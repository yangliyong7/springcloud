package net.xdclass.order_service.logfilter.annotation;


import net.xdclass.order_service.logfilter.config.LogFilterConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({LogFilterConfiguration.class})
public @interface EnableLogFilter {
}
