package testing;

import katas.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTesting {
    @Test
    public void sameLengthThatArgument() {
        int maxNumberExpected = 3;
        ArrayList<String> solution = FizzBuzz.solution(maxNumberExpected);
        int actLength = solution.size();

        assertEquals(maxNumberExpected, actLength);
    }

    @Test
    public void ShouldBeReturnFizzANumberDivisibleBYTree() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("fizz");

        ArrayList<String> solution = FizzBuzz.solution(3);

       assertEquals(expected,solution);
    }
}
