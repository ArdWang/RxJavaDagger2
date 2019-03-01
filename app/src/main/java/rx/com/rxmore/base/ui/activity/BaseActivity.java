package rx.com.rxmore.base.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import dagger.android.AndroidInjection;

/**
   使用Rxlifecycer 需要继承
 */
public class BaseActivity extends RxAppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
}
