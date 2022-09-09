package com.example.thithuchanh.controller;

import com.example.thithuchanh.model.Country;
import com.example.thithuchanh.sevice.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("countries")
public class CountryController {
@Autowired
    private ICountryService iCountryService;
@GetMapping
    private ResponseEntity<List<Country>> display(){
    return new ResponseEntity<>(iCountryService.findAll(), HttpStatus.OK);
}
}
