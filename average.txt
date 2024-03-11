// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int v1, v2, v3;
        double average;
        Scanner scan = new Scanner(System.in) ;


        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");


        System.out.print("Enter the first value: ");
        v1 = scan.nextInt();
        System.out.print("Enter the second value: ");
        v2 = scan.nextInt();
        System.out.print("Enter the third value: ");
        v3 = scan.nextInt();



        //compute the average


        average = (v1 + v2 + v3) / 3.0;

        //print the average


        System.out.print("The average is "+average+".");


    }
}