package dontknow.finhacks.com.shoppersproject;

import java.io.File;

/**
 * Created by Safer on 2016-11-19.
 */

public class Product {
    private File pPicture;
    private String pName;
    private int pPrice;
    private String pCategory;
    private int pId;
    public Product(String name, int price, String category, int id){
        pName = name;
        pPrice = price;
        pCategory = category;
        pId = id;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpPicture(File pPicture) {
        this.pPicture = pPicture;
    }
}
