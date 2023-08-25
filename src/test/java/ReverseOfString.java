/*

   Automation testing

   Java Skills -> oops Concepts

     1) Abstration , Interfaces , encapsulation , Inheritance , polymorphism , Constructors . classes / objects
     2) Selenium ( How to capture SS , handling elements etx )
     3) Frame work designing ( page object model)
     4) CI CD pipelines configurations
     5) GIT
     6) pipeline in Azure Devops

//    1) Find the maximum and minimum elements in an integer array ( [10,30 , 40]
//    2) How to sort an array ( integer array or string array)
//    3) How to find out the duplicate elements in an array ( Integer array or string ) //{1,1,2,3,4,5,5}   {1,5}
//    4) How we can find out given number is a prime number or not
//    4) How to reverse and integer digits   //12345   //54321
//    5) aficionado ( 20 elements is )   0 , 1 , 1 ,2,3,5.....
//    6) recursion when a method call itself
//    7) How to find out the sum of an integer with the help of recursion




      a)   *
           *  *
           *  *  *
           *  *  *  *

      b) 1
         1  2
         1  2  3



 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseOfString {

    public static void main(String[] args) {

        String str = "Selenium with java";

          String[] arr =str.split(" ");

            for(int i=arr.length-1;i>=0;i--)

            {

                System.out.print(arr[i]+" ");

            }

    }
}