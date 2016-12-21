package tk.chiragarora.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    FloatingActionButton fab_twitter,fab_fb,fab_plus;
    Animation FabOpen,FabClose,FabRClockwise,FabRanticlockwise;
    boolean isOpen=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus);
        fab_fb=(FloatingActionButton)findViewById(R.id.fab_fb);
        fab_twitter=(FloatingActionButton)findViewById(R.id.fab_twitter);

        FabOpen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRClockwise=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(isOpen){
                    fab_fb.startAnimation(FabClose);
                    fab_twitter.startAnimation(FabClose);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_twitter.setClickable(false);
                    fab_fb.setClickable(false);
                    isOpen=false;

                }
                else {
                    fab_fb.startAnimation(FabOpen);
                    fab_twitter.startAnimation(FabOpen);
                    fab_plus.startAnimation(FabRClockwise);
                    fab_twitter.setClickable(true);
                    fab_fb.setClickable(true);
                    isOpen=true;
                }

            }


        });

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                mDrawerLayout.closeDrawers();
                int id = item.getItemId();



                if (id == R.id.nav_home) {
                    //Set the fragment initially
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    // Handle the camera action
                } else if (id == R.id.nav_upcoming_events) {
                    //Set the fragment initially
                    Intent intent = new Intent(getApplicationContext(), UpcomingEvents.class);
                    startActivity(intent);

                } else if (id == R.id.nav_flagship_events) {
                    Intent intent = new Intent(getApplicationContext(), FlagshipEvents.class);
                    startActivity(intent);

                } else if (id == R.id.nav_pitch_a_project) {
                    Intent intent = new Intent(getApplicationContext(), PitchAProject.class);
                    startActivity(intent);

                } else if (id == R.id.nav_suggest_an_event) {
                    Intent intent = new Intent(getApplicationContext(), SuggestAnEvent.class);
                    startActivity(intent);

                } else if (id == R.id.nav_two_credits) {
                    Intent intent = new Intent(getApplicationContext(), TwoCredits.class);
                    startActivity(intent);

                } else if (id == R.id.nav_about_us) {

                    Intent intent = new Intent(getApplicationContext(), AboutUs.class);
                    startActivity(intent);

                } else if (id == R.id.nav_settings) {
                    Intent intent = new Intent(getApplicationContext(), Settings.class);
                    startActivity(intent);

                } else if (id == R.id.nav_logout) {

                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
}