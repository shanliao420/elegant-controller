/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.enity.app
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 12:40:12:40
 */
package work.tangthinker.elegantcontroller.enity.app;

import lombok.Getter;
import work.tangthinker.elegantcontroller.enity.result.StatusCode;

/**
 * @author Jon Snow
 * @since 2023/6/26 12:40
 * ClassPath: work.tangthinker.elegantcontroller.enity.app.AppCode
 * Description:
 */
@Getter
public enum AppCode implements StatusCode {

    APP_ERROR(2000, "业务异常"),
    PRICE_ERROR(2001, "价格异常");


    private int code;
    private String msg;

    AppCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
