package net.xdclass.order_service.logfilter.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LogFilterConfiguration {
    public static final String POINT_CUT_EXPR = "execution(* *..save(..))";


}
