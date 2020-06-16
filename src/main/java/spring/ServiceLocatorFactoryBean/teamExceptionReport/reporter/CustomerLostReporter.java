package spring.ServiceLocatorFactoryBean.teamExceptionReport.reporter;

import org.springframework.stereotype.Component;
import spring.ServiceLocatorFactoryBean.teamExceptionReport.ExceptionReporter;

/**
 * @author jennyhui
 */
@Component("CUSTOMER_LOST")
public class CustomerLostReporter implements ExceptionReporter {
    @Override
    public void bookedOrderReport() {

    }

    @Override
    public void normalOrderReport() {

    }
}
