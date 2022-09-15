package MDEL_Calculator;

import java.util.Scanner;

/**
 * Convert from decimal to Other
 */
public class DecimalToOther {
    public String isValidDecimal(int dec){
        String check="";
        return check;
    }
    /**
     * the method convert from decimal to binary
     */
    public void DecimalToBinary(){
        int remain;
        int decimal;
        char binary_character[]={'0','1'};
        String binary="";
        System.out.print("Decimal = ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();
        do{
            remain = decimal%2;
            binary +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Binary = new StringBuilder();
        Binary.append(binary);
        Binary.reverse();
        System.out.println("Binary = " + Binary +"\n");
    }

    /**
     * the method to convert from decimal to octal
     */
    public void DecimalToOctal(){
        int remain;
        int decimal;
        char octal_character[]={'0','1','2','3','4','5','6','7'};
        String octal="";
        System.out.print("Decimal = ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();
        do{
            remain = decimal%8;
            octal +=octal_character[remain];
            decimal/=8;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Octal = new StringBuilder();
        Octal.append(octal);
        Octal.reverse();
        System.out.println("Octal = " + Octal +"\n");
    }

    /**
     * the method to convert from decimal to hexadecimal
     */
    public void DecimalToHexadecimal(){
        int remain;
        int decimal;
        char hexadecimal_character[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal="";
        System.out.print("Decimal = ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();
        do{
            remain = decimal%16;
            hexadecimal +=hexadecimal_character[remain];
            decimal/=16;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Hexadecimal = new StringBuilder();
        Hexadecimal.append(hexadecimal);
        Hexadecimal.reverse();
        System.out.println("Hexadecimal = " + Hexadecimal +"\n");
    }
}
