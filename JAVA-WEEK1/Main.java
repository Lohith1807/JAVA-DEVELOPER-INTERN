public class Main {

    public static void main(String[] args) {
        Student student = new Student("Lohith", 20, 95);
        Teacher teacher = new Teacher("Ramesh", 40, "Java Programming");
        System.out.println("===== STUDENT DETAILS =====");
        student.displayInfo();
        System.out.println("\n===== TEACHER DETAILS =====");
        teacher.displayInfo();
        student.setMarks(98);
        System.out.println("\nUpdated Student Marks: " + student.getMarks());
    }
}