package dontknow.finhacks.com.shoppersproject;

/**
 * Created by admin on 19/11/2016.
 */

import java.util.ArrayList;

public class User
{
    public int userId;
    public String fullName;
    public String preferences;
    public String emailAddress;
    public ArrayList<String> listTerms;


    public User(int userId, String fullName, String preferences, String emailAddress, Object listTerms)
    {
        this.userId = userId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.preferences = preferences ;
        fillListTerms(listTerms);
    }

    public void fillListTerms(Object listTerms)
    {
        //TO DO: populate listTerms from database
    }



    public int getUserId()
    {
        return this.userId;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getEmailAddress()
    {
        return this.fullName;
    }

    public void  setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public void addPreference(String preference)
    {

    }

    public void removePreference(String preference)
    {
        if (this.preferences.contains(preference))
        {

        }

    }
}
