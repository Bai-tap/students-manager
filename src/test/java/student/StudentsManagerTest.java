package student;

public class StudentsManagerTest {
    public static void main(String[] args) {
        StudentsManager studentsManager = new StudentsManager();
        studentsManager.displayAll();

        Student longH = new Student("Long", 25);
        studentsManager.add(longH);
        System.out.println("added: " + longH.getInformation());
        studentsManager.displayAll();

        Student son = new Student("Son", 1);
        studentsManager.add(son);
        System.out.println("added: " + son.getInformation());
        studentsManager.displayAll();

        Student dat = new Student("Dat", 20);
        studentsManager.add(dat);
        System.out.println("added: " + dat.getInformation());
        studentsManager.displayAll();

        studentsManager.find("Long");
        studentsManager.find("Son");
        studentsManager.find("Dat");
    }
}