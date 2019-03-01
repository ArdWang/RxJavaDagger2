package rx.com.rxmore.user.service;


import io.reactivex.Observable;
import rx.com.rxmore.user.model.User;

public interface UserService {

    Observable<User> login(String mobile, String pwd, String pushId);
}
