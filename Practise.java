
//Differnce between abstract class and interface...
package practise;

import java.io.*;
import java.lang.*;
import java.awt.*;
import java.util.*;


interface abs1{
    //abs1(){} //3. Interface cannot have construct...
                // if you add construct...you have to define body but interface cannot have body...or defination...
    int x = 20;//2. Interface cannot have instance variable...
  //  x = 40; // because by default they are static and final in java...
    void display1();
   // void public show(){}// 1. Interface cannot have method body...
   // public static void sh(){}//4. Interface cannot have static method...
}
interface abs2{
    int x = 40;
    void display2();
}
interface abs3 extends abs1, abs2{//5. Interface extends mulitply interface...
    abstract void display3();
}

class demo implements abs1, abs2{
    public void display1(){
        System.out.println("I am the first display");
    }
    public void display2(){
        System.out.println("I am the second display");
    }
    public void display3(){
        System.out.println("I am the third display");
    }
}
public class Practise {
    public static void main(String[] args) {
       demo d = new demo();
       d.display1();
       d.display2();
       d.display3();
       
       System.out.println(abs1.x); // static variable belong to the class and not the object....
                                   // so d.x `gives you error...and not abs1.x...
       System.out.println(abs2.x);
       
    }
}
/*
An abstract method is defined only so that it can be overridden in a subclass. 
However, static methods can not be overridden. Therefore, it is a compile-time 
error to have an abstract, static method. ... It's because static methods belongs 
to a particular class and not to its instance
*/