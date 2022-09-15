/**
 * the class to do Bitwise
 */
public class Bitwise {

    /**
     * the method to do AND of two number
     * @param a first number
     * @param b second number
     * @return doing AND
     */
    public int AND(int a , int b){
        return (a&b);
    }

    /**
     * the method to do OR of two number
     * @param a first number
     * @param b second number
     * @return doing OR
     */
    public int OR(int a, int b){
        return (a|b);
    }

    /**
     * the method to do XOR of two number
     * @param a first number
     * @param b second number
     * @return doing XOR
     */
    public int XOR(int a, int b){
        return (a^b);
    }

    /**
     * the method to do leftShift between two number
     * @param a first number
     * @param b second number
     * @return doing leftShift
     */
    public int leftShift(int a,int b){
        return (a<<b);
    }

    /**
     * the method to do rightShift  between two number
     * @param a first number
     * @param b second number
     * @return doing rightShift
     */
    public int rightShift(int a , int b){
        return (a>>b);
    }

    /**
     * the method to do bitInversion of a number
     * @param a my number
     * @return doing bitInversion
     */
    public int  bitInversion(int a){
        return (~a);
    }
}
