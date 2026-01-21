package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int yr = in.nextInt();
       boolean divideBy4 = (yr % 4 == 0);
       boolean notDivideBy100 = (yr % 100 != 0); 
        boolean divideby400 = (yr % 400 == 0);
        
        boolean leapYear = (divideBy4 && notDivideBy100) || divideby400;
        System.out.println(leapYear);



    }

}
