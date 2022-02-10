package com.spring.bootexamples.configuration;

import io.prometheus.client.exporter.MetricsServlet;
import io.prometheus.client.hotspot.DefaultExports;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

public class MetricsConfig {

    public static final String PROMETHEUS = "/prometheus";

    @Bean
    ServletRegistrationBean<MetricsServlet> servletRegistrationBean() {
        DefaultExports.initialize();
        return new ServletRegistrationBean<>(new MetricsServlet(), PROMETHEUS);
    }
}
