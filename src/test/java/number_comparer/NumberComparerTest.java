package number_comparer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberComparerTest {

    @Test
    public void max() {
        NumberComparer numberComparer = new NumberComparer();
        assertEquals(5, numberComparer.max(3, 5));
        assertEquals(5, numberComparer.max(5, 3));
    }
    
}
