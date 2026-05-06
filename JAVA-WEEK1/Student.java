public class Student extends person {

    private int marks;

    public Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Marks: " + marks);
    }
}