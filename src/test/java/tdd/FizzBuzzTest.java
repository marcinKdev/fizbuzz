package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @Before
    public void setUp() throws Exception {
         fizzBuzz = new FizzBuzz();
    }

    @Test
    public void returnsNullForZero(){
        Assert.assertEquals(null, fizzBuzz.play(0));
    }

    @Test
    public void returnsOneForOne(){
        Assert.assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void returnsFizzForThree(){
        Assert.assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void returnsBuzzForFive(){
        Assert.assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void returnsFizzBuzzForFifteen(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.play(15));
    }

    @Test
    public void givesProperArrayFor100(){
        String result = fizzBuzz.playGameFor(100);
        Assert.assertEquals('1', result.charAt(0));
    }


}