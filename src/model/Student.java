package model;

import java.util.List;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }

    public void inputStudent(List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input students information: ");
        boolean status;
        do {
            status = true;
            System.out.println("Student ID: ");
            this.id = scanner.next();

            for (Student st : students) {
                if (st.getId().equalsIgnoreCase(this.id)) {
                    System.out.println("This ID is available");
                    status  = false;
                    break;
                }
            }
        } while (!status);

        System.out.print("Name: ");
        this.name = scanner.next();
        System.out.print("Age: ");
        this.age = scanner.nextInt();
        System.out.print("Course: ");
        this.course = scanner.next();
        System.out.print("Address: ");
        this.address = scanner.next();
        System.out.println("Medium Score: ");
        this.mediumScore = scanner.nextFloat();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }
}




