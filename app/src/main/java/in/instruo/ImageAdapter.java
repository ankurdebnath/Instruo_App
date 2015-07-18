package in.instruo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by Focus on 26-Mar-15.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return Images.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        NetworkImageView networkImageView;
        ImageView imageView;
        if (convertView == null) {
//            networkImageView = new NetworkImageView(mContext);

            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mContext.getResources().getDisplayMetrics().widthPixels/3, mContext.getResources().getDisplayMetrics().widthPixels/3));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }
//        ImageLoader.ImageCache imageCache = new BitmapLruCache();
//        ImageLoader imageLoader = new ImageLoader(Volley.newRequestQueue(mContext), imageCache);
//        networkImageView.setDefaultImageResId(R.mipmap.ic_launcher);
//        if(position<9){
//            if (position==5)
//                networkImageView.setImageUrl("http://instruo.in/static/main/img/sponsors/pic0"+ (int)(position+1) + ".png",imageLoader);
//            else
//                networkImageView.setImageUrl("http://instruo.in/static/main/img/sponsors/pic0"+ (int)(position+1) + ".jpg",imageLoader);
//        }
//        else{
//            if (position==10)
//                networkImageView.setImageUrl("http://instruo.in/static/main/img/sponsors/pic"+ (int)(position+1) + ".png",imageLoader);
//            else
//                networkImageView.setImageUrl("http://instruo.in/static/main/img/sponsors/pic"+ (int)(position+1) + ".jpg",imageLoader);
//        }
        imageView.setImageResource(Images[position]);
        return imageView;
    }

    private int [] Images = {
            R.drawable.spon0, R.drawable.spon1, R.drawable.spon2, R.drawable.spon3,
            R.drawable.spon4, R.drawable.spon5, R.drawable.spon6, R.drawable.spon7,
            R.drawable.spon8, R.drawable.spon9, R.drawable.spon10, R.drawable.spon11,
    };

}
