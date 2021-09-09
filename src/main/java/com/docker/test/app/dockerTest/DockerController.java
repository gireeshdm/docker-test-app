package com.docker.test.app.dockerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DockerController {
@GetMapping("/")
public String testGet() {
	return "Hi Docker is working";
}
}
