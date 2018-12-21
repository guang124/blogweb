package com.yzg.blogweb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer age;
}
