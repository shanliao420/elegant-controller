/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.controller
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 12:33:12:33
 */
package work.tangthinker.elegantcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.tangthinker.elegantcontroller.annotation.NotControllerResponseAdvice;

/**
 * @author Jon Snow
 * @since 2023/6/26 12:33
 * ClassPath: work.tangthinker.elegantcontroller.controller.HealthController
 * Description:
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    @NotControllerResponseAdvice
    public String health(){
        return "success";
    }



}
