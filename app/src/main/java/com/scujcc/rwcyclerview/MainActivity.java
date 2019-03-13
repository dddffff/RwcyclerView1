package com.scujcc.rwcyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvTest = (RecyclerView) findViewById(R.id.rv_test);
        rvTest.setLayoutManager(new LinearLayoutManager(this));
    }
}
