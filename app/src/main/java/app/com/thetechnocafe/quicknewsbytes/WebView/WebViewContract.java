package app.com.thetechnocafe.quicknewsbytes.WebView;

/**
 * Created by gurleensethi on 20/12/16.
 */

public class WebViewContract {
    public interface View {
        void loadURLInWebView();
    }

    public interface Presenter {
        void onStart();
    }
}
