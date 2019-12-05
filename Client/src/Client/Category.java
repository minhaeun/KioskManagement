package Client;

import java.util.HashMap;

public class Category {
    String categoryName;
//    private Menu[] m = new Menu[100];
    HashMap<String, Menu> menues = new HashMap<>();
    int i = 0;

    public Category(){}
    public Category(String categoryName){
        this.categoryName = categoryName;

    }
    public void addMenu(String name, int price, int activ_num){
        menues.put(name,new Menu(name, price, activ_num));
     //   m[i] = new Menu(name,price, activ_num);
        i++;
    }
    public int count(){
        return i;
    }
}
