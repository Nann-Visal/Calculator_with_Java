package MDEL_Calculator;

/**
 * the class to do Trigonometry
 */
public class Trigonometry {
    /**
     * the method to convert the value of degree to radian
     * @param a my number
     * @return do converting
     */
    public double DegreeToRadian(double a){
        return Math.toRadians(a);
    }

    /**
     * the method to convert of a number to sin
     * @param a my number
     * @return do converting
     */
    public double sin(int  a){
        return Math.sin(a);
    }

    /**
     * the method to convert a value of sin to degree
     * @param a my number
     * @return do converting
     */
    public double sinToDegree(int  a){
        return Math.sin(DegreeToRadian(a));
    }

    /**
     * the method to convert of a number to cos
     * @param a my number
     * @return do converting
     */
    public double cos(int  a){
        return Math.cos(a);
    }

    /**
     * the method to convert the value of cos to degree
     * @param a my number
     * @return
     */
    public double cosToDegree(int a){
        return Math.cos(DegreeToRadian(a));
    }

    /**
     * the method to convert of a number to tan
     * @param a my number
     * @return do converting
     */
    public double tan(int  a){
        return Math.tan((double) a);
    }

    /**
     * the method to convert the value of tan to degree
     * @param a my number
     * @return do converting
     */
    public double tanToDegree(int  a){
        return Math.tan(DegreeToRadian((double) a));
    }

    /**
     * the method to do square of 2 in type int
     * @param a my number
     * @return do square
     */
    public double square_int(int a){
        return Math.pow(a,(1.0/2));
    }

    /**
     * the method to do square of 2 in type long
     * @param a my number
     * @return do square
     */
    public double square_double(long a){
        return Math.pow((double) a,(1.0/2));
    }

    /**
     * the method to do square of 3 in type int
     * @param a my number
     * @return do square
     */
    public double square3_int(int a){
        return Math.pow(a,(1.0/3));
    }

    /**
     * the method to do square of 3 in type long
     * @param a my number
     * @return do square
     */
    public double square3_double(long a){
        return Math.pow((double) a,(1.0/3));
    }
}
