package com.elcarim.certverification.controller;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

        public class HelloController {
            @FunctionName("getBook")
            public HttpResponseMessage getBook(
                    @HttpTrigger(name = "req", methods = {HttpMethod.GET}, route = "books/{id}") HttpRequestMessage<Optional<String>> request,
                    @BindingName("id") int id,
                    final ExecutionContext context) {
                // Your Spring Boot application logic to handle GET requests here
                String responseBody = "Hello from Azure Function!"; // Replace this with your response content

                return request.createResponseBuilder(HttpStatus.OK)
                        .header("Content-Type", "text/plain")
                        .body(responseBody)
                        .build();
            }
        }


