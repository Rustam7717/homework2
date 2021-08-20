package com.company;

public class Main {
    public static int age = 55;
    public static int temp = 20;


    public static void main(String[] args) {
         weather();

    }
    public static void weather(){
        if (age > 10 && age < 45 && temp > -20 && temp <30){
            System.out.println( "можно гулять");
        }
        else if (age <10 && temp > 0 && temp < 8){
            System.out.println( "можно гулять, но не долго");
        }
        else if (age > 65 && temp < -10 && temp > 25){
            System.out.println("лучше остаться дома");
        }
        else {
            System.out.println("остаться дома");
        }
    }

}
