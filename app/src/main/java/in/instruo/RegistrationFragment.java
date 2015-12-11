package in.instruo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Focus on 31-Mar-15.
 */
public class RegistrationFragment extends Fragment {
    private WebView mWebview ;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.registration_fragment, container,false);

        mWebview = new WebView(getActivity());
        final Activity activity = getActivity();

        final ProgressDialog pd = ProgressDialog.show(getActivity(), "", "Loading...", true);
        mWebview.getSettings().setJavaScriptEnabled(true);

        mWebview.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                if(pd.isShowing()&&pd!=null)
                {
                    pd.dismiss();
                }
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        /*link to google forms*/
        mWebview .loadUrl("http://goo.gl/forms/H67euhyxPC");

        v.addView(mWebview);


        return v;
    }


}
