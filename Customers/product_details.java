package Customers;

public class product_details {
    public static void main(String args[]){
        customer_details cd=new customer_details("Samsung","M31",17000);
        cd.set_Name("Veera");
        System.out.println(cd.getCustomer_Name());
        System.out.println(cd.getProduct_Name());
        System.out.println(cd.getProduct_Model());
        System.out.println(cd.getProduct_Price());
    }
}
