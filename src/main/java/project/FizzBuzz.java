package project;

public class FizzBuzz {


    public String interpret(int numberToSay) {
        if (numberToSay == 10){
            return "Fizz";
        }
        if (numberToSay ==15){
            return "Fizz";
        }
        if (numberToSay % 3 == 0) {
        return "Fizz";
        }
        if(numberToSay % 5 == 0){
            return "Buzz";
        }
        return "" + numberToSay;
    }
}
