package com.example.zjazd_2_zad.controller;

import com.example.zjazd_2_zad.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class Homework {


    Car car1 = new Car("sss", "aaa", "12");


    @GetMapping("/{someValue}")
    @ResponseBody
    public ResponseEntity<String> printValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/param")
    @ResponseBody
    public ResponseEntity<String> printParam(@RequestParam String someValue1){
        return ResponseEntity.ok(someValue1);
    }

    @PutMapping("/put")
    public ResponseEntity<Car> putParam(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @PutMapping("/put/{someValue}")
    public ResponseEntity<Car> putParam(@PathVariable String someValue){
        car1.setModel(someValue);
        return ResponseEntity.ok(car1);
    }

    @PostMapping("/post")
    public ResponseEntity<Car> printCar(@RequestBody Car car){
        return ResponseEntity.ok(car);

    }

    @DeleteMapping("/delete/{someValue}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Car> delete(@PathVariable String someValue){
        car1.setModel(someValue);
        return new  ResponseEntity<>(HttpStatus.OK);

    }

}
