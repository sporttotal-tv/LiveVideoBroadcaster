package io.antmedia.android.broadcaster.event;

import android.content.Context;
import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import io.antmedia.android.broadcaster.Logger;
import io.antmedia.android.broadcaster.constants.LiveVideoBroadcasterStatus;

public class EventBroadcast {

    public static void sendEvent(MutableLiveData<LiveVideoBroadcasterStatus> liveData, LiveVideoBroadcasterStatus status) {

      //  liveData.setValue(status);
        liveData.postValue(status);
        Logger.d("Sending event :" + status.getName());
    }
}
