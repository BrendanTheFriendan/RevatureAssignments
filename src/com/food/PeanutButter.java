package com.food;

public class PeanutButter extends Food{

    private boolean isChunky;
    private boolean lowFat;
    private String brandName;

    public PeanutButter(){
        this.isChunky = false;
        this.lowFat = false;
        this.brandName = "The Brandless Butter";
        this.isExpired = false;
        this.isRaw = false;
        this.isFrozen = false;
        this.daysUntilExpiration = 300;
    }

    public PeanutButter(boolean isChunky, boolean lowFat, String brandName, boolean isExpired, boolean isRaw, boolean isFrozen, int daysUntilExpiration){
        this.isChunky = isChunky;
        this.lowFat = lowFat;
        this.brandName = brandName;
        this.isExpired = isExpired;
        this.isRaw = isRaw;
        this.isFrozen = isFrozen;
        this.daysUntilExpiration = daysUntilExpiration;
    }

    @Override
    public void expire(){
        this.daysUntilExpiration--;
        if(this.daysUntilExpiration <= 0){
            this.isExpired = true;
        }
    }

    @Override
    public void describeFoodItem(){
        System.out.println("This food item is a Peanut Butter with the following characteristics:");
        System.out.println("- Brand Name = "+this.brandName);
        System.out.println("- isChunky = "+this.isChunky);
        System.out.println("- lowFat = "+this.lowFat);
        System.out.println("- isExpired = "+this.isExpired);
        System.out.println("- isRaw = "+this.isRaw);
        System.out.println("- isFrozen = "+this.isFrozen);
        System.out.println("- daysUntilExpiration = "+this.daysUntilExpiration+"\n");
    }

    public boolean getChunky(){
        return this.isChunky;
    }

    public void setChunky(boolean isChunky){
        this.isChunky = isChunky;
    }

    public boolean getFat(){
        return this.lowFat;
    }

    public void setFat(boolean lowFat){
        this.lowFat = lowFat;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }
}
