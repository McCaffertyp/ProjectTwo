/*
 * RunGame.java
 */

import java.util.Random;

public class RunGame {

    public static void main(String[] args) {
		
		System.out.println("B-Bugs Bunny D-Taz Devil T-Tweety M-Marvin F-Mountain C-Carrot");
        Grid x = new Grid();
        x.createGrid();
        x.setMountain(0, 0);
        
        //CreateThreads T1 = new CreateThreads("B");
        //CreateThreads T2 = new CreateThreads("D");
        //CreateThreads T3 = new CreateThreads("T");
        //CreateThreads T4 = new CreateThreads("M");
        //T1.start();
        //T2.start();
        //T3.start();
        //T4.start();

        Random num = new Random();

        //testing the markGrid and removeMark methods
        while (!x.getWinner()) {

            int row = num.nextInt(9);
            int column = num.nextInt(9);
            x.markGrid(row, column, "B");

            row = num.nextInt(9);
            column = num.nextInt(9);
            x.markGrid(row, column, "D");

            row = num.nextInt(9);
            column = num.nextInt(9);
            x.markGrid(row, column, "T");

            row = num.nextInt(9);
            column = num.nextInt(9);
            x.markGrid(row, column, "M");

            System.out.print("\n");
            x.printGrid();

        }
        
        System.out.println("\n"+x.displayWinner()+" won!");
        //x.printGrid();

    }
}
