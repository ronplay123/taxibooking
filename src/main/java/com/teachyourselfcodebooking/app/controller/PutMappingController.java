package com.example.spring.boot.app.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
    @RestController
    @RequestMapping("/putExample")
    public class PutMappingController {

    @Autowired
    PutMappingService service;

    @GetMapping("/getAllItems")
    public List<Item> getAllItems() {
        return service.getAllItems();
    }
@PutMapping("/updateItems")
        public String updateItems(@RequestBody Item item) {
        return service.updateItems(item);
}

}
