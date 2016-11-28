package dontknow.finhacks.com.shoppersproject;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.support.design.widget.NavigationView;
import android.graphics.PorterDuff;

public class CategoryGrid extends AppCompatActivity {
    ImageButton clothingButton;
    ImageButton electronicsButton;
    ImageButton gamesButton;
    ImageButton restaurantsButton;
    ImageButton homeButton;
    ImageButton CosmeticButton;
    boolean[] selected; // get from user

    //Change colors here for when button pressed
    public static final int COLOR_SELECTED = Color.GREEN;
    public static final int COLOR_UNSELECTED = Color.GRAY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid);
        clothingButton = (ImageButton) findViewById(R.id.clothingButton);
        electronicsButton = (ImageButton)findViewById(R.id.electronicsButton);
        gamesButton = (ImageButton)findViewById(R.id.gamesButton);
        restaurantsButton = (ImageButton)findViewById(R.id.restaurantButton);
        homeButton = (ImageButton)findViewById(R.id.homeButton);
        CosmeticButton = (ImageButton)findViewById(R.id.cosmesticsButton);
        ImageButton[] buttons = {clothingButton ,electronicsButton, gamesButton, restaurantsButton, homeButton, CosmeticButton};
        Button done = (Button) findViewById(R.id.submitCategory);
        String [] category = new String [5];

        // TODO: get user pref
        selected = new boolean[6];
        for (int i =0; i<6; i++){
            selected[i] = false;
        }

        //Edit onClick function to program logic for button being pressed
        for (int i = 0; i < 6; i++){
            final ImageButton b = buttons[i];

            final int j = i;
            boolean isSelected = selected[i];
            if (isSelected){
                //b.setBackgroundColor(COLOR_SELECTED);
                b.setColorFilter(Color.GRAY, PorterDuff.Mode.LIGHTEN);

                if(b.equals(clothingButton)){
                    category[0] = "clothing";
                }
                else if(b.equals(electronicsButton)){
                    category[1] = "electronics";
                }
                else if(b.equals(gamesButton)){
                    category[2] = "games";
                }
                else if(b.equals(restaurantsButton)){
                    category[3] = "restaurants";
                }
                else if(b.equals(homeButton)){
                    category[4] = "home";
                }
                else if(b.equals(CosmeticButton)){
                    category[5] = "cosmetic";
                }
            } else {
                //b.setBackgroundColor(COLOR_UNSELECTED);
                b.setColorFilter(Color.argb(0, 0, 0, 0));

            }
            b.setOnClickListener((new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
//                    Toast.makeText(getApplicationContext(), "You Clicked Clothing", Toast.LENGTH_LONG).show();
                    if (selected[j])
                    {
                        //Change color after pressed when not previously selected
                        //b.setBackgroundColor(COLOR_UNSELECTED);
                        b.setColorFilter(Color.argb(0, 0, 0, 0));

                        selected[j] = false;
                    }
                    else
                    {
                        b.setColorFilter(Color.GRAY, PorterDuff.Mode.LIGHTEN);
                        //b.setBackgroundColor(COLOR_SELECTED);
                        selected[j] = true;
                    }
                }
            }));


        }
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (CategoryGrid.this, MainActivity.class));
            }
        });

    }

}
