package rx.com.rxmore.base.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import rx.com.rxmore.base.injection.component.DaggerAppComponent;


public class MainApplication extends Application implements HasActivityInjector{

    public static Context context;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        DaggerAppComponent.create().inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
