package com.food;

public class Assignment1 {
    public static void main(String args[]){

        Food foodItem1 = new Food();
        Food foodItem2 = new Food(false, false, false, 10);

        PeanutButter p1 = new PeanutButter();
        PeanutButter p2 = new PeanutButter(false, false, "", false, true, false, 1);

        foodItem1.describeFoodItem();
        foodItem2.describeFoodItem();
        p1.describeFoodItem();
        p2.describeFoodItem();

        p2.setBrandName("Butter Days Ahead");
        System.out.println("The updated p2 brand name is "+p2.getBrandName());

        System.out.println("The number of days until p2's expiration is "+p2.getDaysUntilExpiration());
        System.out.println("p2's expiration state is "+p2.getExpired());
        p2.expire();
        System.out.println("The number of days until p2's expiration is "+p2.getDaysUntilExpiration());
        System.out.println("p2's expiration state is "+p2.getExpired());


    }
}
