/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.exception
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 11:08:11:08
 */
package work.tangthinker.elegantcontroller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import work.tangthinker.elegantcontroller.enity.app.AppCode;
import work.tangthinker.elegantcontroller.enity.result.ResultCode;
import work.tangthinker.elegantcontroller.enity.result.StatusCode;

/**
 * @author Jon Snow
 * @since 2023/6/26 11:08
 * ClassPath: work.tangthinker.elegantcontroller.exception.APIException
 * Description:
 */
@Data
public class APIException extends RuntimeException{

    private int code;
    private String msg;

    public APIException(StatusCode statusCode, String message){
        super(message);
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public APIException(String message){
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMsg();
    }



}
