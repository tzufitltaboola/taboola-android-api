package com.taboola.samples.articlefeed;

import android.app.Application;

import com.taboola.android.api.TaboolaApi;
import com.taboola.samples.endlessfeed.R;

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TaboolaApi.getInstance().init(getApplicationContext(), "betterbytheminute-app",
                "4f1e315900f2cab825a6683d265cef18cc33cd27");
        TaboolaApi.getInstance().setImagePlaceholder(getResources().getDrawable(R.drawable.image_placeholder));
    }
}
