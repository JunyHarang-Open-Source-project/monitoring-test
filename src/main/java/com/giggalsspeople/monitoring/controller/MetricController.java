package com.giggalsspeople.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricController {

    @GetMapping("/endpoint1")
    public String endPoint1() {
        return "[기깔나는 사람들] Metrics endPoint1번 작동";
    }

    @GetMapping("/endpoint2")
    public String endPoint2() {
        return "[기깔나는 사람들] Metrics endPoint2번 작동";
    }
}
