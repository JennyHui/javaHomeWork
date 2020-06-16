package spring.ServiceLocatorFactoryBean.teamExceptionReport;

import org.springframework.stereotype.Repository;

/**
 * @author jennyhui
 */
@Repository
public interface ExceptionReporterFactory {

    ExceptionReporter getExceptionReporter(String reporterName);
}
