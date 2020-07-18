package net.tongark.webmvc.config.configurers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianClientConifgurer {

    @Bean
    public HessianProxyFactoryBean accountService(){
        HessianProxyFactoryBean factoryBean=new HessianProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8080/webmvc/remoting/AccountService");
        factoryBean.setServiceInterface(net.tongark.spring.webservice.account.AccountService.class);
        return factoryBean;
    }

}
