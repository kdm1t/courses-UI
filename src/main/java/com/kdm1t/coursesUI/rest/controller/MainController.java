package com.kdm1t.coursesUI.rest.controller;

import com.kdm1t.coursesUI.model.entity.CourseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    @RequestMapping(value = "/get_courses", method = RequestMethod.GET)
    public String getCourses(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<CourseDTO>> response = restTemplate.exchange("http://localhost:8088/courses/get_all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );
//        System.out.println(response.getBody());
        model.addAttribute("values", response.getBody() != null ? response.getBody() : new ArrayList<>());
        return "courses";
    }

}
