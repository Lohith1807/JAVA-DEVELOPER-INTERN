public class ArrayExample {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {

            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) sum / marks.length;

        System.out.println("Array Elements:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\n\nTotal: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}