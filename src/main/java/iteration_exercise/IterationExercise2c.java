public class IterationExercise2c {
   public static void main(String []args)
    {
        float number = (float) 0.9;
        while (number < 1.0) {
            number += 0.000025;
            System.out.printf("The number is now %f\n", number);
        }
    }
}
