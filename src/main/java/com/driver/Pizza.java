package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBillGenerated;
    private boolean isTakeAwayAdded;
    private int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg)
        {
            this.basePrice=300;
            this.price=300;
            this.toppings=70;
        }
        else
        {
            this.basePrice=400;
            this.price=400;
            this.toppings=120;
        }
        this.isBillGenerated=false;
        this.isTakeAwayAdded=false;
        this.isToppingsAdded=false;
        this.isCheeseAdded=false;
        this.bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price=this.price+80;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price=this.price+toppings;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price=this.price+20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){

            this.bill+="Base Price Of The Pizza: "+basePrice+"\n";
            if(isCheeseAdded)
            this.bill+="Extra Cheese Added: 80"+"\n";

            if(isToppingsAdded)
            this.bill+="Extra Toppings Added: "+toppings+"\n";

            if(isTakeAwayAdded)
            this.bill+="Paperbag Added: 20"+"\n";

            this.bill+="Total Price: "+price+"\n";
            isBillGenerated=true;
        }

        return this.bill;
    }
}
