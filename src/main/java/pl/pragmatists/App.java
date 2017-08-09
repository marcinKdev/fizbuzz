package pl.pragmatists;

import tdd.FizzBuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Let's play fizzbuzz!" );

        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.playGameFor(100));

    }
}
