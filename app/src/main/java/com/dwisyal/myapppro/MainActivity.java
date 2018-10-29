package com.dwisyal.myapppro;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView moView;
    Adapter adapView;
    List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moView = (RecyclerView)findViewById(R.id.movieView);
        moView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));

        movieLoad("top_rated");
    }
}
