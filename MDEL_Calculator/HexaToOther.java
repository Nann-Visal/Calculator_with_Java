package MDEL_Calculator;

import java.util.Scanner;

/**
 * the class to convert from hexadecimal to other number system
 */
public class HexaToOther {
    /**
     * the method to check hexadecimal number
     * @param j
     * @param hex
     * @return
     */
    public String isValidHex(int j,char[] hex){
        String checking="";
        for(j=0;j< hex.length;j++){
            if(hex[j]=='0'||hex[j]=='1'||hex[j]=='2'||hex[j]=='3'||hex[j]=='4'||hex[j]=='5'||hex[j]=='6'||hex[j]=='7'||
                    hex[j]=='8'||hex[j]=='9'||hex[j]=='a'||hex[j]=='b'||hex[j]=='c'||hex[j]=='d'||hex[j]=='e'||hex[j]=='f'||
                    hex[j]=='A'||hex[j]=='B'||hex[j]=='C'||hex[j]=='D'||hex[j]=='E'||hex[j]=='f'){
                checking="true";
            }else{
                checking="false";
                break;
            }
        }
        return checking;
    }
    /**
     * the method to convert from hexadecimal to decimal
     */
    public void HexadecimalToDecimal(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=input.nextInt();
        char[] Hexadecimal = new char[n];
        double Decimal=0;
        /**
         * user input and convert to Decimal
         */
        for(int i=0 ; i< Hexadecimal.length ; i++){
            Hexadecimal[i] = input.next().charAt(0);
        }
        /**
         * checking octal number
         */
        String checking="";
        checking=isValidHex(n,Hexadecimal);
        switch (checking){
            case "true":
                System.out.print("Hexadecimal = ");
                for(int i=0 ; i< Hexadecimal.length ; i++){
                    System.out.print("" + Hexadecimal[i]);
                    if(Hexadecimal[i]=='0'){
                        Decimal += 0*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='1'){
                        Decimal += 1*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='2'){
                        Decimal += 2*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='3'){
                        Decimal += 3*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='4'){
                        Decimal += 4*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='5'){
                        Decimal += 5*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='6'){
                        Decimal += 6*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='7'){
                        Decimal += 7*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='8'){
                        Decimal += 8*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='9'){
                        Decimal += 9*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='A'||Hexadecimal[i]=='a'){
                        Decimal += 10*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='B'||Hexadecimal[i]=='b'){
                        Decimal += 11*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='C'||Hexadecimal[i]=='c'){
                        Decimal += 12*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='D'||Hexadecimal[i]=='d'){
                        Decimal += 13*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='E'||Hexadecimal[i]=='e'){
                        Decimal += 14*(Math.pow(16,(n-(i+1))));
                    }
                    if(Hexadecimal[i]=='F'||Hexadecimal[i]=='f'){
                        Decimal += 15*(Math.pow(16,(n-(i+1))));
                    }

                }
                System.out.println("\nDecimal = " + (int)Decimal);
                break;
            case "false":
                System.out.println("Invalid,please enter '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'");
                break;
        }
    }

