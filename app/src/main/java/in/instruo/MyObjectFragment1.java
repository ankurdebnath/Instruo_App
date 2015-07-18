package in.instruo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Focus on 28-Mar-15.
 */
public class MyObjectFragment1 extends Fragment {

    MyMenu day2 [] = {
            new MyMenu(R.drawable.icon, "Registration"),
            new MyMenu(R.drawable.pic17, "Robotics"),
            new MyMenu(R.drawable.picracing, "Hovercraft"),
            new MyMenu(R.drawable.pic2, "Gaming Finals"),
            new MyMenu(R.drawable.pic14, "Prashnavali"),
            new MyMenu(R.drawable.pic6, "Business Plan (Finals)"),
            new MyMenu(R.drawable.pic14, "Business Quiz"),
            new MyMenu(R.drawable.reversecoding, "Reverse Coding (Round 1)"),
            new MyMenu(R.drawable.pic9, "Electronikaz (prelims)"),
            new MyMenu(R.drawable.icon, "LUNCH"),
            new MyMenu(R.drawable.reversecoding, "Reverse Coding (Round 2)"),
            new MyMenu(R.drawable.wiredin, "Wired"),
            new MyMenu(R.drawable.pic7, "War of Titans (Round 1)"),
            new MyMenu(R.drawable.pic15, "Junkyard (Prelims)"),

    };

    public EventSchedule day_one_schedule [] = new EventSchedule[]{
            new EventSchedule(day2[0], "", "0800"),
            new EventSchedule(day2[1], "U Building", "0900","1700"),
            new EventSchedule(day2[2], "", "0900","1700"),
            new EventSchedule(day2[3], "", "0900","1700"),
            new EventSchedule(day2[4], "Institute Hall", "0900","1200"),
            new EventSchedule(day2[5], "Alumni Seminar Hall", "1100","1530"),
            new EventSchedule(day2[6], "Alumni Seminar Hall", "1600","1830"),
            new EventSchedule(day2[7], "M N DASTUR LAB", "1130","1300"),
            new EventSchedule(day2[8], "Gallery 7", "1130","1230"),
            new EventSchedule(day2[9], "", "1230","1300"),
            new EventSchedule(day2[10], "M N DASTUR LAB", "1400","1530"),
            new EventSchedule(day2[11], "", "1430","1700"),
            new EventSchedule(day2[12], "Institute Hall", "1500","1700"),
            new EventSchedule(day2[13], "", "1600","1800"),
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_object_fragment, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.schedule_listview);
        ScheduleAdapter adapter = new ScheduleAdapter(this.getActivity(), R.layout.schedule_list_row, day_one_schedule);
        lv.setAdapter(adapter);
        return rootView;
    }
}
