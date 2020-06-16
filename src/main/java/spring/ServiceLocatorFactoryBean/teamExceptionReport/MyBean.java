package spring.ServiceLocatorFactoryBean.teamExceptionReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBean {

    @Autowired
    private ExceptionReporterFactory exceptionReporterFactory;

    public void someBusinessMethod() {

        ExceptionReporter exceptionReporter = exceptionReporterFactory.getExceptionReporter("CUSTOMER_INFO_WRONG");

        exceptionReporter.bookedOrderReport();
    }
}
