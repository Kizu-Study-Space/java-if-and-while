package number_comparer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberComparerTest {

    @Test
    public void max() {
        NumberComparer numberComparer = new NumberComparer();
        assertEquals(5, numberComparer.max(3, 5));
        assertEquals(5, numberComparer.max(5, 3));
        assertEquals(5, numberComparer.max(5, 5));
        assertEquals(5, numberComparer.max(5, 3, 2));
        assertEquals(5, numberComparer.max(3, 5, 2));
        assertEquals(5, numberComparer.max(2, 3, 5));
        assertEquals(5, numberComparer.max(5, 3, 5));
        assertEquals(5, numberComparer.max(5, 5, 3));
        assertEquals(5, numberComparer.max(2, 5, 5));
        assertEquals(5, numberComparer.max(5, 5, 5));
    }
    
}
