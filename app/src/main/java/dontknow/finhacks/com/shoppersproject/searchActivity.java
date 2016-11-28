package dontknow.finhacks.com.shoppersproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class searchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        final ArrayList<String> inputHistory = new ArrayList<String>(); // ArrayList to save history
        EditText userInput = (EditText) findViewById(R.id.searchBar);
        userInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_NEXT){
                    String userInputText = textView.getText().toString();
                    inputHistory.add(userInputText);
                    Toast.makeText(searchActivity.this, "You searched: " +
                     userInputText, Toast.LENGTH_SHORT).show();
                }
                return handled;
            }
        });

    }


}
