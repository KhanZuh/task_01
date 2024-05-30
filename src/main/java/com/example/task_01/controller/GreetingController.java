package com.example.task_01.controller;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    // Create a method which accepts a `GET` request and returns a string saying "Good afternoon <yourname>!", eg. `"Good afternoon Colin!"`
//    @GetMapping
//    public String greeting() {
//        return "Good afternoon Zuhair!";
//    }

    // - Refactor your controller to use your POJO instead of a string
//    @GetMapping
//    public Greeting getGreeting() {
//        return new Greeting("Zuhair", "Good afternoon");
//    }

    // Use a @RequestParam to get the value for timeOfDay from the url
    @GetMapping
    public Greeting greet(@RequestParam(value = "timeOfDay", defaultValue = "Afternoon") String timeOfDay) {
        return new Greeting("Zuhair", timeOfDay);
    }

    // Add a second method to the controller to accept a GET request to http://localhost:8080/greeting/summer. HINT: research adding a value argument to the @GetMapping annotation.
    // Have the route return a Celebration object with the message "Happy summer solstice!"
    // This is a DTO
    // A POJO (Plain Old Java Object) becomes a DTO (Data Transfer Object) when it is specifically designed to transfer data between different parts of an application, typically between a client and a server or between different layers of an application.
    @GetMapping(value = "/celebration")
    public Celebration celebration() {
        return new Celebration("Happy summer solstice!");
    }

}







