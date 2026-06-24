
public class Main {
    public static void main(String[] args) {

        GradStudent grad =
                new GradStudent("Sadgi", 22, 101, 9.1,
                        "Artificial Intelligence");

        System.out.println(grad);

        // IS-A relationship demonstration
        Student s = grad;   // GradStudent IS-A Student
        Person p = grad;    // GradStudent IS-A Person

        System.out.println("\nUsing Student reference:");
        System.out.println(s);

        System.out.println("\nUsing Person reference:");
        System.out.println(p);
    }
}