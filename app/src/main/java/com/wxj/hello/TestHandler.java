package com.wxj.hello;

import android.os.Handler;
import android.os.HandlerThread;


/**
 * Created by Xuejian on 2017/8/15.
 */

public class TestHandler {
    public static Handler handler;
    private static HandlerThread handlerThread;
    public static Handler reqHandler(){
        if(handlerThread == null){
            handlerThread = new HandlerThread("test");
            handlerThread.start();
        }
        if (handler == null){
            handler = new Handler(handlerThread.getLooper());
        }
        return handler;
    }

    private static final class MyHandler extends Handler{

    }

}
