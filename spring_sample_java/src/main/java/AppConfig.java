import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
////        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
////        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }
    
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
