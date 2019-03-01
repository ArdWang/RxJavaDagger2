package rx.com.rxmore.base.injection.component;



import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import rx.com.rxmore.base.common.MainApplication;
import rx.com.rxmore.base.injection.AllActivitiesModule;



@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitiesModule.class})
public interface AppComponent{
    void inject(MainApplication application);
}
