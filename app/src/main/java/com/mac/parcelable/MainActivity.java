package com.mac.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private A parcelableObjectA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parcelableObjectA = new A("Ihsan");

        List<B> list = new ArrayList<B>();
        list.add(new A("Washington"));
        list.add(new A("London"));
        list.add(new A("Sydney"));
        list.add(new A("Berlin"));
        list.add(new A("Lahore"));

        parcelableObjectA.setList(list);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify parcelableObjectA parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(MainActivity.this, RecieverActivity.class);
            i.putExtra("object", parcelableObjectA);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
