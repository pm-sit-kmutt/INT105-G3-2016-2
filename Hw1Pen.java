class Hw1Pen {
    
    private long productId;
    private String model;
    private String brand;
    private double price;
    private static int count;
    private static String all; 
    
    public void setProductId(long pid){
        productId=pid;
    }
    public long getProductId(){
        return productId;
    }
    public void setModel(String penModel){
        model=penModel;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String penBrand){
        brand=penBrand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double penPrice){
        price=penPrice;
    }
    public double getPrice(){
        return price;
    }
    public Hw1Pen(){
        this(0,null,null,0);
    }
    public Hw1Pen(long productId){
        this(productId,null,null,0);
    }
    public Hw1Pen(long productId, String model){
        this(productId,model,null,0);
    }
    public Hw1Pen(long productId, String model, String brand){
        this(productId,model,brand,0);
    }
    public Hw1Pen(long productId, String model, String brand, double price){
        count++;
        this.productId=productId;
        this.model=model;
        this.brand=brand;
        this.price=price;
        Hw1Pen.all+="\nProduct ID :"+productId+"\nModel :"+model+"\nBrand :"+brand+"\nPrice :"+price+"\n-------------"; 
    }
    public static int numberOfPen() {
        return count;
    }
    public static String allPen(){
        return all;
    } 
}
