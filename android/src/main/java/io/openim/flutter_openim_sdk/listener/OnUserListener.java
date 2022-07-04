package io.openim.flutter_openim_sdk.listener;

import io.openim.flutter_openim_sdk.util.CommonUtil;

public class OnUserListener implements open_im_sdk_callback.OnUserListener {
    // feature_user_quit专有方法
    @Override
    public void onSelfInfoUpdated(String s) {
        CommonUtil.emitEvent("userListener", "onSelfInfoUpdated", s);
    }

    @Override
    public void onUserQuit(String s) {

    }
}