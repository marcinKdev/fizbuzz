package tdd;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final String WORD_FIZZ = "Fizz";
    private static final String WORD_BUZZ = "Buzz";



    public String play(int inputNumber){

        if (inputNumber < 1){
            return null;
        }
        else{
            if (inputNumber % 15 == 0)
                return WORD_FIZZ.concat(WORD_BUZZ);
            else if (inputNumber % 5 == 0){
                return WORD_BUZZ;
            }
            else if (inputNumber % 3 == 0){
                return WORD_FIZZ;
            }
            else{
                return String.valueOf(inputNumber);
            }

        }

    }

    public String playGameFor(int rangeSize){
        String result = "";
        for (int i=1; i<=rangeSize; i++){
            result += (play(i) + ",");
        }
        return result.substring(0, result.length()-1);
    }
}
