package com.company;

public class Main {

    /******************************************
     * This is the method to print pattern 1a *
     ******************************************/
    public static void PrintPattern1a(int numRows) {

        // This loop takes care of the rows
        for (int i = 1; i <= numRows; i++) {
            // This loop takes care of printing the pound signs
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    /******************************************
     * This is the method to print pattern 1b *
     ******************************************/
    public static void PrintPattern1b(int numRows) {

        // This loop takes care of the rows
        for (int i = 1; i <= numRows; i++) {
            // This loop takes care of printing the pound signs
            for (int j = 1; j <= (numRows - i + 1); j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }

    /******************************************
     * This is the method to print pattern 1c *
     ******************************************/
    public static void PrintPattern1c(int numRows) {

        // This loop takes care of the rows
        for (int i = 1; i <= numRows; i++) {
            // This loop is to print the "leading spaces" per row
            for (int k = 0; k <= ((i - 1) * 2); k++) {
                System.out.print(" ");
            }
            // This loop is to begin to print the # after the "leading spaces" per row
            for (int j = 1; j <= (numRows - i + 1); j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    /******************************************
     * This is the method to print pattern 1d *
     ******************************************/
    public static void PrintPattern1d(int numRows) {
        // This is the loop to take care of the
        for (int i = 1; i <= numRows; i++) {
            // This loop is to print the "leading spaces" per row
            for (int k= 2*(numRows - i) ; k >= 0; k--) {
                System.out.print(" ");
            }
            // This loop is to begin to print the # after the "leading spaces" per row
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    /******************************************
     * This is the method to print pattern 1e *
     ******************************************/
    public static void PrintPattern1e(int numRows) {

        // This is the loop to take care of the rows
        for (int i = 1; i <= numRows; i++) {
            if (i == 1 || i == numRows) {
                for (int j = 1; j <= numRows; j++) {
                    System.out.print("# ");
                }
            }
            else {
                System.out.print("#");
                for(int j = 1; j <= numRows*2 -3; j++){
                    System.out.print(" ");
                    }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /*********************************
     * This is the method to print 1f*
     *********************************/
    public static void PrintPattern1f(int numRows) {

        // This is the loop to take care of the rows
        for (int i = 1; i <= numRows; i++) {
            if (i == 1 || i == numRows) {
                for (int j = 1; j <= numRows; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for(int j = 1; j <= (i - 1) * 2; j++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /*********************************
     * This is the method to print 1g*
     *********************************/
    public static void PrintPattern1g(int numRows) {

        // This is the loop to take care of the rows
        for (int i = 1; i <= numRows; i++) {
            if (i == 1 || i == numRows) {
                for (int j = 1; j <= numRows; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for(int j = 1; j <= (numRows -i) *2; j++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /*********************************
     * This is the method to print 1h*
     *********************************/
    public static void PrintPattern1h(int numRows) {

        // This is the loop to take care of the rows
        for (int i = 1; i <= numRows; i++) {
            if (i == 1 || i == numRows) {
                for (int j = 1; j <= numRows; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for(int j = 1; j <= (numRows*2 -1); j++){

                    if ((((j + 1) / 2 == i) && ((j + 1) % 2 == 0) || ((j + (2 * i)) == ((numRows * 2) + 1)))) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }



    /****************************
     * This is the main program *
     ****************************/
    public static void main(String[] args) {
        // Variable declarations
        int numRows = 8;        // This is the number of rows to print
        int tempNumRows = 7;    // This is for testing patterns e through i

        // Welcome message
        System.out.println("Welcome to the PrintPattern Program!");

        // Call method to print 1a
        PrintPattern1a(numRows);
        System.out.println("");

        // Call method to print 1b
        PrintPattern1b(numRows);
        System.out.println("");

        // Call method to print 1c
        PrintPattern1c(numRows);
        System.out.println("");

        //Call method to print 1d
        PrintPattern1d(numRows);
        System.out.println("");

        // Call method to print 1e
        PrintPattern1e(tempNumRows);
        System.out.println("");

        //Call method to print 1f
        PrintPattern1f(tempNumRows);
        System.out.println("");

        //Call method to print 1g
        PrintPattern1g(tempNumRows);
        System.out.println("");

        //Call method to print 1h
        PrintPattern1h(tempNumRows);
        System.out.println("");
    }
}
