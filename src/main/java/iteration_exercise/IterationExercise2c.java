public class IterationExercise2c {
   public static void main(String []args)
    {
        float number = (float) 0.9;
        for (int iteration = 0; iteration < 4000; iteration++) {
            number += 0.000025;
            System.out.printf("The number is %f at iteration %d\n", number, iteration+1);
        }
    }
}
