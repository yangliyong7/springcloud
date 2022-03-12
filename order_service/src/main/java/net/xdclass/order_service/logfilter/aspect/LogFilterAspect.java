package net.xdclass.order_service.logfilter.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static net.xdclass.order_service.logfilter.config.LogFilterConfiguration.POINT_CUT_EXPR;

@Aspect
@Component
public class LogFilterAspect {
    private String expr;
    @Pointcut(POINT_CUT_EXPR)
    public void logFilter() {
    }

    public LogFilterAspect() {
        this.expr = "expr";
    }

    @Around("logFilter()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Signature signature = point.getSignature();
        if(Objects.nonNull(signature)){
            System.out.println(signature.getDeclaringType());
        }
        signature.getDeclaringType();
        System.out.println(expr);
        return point.proceed();
    }
}
