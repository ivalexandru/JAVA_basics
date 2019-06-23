package user_input;


import java.util.Scanner;



public class UserInput {

    public static void main(String[]args){
    int[] myIntegers = getIntegers(5);

//    afiseaza ce ai tastat
    for (int i = 0; i<myIntegers.length; i++){
        System.out.println(myIntegers[i]);
    }

//    average
        System.out.println(getAverage(myIntegers));
    }

    public static Scanner scanner = new Scanner(System.in);

//    metoda cere user input si creeaza un array de 5 elemente
//    \r cursor goes to the next line
    public static int[] getIntegers(int nrElemente){
        System.out.println("enter " + nrElemente + " int values \r");
        int[] values = new int[nrElemente];

        for (int i =0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
