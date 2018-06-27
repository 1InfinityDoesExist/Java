
//Differnce between abstract class and interface...
package practise;

abstract class abs{
    abs(){}// 3. Abstract class can have construct...
    int x = 2;// 2. Abstract class can have instance varibale...
    abstract void display();
    void show(){ // 1. abstract class can have method body...(only of non abstract method)
        System.out.println("Kaise ho");
    }
    public static void dekha(){//4 . Abstract class can have static method...
        System.out.println("ye hey static method");
    }
}

//abstract class dushra extend abs{ // 5. Your cannot extent one abstract class....remove comment and see...
//    abstract void cp();
//}

abstract class dushra{
    abstract void cp();
}

class demo extends abs{// 6. Abstract class does not support multiple inheritance...
                        // class demo extends abs,dushra{...} you will see error...
    public void display(){
        System.out.println("may hu demo class may...");
    }
}
public class Practise {
    public static void main(String[] args) {
       // abs ab = new abs();// You can not have instance of a abstract class...
        demo d = new demo();
        d.display();
        d.show();
        abs.dekha();//static method can be called directly no need of creating any instance of a class...
        d.dekha();//calling static method via object...
        
        demo.dekha(); // allowed...
        System.out.println(d.x);
    }
}
