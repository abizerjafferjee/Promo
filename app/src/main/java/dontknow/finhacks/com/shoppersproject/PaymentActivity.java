package dontknow.finhacks.com.shoppersproject;

/**
 * Created by admin on 19/11/2016.
 */

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class PaymentActivity extends AppCompatActivity {

    EditText cardName;
    EditText cardNumber;
    EditText expiryDate;
    Button makePayment;

    public final int COLOR_SELECTED = Color.RED;
    public final int COLOR_UNSELECTED = Color.BLUE;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        final EditText cardName = (EditText) findViewById(R.id.cardName);
        final EditText cardNumber = (EditText) findViewById(R.id.cardNumber);
        final EditText expiryDate = (EditText) findViewById(R.id.expiryDate);
        final Button makePayment = (Button) findViewById(R.id.makePayment);
        makePayment.setOnClickListener((new View.OnClickListener()
        {
            boolean makePaymentClicked = false;
            public void onClick(View v)
            {
                if (makePaymentClicked == false)
                {
                    if ((cardName.getText()!= null) && (cardNumber.getText() != null) && (expiryDate.getText() != null))
                    {
                        makePayment.setBackgroundColor(COLOR_SELECTED);
                        makePaymentClicked = true;
                        System.out.println("Make Payment Clicked");
                    }
                    else
                    {
                        makePayment.setBackgroundColor(COLOR_UNSELECTED);
                        makePaymentClicked = false;
                        System.out.println("Make Payment Not Clicked");
                    }
                }
                }

        }) );
    }


}
