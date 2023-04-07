package com.dalvik.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {
    private WebView pagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        pagina = findViewById(R.id.mi_webview);

        //Esta linea es para la pagina se habra dentro de la aplicacion y no nos habra el
        //explorador del dispositivo.
        //pagina.setWebViewClient(new WebViewClient());
        pagina.loadUrl("http://www.tutorialspoint.com");
    }
}