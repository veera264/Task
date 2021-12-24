package Customers;

public class customer_details {

    customer_details(String product_Name, String product_Model, double product_Price){
        this.product_Name=product_Name;
        this.product_Model=product_Model;
        this.product_Price=product_Price;
    }
    private String customer_Name;
    private String product_Name;
    private String product_Model;
    private double product_Price;

    public void set_Name(String name){
        customer_Name=name;
    }
    public String getCustomer_Name(){
        if(customer_Name!=null){
            return "Hello "+customer_Name;
        }
        return "Please set your name before getting name use 'set_Name method'";
    }
    public String getProduct_Model(){
        return "Product model: "+product_Model;
    }
    public String getProduct_Price(){
        return "Product price: "+product_Price+"/-";
    }
    public String getProduct_Name(){
            return "product name: "+product_Name;
    }
}
