public class Pattern {
    public static void main(String[] args) {

        /*
         * printing the pattern
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * printing the pattern
         * * * * *
         *       *
         *       *
         * * * * *
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(half pyramid)
         * 
         * 
         * *
         * * *
         * * * *
         * 
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(inverted half pyramid)
         * 
         * * * *
         * * *
         * *
         * 
         * 
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(inverted half pyramid rotated by 180 degree)
         * 
         * 
         * *
         * * *
         * * * *
         * 
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(half pyramid with numbers)
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(inverted half pyramid with numbers)
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = 5; i >= 1; i--) { // or for(int i = 1 ; i <= 5 ; i++){
            for (int j = 1; j <= i; j++) { // or for(int j = 1 ; j <= 5-i+1 || j <= 6-i ; j++){
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * 
         * printing the pattern(floyed's triangle)
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  " + num++ + "  ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();
        /*
         * printing the pattern(0-1 triangle)
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * Print a solid rhombus.
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 5; k++)
                System.out.print(" " + k + " ");
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * Print a number pyramid.
                  1   
                2   2   
              3   3   3   
            4   4   4   4   
          5   5   5   5   5   
         */

        for (int i = 1; i <= 5; i++) {

            // spaces (for centering)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            // numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   ");
            }

            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * Print a palindromic pattern.
                       1
                    2  1  2
                 3  2  1  2  3
              4  3  2  1  2  3  4
           5  4  3  2  1  2  3  4  5
         */

        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j >= i ; j--){
                System.out.print("   ");
            }
            for(int k = i ; k >= 1; k--){
                System.out.print("  "+k);
            }
            for(int l = 2 ; l <= i ; l++){
                System.out.print("  "+l);
            }
            System.out.println();
        }

        /*
         * for extra line
         */
        System.out.println();

        /*
         * Print a diamond pattern.
         * 
         */
    }
}
