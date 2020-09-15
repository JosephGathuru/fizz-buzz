package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void shouldBeAbleToCreateFizzBuzzObject() {
        //Arrange and Action
        FizzBuzz underTest = new FizzBuzz();
        //assertion
        assertNotNull(underTest);

    }


    @Test
    public void given1ShouldReturn1() {
        //Arrange
        FizzBuzz underTest = new FizzBuzz();

        //action
        String result = underTest.interpret(1);

        //Assertion
        assertEquals("1", result);

    }

    @Test
    public void given2ShouldReturn2() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(2);

        assertEquals("2", result);
    }

    @Test
    public void given3ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(3);

        assertEquals("Fizz", result);

    }

    @Test
    public void given5ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(5);

        assertEquals("Buzz", result);
    }

    @Test
    public void given6ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(6);

        assertEquals("Fizz", result);

    }

    @Test
    public void given9ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(9);

        assertEquals("Fizz", result);
    }

    @Test
    public void given10ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(10);

        assertEquals("Fizz", result);
    }

    @Test
    public void given15ShouldReturnFizz() {
        FizzBuzz underTest = new FizzBuzz();

        String result = underTest.interpret(15);

        assertEquals("Fizz", result);
    }
}









