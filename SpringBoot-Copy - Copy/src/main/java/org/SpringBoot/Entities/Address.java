package org.SpringBoot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    private String country;
    private String city;
    private String street;

//    public Address(String country, String city, String street) {
//        this.country = country;
//        this.city = city;
//        this.street = street;
//    }
}
