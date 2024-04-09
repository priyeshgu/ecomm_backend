package dev.priyesh.EcommProductService.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public ResponseEntity hi(){
        return  ResponseEntity.ok("Hi");
    }
    @DeleteMapping("/del")
    public ResponseEntity del(){
        return ResponseEntity.ok("del map working");
    }
}
