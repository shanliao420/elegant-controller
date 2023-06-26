/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.enity
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 09:57:09:57
 */
package work.tangthinker.elegantcontroller.enity.result;

import lombok.Data;

/**
 * @author Jon Snow
 * @since 2023/6/26 09:57
 * ClassPath: work.tangthinker.elegantcontroller.enity.result.ResultVo
 * Description:
 */
@Data
public class ResultVo {

    private int code;

    private String msg;

    private Object data;

    public ResultVo(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo(Object data){
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMsg();
        this.data = data;
    }

    public ResultVo(StatusCode statusCode, Object data){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    public ResultVo(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = null;
    }




}
