package com.dalvik.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

public class MainActivity extends AppCompatActivity {

    //private WebView pagina;

    private Button btnLinearHorizontal;
    private Button btnLinearHorizontalFull;
    private Button btnLinearVertical;
    private Button btnLinearVerticalFull;

    private Button btnFrameLayout;
    private Button btnRelativelayout;
    private Button btnConstraintlayout;
    private Button btnTablelayout;
    private Button btnGridlayout;
    private Button btnScrolllayout;
    private Button btnWebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinearHorizontal = findViewById(R.id.linear_layout_horizontal);
        btnLinearHorizontalFull = findViewById(R.id.linear_layout_horizontal_full);
        btnLinearVertical = findViewById(R.id.linear_layout_vertical);
        btnLinearVerticalFull = findViewById(R.id.linear_layout_vertical_full);
        btnFrameLayout = findViewById(R.id.frame_layout);
        btnRelativelayout = findViewById(R.id.relative_layout);
        btnConstraintlayout = findViewById(R.id.constraint_layout);
        btnTablelayout = findViewById(R.id.table_layout);
        btnGridlayout = findViewById(R.id.grid_layout);
        btnScrolllayout = findViewById(R.id.scroll_layout);
        btnWebview = findViewById(R.id.webview_layout);


        btnLinearHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearlayoutHorizontal.class);
                startActivity(intent);
            }
        });
        btnLinearHorizontalFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutHorizontalFull.class);
                startActivity(intent);
            }
        });
        btnLinearVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutVertical.class);
                startActivity(intent);
            }
        });

        btnLinearVerticalFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutVerticalFull.class);
                startActivity(intent);
            }
        });

        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Framelayout.class);
                startActivity(intent);
            }
        });


        btnRelativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Relativelayout.class);
                startActivity(intent);
            }
        });
        btnGridlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gridlayout.class);
                startActivity(intent);
            }
        });

        btnTablelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tablelayout.class);
                startActivity(intent);
            }
        });

        btnScrolllayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollviewActivity.class);
                startActivity(intent);
            }
        });

        btnWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebviewActivity.class);
                startActivity(intent);
            }
        });

        btnConstraintlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Constraintlayout.class);
                startActivity(intent);
            }
        });

    }
}