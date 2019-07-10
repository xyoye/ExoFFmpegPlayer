package com.xyoye.exoffmpegplayer;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.xyoye.exoffmpeg.ExoFFmpegPlayer;

import java.io.File;

/**
 * Created by xyy on 2019/2/19.
 */

public class IPlayerView extends FrameLayout {
    private Context mContext;

    PlayerView playerView;
    SimpleExoPlayer exoPlayer;
    private String videoPath;

    public IPlayerView(@NonNull Context context, String videoPath) {
        super(context);
        this.mContext = context;
        this.videoPath = videoPath;

        init();
    }

    private void init(){
        View.inflate(mContext, R.layout.activity_player, this);
        playerView = this.findViewById(R.id.player_view);

        exoPlayer = new ExoFFmpegPlayer(mContext);
        exoPlayer.setPlayWhenReady(true);

        playerView.setPlayer(exoPlayer);

        Uri uri = Uri.fromFile(new File(videoPath));
        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(mContext, Util.getUserAgent(mContext, "exoplayerdemo"));
        MediaSource videoSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(uri);
        exoPlayer.prepare(videoSource);
    }
}
