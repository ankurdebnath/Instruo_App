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
public class MyObjectFragment2 extends Fragment {

    MyMenu day3 [] = {
            new MyMenu(R.drawable.icon, "Registration"),
            new MyMenu(R.drawable.pic17, "Robotics"),
            new MyMenu(R.drawable.pic10, "Papyrus"),
            new MyMenu(R.drawable.pic15, "Junkyard (Finals)"),
            new MyMenu(R.drawable.pic9, "Electronikaz (Finals)"),
            new MyMenu(R.drawable.pic11, "Mathmania (Prelims)"),
            new MyMenu(R.drawable.pic11, "Mathmania (Finals)"),
            new MyMenu(R.drawable.pic7, "War of Titans (Round 2) "),
            new MyMenu(R.drawable.pic7, "War of Titans (Finals) "),
            new MyMenu(R.drawable.wiredin, "Wired (Finals)"),
            new MyMenu(R.drawable.pic4, "Face off (Prelims)"),
            new MyMenu(R.drawable.pic4, "Face off (Prelims)"),
            new MyMenu(R.drawable.odetocode, "Ode To Code"),
    };

    public EventSchedule day_one_schedule [] = new EventSchedule[]{
            new EventSchedule(day3[0], "", "0800"),
            new EventSchedule(day3[1], "U Building", "0900","1700"),
            new EventSchedule(day3[2], "MN Dastur Seminar Hall", "1000","1300"),
            new EventSchedule(day3[3], "", "1000","1700"),
            new EventSchedule(day3[4], "Communications Lab", "1100","1230"),
            new EventSchedule(day3[5], "N231/Civil Seminar Hall", "1100","1200"),
            new EventSchedule(day3[6], "N231/Civil Seminar Hall", "1400","1500"),
            new EventSchedule(day3[7], "Institute Hall", "1200","1400"),
            new EventSchedule(day3[8], "Institute Hall", "1500","1700"),
            new EventSchedule(day3[9], "", "1430","1500"),
            new EventSchedule(day3[10], "Alumni Seminar Hall", "1000","1300"),
            new EventSchedule(day3[11], "Alumni Seminar Hall", "1400","1600"),
            new EventSchedule(day3[12], "MN DASTUR LAB", "1300","1600"),
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
