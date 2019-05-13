package com.frank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @ Author     ：杨晓波
 * @ Date       ：Created in 13:10 2019-02-18
 * @ Description：路由配置
 * @ Modified By：
 */
@Configuration
public class RouteConfig {
    @Autowired
    private TimeHandle timeHandle;

    @Bean
    public RouterFunction<ServerResponse> timerRouter() {
        return route(GET("/time"), req -> timeHandle.getTime(req))
                .andRoute(GET("/date"), timeHandle::getDate);  // 这种方式相对于上一行更加简洁
    }
}
