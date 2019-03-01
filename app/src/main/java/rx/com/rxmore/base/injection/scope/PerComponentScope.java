package rx.com.rxmore.base.injection.scope;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.inject.Scope;


/**
 * 组件及作用域
 */
@Scope
@Retention(RUNTIME)
public @interface PerComponentScope {

}
