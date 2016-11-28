package dontknow.finhacks.com.shoppersproject;

import java.util.ArrayList;

/**
 * Created by Mohammed on 2016-11-19.
 */

public class ShopCart {
    public ArrayList<String> list = new ArrayList<String>();
    public ShopCart(int userId){
        // connect to server

        // Check if user has existing shopping list.
        // Update ArrayList with the database

    }

    public void addItem(String shopItem){
        list.add(shopItem);
    }

    public void deleteItem(String shopItem){
        list.remove(shopItem);
    }
}
