public class BoxPrinter {
  public static void main(String []args) {
        printBox(50,9);
    }

    private static void printBox(final int width, final int height) {
      printHorizontalLine(width);
      for (int i = 0; i < height - 2; i++) {
        printInnerRectanglePart(width);
      }
      printHorizontalLine(width);
    }

    private static void printHorizontalLine(int length) {
        for (int i = 0; i < length; i++) {
        System.out.print("#");
      }
      System.out.print("\n");
    }

    private static void printInnerRectanglePart(int width) {
        System.out.print("#");
        for (int j = 0; j < width - 2; j++) {
          System.out.print(" ");
        }
        System.out.print("#\n");
    }
}
