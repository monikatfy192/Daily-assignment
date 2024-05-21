package com.example.hello.demo.HelloEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Adress {
    private String city;
    private String country;
    private String street;

}
