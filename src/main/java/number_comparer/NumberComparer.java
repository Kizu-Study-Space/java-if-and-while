package number_comparer;

public class NumberComparer {

    /** * @name max
     * 
     * @number1 First Integer to compare
     * @number2 Second Integer to compare
     * 
     * @return Larger Intager of number1 and number2
     * 
     * Compares two given Integers
     */
    public int max(final int number1, final int number2) {
        return (number1 > number2) ? number1 : number2;
    }

/** * @name max
     * 
     * @number1 First Integer to compare
     * @number2 Second Integer to compare
     * @number3 Third Integer to compare
     * 
     * @return Largest Integer of the three given parameters
     * 
     * Compares three given Integers
     */
    public int max(final int number1, final int number2, final int number3) {
       return this.max(this.max(number1, number2), number3);
    }
}
