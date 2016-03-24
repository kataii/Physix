package com.khatthaphone.code.physix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DisplayHTML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_html);



        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

//        webSettings.getJavaScriptEnabled();
        webView.loadData("<html>\n" +
                "            <head>\n" +
                "\n" +
                "            </head>\n" +
                "            <body>\n" +
                "                <p>Vector is a qauntity which contains direction of that qauntity, eg. the force is a vector qauntity, it has magnitude and also direction.</p>\n" +
                "            </body>\n" +
                "        </html>", "text/html", null);


    }
}
