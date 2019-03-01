package rx.com.rxmore.user.presenter;


import javax.inject.Inject;

import rx.com.rxmore.base.presenter.BasePresenter;
import rx.com.rxmore.base.rx.BaseObserver;
import rx.com.rxmore.user.data.repository.UserRepository;
import rx.com.rxmore.user.model.User;
import rx.com.rxmore.user.presenter.view.UserView;
import rx.com.rxmore.user.service.UserService;

public class UserPresenter extends BasePresenter<UserView>{

    @Inject
    UserPresenter(){

    }

    private UserRepository userRepository;

    @Inject
    UserService userService;



    public void getUser(String phone, String password, String pushid){

        userRepository = new UserRepository();

        if(!checkNetWork()){
            return;
        }

        mView.showLoading();

        /*userRepository.getUser(phone,password,pushid,lifeAProvider).subscribe(new BaseObserver<User>(mView){
            @Override
            public void onNext(User user) {
                mView.onGetUserResult(user);
            }
        });*/
    }

    public void login(String phone, String password, String pushid){
        if(!checkNetWork()){
            return;
        }

        mView.showLoading();

        userService.login(phone,password,pushid).subscribe(new BaseObserver<User>(mView){
            @Override
            public void onNext(User user) {
                mView.onGetUserResult(user);
            }
        });
    }





}
