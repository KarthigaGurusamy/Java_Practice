package I_Collection;

import java.util.ArrayList;

public class I_Collection {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Karthiga"));

        Student student = new Student();
        student.setId(2);
        student.setName("Sam");
        list.add(student);

        System.out.println("-Getting value based on index-");
        System.out.println(list.get(0).getName());
        System.out.println(list.get(1).getName());

        System.out.println("-Before Removing-");
        for(Student data:list)
        {
            System.out.println(data.getName());
        }

        list.remove(1);
        System.out.println("-After Removing-");
        for(Student data:list)
        {
            System.out.println(data.getName());
        }


    }
}
