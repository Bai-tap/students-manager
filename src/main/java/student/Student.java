package student;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return this.age;
    }

    public String getInformation() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
