package rx.com.rxmore.user.service.impl;

import javax.inject.Inject;
import io.reactivex.Observable;
import rx.com.rxmore.base.rx.BaseFunction;
import rx.com.rxmore.user.data.repository.UsersRepository;
import rx.com.rxmore.user.model.User;
import rx.com.rxmore.user.service.UserService;

public class UserServiceImpl implements UserService{

    @Inject
    UserServiceImpl(){

    }

    @Inject
    UsersRepository repository;

    @Override
    public Observable<User> login(String mobile, String pwd, String pushId) {
        return repository.login(mobile,pwd,pushId).map(new BaseFunction<User>());
    }
}
