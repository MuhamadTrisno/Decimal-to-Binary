
package project;

import java.util.Scanner;

public class Project {
    public String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
    String binary = "";
    while (n > 0) {
        int rem = n % 2;
        binary = rem + binary;
        n = n / 2;
    }
    

    return binary;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("masukan nilai = ");
            int decimal = scanner.nextInt();
            
            Project dtb = new
            Project();
            String binary = dtb.toBinary(decimal);
            System.out.println("hasil nilainya = " + binary);
    }
  
    
}
