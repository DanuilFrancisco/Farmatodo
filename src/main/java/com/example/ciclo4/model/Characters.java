package com.example.ciclo4.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "personajes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Characters {

    @Id
    private String name;
    private String species;
    private String gender;
    private String image;
    private Location location;
}
