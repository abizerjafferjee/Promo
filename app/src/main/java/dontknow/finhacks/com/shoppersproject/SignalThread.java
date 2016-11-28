package dontknow.finhacks.com.shoppersproject;

import java.io.BufferedReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by donovan on 11/19/16.
 */

public class SignalThread extends Thread
{
    private final int LISTENING_PORT = 9000;

    @Override
    public void run()
    {
        try
        {
            System.out.println("HEH");
            DatagramSocket socket = new DatagramSocket(LISTENING_PORT);
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            while(true)
            {
                socket.receive(receivePacket);
                String rString = new String(receivePacket.getData());
                System.out.println(rString);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
