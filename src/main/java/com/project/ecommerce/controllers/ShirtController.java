package com.project.ecommerce.controllers;

import com.project.ecommerce.buisiness.ShirtService;
import com.project.ecommerce.entities.ShirtModel;
import com.project.ecommerce.entities.dtos.ShirtRecordDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/shirts")
public class ShirtController {

    @Autowired
    ShirtService shirtService;

    @PostMapping
    public ResponseEntity<ShirtModel> registerShirt(@RequestBody @Valid ShirtRecordDto shirtRecordDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(shirtService.registerShirt(shirtRecordDto));
    }

    @GetMapping
    public ResponseEntity<List<ShirtModel>> getShirts(){
        return ResponseEntity.status(HttpStatus.OK).body(shirtService.getAllShirts());
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getShirt(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(shirtService.getShirt(id));
    }

}
