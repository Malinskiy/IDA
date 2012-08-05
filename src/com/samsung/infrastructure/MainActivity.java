package com.samsung.infrastructure;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.app.ActionBar;
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
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(R.string.actionbar_item_0)
                .setIcon(R.drawable.social_share)
                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        menu.add(R.string.actionbar_item_1)
                .setIcon(R.drawable.av_download)
                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        menu.add(R.string.actionbar_item_2)
                .setIcon(R.drawable.content_save)
                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        menu.add(R.string.menu_item_0);
        menu.add(R.string.menu_item_1);
        menu.add(R.string.menu_item_2);

        return true;
    }
}