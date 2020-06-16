package spring.ServiceLocatorFactoryBean.teamExceptionReport;

import org.springframework.stereotype.Repository;

/**
 * @author jennyhui
 */
@Repository
public interface ExceptionReporter {

    void bookedOrderReport();

    void normalOrderReport();
}
