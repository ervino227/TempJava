public class Main {

    public static void main(String[] args) {
        //test value
        int myNum = 56204;

        //convert to a binary number
        String stringNum = Integer.toBinaryString(myNum);
        System.out.println(myNum + " as a binary: " + stringNum);

        System.out.println("Number of ones found in " + myNum + ": " + countOnesLogic(myNum));
    }

    public static int countOnesLogic(int number) {
        int ones = 0;
        int quotient;

        do {
            quotient = number % 2;
            if(quotient == 1) ones++;
            number = number/2;
        } while (number > 0);


        return ones;
    }

}
