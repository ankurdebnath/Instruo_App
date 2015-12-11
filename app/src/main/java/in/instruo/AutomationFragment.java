package in.instruo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Focus on 28-Mar-15.
 */
public class AutomationFragment extends Fragment {

    /*hardcoded desc. Get in json format from API instead.*/
    public static String desc [] = {
            "<h3>INTRODUCTION</h3>\n" +
                    "<p>You have been placed in a maze and you have to get out of it. But checking every path takes a lot of time so the captors have decided to help you. The maze has letters and numbers in some of the turns to guide you in the correct direction. It is now up to you to take correct turns and reach the exit. Beware of the night though as you can't see the numbers.</p>\n" +
                    "<h3>PROBLEM STATEMENT</h3>\n" +
                    "<p>Build an autonomous robot that can solve a maze with help from IR communication and wall following.</p>\n" +
                    "<h3>TASKS</h3>\n" +
                    "<p>Build an autonomous robot that can-<br /> 1.Follow the maze using IR proximity/ Ultrasound sensor.<br /> 2.Communicate with the maze using IR remote control protocol (SONY) and follow the directions.<br /> 3.In case of dead ends, return and take the other path.<br /> 4.And finally, Reach the exit of the maze before time runs out.</p>\n" +
                    "<p><a style=\"text-decoration: underline;\" href=\"http://robodarshan.iiests.ac.in/events/mazerunner.html\" target=\"blank\"><strong>More details here..</strong></a></p>\n" +
                    "<h3>Contacts</h3>\n" +
                    "<p>Ananyo Sen: +918334988667 <br /> Binayak Ghosh: +919434110169</p>",
            "<h3>INTRODUCTION</h3>\n" +
                    "<p>M: Bond one of our men has confirmed the location of the hideout of our old mate Joe. Remember how he planned an attack into our headquarters? Well, he is hiding in a nearby territory with some of his fellow, well secured by arm guards. I order you to sneak into the hideout and hunt him down. But beware, his guards, they are dangerous. You have already lost substantial amount of your skills. Stay alert and get back safe.</p>\n" +
                    "<h3>PROBLEM STATEMENT</h3>\n" +
                    "<p>Make a vision guided bot to move through some goal points avoiding some moving autonomous enemy bots.<br /> <strong>Goal points:</strong> These are some <strong>green</strong> marks that your bot needs to pass through.<br /> <strong>Guards:</strong> Virtual <strong>Red</strong> Spots which moves in a straight line for some time, stops, rotates by a random angle and starts moving in another direction.<br /> <strong>Arena Boundary:</strong> Solid Black walls and avoid hitting them.</p>\n" +
                    "<h3>TASKS</h3>\n" +
                    "<p>Start from a starting point, you will have to reach the goal points in any order avoiding the enemy bots. When you reach and leave a goal point an alert will be raised for 'x' seconds during the time the enemy bots will seek your current position and move towards you, all goal points will be closed down. After 'x' second everything will be restored to normal. Finally come out through an escape point.<br /> <strong>Level I:</strong><br /> 1. You have 2 goal points to pass through.<br /> 2. You have to escape 1 Enemy Bot.<br /> <strong>Level 2:</strong><br /> 1. 4 Goal Points<br /> 2. 2 Enemy Bot<br /> <strong>Level 3:</strong> [will be held if required]<br /> 1. You will have 6 Goal Point to pass through.<br /> 2. You have to escape 2 smart(explained in next point) Enemy bots.<br /> 3. Upon reaching a goal point, an alert will be raised for 5 seconds. During that time the enemy bots will seek your current position and move towards you, all goal point will be closed down. After 5 seconds everything will be restored to normal. <br /><br /></p>\n" +
                    "<p><a style=\"text-decoration: underline;\" href=\"http://robodarshan.iiests.ac.in/events/escapist.html\" target=\"blank\"><strong>More details here..</strong></a></p>\n" +
                    "<h3>Contacts</h3>\n" +
                    "<p>Abhas Bhattacharya: +918334955881<br /> Anish Dutta: +919007014592<br /> Souvik Baksi: +919614690125</p>",
            "<h3>PROBLEM STATEMENT</h3>\n" +
                    "<h4>Follow anyone of them</h4>\n" +
                    "<p><strong>1)Using 2 bots :</strong><br /> Build 2 bots; one capable of traversing a rough terrain, carrying objects, climbing an incline and depositing them on the raised platform. The 2nd bot needs to traverse on two tracks raised above the ground placed parallel and at a constant height. The 2nd bot needs to transport objects from the raised platform underneath and deliver them to the victims stationed at rehabs.</p>\n" +
                    "<p><strong>1)Using 1 bot: </strong><br /> Build a bot which can traverse on rough terrains, carry the objects, climb an incline and shoot the objects into the baskets at a certain distance away.</p>\n" +
                    "<p><a style=\"text-decoration: underline;\" href=\"http://robodarshan.iiests.ac.in/events/spirit.html\" target=\"blank\"><strong>More details here..</strong></a></p>\n" +
                    "<h3>Contacts</h3>\n" +
                    "<p>TAUSEEF RASUL : 9477345031 ANIRBAN SARKAR: 8013085041<br /> RATNADEEP DEY: 8961752968<br /> SAGNIK PAL CHOWDHURY : 9007004442</p>",
            "<h3>PROBLEM STATEMENT</h3>\n" +
                    "<p>Design a bot which can traverse on the waves of the water body sidestepping the obstacles , collect the balls and dribble them to goal</p>\n" +
                    "<h3>TASKS</h3>\n" +
                    "<p>1.Make a bot that can float on water.<br /> 2.The bot will dodge the obstacles <br /> 3.The bot will shoot the balls inside the goal.</p>\n" +
                    "<p><a style=\"text-decoration: underline;\" href=\"http://robodarshan.iiests.ac.in/events/robopolo.html\" target=\"blank\"><strong>More details here..</strong></a></p>\n" +
                    "<h3>Contacts</h3>\n" +
                    "<p>\n" +
                    "TAUSEEF RASUL : 9477345031 <br/>\n" +
                    "ANIRBAN SARKAR: 8013085041<br />\n" +
                    "RATNADEEP DEY: 8961752968<br /> \n" +
                    "SAGNIK PAL CHOWDHURY : 9007004442</p>",
    };

    public static MyMenu event_list[] = new MyMenu[]
            {
                    new MyMenu(R.drawable.maze, "Maze Runner"),
                    new MyMenu(R.drawable.escapist, "Escapist"),
                    new MyMenu(R.drawable.spirit, "Spirit"),
                    new MyMenu(R.drawable.robopolo, "Robopolo"),
            };

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity.state = 1;
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(EventFragment.event_list[getArguments().getInt("POSITION")].title);
        View v = inflater.inflate(R.layout.event_fragment, container, false);
        ListView lv = (ListView) v.findViewById(R.id.event_listview);
        EventAdapter adapter = new EventAdapter(this.getActivity(), R.layout.event_list_row, event_list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ((MainActivity)getActivity()).getSupportActionBar().setTitle(event_list[position].title);
                selectItem(position);
            }
        });
        return v;
    }

    private void selectItem(int position){
        FragmentManager fm = getFragmentManager();
        Bundle args = new Bundle();
        args.putInt("POSITION", position);
        AutomationSubFragment fragment = new AutomationSubFragment();
        fragment.setArguments(args);
        fm.beginTransaction().replace(R.id.fr1, fragment).addToBackStack("Auto-sub").commit();
    }
}
