package com.canessa.calcengine;

/**
 * 
 */
public class MathEquation {

    // **** fields ****
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // **** ****
    private static int numberOfCalculations;
    private static double sumOfResults;

    /**
     * Constructor
     */
    public MathEquation() {}

    /**
     * Constructor
     * @param opCode
     */
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    /**
     * Constructor
     * The order of arguments has changed!!!
     * @param opCode
     * @param leftVal
     * @param rightVal
     */
    public MathEquation(char opCode, double leftVal, double rightVal) {
        //this.opCode = opCode;
        this(opCode);

        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }




    /**
     * 
     */
    void execute() {

        // **** ****
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;

            case 'd':
                result = rightVal != 0.0 ? leftVal / rightVal : 0.0d;
                break;

            default:
                System.err.println("execute <<< invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }

        // **** ****
        numberOfCalculations += 1;
        sumOfResults += result;
    }

    /**
     * 
     * @return
     */
    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }




    /**
     * 
     */
    static void performCalculations() {

        // **** ****
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        // **** ****
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("performCalculations <<< result: " + equation.result);
        }
    }


    /**
     * 
     * @param leftVal
     * @param rightVal
     * @param opCode
     * @return
     */
    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }


    // **** setters ****
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void setResult(double result) {
        this.result = result;
    }

    // **** getters ****
    public double getLeftVal() {
        return this.leftVal;
    }

    public double getRightVal() {
        return this.rightVal;
    }

    public char getOpCode() {
        return this.opCode;
    }

    public double getResult() {
        return this.result;
    }
}
