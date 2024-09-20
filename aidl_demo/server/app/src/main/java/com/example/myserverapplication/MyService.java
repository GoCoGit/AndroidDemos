package com.example.myserverapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;


public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final Binder mBinder = new IMyAidlInterface.Stub() {
        @Override
        public int sum(int a, int b) throws RemoteException {
            return a + b - 1;
        }
    };
}