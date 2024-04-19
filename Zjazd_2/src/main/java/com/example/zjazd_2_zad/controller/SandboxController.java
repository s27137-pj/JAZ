package com.example.zjazd_2_zad.controller;

import com.example.zjazd_2_zad.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sandbox")
public class SandboxController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> printCar(){
        return ResponseEntity.ok(new Car("audi", "a2", "123"));

    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> printValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/param")
    public ResponseEntity<String> printParam(@RequestParam String someValue1){
        return ResponseEntity.ok(someValue1);
    }

    @PostMapping("/test/model")
    public ResponseEntity<Car> printCar(@RequestBody Car car){
        return ResponseEntity.ok(car);

    }




}
