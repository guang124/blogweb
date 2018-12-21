package com.yzg.blogweb.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Student {
    @Getter @Setter
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter @Setter
    private Integer age;
}
