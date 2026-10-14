import java.util.*;

class exceptionThrower extends Exception {
    public exceptionThrower(String str) {
        super(str);
    }
}

public class Exception_Own {
    public void salCheckr(int sal) {
        if (sal < 10000000) {
            try {
                throw new exceptionThrower("sj salary exception occurred...");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("salary matched...");
        }
    }

    public static void main(String args[]) throws exceptionThrower {
        Exception_Own obj = new Exception_Own();
        obj.salCheckr(100);
        Hashtable t= new Hashtable();
        t.put("null","null");
        System.out.println(t);
    }
}