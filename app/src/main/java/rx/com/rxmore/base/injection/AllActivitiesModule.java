package rx.com.rxmore.base.injection;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rx.com.rxmore.base.injection.module.ActivityModule;
import rx.com.rxmore.base.injection.scope.ActivityScope;
import rx.com.rxmore.user.ui.activity.LoginActivity;


@Module
public abstract class AllActivitiesModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = ActivityModule.class)
    abstract LoginActivity contributeLoginActivitytInjector();
}
