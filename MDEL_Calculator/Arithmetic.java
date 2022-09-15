package MDEL_Calculator;

/**
 * the class to calculate two number
 */
public class Arithmetic {
        /**
         * the method do summation of two number
         * @param a first number
         * @param b second number
         * @return doing summation
         */
        public int sum(int a, int b){
            return (a+b);
        }
        /**
         * the method do divide of two number
         * @param a first number
         * @param b second number
         * @return doing divide
         */
        public float divide(int a , int b){
            return ((float) a/b);
        }
        /**
         * the method do minus of two number
         * @param a first number
         * @param b second number
         * @return doing minus
         */
        public int minus(int a, int b){
            return (a-b);
        }
        /**
         * the method do multiply of two number
         * @param a first number
         * @param b second number
         * @return doing multiply
         */
        public int multiply(int a , int b){
            return (a*b);
        }
        /**
         * the method do modulo of two number
         * @param a first number
         * @param b second number
         * @return doing modulo
         */
        public float modulo(int a , int b){
            return ((float) a%b);
        }
}

