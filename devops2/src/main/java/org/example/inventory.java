package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class inventory {
        private ArrayList<String> item= new ArrayList<>(Arrays.asList("phone","screen","laptop"));
        private ArrayList<Integer> quantity= new ArrayList<>(Arrays.asList(2,10,8));

//        private HashMap<String,Integer> product= new HashMap<>();
//        public inventory(){
//            product.put("samsung ",5);
//            product.put("oppo ",8);
//            product.put("xiamoi ",15);
//            product.put("realme ",9);
//            product.put("iphone ",4);
//        }
//        public void addProduct(String type, int no){
//
//        }
        public int addquantity(String type, int add) throws Exception {
            int newQuantity = 0;
            for (int i = 0; i <item.size() ; i++) {
                if(item.get(i).equalsIgnoreCase(type)){
                    newQuantity=quantity.get(i)+add;
                }else {
                    throw new Exception("Item not found");
                }
            }
            return newQuantity;
        }
        public int buyItem(String type, int purchase) throws Exception {
            int newQuantity = 0;
            for (int i = 0; i <item.size() ; i++) {
                if(item.get(i).equalsIgnoreCase(type)&& purchase<= quantity.get(i)){
                    newQuantity=quantity.get(i)-purchase;
                }else {
                    throw new Exception("unavailable quantity");
                }

            }
            return newQuantity;
        }
    }
