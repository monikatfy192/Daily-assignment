package org.example;
    public class inventory {
        private String item1= "phone" ;
        private int quantity1= 2;

        private String item2= "screen" ;
        private int quantity2= 10;

        private String item3= "laptop" ;
        private int quantity3= 8;

        public int addquantity(String type, int quantity){
            if (type.equalsIgnoreCase("phone")) {
                return quantity1 + quantity;
            }if(type.equalsIgnoreCase("screen")) {
                return quantity2 + quantity;
            }if(type.equalsIgnoreCase("laptop")) {
                return quantity3 + quantity;
            }
            return 0;
        }
        public int buyItem(String type, int quantity) throws IllegalAccessException {
//            if ( quantity<=quantity1 ||quantity<=quantity2 || quantity<=quantity3){
//            throw new IllegalAccessException("THE QUANTITY IS NOT ENOUGH");
//            }
            if (type.equalsIgnoreCase("phone")&& quantity<=quantity1) {
                return quantity1 - quantity;
            }else if(type.equalsIgnoreCase("screen")&& quantity<=quantity2) {
                return quantity2 -quantity;
            }else if(type.equalsIgnoreCase("laptop")&& quantity<=quantity3) {
                return quantity3 - quantity;
            }
            return 0;
        }
        public int buyItem1(String type, int quantity) throws IllegalAccessException {
            if (type.equalsIgnoreCase("phone")&& quantity<=quantity1) {
                return quantity1 - quantity;
            }else if(type.equalsIgnoreCase("screen")&& quantity<=quantity2) {
                return quantity2 -quantity;
            }else if(type.equalsIgnoreCase("laptop")&& quantity<=quantity3) {
                return quantity3 - quantity;
            }else {
                throw new IllegalAccessException("THE QUANTITY IS NOT ENOUGH");
            }
        }
        public void addItem() throws Exception {
            throw new Exception("Item not found");
        }
    }
