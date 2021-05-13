package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;



public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    //TODO: Test 1: Confirm brackets are seen as balanced  for brackets only. i.e "[]"
    @Test
    public void onlyBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        }


        //TODO: Test 2: Confirm brackets are in the correct order
    @Test
    public void correctBracketOrder() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //TODO: Test 3 : Confirm no brackets is seen as balanced?
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    //TODO: Test 4: Confirm brackets are seen as balanced if they are midword. i.e "Brac[ket]"
        @Test
        public void bracketMidWord() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("Brac[ket]"));
        }
            //TODO: Test 5: Confirm brackets are seen as balanced at end of word. i.e. "Bracket[]"
            @Test
        public void onlyBracketsReturnsTrue() {
                assertTrue(BalancedBrackets.hasBalancedBrackets("Bracket[]"));
    //TODO: Test 6: Confirm brackets are seen as balanced at beginning of word. i.e. "[]Bracket"
        @Test
        public void onlyBracketsReturnsTrue() {
                    assertTrue(BalancedBrackets.hasBalancedBrackets("[]Bracket"));
    //TODO: Test 7: Confirm double brackets are seen as balanced. i.e. "[]Bracket[]"
        @Test
        public void onlyBracketsReturnsTrue() {
                        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Bracket[]"));

}
