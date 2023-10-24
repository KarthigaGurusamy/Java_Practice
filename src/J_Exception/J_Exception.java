package J_Exception;

public class J_Exception {
    public static void main(String[] args) {

        try {
            new Test().add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try
        {
            int x= 10/0;
            System.out.println(x);
        }
        catch (Exception e)
        {
            if(e instanceof ArithmeticException)
            {
                System.out.println("Error");
            }
            else
            {
                System.out.println(e);
            }
        }

    }
}

class Test
{
    void add() throws Exception
    {
        throw new Exception("User-Defined Exception");
    }
}
