package com.example.b4learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.res.Resources;


import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

public class Menulearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        /////////////////////////////
        /////////////////////////////
        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("",
                res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("TAB2",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);
        //tabs.addTab(tabs.newTabSpec("mitab2").setIndicator("TAB2",
         //       res.getDrawable(android.R.drawable.ic_dialog_map),
          //      fragment1.class, null);
        tabs.setCurrentTab(0);

        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Toast.makeText(this,"taaaaaaaaaaaaaaaaaaabbbb1",Toast.LENGTH_LONG).show();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this,"taaaaaaaaaaaaaaaaaaabbbb1",Toast.LENGTH_LONG).show();
            Log.i("AndroidTabsDemo", "unoooooooooooooooooooooooo: " );
        }else if (id == R.id.opcion3){
            Toast.makeText(this,"tabbbbbbbbbbbbbbbbbbbb2",Toast.LENGTH_LONG).show();
            Log.i("AndroidTabsDemo", "dossssssssssssssssssssssssssss: " );
        }


        return super.onOptionsItemSelected(item);


    }

}

