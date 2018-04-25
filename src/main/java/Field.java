

import com.sun.java.swing.action.ExitAction;
import com.sun.tools.javah.Util;

import java.util.Scanner;
import java.util.Random;


public class Field {


    public static char[][] arr = new char[][]
            {
                    {'0', '1', '2'},
                    {'3', '4', '5'},
                    {'6', '7', '8'}
            };




    //Vivod Cycle

    static void FieldArr() {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("|");
                System.out.print(arr[i][j] + "| ");

            }
            System.out.println("");


        }
    }

    //Check if nobody won
    //Still working method not finished

    public static boolean FieldFull (){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (arr[i][j] != 'X' || arr[i][j] != 'O') return false;

                System.out.println("Nobody won!");

            }
        }

        return true;
    }


    //method for Player Step "X"

    static boolean StepP() {

        int choiceP;
        boolean threeChance;
        boolean wrongField;


        System.out.println();
        System.out.println("---For Exit push: '99'---");
        System.out.println();
        System.out.println("Choose number");
        System.out.println();

        Scanner step = new Scanner(System.in);
        int x = 0;

        while (x < 1) {  //hod i vibor nomera dlya shaga
            x++;

            // 3 Popitki dlya hoda
            threeChance = false;
            for (int z = 1; z < 3; z++) {
                if (threeChance == true)
                    break;
                else



                    choiceP = step.nextInt();

                switch (choiceP) {

                    case 0:
                        if (Field.arr[0][0] == 'O' || Field.arr[0][0] == 'X') { // Esli pole uzhe zanyato 'X' ili 'O' to povtornii vvod
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[0][0] = 'X'; // Esli pole svobodno zamena cifri na 'X'
                            System.out.println("- Nice step -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 1:
                        if (Field.arr[0][1] == 'O' || Field.arr[0][1] == 'X') { // Esli pole uzhe zanyato 'X' ili 'O' to povtornii vvod
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[0][1] = 'X'; // Esli pole svobodno zamena cifri na 'X'
                            System.out.println("- Smart -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 2:
                        if (Field.arr[0][2] == 'O' || Field.arr[0][2] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[0][2] = 'X';
                            System.out.print("- Well done -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 3:
                        if (Field.arr[1][0] == 'O' || Field.arr[1][0] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[1][0] = 'X';
                            System.out.println("- WOW - ");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 4:
                        if (Field.arr[1][1] == 'O' || Field.arr[1][1] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[1][1] = 'X';
                            System.out.println("- GREAT JOB -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 5:
                        if (Field.arr[1][2] == 'O' || Field.arr[1][2] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[1][2] = 'X';
                            System.out.println("- Well done -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 6:
                        if (Field.arr[2][0] == 'O' || Field.arr[2][0] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[2][0] = 'X';
                            System.out.println("- Nice step -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 7:
                        if (Field.arr[2][1] == 'O' || Field.arr[2][1] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[2][1] = 'X';
                            System.out.println("- Almost Win -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 8:
                        if (Field.arr[2][2] == 'O' || Field.arr[2][2] == 'X') {
                            System.out.println("Field is Full. Try again.");
                            return StepP();
                        } else {

                            Field.arr[2][2] = 'X';
                            System.out.println("- Well done -");
                            System.out.println();
                            threeChance = true;
                            break;
                        }
                    case 99:   // Dlya vihoda iz igri

                        System.out.println("See You Soon!");
                        System.out.println("");
                        System.out.println(":-(((((((((");
                        System.exit(99);


                    default:    // Esli vibrana nepravilnaya kletka
                        System.out.println();
                        System.out.println("Wrong number. Try again.");
                        System.out.println();

                }
            }
        }

        return true;

    }



    //method for Computer Step "O"

    static boolean StepC() {

        int choiceC;

        System.out.println();
        System.out.println("Computer Step!");

        Random rand = new Random();
        Scanner step = new Scanner(System.in);
        int x = 0;

        while (x < 1) {  //hod i vibor nomera dlya shaga
            x++;

            choiceC = rand.nextInt(8); // sluchainoe chislo dlya hod. predel do 8.

            switch (choiceC) {

                case 0:
                    if (Field.arr[0][0] == 'O' || Field.arr[0][0] == 'X') { // Esli pole uzhe zanyato 'X' ili 'O' to povtornii vvod
                        //  System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[0][0] = 'O';   // Esli pole svobodno zamena cifri na 'O'
                        System.out.println();
                        break;
                    }
                case 1:
                    if (Field.arr[0][1] == 'O' || Field.arr[0][1] == 'X') {  // Esli pole uzhe zanyato 'X' ili 'O' to povtornii vvod
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[0][1] = 'O'; // Esli pole svobodno zamena cifri na 'O'
                        System.out.println();
                        break;
                    }
                case 2:
                    if (Field.arr[0][2] == 'O' || Field.arr[0][2] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[0][2] = 'O';
                        System.out.println();
                        break;
                    }
                case 3:
                    if (Field.arr[1][0] == 'O' || Field.arr[1][0] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[1][0] = 'O';
                        System.out.println();
                        break;
                    }
                case 4:
                    if (Field.arr[1][1] == 'O' || Field.arr[1][1] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[1][1] = 'O';
                        System.out.println();
                        break;
                    }
                case 5:
                    if (Field.arr[1][2] == 'O' || Field.arr[1][2] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[1][2] = 'O';
                        System.out.println();
                        break;
                    }
                case 6:
                    if (Field.arr[2][0] == 'O' || Field.arr[2][0] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[2][0] = 'O';
                        System.out.println();
                        break;
                    }
                case 7:
                    if (Field.arr[2][1] == 'O' || Field.arr[2][1] == 'X') {
                        //   System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[2][1] = 'O';
                        System.out.println();
                        break;
                    }
                case 8:
                    if (Field.arr[2][2] == 'O' || Field.arr[2][2]== 'X') {
                        //  System.out.println("Field is Full");
                        return StepC();
                    } else {
                        Field.arr[2][2] = 'O';
                        System.out.println();
                        break;
                    }

                default:
                    System.out.println("Wrong number! Try again!");
            }
        }

        return true;
    }

}







