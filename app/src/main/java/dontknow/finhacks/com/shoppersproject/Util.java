package dontknow.finhacks.com.shoppersproject;


import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Util extends AsyncTask<Integer, Void, T1>
{
    public final String[] categoryTypes =
    {
        "Clothing", "Electronics", "Games", "Restaurants", "Cosmetics", "Home"
    };

    @Override
    protected T1 doInBackground(Integer... i){

        try{
            URL url = new URL("http://10.102.200.133/product");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept", "application/json");
            Reader reader;
            reader = new InputStreamReader(urlConnection.getInputStream());
            Gson gson = new GsonBuilder().create();
            T1 p = gson.fromJson(reader, T1.class);
            System.out.println(p.getS());
            return p;
        } catch (Exception e){

            e.printStackTrace();
        }
        return null;
    }
}