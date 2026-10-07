class Parent {
    void method()
    {
        System.out.println("Method from Parent");
    }
    void parentMethod(){
        System.out.println("Parent own method executed");
    }
}

class Child extends Parent {
    void method()
    {
        System.out.println("Method from Child overrided");
    }
    public void childMethod(){
        System.out.println("Child own method executed");
    }
}

public class Inheritance {
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.method();
        c1.childMethod();
        c1.parentMethod();

        // Upcasting
        Parent p = new Child();
        p.method();
        p.parentMethod();


        // Child c = new Parent(); - > compile time error
        // Downcasting Explicitly
        Child c = (Child)p;
        c.method();
        c.childMethod();
        c.parentMethod();
    }
}