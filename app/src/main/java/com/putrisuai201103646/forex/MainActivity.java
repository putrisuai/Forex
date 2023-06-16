package com.putrisuai201103646.forex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar loadingProgressBar;
    private SwipeRefreshLayout swipeRefreshLayout1;
    private TextView idrTextView, usdTextView, aedTextView, afnTextView, allTextView, amdTextView, angTextView, aoaTextView, arsTextView, audTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout1 = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout1);
        idrTextView = (TextView)findViewById(R.id.idrTextView);
        usdTextView = (TextView)findViewById(R.id.usdTextView);
        aedTextView = (TextView)findViewById(R.id.aedTextView);
        afnTextView = (TextView)findViewById(R.id.afnTextView);
        allTextView = (TextView)findViewById(R.id.allTextView);
        amdTextView = (TextView)findViewById(R.id.amdTextView);
        angTextView = (TextView)findViewById(R.id.angTextView);
        aoaTextView = (TextView)findViewById(R.id.aoaTextView);
        arsTextView = (TextView)findViewById(R.id.arsTextView);
        audTextView = (TextView)findViewById(R.id.audTextView);
        loadingProgressBar = (ProgressBar)findViewById(R.id.loadingProgressBar);

        initSwipeRefreshLayout();
        initForex();
    }

    private void initSwipeRefreshLayout() {
        swipeRefreshLayout1.setRefreshing(()  {
            initForex();

            swipeRefreshLayout1.setRefreshing(false);
        });
    }
}