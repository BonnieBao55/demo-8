package com.example.demo.Services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Models.Item;



@Service
public class ItemService {
    
    public void getAllItems() {
        String url = "http://localhost:8080/api/items";

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.exchange(url,
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<List<Item>>() { });
            
    
        
    }
}