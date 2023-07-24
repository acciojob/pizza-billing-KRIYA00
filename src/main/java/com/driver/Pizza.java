package com.driver;

public class Pizza {

    private int totalprice;
    private int cheeseprice;
    private int toppingprice;
    private int paperbagprice;
    private int baseprice;
    private Boolean isVeg;
    private String bill;
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
        bill="Base Price Of The Pizza: " + baseprice+"\n";
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

            if (ischeeseadded)
                bill += "Extra Cheese Added: " + cheeseprice+"\n";
            if (istoppingssadded)
                bill += "Extra Toppings Added: " + toppingprice+"\n";
            if (ispaperbagadded)
                bill += "Paperbag Added: " + paperbagprice+"\n";
                 bill +="Total Price: "+totalprice+"\n";
        }

       /* Base Price Of The Pizza: 300
        Extra Cheese Added: 80
        Extra Toppings Added: 70
        Paperbag Added: 20
        Total Price:*/
        return this.bill;
    }
}
