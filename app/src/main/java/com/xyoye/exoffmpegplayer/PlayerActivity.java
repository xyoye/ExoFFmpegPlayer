package com.xyoye.exoffmpegplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xyy on 2019/7/10.
 */

public class PlayerActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String videoPath = getIntent().getStringExtra("video_path");
        setContentView(new IPlayerView(this, videoPath));
    }
}
