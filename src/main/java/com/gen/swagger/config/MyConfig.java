package com.gen.swagger.config;

import io.swagger.client.ApiClient;
import io.swagger.client.api.DocControllerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Value("${doc.profiles.host.uri}")
    private String HOST_PATH;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient().setBasePath(HOST_PATH);
    }

    @Bean
    public DocControllerApi docControllerApi() {
        return new DocControllerApi(apiClient());
    }

}
