package endomain.alcandroidchallenge1;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String url= "https://www.andela.com/alc/";

        webView=(WebView) findViewById(R.id.ABwebView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
             handler.proceed();
            }
        });

        webView.loadUrl(url);
    }

}

















