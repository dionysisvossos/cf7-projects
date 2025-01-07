package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();            //Invoke default constructor
        Student bob = new Student(2, "Bob", "D.");  //Invoke overloaded constructor

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("W.");


        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Student instances' count: " + Student.getStudentsCount());
    }
}
