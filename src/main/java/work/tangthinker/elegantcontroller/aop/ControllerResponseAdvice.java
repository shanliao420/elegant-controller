/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.aop
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 11:01:11:01
 */
package work.tangthinker.elegantcontroller.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import work.tangthinker.elegantcontroller.annotation.NotControllerResponseAdvice;
import work.tangthinker.elegantcontroller.enity.result.ResultCode;
import work.tangthinker.elegantcontroller.enity.result.ResultVo;
import work.tangthinker.elegantcontroller.exception.APIException;

/**
 * @author Jon Snow
 * @since 2023/6/26 11:01
 * ClassPath: work.tangthinker.elegantcontroller.aop.ControllerResponseAdvice
 * Description:
 */
@RestControllerAdvice(basePackages = {"work.tangthinker.elegantcontroller"})
public class ControllerResponseAdvice implements ResponseBodyAdvice<Object> {


    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        // 判断返回类型不为ResultVo， 如果返回类型已经为ResultVo则不用拦截
        return !(returnType.getParameterType().isAssignableFrom(ResultVo.class)
                || returnType.hasMethodAnnotation(NotControllerResponseAdvice.class));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//        if(returnType.getGenericParameterType().equals(String.class)){
//            ObjectMapper objectMapper = new ObjectMapper();
//            try {
//                return objectMapper.writeValueAsString(new ResultVo(body));
//            } catch (JsonProcessingException e) {
//                throw new APIException(ResultCode.RESPONSE_PACK_ERROR, e.getMessage());
//            }
//        }

        return new ResultVo(body);
    }
}
