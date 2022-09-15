package MDEL_Calculator;

import java.util.Scanner;

/**
 * class to do arithmetic of binary number
 */
public class BinaryArithmetic {
    /**
     * adding binary number
     */
    public void binaryAdd(){
        int n;
        int decimal1=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n = ");
        n=scanner.nextInt();
        int[] binary1=new int[n];
        for(int i=0; i< binary1.length ; i++){
            binary1[i]=scanner.nextInt();
        }
        System.out.print("1_Binary = ");
        for(int i=0 ; i< binary1.length ; i++){
            System.out.print(""+binary1[i]);
            decimal1 += binary1[i]*(Math.pow(2,(n-(i+1))));
        }
        int j;
        int decimal2=0;
        System.out.print("\nEnter j = ");
        j=scanner.nextInt();
        int[] binary2=new int[j];
        for(int i=0; i< binary2.length ; i++){
            binary2[i]=scanner.nextInt();
        }
        System.out.print("\n2_Binary = ");
        for(int i=0 ; i< binary2.length ; i++){
            System.out.print(""+binary2[i]);
            decimal2 += binary2[i]*(Math.pow(2,(j-(i+1))));
        }
        int decimal=decimal1+decimal2;
        int remain;
        char binary_character[]={'0','1'};
        String binary="";
        do{
            remain = decimal%2;
            binary +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Binary = new StringBuilder();
        Binary.append(binary);
        Binary.reverse();
        System.out.println("\nBinary = " + Binary);
    }

    /**
     * subtract binary number
     */
    public void binarySubtraction(){
        int n;
        int decimal1=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n = ");
        n=scanner.nextInt();
        int[] binary1=new int[n];
        for(int i=0; i< binary1.length ; i++){
            binary1[i]=scanner.nextInt();
        }
        System.out.print("1_Binary = ");
        for(int i=0 ; i< binary1.length ; i++){
            System.out.print(""+binary1[i]);
            decimal1 += binary1[i]*(Math.pow(2,(n-(i+1))));
        }
        int j;
        int decimal2=0;
        System.out.print("\nEnter j = ");
        j=scanner.nextInt();
        int[] binary2=new int[j];
        for(int i=0; i< binary2.length ; i++){
            binary2[i]=scanner.nextInt();
        }
        System.out.print("2_Binary = ");
        for(int i=0 ; i< binary2.length ; i++){
            System.out.print(""+binary2[i]);
            decimal2 += binary2[i]*(Math.pow(2,(j-(i+1))));
        }
        int decimal=decimal1-decimal2;
        int remain;
        char binary_character[]={'0','1'};
        String binary="";
        do{
            remain = decimal%2;
            binary +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Binary = new StringBuilder();
        Binary.append(binary);
        Binary.reverse();
        System.out.println("\nBinary = " + Binary);
    }

    /**
     *
     */
    public void findFirstComplement(){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n = ");
        n=scanner.nextInt();
        int[] firstCom=new int[n];
        int[] binary=new int[n];
        for(int i=0; i< binary.length ; i++){
            binary[i]=scanner.nextInt();
        }
        System.out.print("1_Binary = ");
        for(int i=0 ; i< binary.length ; i++){
            System.out.print(""+binary[i]);
            if(binary[i]==1){
                firstCom[i]=0;
            }else{
                firstCom[i]=1;
            }
        }
        System.out.print("\nFirstComplement = ");
        for(int i=0 ; i< firstCom.length ; i++){
            System.out.print(""+firstCom[i]);
        }
    }

    /**
     * the method to call first complement from nested class
     */
    public void firstCom(){
        Complement complement=new Complement();
        complement.FirstComplement();
    }
    /**
     * the method to call second complement from nested class
     */
    public void secondCom(){
        Complement complement=new Complement();
        complement.secondComplement();
    }
    /**
     * Nested class "Complement" to solve complement of binary number
     */
    public class Complement{
        public void FirstComplement(){
            int n;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter n = ");
            n=scanner.nextInt();
            int[] firstCom=new int[n];
            int[] binary=new int[n];
            for(int i=0; i< binary.length ; i++){
                binary[i]=scanner.nextInt();
            }
            System.out.print(" Binary = ");
            for(int i=0 ; i< binary.length ; i++){
                System.out.print(""+binary[i]);
                if(binary[i]==1){
                    firstCom[i]=0;
                }else{
                    firstCom[i]=1;
                }
            }
            System.out.print("\nFirstComplement = ");
            for(int i=0 ; i< firstCom.length ; i++){
                System.out.print(""+firstCom[i]);
            }
        }
        public void secondComplement() {
            int m;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter m = ");
            m = scanner.nextInt();
            int[] firstCom = new int[m];
            int[] binary = new int[m];
            for (int i = 0; i < binary.length; i++) {
                binary[i] = scanner.nextInt();
            }
            System.out.println(" Binary = ");
            for (int i = 0; i < binary.length; i++) {
                System.out.print("" + binary[i]);
                if (binary[i] == 1) {
                    firstCom[i] = 0;
                } else {
                    firstCom[i] = 1;
                }
            }
            int decimal1=0;
            for(int i=0 ; i<firstCom.length ; i++){
                decimal1 += firstCom[i]*(Math.pow(2,(m-(i+1))));
            }

            int decimal=decimal1+1;
            int remain;
            char binary_character[]={'0','1'};
            String secondCom="";
            do{
                remain = decimal%2;
                secondCom +=binary_character[remain];
                decimal/=2;
                if(decimal<1)break;
            }while(decimal>0);
            StringBuilder secondC = new StringBuilder();
            secondC.append(secondCom);
            secondC.reverse();
            System.out.printf("\nSecondComplement = "+ secondC);
        }
    }

    /**
     * the method to add binary number with second complement
     */
    public void addWith2ndComplement(){
        int[] binaryNumber1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] binaryNumber2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char binary_character[]={'0','1'};
        String binaryAdd2Com="";
        Scanner input= new Scanner(System.in);
        int n;
        System.out.print("Enter bit of binary = ");
        n=input.nextInt();
        System.out.println("Enter Binary : ");
        for(int i=(binaryNumber1.length-n);i< binaryNumber1.length;i++){
            binaryNumber1[i]=input.nextInt();
        }
        System.out.print("\nBinary_1 : ");
        for(int i=0;i<binaryNumber1.length;i++){
            System.out.print(" "+binaryNumber1[i]);
        }
        System.out.println();
        //=============================================================
        int decimal1=0;
        for(int i=0 ; i< binaryNumber1.length ; i++){
            decimal1 += binaryNumber1[i]*(Math.pow(2,(binaryNumber1.length-(i+1))));
        }
        //=============================================================
        int m;
        System.out.print("Enter bit of binary = ");
        m=input.nextInt();
        System.out.println("Enter Binary : ");
        for(int i=(binaryNumber2.length-m);i< binaryNumber2.length;i++){
            binaryNumber2[i]=input.nextInt();
        }
        System.out.print("\nBinary_2 : ");
        for(int i=0;i<binaryNumber2.length;i++){
            System.out.print(" "+binaryNumber2[i]);
        }
        System.out.println();
        //=============================================================
        int decimal2=0;
        for(int i=0 ; i< binaryNumber2.length ; i++){
            decimal2 += binaryNumber2[i]*(Math.pow(2,(binaryNumber2.length-(i+1))));
        }
        int decimal=decimal1+decimal2;
        //=============================================================
        int remain;
        do{
            remain = decimal%2;
            binaryAdd2Com +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder binaryAdd2Complement = new StringBuilder();
        binaryAdd2Complement.append(binaryAdd2Com);
        binaryAdd2Complement.reverse();
        System.out.printf("\nSecondComplement = "+ binaryAdd2Complement);
    }
    /**
     * the method to sub binary number with second complement
     */
    public void subWith2ndComplement(){
        int[] binaryNumber1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] binaryNumber2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner input= new Scanner(System.in);
        int n,cont=0;
        System.out.print("Enter bit of binary = ");
        n=input.nextInt();
        System.out.println("Enter Binary : ");
        for(int i=(binaryNumber1.length-n);i< binaryNumber1.length;i++){
            binaryNumber1[i]=input.nextInt();
        }
        System.out.print("\nBinary_1 : ");
        for(int i=0;i<binaryNumber1.length;i++){
            System.out.print(" "+binaryNumber1[i]);
        }
        System.out.println();
        //=============================================================
        int decimal1=0;
        for(int i=0 ; i< binaryNumber1.length ; i++){
            decimal1 += binaryNumber1[i]*(Math.pow(2,(binaryNumber1.length-(i+1))));
        }
        //=============================================================
        int m;
        System.out.print("Enter bit of binary = ");
        m=input.nextInt();
        System.out.println("Enter Binary : ");
        for(int i=(binaryNumber2.length-m);i< binaryNumber2.length;i++){
            binaryNumber2[i]=input.nextInt();
        }
        System.out.print("Binary_2 :");
        for(int i=0;i< binaryNumber2.length;i++){
            System.out.print(" "+binaryNumber2[i]);
        }
        System.out.println();
        //=============================================================
        int[] firstCom_binary2=new int[32];
        int[] number={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        for (int i = 0; i < binaryNumber2.length; i++) {
            if (binaryNumber2[i] == 1) {
                firstCom_binary2[i] = 0;
            } else {
                firstCom_binary2[i] = 1;
            }
        }
        //=============================================================
        int[] secondCom_binary2=new int[firstCom_binary2.length];
        for(int i=(firstCom_binary2.length-1);i>=0;i--){
            if(secondCom_binary2[i]==0){
                secondCom_binary2[i]=firstCom_binary2[i]+number[i];
            }
            if(secondCom_binary2[i]==2){
                secondCom_binary2[i]=0;
                secondCom_binary2[i-1]=firstCom_binary2[i-1]+1;
            }
        }
        //=============================================================
        int[] subBinary=new int[32];
        int remain=0;
        int achieveOf_re;
        for(int i=(subBinary.length-1);i>=0;--i){
            if(subBinary[i]==0){
                subBinary[i]=binaryNumber1[i]+secondCom_binary2[i]+remain;
            }
            if(subBinary[i]==2){
                subBinary[i]=0;
                remain=1;
            }
            if(subBinary[i]==3){
                subBinary[i]=1;
                remain=1;
            }
        }
        System.out.println("\nbinarySub2Complement = ");
        for(int i=0;i<subBinary.length;i++){
            System.out.print(" "+subBinary[i]);
        }
    }

    /**
     * the method to multiply binary number
     */
    public void binaryMultiply(){
        int n;
        int decimal1=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n = ");
        n=scanner.nextInt();
        int[] binary1=new int[n];
        for(int i=0; i< binary1.length ; i++){
            binary1[i]=scanner.nextInt();
        }
        System.out.print("1_Binary = ");
        for(int i=0 ; i< binary1.length ; i++){
            System.out.print(""+binary1[i]);
            decimal1 += binary1[i]*(Math.pow(2,(n-(i+1))));
        }
        int j;
        int decimal2=0;
        System.out.print("\nEnter j = ");
        j=scanner.nextInt();
        int[] binary2=new int[j];
        for(int i=0; i< binary2.length ; i++){
            binary2[i]=scanner.nextInt();
        }
        System.out.print("2_Binary = ");
        for(int i=0 ; i< binary2.length ; i++){
            System.out.print(""+binary2[i]);
            decimal2 += binary2[i]*(Math.pow(2,(j-(i+1))));
        }
        int decimal=decimal1*decimal2;
        int remain;
        char binary_character[]={'0','1'};
        String binary="";
        do{
            remain = decimal%2;
            binary +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Binary = new StringBuilder();
        Binary.append(binary);
        Binary.reverse();
        System.out.println("\nBinary = " + Binary);
    }

    /**
     * the method to divide of binary
     */
    public void binaryDivide(){
        int n;
        int decimal1=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n = ");
        n=scanner.nextInt();
        int[] binary1=new int[n];
        for(int i=0; i< binary1.length ; i++){
            binary1[i]=scanner.nextInt();
        }
        System.out.print("1_Binary = ");
        for(int i=0 ; i< binary1.length ; i++){
            System.out.print(""+binary1[i]);
            decimal1 += binary1[i]*(Math.pow(2,(n-(i+1))));
        }
        int j;
        int decimal2=0;
        System.out.print("\nEnter j = ");
        j=scanner.nextInt();
        int[] binary2=new int[j];
        for(int i=0; i< binary2.length ; i++){
            binary2[i]=scanner.nextInt();
        }
        System.out.print("2_Binary = ");
        for(int i=0 ; i< binary2.length ; i++){
            System.out.print(""+binary2[i]);
            decimal2 += binary2[i]*(Math.pow(2,(j-(i+1))));
        }
        int decimal=decimal1/decimal2;
        int remain;
        char binary_character[]={'0','1'};
        String binary="";
        do{
            remain = decimal%2;
            binary +=binary_character[remain];
            decimal/=2;
            if(decimal<1)break;
        }while(decimal>0);
        StringBuilder Binary = new StringBuilder();
        Binary.append(binary);
        Binary.reverse();
        System.out.println("\nBinary = " + Binary);
    }
}
