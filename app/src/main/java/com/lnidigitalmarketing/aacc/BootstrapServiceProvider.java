package com.lnidigitalmarketing.aacc;

import android.accounts.AccountsException;
import android.app.Activity;

import com.lnidigitalmarketing.aacc.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
