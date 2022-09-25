package com.example.com_jc_tree.controller;

import com.example.com_jc_tree.service.PythonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/python")
public class PythonController {
    @Autowired
    private PythonServiceImpl pythonService;

    @RequestMapping("/python")
    public void face() throws IOException {
        pythonService.faceRecognition();
    }
}


