package com.example.hello.demo.HelloEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShippingObj {
    private int shippingId;
    private Adress adress;
    private int code;
    private boolean active;

}
