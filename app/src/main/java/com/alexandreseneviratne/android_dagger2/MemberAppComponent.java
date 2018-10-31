package com.alexandreseneviratne.android_dagger2;

import dagger.Component;

/**
 * Created by Alexandre SENEVIRATNE on 31/10/2018.
 */

@Component
public interface MemberAppComponent {
    void inject(MainActivity mainActivity);
}
