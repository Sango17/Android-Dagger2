package com.alexandreseneviratne.android_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alexandre SENEVIRATNE on 31/10/2018.
 */
@Module
public class MemberDataModule {

    @Singleton
    @Provides
    MemberDataManager provideMemberDataManager() {
        return new MemberDataManager();
    }
}
