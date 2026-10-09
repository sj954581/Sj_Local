package java8;

class Parent {
    public void print() {
        System.out.println("parent");
    }
    public void print2() {
        System.out.println("parent2");
    }
}
class child extends Parent{
    public void print() {
        System.out.println("child");
    }
    public void child2() {
        System.out.println("child2");
    }
}

class Parent_Child{
    public static void main(String[] args){
        Parent x = new Parent();
        Parent y = new child();
        child z = new child();
        x.print();
        x.print2();

        y.print();
        y.print2();
        // this is not allowed gives error. y.child2();

        z.print();
        z.print2();
        z.child2();
    }
}