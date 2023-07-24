package com.driver;

public class Pizza {

    private int totalprice;
    private int cheeseprice;
    private int toppingprice;
    private int paperbagprice;
    private int baseprice;
    private Boolean isVeg;
    private String bill="";
    private Boolean ischeeseadded=false;
    private  Boolean istoppingssadded=false;
    private Boolean ispaperbagadded=false;
    private Boolean isBillGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg==true)
        {
            baseprice = 300;
            toppingprice=70;
        }
        else
        {
            baseprice=400;
            toppingprice=120;
        }
        cheeseprice = 80;
        paperbagprice=20;
        totalprice=baseprice;
    }

    public int getPrice(){
        return this.totalprice;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(!ischeeseadded)
        {
            totalprice += cheeseprice;
            ischeeseadded=true;
        }
    }

    public void addExtraToppings()
    {
        // your code goes here
        if(!istoppingssadded)
        {
            totalprice += toppingprice;
            istoppingssadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!ispaperbagadded)
        {
            totalprice+=paperbagprice;
            ispaperbagadded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            isBillGenerated=true;
            bill += "Base Price Of The Pizza: " + baseprice;
            if (ischeeseadded)
                bill += "\nExtra Cheese Added: " + cheeseprice;
            if (istoppingssadded)
                bill += "\nExtra Toppings Added: " + toppingprice;
            if (ispaperbagadded)
                bill += "\nPaperbag Added: " + paperbagprice;
            bill +="\nTotal Price: "+totalprice;
        }

       /* Base Price Of The Pizza: 300
        Extra Cheese Added: 80
        Extra Toppings Added: 70
        Paperbag Added: 20
        Total Price:*/
        return this.bill;
    }
}
