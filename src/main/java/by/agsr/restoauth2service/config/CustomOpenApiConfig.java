package by.agsr.restoauth2service.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class CustomOpenApiConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI().info(metaData());
    }

    private Info metaData() {
        return new Info()
                .title("Test task for AGSR")
                .description("CRUD REST for AGSR")
                .version("1.0.0")
                .license(apiLicence());
    }

    private License apiLicence() {
        return new License()
                .name("Apache License Version 2.0")
                .url("https://www.apache.org/licenses/LICENSE-2.0");
    }
}
