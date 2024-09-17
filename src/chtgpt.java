public class chtgpt {
    public static void main(String[] args) {

                // Number of rows and columns for the pattern
                int n = 7; // This value can be adjusted for different sizes

                // Print the pattern
                printPattern(n);
            }

            private static void printPattern(int n) {
                // Loop for each row
                for (int i = 0; i < n; i++) {
                    // Loop for each column
                    for (int j = 0; j < n; j++) {
                        // Print '*' or ' ' based on the row and column
                        if ((i == 0 || i == n - 1) || (j == 0 || j == n - 1) || (i == j) || (i + j == n - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // Move to the next line
                }

    }
}
