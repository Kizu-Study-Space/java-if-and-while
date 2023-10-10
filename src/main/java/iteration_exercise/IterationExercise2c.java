public class IterationExercise2c {
   public static void main(String []args)
    {
        float number = (float) 0.9;
        int iteration = 0;
        while (number < 1.0) {
            number += 0.000025;
            iteration += 1;
            System.out.printf("The number is %f at iteration %d\n", number, iteration);
        }
    }
}
