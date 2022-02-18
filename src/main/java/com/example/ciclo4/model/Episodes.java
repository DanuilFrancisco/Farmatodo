package com.example.ciclo4.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "episodios")
public class Episodes {


    @Id
    private Integer episode;
    private Date episodeName;
    private Map<String, Characters> characters;


}
