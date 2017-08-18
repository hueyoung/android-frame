package com.ytl.frame;

import android.content.Context;
import android.taobao.atlas.runtime.AtlasPreLauncher;
import android.util.Log;

/**
 * Created by huyoung on 2017/8/18.
 * Description: atlas初始化前回调
 */

public class MyPreLaunch implements AtlasPreLauncher {
    @Override
    public void initBeforeAtlas(Context context) {
        Log.d("prelaunch", "prelaunch invokded");
    }
}
