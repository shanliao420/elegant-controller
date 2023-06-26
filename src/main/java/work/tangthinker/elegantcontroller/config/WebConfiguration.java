/*
 * ProjectName: elegant-controller
 * PackageName: work.tangthinker.elegantcontroller.config
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-26 12:09:12:09
 */
package work.tangthinker.elegantcontroller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author Jon Snow
 * @since 2023/6/26 12:09
 * ClassPath: work.tangthinker.elegantcontroller.config.WebConfiguration
 * Description:
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
         converters.removeIf(x -> x instanceof StringHttpMessageConverter);
    }
}
