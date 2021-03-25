package com.company;

public class Main {

    public static void main(String[] args) {
	    // First task
        int month = 8;
        if (month == 1 || month == 2 || month == 12){
            System.out.println("Winter");
        } else if(month >= 3 && month <= 5){
            System.out.println("Spring");
        } else if(month >= 6 && month <= 8){
            System.out.println("Summer");
        } else if(month >= 9 && month <= 11){
            System.out.println("Fall");
        } else {
            System.out.println("Wrong number");
       }

        // Second task
        switch(month){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
             case 3:
                 System.out.println("Spring");
                 break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Fall");
                break;
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong number");
        }
    }

}