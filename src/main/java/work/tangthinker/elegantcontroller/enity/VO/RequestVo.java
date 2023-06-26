/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.enity.VO
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 10:07:10:07
 */
package work.tangthinker.elegantcontroller.enity.VO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author Jon Snow
 * @since 2023/6/26 10:07
 * ClassPath: work.tangthinker.elegantcontroller.enity.VO.RequestVo
 * Description:
 */
@Data
public class RequestVo {



    @NotNull(message = "requestId不能为空")
    @Min(value = 0, message = "requestId不能小于0")
    private Integer requestId;



}
