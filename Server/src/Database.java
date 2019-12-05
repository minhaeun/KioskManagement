import javax.xml.transform.Result;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Database {
    Connection con = null;

    String server = "localhost"; // MySQL 서버 주소
    String database = "menu"; // MySQL DATABASE 이름
    String user_name = "root"; //  MySQL 서버 아이디
    String password = "haeun1015"; // MySQL 서버 비밀번호


    public void connect(){

        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");

        } catch(SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }
//
//        // 3.해제
//        try {
//            if(con != null)
//                con.close();
//        } catch (SQLException e) {}
    }

    public void setActivMenu(String category, String name, int activ_num){
         try{
            String sql = "update menu set activ_num = ? where category=? and name = ?";
             PreparedStatement statement = con.prepareStatement(sql);
             statement.setInt(1, activ_num);
             statement.setString(2,category);
             statement.setString(3,name);
             statement.executeUpdate();

         }catch(Exception e){

        }
    }
//    // query -> data (Select) -> STATEMENT|open,closed
//    public void time(){
//        String result = "STATEMENT";
//        try{
//            Statement statement = con.createStatement();
//            String sql;
//            if(isOpen()){
//                sql = "update time set closetime = CURRENT_TIMESTAMP where closetime is null";
//            } else {
//                sql = "insert into time (opentime) values CURRENT_TIMESTAMP";
//            }
//            ResultSet rs = statement.executeQuery(sql);
//            System.out.println(rs);
//
//        }catch(Exception e){
//
//        }
//    }

    public String open(){

        String result = "OPEN";
        try{
            if(!isOpen()) {
                String sql = "insert into time (opentime) values (?)";
                PreparedStatement statement = con.prepareStatement(sql);


                java.sql.Timestamp opentime = new java.sql.Timestamp(new Date().getTime());
                statement.setTimestamp(1, opentime);
                int r = statement.executeUpdate();
                result += "/success," + opentime;

          }else {
                String sql = "select opentime from time where closetime is null";
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                if(rs.next()) result += "/already," + rs.getTimestamp("opentime") ;
//
//                String sql = "select opentime from time where closetime is null";
//                PreparedStatement statement = con.prepareStatement(sql);
//                ResultSet rs = statement.executeQuery(sql);
//                 result += rs.getDate("/"+ "opentime");
            }

        }catch(Exception e) {e.printStackTrace();}
          return result;
    }

    public String close() {
        String result = "CLOSE";
        try {
            if (isOpen()) {
                String sql = "update time set closetime=(?)";
                PreparedStatement statement = con.prepareStatement(sql);
                java.sql.Timestamp closetime = new java.sql.Timestamp(new Date().getTime());
                statement.setTimestamp(1, closetime);
                int r = statement.executeUpdate();
                System.out.println("close into return "+r);
                result += "/success," + closetime;
            } else {
                String sql = "select closetime from time order by tno desc limit 1";
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(sql);

                if(rs.next()) System.out.println(rs.getTimestamp("closetime"));
                result += "/already," + rs.getTimestamp("closetime");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean isOpen() throws Exception {
        String sql = "select count(1) c from time where closetime is null";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
     //   System.out.println(rs.getInt("c") == 1 ? "open":"closed");
        if(rs.next()){
            if(rs.getInt("c") == 1)
                return true;
        }
        return false;
    }


    public void pay(String cardnum, int price){
      //  String result = "PAY";
        try{
            String sql = "insert into payment (cardnum, price, paymenttime) values(?,?,?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,cardnum);
            statement.setInt(2,price);
            java.sql.Timestamp paymenttime = new java.sql.Timestamp(new Date().getTime());
            statement.setTimestamp(3, paymenttime);
            int r = statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void cancel(int pno){
     //   String result = "CANCEL";
        try{
            Statement statement = con.createStatement();
            String sql = "update payment set canceltime = CURRENT_TIMESTAMP where canceltime is null and pno = " + pno;
            statement.executeUpdate(sql);
        }catch(Exception e){

        }

    }

    public String getPaymentList(){
        String result = "PAYMENT_LIST";
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from payment where timestampdiff(second, paymenttime, (select opentime from time where closetime is null)) < 0");

            while(rs.next()){
                result += "/"+ rs.getInt("pno") + "," + rs.getString("cardnum") + "," + rs.getInt("price") + "," + rs.getTimestamp("paymenttime")+ "," + rs.getTimestamp("canceltime");
            }
        }catch(Exception e){

        }
        return result;
    }

    public String closeUpDetails(){
        try{

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select a.price totalprice, b.price cancelprice, (a.price - b.price)realprice, a.count totalcount, b.count cancelcount\n" +
                    "from\n" +
                            "(select if(isnull(sum(price)),0,sum(price)) price,count(1) count from payment where paymenttime>(select opentime from time where closetime is null)) a,\n" +
                            "(select if(isnull(sum(price)),0,sum(price)) price,count(1) count from payment where canceltime is not null and paymenttime>(select opentime from time where closetime is null)) b;");
            rs.next();
            int totalprice =  rs.getInt("totalprice");
            int cancelprice =  rs.getInt("cancelprice");
            int realprice =  rs.getInt("realprice");
            int totalcount =  rs.getInt("totalcount");
            int cancelcount =  rs.getInt("cancelcount");

           return  String.format("CLOSEMSG/%d,%d,%d,%d,%d",totalprice,cancelprice,realprice,totalcount,cancelcount);

        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }


    public String getMenuList(){
        String result = "MENU_LIST";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from menu");


            while (rs.next()) {
                result += "/" + rs.getString("category") + "," + rs.getString("name") + "," + rs.getInt("price") + "," + rs.getInt("activ_num");
            }
           //
            // System.out.println(result);
        }catch(Exception e){

        }
        return result;
    }
    public void setPassword (String password){
        try{
            Statement statement = con.createStatement();
            int rs = statement.executeUpdate("update  admin set password = '"+password+"'");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getActiv(String name){
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select activ_num from menu where name='"+ name + "'");
            if(rs.next()) return rs.getInt("activ_num");
        } catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public String adminchk(String password){
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select 1 from admin where password=" + password);

            return "ADMINCHK/" + (rs.next() ? 1 : 0);
        }catch(Exception e){

        }
        return "";
    }
}
