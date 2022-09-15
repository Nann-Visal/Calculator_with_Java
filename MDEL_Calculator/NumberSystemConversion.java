import java.util.Scanner;
import java.lang.*;

/**
 * the class to converts system of number
 */
public class NumberSystemConversion {
    /**
     * the method to check binary number
     * @param j count bits of binary
     * @param bin binary number
     * @return checking to check
     */
    public String isValidBinary(int j,int[] bin){
        String checking="";
        for(j=0; j<bin.length; j++){
            if(bin[j]==1||bin[j]==0){
                checking="true";
            }else{
                checking="false";
                break;
            }
        }
        return checking;
    }

    /**
     * the method to check octal number
     * @param j count bits of octal
     * @param oct octal number
     * @return checking to check
     */
    public String  isValidOctal(int j,int[] oct){
        String checking="";
        for(j=0;j< oct.length;j++){
            if(oct[j]>=0&&oct[j]<=7){
                checking="true";
            }else{
                checking="false";
                break;
            }
        }
        return checking;
    }
    /**
     * the method to convert binary number to other
     */
    public void binaryToDecimal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int[] Binary = new int[n];
        double Decimal=0;
        /**
         * user input and convert to Decimal
         */
        for(int i=0 ; i< Binary.length ; i++){
            Binary[i] = input.nextInt();
        }
        /**
         * checking binary number
         */
         String checking="";
         checking=isValidBinary(n,Binary);
         switch (checking){
             case "true":
                 /**
                  * print and convert to decimal
                  */
                 System.out.print("Binary = ");
                 for(int i=0 ; i< Binary.length ; i++){
                     System.out.print("" + Binary[i]);
                     Decimal += Binary[i]*(Math.pow(2,(n-(i+1))));
                 }
                 System.out.println("\nDecimal = " + (int)Decimal);
                 break;
             case "false":
                 System.out.println("Invalid number, please enter '0' or '1' ");
         }

    }

    /**
     * the method to convert from binary to octal
     */
    public void binaryToOctal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int remain;
        String Octal="";
        char Octal_character[]={'0','1','2','3','4','5','6','7'};
        int[] Binary = new int[n];
        double Decimal=0;
        /**
         * user input and convert to Decimal
         */
        for(int i=0 ; i< Binary.length ; i++){
            Binary[i] = input.nextInt();
        }
        /**
         * checking binary number
         */
        String checking="";
        checking=isValidBinary(n,Binary);
        switch (checking){
            case "true":
                /**
                 * print and convert to decimal
                 */
                System.out.print("Binary = ");
                for(int i=0 ; i< Binary.length ; i++){
                    System.out.print("" + Binary[i]);
                    Decimal += Binary[i]*(Math.pow(2,(n-(i+1))));
                }
                System.out.println("\nDecimal = " + (int)Decimal);
                /**
                 * looking for Octal string
                 */
                do{
                    remain = (int)Decimal%8;
                    Octal += Octal_character[remain];
                    Decimal/=8;
                    if(Decimal<1)break;
                }while(Decimal>0);
                /**
                 * format string Octal
                 */
                StringBuilder Octals = new StringBuilder();
                Octals.append(Octal);
                Octals.reverse();
                System.out.println("\nOctal = " + Octals +"\n");
                break;
            case "false":
                System.out.println("Invalid number, please enter '0' or '1' ");
        }
    }
    public void binaryToHexadecimal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int remain;
        String Hexa="";
        char Hexa_character[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[] Binary = new int[n];
        double Decimal=0;
        /**
         * user input and convert to Decimal
         */
        for(int i=0 ; i< Binary.length ; i++){
            Binary[i] = input.nextInt();
        }
        /**
         * checking binary number
         */
        String checking="";
        checking=isValidBinary(n,Binary);
        switch (checking){
            case "true":
                /**
                 * print and convert to decimal
                 */
                System.out.print("Binary = ");
                for(int i=0 ; i< Binary.length ; i++){
                    System.out.print("" + Binary[i]);
                    Decimal += Binary[i]*(Math.pow(2,(n-(i+1))));
                }
                /**
                 * looking for Hexadecimal string
                 */
                do{
                    remain = (int)Decimal%16;
                    Hexa += Hexa_character[remain];
                    Decimal/=16;
                    if(Decimal<1)break;
                }while(Decimal>0);
                /**
                 * format string Hexa
                 */
                StringBuilder Hexas = new StringBuilder();
                Hexas.append(Hexa);
                Hexas.reverse();
                System.out.println("Hexadecimals = " + Hexas +"\n");
                break;
            case "false":
                System.out.println("Invalid number, please enter '0' or '1' ");
                break;
        }
    }
    /**
     * the method to convert from Octal to Decimal
     */
    public void octalToDecimal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int[] Octal = new int[n];
        double Decimal=0;
        /**
         * user input amd convert to Decimal
         */
        for(int i=0 ; i< Octal.length ; i++){
            Octal[i] = input.nextInt();
        }
        /**
         * checking octal number
         */
        String checking="";
        checking=isValidOctal(n,Octal);
        switch (checking){
            case "true":
                System.out.print("Octal = ");
                for(int i=0 ; i< Octal.length ; i++){
                    System.out.print("" + Octal[i]);
                    Decimal += Octal[i]*(Math.pow(8,(n-(i+1))));
                }
                System.out.println("\nDecimal = " + (int)Decimal);
                break;
            case "false":
                System.out.println("Invalid number, please enter '0''1''2''3''4''5''6' or'7' ");
                break;
        }
    }

    /**
     * the method to convert from octal to binary
     */
    public void octalToBinary(){
        Scanner input = new Scanner(System.in);
        int remain;
        String Binary="";
        char Binary_character[]={'0','1'};
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int[] Octal = new int[n];
        double Decimal=0;
        /**
         * user input and convert to Decimal
         */
        for(int i=0 ; i< Octal.length ; i++){
            Octal[i] = input.nextInt();
        }
        /**
         * checking octal number
         */
        String checking="";
        checking=isValidOctal(n,Octal);
        switch (checking){
            case "true":
                System.out.print("Octal = ");
                for(int i=0 ; i< Octal.length ; i++){
                    System.out.print("" + Octal[i]);
                    Decimal += Octal[i]*(Math.pow(8,(n-(i+1))));
                }
                System.out.println("\nDecimal = " + (int)Decimal);
                /**
                 * looking for Binary string
                 */
                do{
                    remain = (int)Decimal%2;
                    Binary += Binary_character[remain];
                    Decimal/=2;
                    if(Decimal<1)break;
                }while(Decimal>0);
                /**
                 * format string Binary
                 */
                StringBuilder Binarys = new StringBuilder();
                Binarys.append(Binary);
                Binarys.reverse();
                System.out.println("\nBinary = " + Binarys +"\n");
                break;
            case "false":
                System.out.println("Invalid number, please enter '0''1''2''3''4''5''6' or'7' ");
                break;
        }
    }
    /**
     * the method to convert from octal to hexadecimal
     */
    public void octalToHexadecimal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        int[] Octal = new int[n];
        double Decimal=0;
        /**
         * user input and convert to decimal
         */
        for(int i=0 ; i< Octal.length ; i++){
            Octal[i] = input.nextInt();
        }
        /**
         * checking octal number
         */
        String checking="";
        checking=isValidOctal(n,Octal);
        switch (checking){
            case "true":
                int remain;
                String Hexadecimal="";
                char Hexadecimal_character[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                System.out.print("Octal = ");
                for(int i=0 ; i< Octal.length ; i++){
                    System.out.print("" + Octal[i]);
                    Decimal += Octal[i]*(Math.pow(8,(n-(i+1))));
                }
                /**
                 * looking for Hexadecimal string
                 */
                do{
                    remain = (int)Decimal%16;
                    Hexadecimal += Hexadecimal_character[remain];
                    Decimal/=16;
                    if(Decimal<1)break;
                }while(Decimal>0);
                /**
                 * format string Hexadecimal
                 */
                StringBuilder Hexadecimals = new StringBuilder();
                Hexadecimals.append(Hexadecimal);
                Hexadecimals.reverse();
                System.out.println("\nHexadecimal = " + Hexadecimals +"\n");
                break;
            case "false":
                System.out.println("Invalid number, please enter '0''1''2''3''4''5''6' or'7' ");
                break;
        }
    }
}
