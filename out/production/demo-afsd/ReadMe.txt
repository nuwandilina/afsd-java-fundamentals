import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] studentsArr = new Student[10];
        for (int i = 0; i < studentsArr.length; i++) {

            Student student=new Student();

            System.out.print("Enter student "+(i+1)+" name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student "+(i+1)+" address: ");
            String address = scanner.nextLine();
            System.out.print("Enter student"+(i+1)+" age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student "+(i+1)+" marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();

            student.Name=name;
            student.Address=address;
            student.Age=age;
            student.Marks=marks;

            studentsArr[i] = student;
        }

        System.out.println("");
        System.out.println("Entered Student details as follows : ");
        System.out.println("");

        for (Student student : studentsArr) {

            System.out.println("Student : " + student.Name+ "'s Details");
            System.out.println("Name: " + student.Name);
            System.out.println("Address: " + student.Address);
            System.out.println("Age: " + student.Age);
            System.out.println("Marks: " + student.Marks);
            System.out.println("");
        }
    }

}

----------------------------------------


public class Student {
    private String name;
    private String address;
    private int age;
    private int marks;

    public Student(String name, String address, int age, int marks) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student address: ");
            String address = sc.nextLine();
            System.out.print("Enter student age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, address, age, marks);
        }

        System.out.println("Student details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Age: " + student.getAge());
            System.out.println("Marks: " + student.getMarks());
        }
    }

}


-------------------------------------------------

