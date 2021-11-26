public class Television {
    private String model;
    private double price;

    public Television(){
        this.model = new String();
        this.price = 0.0;
    }// end two-arg constructor Television
    
    public Television(String initModel, double initPrice){
        this.model = initModel;
        this.price = initPrice;
    }// end two-arg constructor Television
    
    public void setModel( String newModel ){
        this.model = newModel;
    }// end method setModel
    
     
    public String getModel(){
        return this.model;
    }// end method getModel
    
    public void setPrice( double newPrice ){
        this.price = newPrice;
    }// end method setPrice
    
    public double getPrice(){
        return this.price;
    }// end method getPrice
    
    public String toString(){
        String output = new String();
        output = "The Model of this tv is: " + this.model +"\tPrice: " + this.price;
     
        return output;
    }// end method toString
 
}// end class Television
