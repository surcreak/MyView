package com.surcreak.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.surcreak.myview.adapter.HorizontalGridViewAdpter;
import com.surcreak.myview.view.HorizontalGridView;

public class DemoActivity extends AppCompatActivity {

    private HorizontalGridView horizontalGridView;
    private HorizontalGridViewAdpter adpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        setupView();
    }

    private void setupView(){
        horizontalGridView = (HorizontalGridView) findViewById(R.id.horizontal_grid_view);
        adpter = new HorizontalGridViewAdpter(this);
        horizontalGridView.setAdapter(adpter);
    }
}
