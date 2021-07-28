package com.food;

public class Food {

    protected boolean isExpired;
    protected boolean isRaw;
    protected boolean isFrozen;
    protected int daysUntilExpiration;

    public Food(){
        this.isExpired = false;
        this.isRaw = true;
        this.isFrozen = false;
        this.daysUntilExpiration = 7;
    }

    public Food(boolean isExpired, boolean isRaw, boolean isFrozen, int daysUntilExpiration){
        this.isExpired = isExpired;
        this.isRaw = isRaw;
        this.isFrozen = isFrozen;
        this.daysUntilExpiration = daysUntilExpiration;
        if(this.daysUntilExpiration<0){
            this.isExpired = true;
        }
    }

//    public void help(){
//        System.out.println("\nThis class is called Food and is meant to be the parent class for more specific food items, such as an apple, sandwich, or sushi roll.\n" +
//                "The attributes present in Food relate to a general well-being or state of the food that is important regardless of the type of food being represented.\n" +
//                "These attributes are:\n" +
//                "-isExpired: a boolean representing whether the food is no longer edible whether it is cooked or not\n" +
//                "-isRaw: a boolean representing the cooked state of the food\n" +
//                "-isFrozen: a boolean representing whether the food item is in a preserved state or not\n" +
//                "-daysUntilExpiration: an integer which indicates how many days remain until the particular food item becomes expired\n\n" +
//                "Additionally, the Food class provides the following methods:\n" +
//                "-describeFoodItem(): Prints the current values for each attribute of the food item\n" +
//                "-expire(): Reduces the number of days until expiration of the food item, a non-frozen food will have a reduction of 2, while frozen foods will only be reduced by 1\n" +
//                " ");
//    }

    public void describeFoodItem(){
        System.out.println("This food item has the following characteristics:");
        System.out.println("- isExpired = "+this.isExpired);
        System.out.println("- isRaw = "+this.isRaw);
        System.out.println("- isFrozen = "+this.isFrozen);
        System.out.println("- daysUntilExpiration = "+this.daysUntilExpiration +"\n");
    }

    public void expire(){
        if(this.daysUntilExpiration > 0 && this.isFrozen){
            this.daysUntilExpiration--;
        }
        else if(this.daysUntilExpiration > 1){
            this.daysUntilExpiration -= 2;
        }
        if(this.daysUntilExpiration <= 0){
            this.isExpired = true;
        }
    }

    public void expire(int expirationRate){
        if(this.daysUntilExpiration - expirationRate > 0){
            this.daysUntilExpiration -= expirationRate;
        }
        else{
            this.daysUntilExpiration = 0;
            this.isExpired = true;
        }
    }

    public void setFrozen(boolean isFrozen){
        this.isFrozen = isFrozen;
    }

    public boolean getFrozen(){
        return this.isFrozen;
    }

    public void setDaysUntilExpiration(int daysUntilExpiration){
        this.daysUntilExpiration = daysUntilExpiration;
        this.isExpired = this.daysUntilExpiration <= 0;
    }

    public int getDaysUntilExpiration(){
        return this.daysUntilExpiration;
    }

    public boolean getRaw(){
        return this.isRaw;
    }

    public void setRaw(boolean isRaw){
        this.isRaw = isRaw;
    }

    public void setExpired(boolean isExpired){
        if(this.isExpired){
            System.out.println("An expired food item should remain expired.");
        }
        else{
            this.isExpired = isExpired;
        }
    }

    public boolean getExpired(){
        return this.isExpired;
    }
}
