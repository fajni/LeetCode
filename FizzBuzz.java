package Problems;
import java.util.*;
public class FizzBuzz {
    public static Scanner input = new Scanner(System.in);

    public static List<String> fizzBuzz(int n){
        List<String> array = new ArrayList<String>();

        for(int i=1;i<=n;i++){
//            if(i%3!=0 && i%5!=0)
//                array.add(String.valueOf(i));
//            else if(i%3==0 && i%5==0)
//                array.add("FizzBuzz");
//            if(i%3==0 && i%5!=0)
//                array.add("Fizz");
//            if(i%5==0 && i%3!=0)
//                array.add("Buzz");

            if(i%5==0 && i%3==0)
                array.add("FizzBuzz");
            else if (i%5==0)
                array.add("Buzz");
            else if (i%3==0)
                array.add("Fizz");
            else array.add(String.valueOf(i));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println(fizzBuzz(n));
    }
}
