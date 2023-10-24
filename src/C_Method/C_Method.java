package C_Method;

public class C_Method {

    void run(){
        System.out.println("This is C_Method class run method without parameters");
    }
    void run(String str)
    {
        System.out.println(str);
    }

    static void getString(){
        System.out.println("This is C_Method class static method");
    }

    public static void main(String[] args) {

        C_Method obj = new C_Method();

        //OverLoading
        obj.run();
        obj.run("This is C_Method class run method with parameters");
        C_Method.getString();


        Test test = new Test();

        //OverLoading
        test.run();
        test.run("This is Test class run method with parameters");
        Test.getString();
    }
}
