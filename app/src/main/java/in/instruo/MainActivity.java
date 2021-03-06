package in.instruo;

/**
 * Created by Focus on 28-Mar-15.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.Fragment;


public class MainActivity extends ActionBarActivity {
    public static int x=0;
    public static int state = 0;
    private static long back_pressed;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private int defaultPosition = 0;
    public static CharSequence sTitle;
    public static int itemSelected =0;
    public static MyMenu menu_list[] = new MyMenu[]
            {
                    new MyMenu(R.drawable.events_selected, R.drawable.events, "Events"),
                    new MyMenu(R.drawable.schedule_selected, R.drawable.schedule, "Schedule"),
                    new MyMenu(R.drawable.sponsors_selected, R.drawable.sponsors, "Sponsors"),
                    new MyMenu(R.drawable.location_selected, R.drawable.location, "Location"),
                    new MyMenu(R.drawable.contacts_selected, R.drawable.contacts, "Contacts"),
                    new MyMenu(R.drawable.registration_selected, R.drawable.registration, "Registration"),
            };
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fr1, new Fragment()).commit();
//        findViewById(R.id.toolbar_shadow).bringToFront();
        Toolbar mToolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.my_drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        MyMenuAdapter adapter = new MyMenuAdapter(this, R.layout.list_item_row_menu, menu_list);
        mDrawerList.setAdapter(adapter);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolbar,
                R.string.abc_action_bar_home_description,
                R.string.abc_action_bar_up_description
        ){

            public void onDrawerClosed(View view) {
//                getSupportActionBar().setTitle(sTitle);
                super.onDrawerClosed(view);
            }


            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
//                sTitle = getSupportActionBar().getTitle();
//                getSupportActionBar().setTitle("Open");
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
//	    mDrawerLayout.setDrawerShadow(R.drawable.shadow, GravityCompat.START);
        mDrawerList.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//				view.setId((int)id);
                  itemSelected = position;
//                view.setSelected(true);
                  selectItem(position);
            }
        });
        mDrawerToggle.syncState();

        if(savedInstanceState==null){
            selectItem(defaultPosition);
        }

    }

    private void selectItem(int position){

        Bundle args = new Bundle();
        args.putInt("POSITION", position);

        FragmentManager fm = getSupportFragmentManager();

        switch (position){
            case 0 : EventFragment fragment = new EventFragment();
                     fragment.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment, "EVENT").commit();
                     break;
            case 1:  ScheduleFragment fragment1 = new ScheduleFragment();
                     fragment1.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment1).commit();
                     break;
            case 2:  SponsorFragment fragment4 = new SponsorFragment();
                     fragment4.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment4).commit();
                     break;
            case 3:  MapFragment fragment5 = new MapFragment();
                     fragment5.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment5).commit();
                     break;
            case 4:  ContactFragment fragment6 = new ContactFragment();
                     fragment6.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment6).commit();
                     break;
            case 5:  RegistrationFragment fragment2 = new RegistrationFragment();
                     fragment2.setArguments(args);
                     fm.beginTransaction().replace(R.id.fr1, fragment2).commit();
                     break;
        }



        mDrawerList.setItemChecked(position, true);
        setTitle(menu_list[position].title);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }

    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
        sTitle = title;
        super.setTitle(title);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
            mDrawerLayout.closeDrawer(Gravity.LEFT);
//            setTitle(sTitle);
        }
        else if(state ==0 ) {
            if (back_pressed + 2000 > System.currentTimeMillis()){
                itemSelected = 0;
                super.onBackPressed();
            }
            else{
                Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
                back_pressed = System.currentTimeMillis();
            }
        }
        else
            super.onBackPressed();

    }











}
