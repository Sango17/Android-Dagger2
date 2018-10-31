package com.alexandreseneviratne.android_dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Alexandre SENEVIRATNE on 31/10/2018.
 */

@Singleton
@Component(modules = MemberDataModule.class)
public interface MemberAppComponent {
    void inject(MainActivity mainActivity);
}
