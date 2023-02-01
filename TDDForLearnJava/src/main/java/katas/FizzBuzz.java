package katas;

import java.util.ArrayList;

public class FizzBuzz {
    public static ArrayList<String> solution(int maxNumber) {
       return FizzBuzz.resolve(maxNumber);
    }

    public static ArrayList<String> resolve(int maxNumber){
        ArrayList<String> arrResolve = new ArrayList<String>();

        for (int i = 1; i <= maxNumber; i++) {
            evaluateFizzBuzz(arrResolve,i);
        }

        return arrResolve;
    }
    private static void evaluateFizzBuzz(ArrayList<String> arr,int number){

       if(number % 3 == 0 ) {
           arr.add("fizz");
           return;
       }
       arr.add(String.valueOf(number));

    }
}
