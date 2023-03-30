package strings;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        String address = args[0];

        if (checkFormat(address)) {
            System.out.println("Correct Format");
            validAddress(address);
        } else {
            System.out.println("Incorrect Format");
        } 
    }
    
    public static int numberOccurences(String address, char character) {
        int occurences = 0;

        for (int index = 0; index < address.length(); index++) {
            if (address.charAt(index) == character) 
                occurences++;
        }

        return occurences; 
    }

    public static boolean besideCharacters(String address, char character) {
        boolean beside = false; 
        for (int index = 0; index < address.length() - 1; index++) {
            if (address.charAt(index) == character) {
                if (address.charAt(index + 1) == character)
                    beside = true; 
            }
        }

        return beside; 
    }

    public static boolean checkFormat(String address) {
        int length = address.length(); 
        boolean valid = true; 

        if (length < 7 || length > 15) 
            valid = false; 

        else if (address.charAt(0) == '.' || address.charAt(length - 1) == '.')
            valid = false;

        else if (numberOccurences(address, '.') != 3) 
            valid = false;  

        else if (besideCharacters(address, '.'))
            valid = false; 

        return valid; 
    }

    public static void validAddress(String address) {
        String s = address + '.'; 
        boolean goAhead = true; 

        while (s.length() != 0 && goAhead) {
            String substring = s.substring(0, s.indexOf('.'));

            for (int index = 0; index < substring.length() && goAhead; index++) {
                char character = substring.charAt(index);
                if (!Character.isDigit(character))
                    goAhead = false; 
            }

            if (goAhead) {
                int value = Integer.parseInt(substring);
                if (value < 0 || value > 255)
                    goAhead = false; 
            }

            s = s.substring(s.indexOf('.') + 1);
        }

        if (goAhead) 
            System.out.println("Valid IP-Address"); 
        else
            System.out.println("Invalid IP-Address");
    }
} 