package com.spring_backstage_test.spring_test.utils.http;

import org.springframework.http.HttpMethod;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Get extends HttpPadrao {

    @Override
    protected HttpMethod method() {
        return HttpMethod.GET;
    }

}
