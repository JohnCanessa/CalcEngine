package com.canessa.calcengine;


import java.util.Arrays;
import java.util.Scanner;


// **** to remove class name from individual calls ****
// import static com.canessa.calcengine.Flight.resetAllPassengers;
// import static com.canessa.calcengine.Flight.getAllPassengers;

import static com.canessa.calcengine.Flight.*;


/**
 * 
 */
public class Main {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        // **** display arguments (if any) ****
        System.out.println("main <<< args.length: " + args.length);
        for (String arg : args) System.out.println("main <<< arg ==>" + arg + "<==");
        System.out.println();

        // // ???? ????
        // System.out.println("main <<< not compiled");
        
        // **** no command line arguments ****
        if (args.length == 0) {
            performCalculations();
        } 

        // **** one command line argument ****
        else if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();
        }        

        // **** three command line arguments ****
        else if (args.length == 3) {
            handleCommandLine(args);
        }
        
        // **** invalid number of command line arguments ****
        else {
            System.out.println("main <<< provide an operation code and two numeric values");
        }
        System.out.println();


        // **** initialization ****
        int someValue = 4;
        int factorial = 1;

        // **** ****
        while (someValue > 1) {
            factorial *= someValue;
            someValue--;
        }

        // **** ****
        System.out.println("main <<< factorial: " + factorial);


        // **** initialization ****
        int iVal = 80;      // was:  5;

        // **** ****
        do {
            System.out.print("main <<< " + iVal);
            System.out.print(" * 2: ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);

        // **** ****
        System.out.println("main <<< iVal: " + iVal);
        System.out.println();


        // **** initialization ****
        // float[] theVals = new float[3];
        // theVals[0] = 10.0f;
        // theVals[1] = 20.0f;
        // theVals[2] = 15.0f;

        float[] theVals = {10.0f, 20.0f, 15.0f};

        float sum = 0.0f;

        // **** compute sum ****
        // for (int i = 0; i < theVals.length; i++)
        //     sum += theVals[i];

        for (float v : theVals)
            sum += v;
        
        // **** display sum ****
        System.out.println("main <<< sum: " + sum);
        System.out.println();


        // **** ****
        System.out.println("main <<< BEFORE calling doSomething");
        doSomething();
        System.out.println("main <<<  AFTER calling doSomething");
        System.out.println();


        // **** ****
        //showSum(7.5f, 1.4f, 3);
        showSum(7.5f, 1.4f, 0);
        System.out.println();


        // **** ****
        int val1 = 10;
        int val2 = 20;
        System.out.println("main <<< val1: " + val1 + " val2: " + val2);
        swap(val1, val2);
        System.out.println("main <<< swap val1: " + val1 + " val2: " + val2);
        System.out.println();


        // **** ****
        int[] arr = {10, 20};
        System.out.println("main <<< arr: " + Arrays.toString(arr));
        workingSwap(arr);
        System.out.println("main <<< workingSwap arr: " + Arrays.toString(arr));
        System.out.println();


        // **** ****
        double interest = calculateInterest(100d, 0.05d, 10);
        System.out.println("main <<< interest: " + interest);
        System.out.println();


        // **** ****
        double[] yearlyInterest = produceInterestHistory(100.0, 0.05, 10);
        for (double yearly : yearlyInterest)
            System.out.println("main <<< yearly: " + yearly);
        System.out.println();


        // **** ****
        String location = "Florida";
        int flightNumber = 175;
        String time = "09:00";

        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on flight # ");
        sb.append(flightNumber);

        // **** ****
        System.out.println("main <<< sb ==>" + sb.toString() + "<==");

        // **** ****
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);

        // **** ****
        System.out.println("main <<< sb ==>" + sb.toString() + "<==");
        System.out.println();


        // **** ****
        Flight flight1 = null;
        flight1 = new Flight();

        // ???? ????
        System.out.println("main <<< flight1: " + flight1.toString());


        // // **** ****
        // Flight flight2 = null;
        // flight2 = new Flight();
        // flight2.add1Passenger();

        // // ???? ????
        // System.out.println("main <<< flight2: " + flight2.toString());


        // Flight slcToNyc = new Flight();
        // slcToNyc.setSeats(20);
        Flight slcToNyc = new Flight(20);

        // ???? ????
        System.out.println("main <<< slcToNyc: " + slcToNyc.toString());
        System.out.println();


        // **** ****
        Passenger bob = new Passenger();
        bob.setCheckedBags(3);
        System.out.println("main <<<      bob: " + bob.toString());

        Passenger nia = new Passenger(2);
        System.out.println("main <<<      nia: " + nia.toString());

        // **** does not compile because constructor is private ****
        //Passenger cheapJoe = new Passenger(0.01d);

        Passenger geetha = new Passenger(2);
        System.out.println("main <<<   geetha: " + geetha.toString());

        Passenger santiago = new Passenger(2, 3);
        System.out.println("main <<< santiago: " + santiago.toString());
        System.out.println();


        // **** reset static field ****
        //Flight.resetAllPassengers();
        resetAllPassengers();

        Flight laxToSlc = new Flight();
        laxToSlc.add1Passenger();
        laxToSlc.add1Passenger();
        System.out.println("main <<< laxToSlc: " + laxToSlc.toString());

        Flight dfwToNyc = new Flight();
        dfwToNyc.add1Passenger();
        System.out.println("main <<< dfwToNyc: " + dfwToNyc.toString());

        //System.out.println("main <<< getAllPassengers: " + Flight.getAllPassengers());
        System.out.println("main <<< getAllPassengers: " + getAllPassengers());

        System.out.println();


        // **** ****
        Flight flt1 = new Flight(10);
        Flight flt2 = new Flight(20);

        // **** swap flights (does not work) ****
        swapFlight(flt1, flt2);

        System.out.println("main <<< flt1: " + flt1.toString());
        System.out.println("main <<< flt2: " + flt2.toString());

        // **** swap flight numbers (works) ****
        swapNumbers(flt1, flt2);

        System.out.println("main <<< flt1: " + flt1.toString());
        System.out.println("main <<< flt2: " + flt2.toString());

        System.out.println();
    }

    /**
     * 
     */
    static void performCalculations() {

        MathEquation[] equations = new MathEquation[4];

        // **** call constructors ****
        equations[0] = new MathEquation('d',100.0, 50.0);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        // **** compute and display results ****
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("performCalculations <<< result: " + equation.getResult());
        }

        // **** *****
        System.out.println("performCalculations <<< average result: " + MathEquation.getAverageResult());
    }

    // /**
    //  * 
    //  * @param leftVal
    //  * @param rightVal
    //  * @param opCode
    //  * @return
    //  */
    // private static MathEquation create(double leftVal, double rightVal, char opCode) {
    //     MathEquation equation = new MathEquation();
    //     equation.setLeftVal(leftVal);
    //     equation.setRightVal(rightVal);
    //     equation.setOpCode(opCode);
    //     return equation;
    // }

    /**
     * 
     */
    static void executeInteractively() {

        // **** ****
        System.out.print("executeInteractively >>> enter operation and two numbers: ");

        // **** ****
        Scanner scanner = new Scanner(System.in);
        var userInput = scanner.nextLine();
        scanner.close();

        // **** ****
        String[] parts = userInput.split(" ");

        // **** ****
        performOperation(parts);
    }


    /**
     * 
     * @param parts
     */
    private static void performOperation(String[] parts) {

        // **** ****
        char opCode = opCodeFromString(parts[0]);
        Double leftVal = valueFromWord(parts[1]);
        Double rightVal = valueFromWord(parts[2]);

        // **** ****
        Double result = execute(opCode, leftVal, rightVal);

        // **** ****
        // System.out.println("performOperation <<< result: " + result);

        // **** ****
        displayResult(opCode, leftVal, rightVal, result);
    }


    /**
     * 
     * @param opCode
     * @param leftVal
     * @param rightVal
     * @param result
     */
    private static void displayResult(char opCode, Double leftVal, Double rightVal, Double result) {

        // **** ****
        char symbol = symbolFromOpCode(opCode);

        // **** ****
        StringBuilder sb = new StringBuilder();

        // **** ****
        sb.append("displayResult <<< ");
        sb.append(leftVal);
        sb.append(" " + symbol + " ");
        sb.append(rightVal);
        sb.append(" = " + result);

        // **** display contents of string builder *****
        System.out.println(sb.toString());
    }


    /**
     * 
     * @param opCode
     * @return
     */
    private static char symbolFromOpCode(char opCode) {

        // **** initilaization ****
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};

        char symbol = ' ';

        // **** look up the op code ****
        for (int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == opCode) {
                symbol = symbols[i];
                break;
            }
        }

        // **** return associated symbol ****
        return symbol;
    }


    /**
     * Handle command line arguments.
     * Should be three.
     * @param args
     */
    private static void handleCommandLine(String[] args) {

        // **** extract values from the arguments ****
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);

        // ???? ????
        System.out.println("handleCommandLine <<< opCode: " + opCode + 
                            " leftVal: " + leftVal + " rightVal: " + rightVal);

        // **** compute the result ****
        double result = execute(opCode, leftVal, rightVal);

        // **** ****
        System.out.println("handleCommandLine <<< result: " + result);
    }


    /**
     * 
     * @param opCode
     * @param leftVal
     * @param rightVal
     * @return
     */
    static double execute(char opCode, Double leftVal, Double rightVal) {
        switch (opCode) {
            case 'a':
                return leftVal + rightVal;

            case 's':
                return leftVal - rightVal;

            case 'm':
                return leftVal * rightVal;

            case 'd':
                return rightVal != 0.0 ? leftVal / rightVal : 0.0d;

            default:
                System.err.println("main <<< invalid opCode: " + opCode);
                return 0.0d;
        }
    }


    /**
     * 
     * @param amt
     * @param rate
     * @param years
     * @return
     */
    static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumulatedInterest = new double[years];
        
        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        
        return accumulatedInterest;
    }


    /**
     * Compute simple interest.
     * @param amount
     * @param rate
     * @param years
     * @return
     */
    static double calculateInterest(double amount, double rate, int years) {
        return amount * rate * years;
    }


    /**
     * Needs to be static.
     */
    static void doSomething() {
        System.out.println("doSomething <<< Inside method");
        System.out.println("doSomething <<< Still inside");
    }


    /**
     * 
     * @param x
     * @param y
     * @param count
     */
    static void showSum(float x, float y, int count) {

        // **** ****
        if (count < 1) return;

        // **** ****
        float sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println("showSum <<< sum: " + sum);
    }


    /**
     * Does not work
     * @param i
     * @param j
     */
    static void swap(int i, int j) {
        int tmp = i;
        i = j;
        j = tmp;
        System.out.println("swap <<< i: " + i + " j: " + j);
    }


    /**
     * Working swap.
     * @param arr
     * @return
     */
    static void workingSwap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

        System.out.println("workingSwap <<< arr: " + Arrays.toString(arr));
    }




    /**
     * 
     * @param operationName
     * @return
     */
    static char opCodeFromString(String operationName) {

        // **** sanity check ****
        if (operationName.length() < 1) return 'x';

        // **** return first character in lowercase ****
        return operationName.toLowerCase().charAt(0);
    }

    /**
     * 
     * @param word
     * @return
     */
    static double valueFromWord(String word) {

        // **** initialization ****
        String[] numberWords = {"zero", "one", "two", "three", "four",
                                "five", "six", "seven", "eight", "nine"
        };

        Double value = 0d;

        // **** look for the word in the array ****
        for (int i = 0; i < numberWords.length; i++) {
            if (word.equals(numberWords[i])) {
                value = (double)i;
                break;
            }
        }
        
        // **** return the value from the word ****
        return value;
    }
}