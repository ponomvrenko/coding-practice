package ponomvrenko.practice.codewars.sevenkyi;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ReverseLetterTest extends TestCase {

    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseLetter.reverseLetter(str));
    }
}