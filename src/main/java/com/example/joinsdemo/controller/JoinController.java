package com.example.joinsdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.joinsdemo.model.Enrollment;
import com.example.joinsdemo.service.JoinService;

@RestController
@RequestMapping("/api/joins")
public class JoinController {
private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @GetMapping("/inner")
    public List<Enrollment> innerJoin() {
        return joinService.getInnerJoinData();
    }

    @GetMapping("/left")
    public List<Enrollment> leftJoin() {
        return joinService.getLeftJoinData();
    }

    @GetMapping("/right")
    public List<Enrollment> rightJoin() {
        return joinService.getRightJoinData();
    }

    @GetMapping("/full")
    public List<Object[]> fullJoin() {
        return joinService.getFullJoinData();
    }
}
