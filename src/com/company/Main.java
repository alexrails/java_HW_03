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
        //Third task
        int[] array = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for(int i = array.length - 1; i >= 0; i = i - 1){
            System.out.printf(" %d", array[i]);
        }
        //Fourth task
        int squareArray[][] = new int[2][3];
        squareArray[0][0] = 12;
        squareArray[0][1] = 21;
        squareArray[0][2] = 34;
        squareArray[1][0] = 11;
        squareArray[1][1] = 8;
        squareArray[1][2] = 3;

        System.out.println();
        for(int i = 0; i < squareArray.length; i += 1){
            for(int j = 0; j < squareArray[i].length; j += 1){
                System.out.print(" " + squareArray[i][j] + "[" + i + "]" + "[" + j + "]" );
            }
            System.out.println();
        }
    }
}