    /**
     * the method to convert from hexadecimal to binary
     */
    public void HexadecimalToBinary() {
            Scanner input = new Scanner(System.in);
            int n;
            System.out.print("Enter n = ");
            n = input.nextInt();
            char[] Hexadecimal = new char[n];
            int Decimal = 0;
            /**
             * user input and convert to Decimal
             */
            for (int i = 0; i < Hexadecimal.length; i++) {
                Hexadecimal[i] = input.next().charAt(0);
            }
        /**
         * checking hexadecimal number
         */
        String checking="";
            checking=isValidHex(n,Hexadecimal);
            switch (checking){
                case "true":
                    System.out.print("Hexadecimal = ");
                    for (int i = 0; i < Hexadecimal.length; i++) {
                        System.out.print("" + Hexadecimal[i]);
                        if (Hexadecimal[i] == '0') {
                            Decimal += 0 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '1') {
                            Decimal += 1 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '2') {
                            Decimal += 2 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '3') {
                            Decimal += 3 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '4') {
                            Decimal += 4 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '5') {
                            Decimal += 5 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '6') {
                            Decimal += 6 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '7') {
                            Decimal += 7 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '8') {
                            Decimal += 8 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == '9') {
                            Decimal += 9 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'A' || Hexadecimal[i] == 'a') {
                            Decimal += 10 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'B' || Hexadecimal[i] == 'b') {
                            Decimal += 11 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'C' || Hexadecimal[i] == 'c') {
                            Decimal += 12 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'D' || Hexadecimal[i] == 'd') {
                            Decimal += 13 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'E' || Hexadecimal[i] == 'e') {
                            Decimal += 14 * (Math.pow(16, (n - (i + 1))));
                        }
                        if (Hexadecimal[i] == 'F' || Hexadecimal[i] == 'f') {
                            Decimal += 15 * (Math.pow(16, (n - (i + 1))));
                        }
                    }
                    /**
                     * convert decimal above to binary
                     */
                    int remain;
                    char binary_character[]={'0','1'};
                    String binary="";
                    do{
                        remain = Decimal%2;
                        binary +=binary_character[remain];
                        Decimal/=2;
                        if(Decimal<1)break;
                    }while(Decimal>0);
                    StringBuilder Binary = new StringBuilder();
                    Binary.append(binary);
                    Binary.reverse();
                    System.out.println("\nBinary = " + Binary);
                    break;
                case "false":
                    System.out.println("Invalid,please enter '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'");
                    break;
            }
    }

    /**
     * the method to convert from hexadecimal to octal
     */
    public void HexadecimalToOctal() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n = input.nextInt();
        char[] Hexadecimal = new char[n];
        int Decimal = 0;
        /**
         * user input and convert to Octal
         */
        for (int i = 0; i < Hexadecimal.length; i++) {
            Hexadecimal[i] = input.next().charAt(0);
        }
        String checking="";
        checking=isValidHex(n,Hexadecimal);
        switch (checking){
            case "true":
                System.out.print("Hexadecimal = ");
                for (int i = 0; i < Hexadecimal.length; i++) {
                    System.out.print("" + Hexadecimal[i]);
                    if (Hexadecimal[i] == '0') {
                        Decimal += 0 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '1') {
                        Decimal += 1 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '2') {
                        Decimal += 2 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '3') {
                        Decimal += 3 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '4') {
                        Decimal += 4 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '5') {
                        Decimal += 5 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '6') {
                        Decimal += 6 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '7') {
                        Decimal += 7 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '8') {
                        Decimal += 8 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == '9') {
                        Decimal += 9 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'A' || Hexadecimal[i] == 'a') {
                        Decimal += 10 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'B' || Hexadecimal[i] == 'b') {
                        Decimal += 11 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'C' || Hexadecimal[i] == 'c') {
                        Decimal += 12 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'D' || Hexadecimal[i] == 'd') {
                        Decimal += 13 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'E' || Hexadecimal[i] == 'e') {
                        Decimal += 14 * (Math.pow(16, (n - (i + 1))));
                    }
                    if (Hexadecimal[i] == 'F' || Hexadecimal[i] == 'f') {
                        Decimal += 15 * (Math.pow(16, (n - (i + 1))));
                    }
                }
                /**
                 * convert decimal above to octal
                 */
                int remain;
                char Octal_character[]={'0','1','2','3','4','5','6','7'};
                String Octal="";
                do{
                    remain = Decimal%8;
                    Octal +=Octal_character[remain];
                    Decimal/=8;
                    if(Decimal<1)break;
                }while(Decimal>0);
                StringBuilder Octals = new StringBuilder();
                Octals.append(Octal);
                Octals.reverse();
                System.out.println("\nOctal = " + Octals);
                break;
            case "false":
                System.out.println("Invalid,please enter '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'");
                break;
        }
    }

}
