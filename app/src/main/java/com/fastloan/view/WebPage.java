package com.fastloan.view;

import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fastloan.model.DataExchange;
import com.fastloan.R;



public class WebPage  extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_page);

        webView = (WebView) findViewById(R.id.web_page);
        // устанавливаем настройки для броузера
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(DataExchange.getCreditOrganization().getSite());
        // для того чтобы не переходило в броузер при нажатии на линки, а оставались в приложении
        webView.setWebViewClient(new WebViewClient());
        // для доступа приложения к интернету надо указать в манифесте -->
    }



    // при нажатии на кнопку назад будем возвращаться назад
    @Override
    public void onBackPressed() {
//        if (webView.canGoBack()) {
//            webView.goBack();
//        } else {
            super.onBackPressed();
//        }
    }
}
