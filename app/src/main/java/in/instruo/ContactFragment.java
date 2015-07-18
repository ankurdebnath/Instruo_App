package in.instruo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * Created by Focus on 27-Mar-15.
 */
public class ContactFragment extends Fragment {
    NetworkImageView networkImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.contact_fragment, container, false);
        ImageLoader.ImageCache imageCache = new BitmapLruCache();
        ImageLoader imageLoader = new ImageLoader(Volley.newRequestQueue(getActivity()), imageCache);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc1);
        networkImageView.setImageUrl("https://graph.facebook.com/1640422862/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc2);
        networkImageView.setImageUrl("https://graph.facebook.com/lucas.ibrahimovich/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc3);
        networkImageView.setImageUrl("https://graph.facebook.com/Archisman.LeoShady/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc4);
        networkImageView.setImageUrl("https://graph.facebook.com/binay28/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc5);
        networkImageView.setImageUrl("https://graph.facebook.com/abhishek.ashish.75/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc6);
        networkImageView.setImageUrl("https://graph.facebook.com/sourav.dandapat.5/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc7);
        networkImageView.setImageUrl("https://graph.facebook.com/100001832195707/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc8);
        networkImageView.setImageUrl("https://graph.facebook.com/ghoshbinayak/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc9);
        networkImageView.setImageUrl("https://graph.facebook.com/asif.iqbal.gazi/picture?type=square&width=200&height=200",imageLoader);

        networkImageView = (NetworkImageView) v.findViewById(R.id.img_cntc10);
        networkImageView.setImageUrl("https://graph.facebook.com/ankurdebnath1994/picture?type=square&width=200&height=200",imageLoader);

        Button b = (Button) v.findViewById(R.id.like);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri;
                String url = "https://www.facebook.com/instruo.iiests";
                try {
                    getActivity().getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    uri = Uri.parse("fb://facewebmodal/f?href=" + url);
                } catch (PackageManager.NameNotFoundException e) {
                    uri = Uri.parse(url);
                }
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        return v;
    }
}
