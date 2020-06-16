package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MaskAop {

    @Pointcut("@annotation(MaskMethod)")
    public void pointcut() {
    }

    // 定义 advise
    @Before("pointcut()")
    public void maskFieldProcess(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().toShortString());
        System.out.println(joinPoint.getArgs());
    }
}