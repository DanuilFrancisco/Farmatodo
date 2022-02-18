package com.example.ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;




    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Document(collection = "numeros")
    public class Numbers {


        @Id
        private Map<Integer, Number> numbers;


    }

