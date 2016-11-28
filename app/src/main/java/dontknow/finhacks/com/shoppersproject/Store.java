import java.io.File;
public class Store
{
    private int storeID;
    private String storeName;
    private String storeAddress;
    private File storeImage;
    private String productCategory; //Possible for more than one
    private String storeLocation;

    //Basic constructor with NO image file
    public Store(int storeID, String storeName, String storeAddress, String productCategory, String storeLocation)
    {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.productCategory = productCategory;
        this.storeLocation = storeLocation;
    }

    //Construct WITH IMAGE FILE
    public Store(int storeID, String storeName, String storeAddress, File storeImage, String productCategory, String storeLocation)
    {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeImage = storeImage;
        this.productCategory = productCategory;
        this.storeLocation = storeLocation;
    }

    public int getStoreID()
    {
        return storeID;
    }

    public void setStoreID(int storeID)
    {
        this.storeID = storeID;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public void setStoreName(String storeName)
    {
        this.storeName = storeName;
    }

    public String getStoreAddress()
    {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress)
    {
        this.storeAddress = storeAddress;
    }

    public File getStoreImage()
    {
        return storeImage;
    }

    public void setStoreImage(File storeImage)
    {
        this.storeImage = storeImage;
    }

    public String getProductCategory()
    {
        return productCategory;
    }

    public void setProductCategory(String productCategory)
    {
        this.productCategory = productCategory;
    }

    public String getStoreLocation()
    {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation)
    {
        this.storeLocation = storeLocation;
    }

}