package com.samsung.infrastructure;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity {

    ActionBar actionBar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sherlock);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main,menu);

//        menu.add(R.string.actionbar_item_0)
//                .setIcon(R.drawable.social_share)
//                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
//
//        menu.add(R.string.actionbar_item_1)
//                .setIcon(R.drawable.av_download)
//                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
//
//        menu.add(R.string.actionbar_item_2)
//                .setIcon(R.drawable.content_save)
//                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
//
//        menu.add(R.string.menu_item_0);
//        menu.add(R.string.menu_item_1);
//        menu.add(R.string.menu_item_2);

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