package com.dots.aidlserver

import android.app.Service
import android.content.Intent
import android.os.IBinder

class RemoteService : Service() {
    var mBinder :RemoteAidlInterface.Stub = object :RemoteAidlInterface.Stub(){
        override fun getName(name:String): String {
            return name
        }

        override fun setName(name:String): String {
            return name
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return mBinder;
    }


}