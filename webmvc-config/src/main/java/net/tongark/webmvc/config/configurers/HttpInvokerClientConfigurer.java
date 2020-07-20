package net.tongark.webmvc.config.configurers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class HttpInvokerClientConfigurer {

    @Bean
    public HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean(){
        HttpInvokerProxyFactoryBean factoryBean=new HttpInvokerProxyFactoryBean();
        factoryBean.setServiceUrl("http://127.0.0.1:12710/HttpInvokerAccountService");
        factoryBean.setServiceInterface(net.tongark.spring.webservice.account.AccountService.class);
        return factoryBean;
    }
}
