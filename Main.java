package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean palindrom = true;
        Scanner input = new Scanner(System.in);
        String napis = input.nextLine();
        char [] word = napis.toCharArray();
        int dlugosc = napis.length();

        if(dlugosc % 2 == 0) {
            for (int i = 0; i < dlugosc / 2; i++) {
                if (word[i] != dlugosc - i) {
                    palindrom = false;
                    System.out.println("Nie jest");
                    break;
                }
            }
        }

        else {
            for(int i = 0; i < (dlugosc-1)/2-1; i++){
                if(word[i] != word[dlugosc-i-1]){
                    palindrom = false;
                }
            }
        }

        if(palindrom == true) System.out.println("Jest");
    }
}
