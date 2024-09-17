public class que33 {
    public static void main(String[] args) {
        int n = 10;
        int spaces = n - 1;
        int row = 1;
        int p=n;
      while(row<=n) {
          int i = 1;
          while (i <= spaces) {
              System.out.print(" ");
              i++;
          }
          int j = 1;
          int p1 = p;
          int p2 = n - 1;
          int num = 2 * row - 1;
          while (j <= num) {
              if (row == 1 || j == num / 2 + 1) {
                  System.out.print("0");
              } else {
                  if (j < num / 2 + 1) {
                      System.out.print(p1);
                      p1++;
                  } else {
                      System.out.print(p2);
                      p2--;
                  }
              }j++;
          }
          System.out.println();
          p--;
          row++;
          spaces--;

      }

    }}