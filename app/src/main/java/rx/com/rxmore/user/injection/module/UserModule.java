package rx.com.rxmore.user.injection.module;



import dagger.Module;
import dagger.Provides;
import rx.com.rxmore.user.service.UserService;
import rx.com.rxmore.user.service.impl.UserServiceImpl;

@Module
public class UserModule {

    @Provides
    public UserService provideUserService(UserServiceImpl userService){
        return userService;
    }
}
