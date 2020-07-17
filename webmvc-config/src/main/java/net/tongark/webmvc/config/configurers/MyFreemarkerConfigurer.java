package net.tongark.webmvc.config.configurers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
public class MyFreemarkerConfigurer {

    /**
     * FreeMarker 视图配置
     *
     * @return
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        //该方法需要添加spring-context-support依赖
        configurer.setTemplateLoaderPath("/WEB-INF/views/freemarker");
        return configurer;
    }
}
