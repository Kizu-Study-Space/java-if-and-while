

import java.util.stream.IntStream;

public class IterationExercise2a {

  public static void main(String []args) {
      IntStream.range(1, 11).forEach(number->System.out.println(number));
  }
}
