package spring.ServiceLocatorFactoryBean.teamExceptionReport.reporter;

import org.springframework.stereotype.Component;
import spring.ServiceLocatorFactoryBean.teamExceptionReport.ExceptionReporter;

/**
 * @author jennyhui
 */
@Component("CUSTOMER_INFO_WRONG")
public class CustomerInfoWrongReporter implements ExceptionReporter {
    @Override
    public void bookedOrderReport() {

    }

    @Override
    public void normalOrderReport() {

    }
}
