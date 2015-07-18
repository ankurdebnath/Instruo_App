package in.instruo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by Focus on 26-Mar-15.
 */
public class SponsorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.sponsor, container,false);
        GridView gv = (GridView) v.findViewById(R.id.grid);
        gv.setAdapter(new ImageAdapter(getActivity()));
        return v;
    }
}
