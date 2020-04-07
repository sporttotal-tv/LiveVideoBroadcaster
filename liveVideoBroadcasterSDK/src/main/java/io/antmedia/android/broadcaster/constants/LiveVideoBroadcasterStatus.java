package io.antmedia.android.broadcaster.constants;

public enum LiveVideoBroadcasterStatus {
    IDLE("idle"), STOPPED ("stopped"), STREAMING("streaming"), STOPPING_SAFELY("stopping_safely"),  NETWORK_PAUSED("network_paused"), NETWORK_RESUMED("network_resumed");

    private String name;

    LiveVideoBroadcasterStatus (String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}
