package org.SpringBoot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShippingObj {
    private  String shippingID;
    private Address address;
    private int code;
    private boolean active;
}
