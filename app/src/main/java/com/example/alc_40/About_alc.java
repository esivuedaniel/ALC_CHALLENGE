package com.example.alc_40;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_alc extends AppCompatActivity {

    private WebView webView;
    private String url="http://www.andela.com/alc/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webView=(WebView) findViewById(R.id.webView);



        WebViewClient myWebViewClient=new WebViewClient(){
            //handle onReceive error method
            @Override
            public  void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        };
        webView.setWebViewClient(myWebViewClient);
        WebSettings webSettings=webView.getSettings();
        //Enable javaScript
        webSettings.setJavaScriptEnabled(true);

        //load the web page
        webView.loadUrl(url);

    }
}
