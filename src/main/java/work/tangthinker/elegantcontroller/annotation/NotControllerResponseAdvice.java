/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.annotation
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 12:36:12:36
 */
package work.tangthinker.elegantcontroller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jon Snow
 * @since 2023/6/26 12:36
 * ClassPath: work.tangthinker.elegantcontroller.annotation.NotControllerResponseAdvice
 * Description:
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotControllerResponseAdvice {
}
