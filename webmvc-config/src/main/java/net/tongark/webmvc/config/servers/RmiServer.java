package net.tongark.webmvc.config.servers;

import net.tongark.spring.webservice.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RmiServer {
    @Autowired
    private AccountService accountService;

    @Bean
    public RmiServiceExporter accountRmiService() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("AccountService");
        rmiServiceExporter.setService(accountService);
        rmiServiceExporter.setServiceInterface(AccountService.class);
        rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }
}
