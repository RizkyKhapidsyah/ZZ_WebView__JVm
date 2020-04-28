package com.rk.zz_wv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView WV_1_IDJAVA = findViewById(R.id.WV_1_IDXML);

        WV_1_IDJAVA.setWebViewClient(new RizkyKhapidsyah());
        String AlamatTujuan = "http://www.programmerfiles.blogspot.com";
        WV_1_IDJAVA.getSettings().setJavaScriptEnabled(true);
        WV_1_IDJAVA.loadUrl(AlamatTujuan);
    }

    private class RizkyKhapidsyah extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView DessyPuspitaSari, String AlamatWeb) {
            DessyPuspitaSari.loadUrl(AlamatWeb);
            return true;
        }
    }

}
