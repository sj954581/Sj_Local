import java.lang.*;
class StringBuilderDemo {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Hello");
        //sb.charAt(0);
        //sb.length();
        //sb.substring(3, 5);
        //sb.append(" Java");//now original string is changed
        //sb.insert(3, " inserted");
        //sb.replace(3, 5, "ab");
        //sb.delete(3, 5);
        System.out.println(sb);//prints Hello Java


    }
}