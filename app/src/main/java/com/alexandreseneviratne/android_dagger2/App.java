package com.alexandreseneviratne.android_dagger2;

import android.app.Application;

/**
 * Created by Alexandre SENEVIRATNE on 31/10/2018.
 */
public class App extends Application {
    private static App app;
    private MemberAppComponent memberAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        memberAppComponent = DaggerMemberAppComponent.builder()
                .memberDataModule(new MemberDataModule())
                .build();
    }

    public static App getApp() {
        return app;
    }

    public MemberAppComponent getMemberAppComponent() {
        return memberAppComponent;
    }
}
