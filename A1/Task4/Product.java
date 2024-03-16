package A1.Task4;

public class Product {
    private String id;
    private String name;
    private int price;
    private int quantity;
    Product(){
        id = "";
        name = "";
        price = 0;
        quantity = 0;
    }

    //Setters
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Getters
    public String getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    //Method for total value of Product
    public int totalValue(){
        int totalvalue = price*quantity;
        return totalvalue;
    }
    public void itemDetails(){
        System.out.println("=================");
        System.out.println("id : "+ id);
        System.out.println("name : "+ name);
        System.out.println("price : "+ price);
        System.out.println("quantity : "+ quantity);
        System.out.println("Total : "+ totalValue());
        System.out.println("=================");
    }
}