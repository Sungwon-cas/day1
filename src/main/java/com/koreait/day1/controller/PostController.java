package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    @PostMapping("value = /postMethod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){

        return multiParam;
    }
    @PutMapping("/putMethod")
    public  void put(){
        System.out.println("putMethod 호출");
    }
    @PatchMapping("/pathMethod")
    public void path(){
        System.out.println("PatchMethod 호출");
    }
    @DeleteMapping("/deleteMethod")
    public void delete(){
        System.out.println("DeleteMethod 호출");
    }
}
