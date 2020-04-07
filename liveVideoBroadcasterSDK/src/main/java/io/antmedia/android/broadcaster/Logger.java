package io.antmedia.android.broadcaster;

import android.util.Log;

public class Logger {

    public static void d(String message) {
        Log.d("LiveVideoBroadcaster" , "LVB:" +  message);
    }

    public static void state(Class c, String message) {
        Log.i("LiveVideoBroadcaster" , "State(" + c.getName() +"):"  +  message);
    }
}
