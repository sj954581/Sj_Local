import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable <Student>, java.util.Comparator<Student> {
    String name;
    int age;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Student() {}
    public int compareTo(Student st) {
        if(this.age > st.age){return 1;}
        else{return -1;}
    }
    public int compare(Student o1, Student o2) {
        if(o1.age > o2.age){return 1;}
        else {return -1;}
    }
}
public class Comparator {
    public static void main(String args[]){
        List<Student> list = new ArrayList<>();
        list.add(new Student(20,"aaaa"));
        list.add(new Student(23,"bbbb"));
        list.add(new Student(18,"cccc"));
        list.add(new Student(17,"dddd"));

        Collections.sort(list,new Student());
        //Collections.sort(list);
        for(Student s : list){
            System.out.println(s.age);
        }
    }
}
