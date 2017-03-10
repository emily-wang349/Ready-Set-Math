package com.readysetmath.readysetmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    int currentLayout = R.id.activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainScreenButtonClicked(View v) {
        int id = v.getId();

        if (id == R.id.btn_add) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_add;
            ((RelativeLayout) findViewById(R.id.layout_add)).setVisibility(RelativeLayout.VISIBLE);
        }
        else if (id == R.id.btn_sub) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_sub;
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.VISIBLE);
        }
        else if (id == R.id.btn_mul) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_mul;
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.VISIBLE);
        }
        else if (id == R.id.btn_div) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_div;
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.VISIBLE);
        }
        else if (id == R.id.btn_challenge) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_challenge;
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.VISIBLE);
        }
        else if (id == R.id.btn_scoreboard) {
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.GONE);
            currentLayout = R.id.layout_scoreboard;
            ((RelativeLayout) findViewById(currentLayout)).setVisibility(RelativeLayout.VISIBLE);
        }

    }
}
