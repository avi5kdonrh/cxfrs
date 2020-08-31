package org.example;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class RouteTest extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxfrs:bean:rsBean")
                .log("${body}")
                .setBody(constant("Inter"));
    }


}
