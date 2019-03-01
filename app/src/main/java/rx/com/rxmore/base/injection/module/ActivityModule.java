package rx.com.rxmore.base.injection.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import rx.com.rxmore.base.injection.scope.ActivityScope;

@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    public Activity provideActivity(){
        return new Activity();
    }
}
