package rx.com.rxmore.user.data.repository;

import javax.inject.Inject;
import io.reactivex.Observable;
import rx.com.rxmore.base.data.net.RetrofitFactory;
import rx.com.rxmore.base.data.protocol.BaseResp;
import rx.com.rxmore.user.data.api.UserApi;
import rx.com.rxmore.user.data.protocol.GetUserReq;
import rx.com.rxmore.user.model.User;


public class UsersRepository {

    @Inject
    UsersRepository(){

    }


    public Observable<BaseResp<User>> login(String moblie, String pwd, String pushId){
        return RetrofitFactory.getInstance().create(UserApi.class).getUser(new GetUserReq(moblie,pwd,pushId));
    }
}
