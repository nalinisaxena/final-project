package com.example.nalini.navi1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);


        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setTitle("main fragment.....");
        navigationView=(NavigationView)findViewById(R.id.design_navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.signup_id:
                        fragmentTransaction =getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new SignUp());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Sign Up Here...");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.login_id:
                        fragmentTransaction =getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new Login());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Login  Here...");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.db:
                        fragmentTransaction =getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new Login());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("DataBase Here...");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.map_id:
                        fragmentTransaction =getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new Login());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Map Here...");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;




                }
                return true;
            }


        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
