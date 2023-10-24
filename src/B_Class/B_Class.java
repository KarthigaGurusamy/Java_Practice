package B_Class;

import org.w3c.dom.ls.LSOutput;

public class B_Class {

    void run(){
        System.out.println("Main class");
    }

    static void runTwo(){
        System.out.println("Main clas static method");
    }


    public static void main(String[] args) {

        B_Class object = new B_Class();
        object.run();
        B_Class.runTwo();

        Test test = new Test();
        test.run();
        Test.runTwo();
    }

}


