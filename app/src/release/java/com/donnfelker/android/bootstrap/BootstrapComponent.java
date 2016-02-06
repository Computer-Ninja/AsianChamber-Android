package com.lnidigitalmarketing.aacc;

import com.lnidigitalmarketing.aacc.authenticator.BootstrapAuthenticatorActivity;
import com.lnidigitalmarketing.aacc.core.TimerService;
import com.lnidigitalmarketing.aacc.ui.BootstrapActivity;
import com.lnidigitalmarketing.aacc.ui.BootstrapFragmentActivity;
import com.lnidigitalmarketing.aacc.ui.BootstrapTimerActivity;
import com.lnidigitalmarketing.aacc.ui.CheckInsListFragment;
import com.lnidigitalmarketing.aacc.ui.MainActivity;
import com.lnidigitalmarketing.aacc.ui.NavigationDrawerFragment;
import com.lnidigitalmarketing.aacc.ui.NewsActivity;
import com.lnidigitalmarketing.aacc.ui.NewsListFragment;
import com.lnidigitalmarketing.aacc.ui.UserActivity;
import com.lnidigitalmarketing.aacc.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
