package sort_descending_ex;

import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        int[] myArrayInt = getIntegers(4);
        int[] sorted = sortIntegers(myArrayInt);
        printArray(sorted);

    }


    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int nrElemente){
        System.out.println("introdu int \r");
        int[] valoriIntroduse = new int[nrElemente];

        for (int i = 0; i < nrElemente; i++){
            valoriIntroduse[i] = scanner.nextInt();
        }
        return valoriIntroduse;
    }

    public static void printArray(int[] arrayX){
        for(int i = 0; i < arrayX.length; i++){
            System.out.println(arrayX[i] + " indx");
        }
    }

    public static int[] sortIntegers(int[] arrayInitial){
//        creez un nou array de aceeasi dimensiune
        int[] sortedArray = new int[arrayInitial.length];
//        copiez arrayInitial in sortedArray
        for (int i = 0; i < arrayInitial.length; i++){
sortedArray[i] = arrayInitial[i];
            }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            //        (sortedArray.length - 1 )  ca sa nu o ia de la capat loop-ul
            for(int i = 0; i< sortedArray.length - 1; i++){
                //daca i+1 nu e > i, nu se mai face o iteratie de WHILE
                //pt ca nu mai exista nr care sa fie mai mare ca nr din stanga sa
                //SE FAC ORICUM ITERATIILE DE FOR
                //daca nr din STANGA e mai mic, ramane pe pozitie
                //si se ia la verificat urmatorul nr
                //daca sunt deja sortate invers, se executa un singur FOR
                //apoi se iese si din while
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true; //aka mai baga o iteratie de while
                }
            }
        }
        return sortedArray;
        }


    }

