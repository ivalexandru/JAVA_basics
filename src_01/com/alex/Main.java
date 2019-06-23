package com.alex;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i;
        }
        printArray(myIntArray);

    }

        public static void printArray(int[] parametrul){
            for (int i =0; i < parametrul.length; i++){
                System.out.println(parametrul[i] + " index");
            }
        }
}

