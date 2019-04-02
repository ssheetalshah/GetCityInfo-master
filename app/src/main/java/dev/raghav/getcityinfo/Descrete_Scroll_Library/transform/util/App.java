package dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.util;

import android.app.Application;

import dev.raghav.getcityinfo.Descrete_Scroll_Library.transform.DiscreteScrollViewOptions;


public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DiscreteScrollViewOptions.init(this);
    }
}
