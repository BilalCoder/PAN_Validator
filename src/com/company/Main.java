package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String st = sc.nextLine();
        if(st.length()!=10){
            System.out.println("Invalid PAN no");
            return;
        }
        for(int i=0; i<st.length(); i++){
            if((i<5 && !Character.isUpperCase(st.charAt(i))) || (i>4 && i<9 && !Character.isDigit(st.charAt(i)))){
                System.out.println("Invalid PAN no");
                return;
            }
            if(i==9 && !Character.isUpperCase(st.charAt(i))){
                System.out.println("Invalid PAN no");
                return;
            }
        }
        System.out.println("Valid PAN no");


//        if(pan.length()==10)
//        {
//            Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
//            Matcher matcher=pattern.matcher(pan);
//            if(matcher.matches())
//                System.out.println("Valid PAN no");
//            else
//                System.out.println("Invalid PAN no");
//        }
//        else {
//            System.out.println("Invalid PAN no");
//        }
    }
}
