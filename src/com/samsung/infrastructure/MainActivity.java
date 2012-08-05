package com.samsung.infrastructure;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockFragmentActivity {

    ActionBar actionBar;

    private class MyTabListener implements ActionBar.TabListener {
        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            if (tab.getPosition() == 0) {
                FragmentA frag = new FragmentA();
                ft.replace(android.R.id.content, frag);
            } else {
                FragmentB frag = new FragmentB();
                ft.replace(android.R.id.content, frag);
            }
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
            // TODO Auto-generated method stub
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sherlock);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab();
        ActionBar.Tab tab2 = actionBar.newTab();

        tab1.setText("Public segment");
        tab2.setText("Private segment");
        tab1.setTabListener(new MyTabListener());
        tab2.setTabListener(new MyTabListener());
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Toast.makeText(this, "Share selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.download:
                Toast.makeText(this, "Download selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.save:
                Toast.makeText(this, "Save selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.login:
                Toast.makeText(this, "Login selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.exit:
                Toast.makeText(this, "Exit selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                break;
        }

        return true;
    }
}