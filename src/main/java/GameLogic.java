

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {


    void start() {


        boolean chk = false;


        //Steps of player and computer with show Field

        int x = 0;
        while (x < 9) {
            x++;


            //If player do step

            if (x % 2 != 0) {


                Field.StepP();

                Field.FieldArr();
                Field.FieldFull();


                //Result of game (Winner Player)

                //horizontal
                if ((Field.arr[0][0] == 'X' && Field.arr[0][1] == 'X' && Field.arr[0][2] == 'X')
                        || (Field.arr[1][0] == 'X' && Field.arr[1][1] == 'X' && Field.arr[1][2] == 'X')
                        || (Field.arr[2][0] == 'X' && Field.arr[2][1] == 'X' && Field.arr[2][2] == 'X')

                        //Vertical
                        || (Field.arr[0][0] == 'X' && Field.arr[1][0] == 'X' && Field.arr[2][0] == 'X')
                        || (Field.arr[0][1] == 'X' && Field.arr[1][1] == 'X' && Field.arr[2][1] == 'X')
                        || (Field.arr[0][2] == 'X' && Field.arr[1][2] == 'X' && Field.arr[2][2] == 'X')

                        //diagonal
                        || (Field.arr[0][0] == 'X' && Field.arr[1][1] == 'X' && Field.arr[2][2] == 'X')
                        || (Field.arr[2][0] == 'X' && Field.arr[1][1] == 'X' && Field.arr[0][2] == 'X')

                        ) {
                    System.out.println("");
                    System.out.println("***You Winner!!!***");
                    break;
                }


            }

            //If computer do step
            else if (x % 2 == 0) {

                Field.StepC();
                Field.FieldArr();
                Field.FieldFull();


                //Result of game (Winner Computer)

                //horizontal
                if ((Field.arr[0][0] == 'O' && Field.arr[0][1] == 'O' && Field.arr[0][2] == 'O')
                        || (Field.arr[1][0] == 'O' && Field.arr[1][1] == 'O' && Field.arr[1][2] == 'O')
                        || (Field.arr[2][0] == 'O' && Field.arr[2][1] == 'O' && Field.arr[2][2] == 'O')

                        //Vertical
                        || (Field.arr[0][0] == 'O' && Field.arr[1][0] == 'O' && Field.arr[2][0] == 'O')
                        || (Field.arr[0][1] == 'O' && Field.arr[1][1] == 'O' && Field.arr[2][1] == 'O')
                        || (Field.arr[0][2] == 'O' && Field.arr[1][2] == 'O' && Field.arr[2][2] == 'O')

                        //diagonal
                        || (Field.arr[0][0] == 'O' && Field.arr[1][1] == 'O' && Field.arr[2][2] == 'O')
                        || (Field.arr[2][0] == 'O' && Field.arr[1][1] == 'O' && Field.arr[0][2] == 'O')

                        ) {

                    System.out.println("***Computer Winner!!!***");
                    break;
                }
            }


            else break;
        }


        System.out.println();
        System.out.println("Game Over!!!");
    }


}





