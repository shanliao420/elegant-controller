/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.controller
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 09:47:09:47
 */
package work.tangthinker.elegantcontroller.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.tangthinker.elegantcontroller.enity.VO.RequestVo;
import work.tangthinker.elegantcontroller.enity.app.AppCode;
import work.tangthinker.elegantcontroller.enity.result.ResultVo;
import work.tangthinker.elegantcontroller.exception.APIException;

/**
 * @author Jon Snow
 * @since 2023/6/26 09:47
 * ClassPath: work.tangthinker.elegantcontroller.controller.HelloController
 * Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/get")
    public String hello(@Validated RequestVo requestVo){
        String result = "Hello Elegant Controller! -> requestId:" + requestVo.getRequestId();
        return result;
    }


    @GetMapping("/throw")
    public Object throw_(){
        throw new APIException(AppCode.PRICE_ERROR, "异常测试:" + 1);
    }





}
