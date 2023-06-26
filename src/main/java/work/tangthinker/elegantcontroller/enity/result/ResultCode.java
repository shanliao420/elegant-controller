/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.enity
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 09:51:09:51
 */
package work.tangthinker.elegantcontroller.enity.result;

import lombok.Getter;

/**
 * @author Jon Snow
 * @since 2023/6/26 09:51
 * ClassPath: work.tangthinker.elegantcontroller.enity.result.ResultCode
 * Description:
 */
@Getter
public enum ResultCode implements StatusCode{


    SUCCESS(1000, "请求成功"),
    FAILED(1001, "请求失败"),
    VALIDATE(1002, "参数校验失败"),
    RESPONSE_PACK_ERROR(1003, "response包装失败");

    private int code;
    private String msg;

    ResultCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
