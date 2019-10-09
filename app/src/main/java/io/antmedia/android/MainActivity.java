package io.antmedia.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.antmedia.android.liveVideoBroadcaster.*;
import io.antmedia.android.liveVideoPlayer.LiveVideoPlayerActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * PLEASE WRITE RTMP BASE URL of the your RTMP SERVER.
     */
    public static final String RTMP_BASE_URL = "rtmp://26f22bd7eb73461282e47bfb07820e4e-sttvmamprodmediaservice-euwe.channel.media.azure.net:1935/live/"; //"rtmp://10.10.31.87/LiveApp/";
    public static final String RTMP_STREAM_NAME ="fe67390cc8e3496185df2d06d929cafa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(io.antmedia.android.liveVideoBroadcaster.R.layout.activity_main);
    }

    public void openVideoBroadcaster(View view) {
        Intent i = new Intent(this, LiveVideoBroadcasterActivity.class);
        startActivity(i);
    }

    public void openVideoPlayer(View view) {
        Intent i = new Intent(this, LiveVideoPlayerActivity.class);
        startActivity(i);
    }
}
