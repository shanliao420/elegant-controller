/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.exception
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 10:19:10:19
 */
package work.tangthinker.elegantcontroller.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import work.tangthinker.elegantcontroller.enity.result.ResultCode;
import work.tangthinker.elegantcontroller.enity.result.ResultVo;
import work.tangthinker.elegantcontroller.exception.APIException;


/**
 * @author Jon Snow
 * @since 2023/6/26 10:19
 * ClassPath: work.tangthinker.elegantcontroller.aop.ControllerExceptionAdvice
 * Description:
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionAdvice {

    @ExceptionHandler({BindException.class})
    public ResultVo MethodArgumentNotValidExceptionHandler(BindException e){
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        log.error(objectError.getDefaultMessage());
        return new ResultVo(ResultCode.VALIDATE, objectError.getDefaultMessage());
    }


    @ExceptionHandler({APIException.class})
    public ResultVo APIExceptionHandler(APIException e){
        log.error(e.getMessage());
        return new ResultVo(e.getCode(), e.getMsg(), e.getMessage());
    }





}
