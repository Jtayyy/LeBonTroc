package com.lebontroc.controllers;

import com.lebontroc.models.Object;
import com.lebontroc.models.User;
import com.lebontroc.services.ObjectService;
import com.lebontroc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("objects")
@RestController
@RequiredArgsConstructor
public class ObjectController {
    private final ObjectService objectService;
    @GetMapping("")
    public List<Object> getAllObject() {
        return objectService.findAll();
    }
}
