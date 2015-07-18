package in.instruo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Focus on 28-Mar-15.
 */
public class PlanMastersFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity.state = 1;
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(EventFragment.event_list[getArguments().getInt("POSITION")].title);
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.plan_masters_fragment, container, false);
        TextView tv = (TextView) v.findViewById(R.id.plan_masters_desc);
        String src = EventFragment.desc[getArguments().getInt("POSITION")];
        tv.setText(Html.fromHtml(src));
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        return v;
    }
}
