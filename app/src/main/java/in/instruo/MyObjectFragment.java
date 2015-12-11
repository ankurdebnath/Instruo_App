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
public class MyObjectFragment extends Fragment {

    /*hardcoded desc. Get in json format from API instead.*/
    MyMenu day1 [] = {
            new MyMenu(R.drawable.icon, "Registration"),
            new MyMenu(R.drawable.icon, "Inauguration Ceremony"),
            new MyMenu(R.drawable.icon, "NRDC seminar"),
            new MyMenu(R.drawable.pic2, "Gaming Prelims ( FIFA, NFS, CS )"),
    };

    public EventSchedule day_one_schedule [] = new EventSchedule[]{
            new EventSchedule(day1[0], "", "0830"),
            new EventSchedule(day1[1], "Institute Hall", "1000","1400"),
            new EventSchedule(day1[2], "Institute Hall", "1500","1700"),
            new EventSchedule(day1[3], "", "1400","1900"),
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
