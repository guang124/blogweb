package com.yzg.blogweb.controller;

import com.yzg.blogweb.mapper.StudentMapper;
import com.yzg.blogweb.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students= studentMapper.findAll();
        model.addAttribute("students",students);
        for (Student s:students
             ) {
            System.out.print(s.getId()+s.getName());
        }
        return "listStudent";
    }
}
