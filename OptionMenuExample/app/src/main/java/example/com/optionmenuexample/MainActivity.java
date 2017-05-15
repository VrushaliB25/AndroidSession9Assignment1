package example.com.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Initialization

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);      //Menu Resource, Menu
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView mTextView=(TextView) findViewById(R.id.textview1);  //Initialization of textview

        switch (item.getItemId()) {
            case R.id.option1:
               mTextView.setBackgroundColor(0xfff00000);   //background color-red
                return true;
            case R.id.option2:
                mTextView.setBackgroundColor(0xff00ff00);    //background color-green
                return true;
            case R.id.option3:
                mTextView.setBackgroundColor(0xff0000ff);  //background color-blue
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
