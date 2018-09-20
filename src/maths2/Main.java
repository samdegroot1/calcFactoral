package maths2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Give me a number to calculate the factoral: ");
        String input = reader(br);

        if(input != null) {

            if(validateSize(input)) {
                calculateFactoral(input);
            }
        }
        else {
            System.out.println("Couldn't capture input");
        }
    }


    private static String reader(BufferedReader br)
    {
        String input = null;
        try {
            input = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    /**
     * Ofcourse we can change the datatype from int to long.
     * But for me the big numbers with the 123456789E12 is a little bit confusing.
     * Although: 123456789E12 == 123456789^12.
     * But, this is just a fun example/calculation with lower and more human readable numbers.
     *
     * @param input
     * @return
     */
    private static boolean validateSize(String input)
    {
        if(Integer.parseInt(input) >= 13) {
            System.out.println("I'm sorry but this number is soo big to calculate the factoral for");
            System.out.println("Can't store the result in an 32 bit integer. Max number is: 2147483647.");
            return false;
        }

        return true;
    }

    private static void calculateFactoral(String input)
    {
        int a = Integer.parseInt(input);
        int c = a;

        for(int b=1; b < a; b++) {

            System.out.println("Step: " + c);

            if((a-b) != 0) {
                c =  c * (a-b);
            }

        }

        System.out.println("Factoral: " + c);
    }
}
