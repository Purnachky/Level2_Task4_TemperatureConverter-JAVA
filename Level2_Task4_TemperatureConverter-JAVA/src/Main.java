import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //taking users input for temperatures and choose the conversion direction between fahrenheit and celsius
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose Temperature conversion type: ");
        System.out.println("0: Celsius to Fahrenheit");
        System.out.println("1: Farenheit to Celsius");

        int conversion = myObj.nextInt();

       if(conversion == 0){
           System.out.println("Enter temp in Celsius: ");
           int celsius = myObj.nextInt();
           int fahrenheit = (celsius * 9/5)+32;
           System.out.println("Fahrenheit: "+fahrenheit+"F");
       } else if (conversion == 1) {
           System.out.println("Enter temp in Fahrenheit: ");
           int fahrenheit = myObj.nextInt();
           int celsius  = (fahrenheit - 32)*5/9;
           System.out.println("Celsius: "+ celsius+"C");
       }else{
           System.out.println();
       }
       myObj.close();
    }
}