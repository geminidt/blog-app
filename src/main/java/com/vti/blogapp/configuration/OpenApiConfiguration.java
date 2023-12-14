package com.vti.blogapp.configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Blog Application REST APIs",
                description = "Blog Application REST APIs Documentation",
                termsOfService = "https://github.com/khoa-omega/blog-app",
                contact = @Contact(
                        name = "Đặng Hữu Thịnh",
                        url = "https://github.com/geminidt",
                        email = "geminidt@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                version = "v1.0"
        ),
        servers = @Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        ),
        externalDocs = @ExternalDocumentation(
                description = "Blog Application Github",
                url = "https://github.com/khoa-omega/blog-app"
        )
)
public class OpenApiConfiguration {

}
