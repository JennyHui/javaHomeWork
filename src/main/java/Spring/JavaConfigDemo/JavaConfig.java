package Spring.JavaConfigDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jennyhui
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService);
        return userFunctionService;
    }
}
