import java.io.*;
import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
      int f = 0;
        for(int i = 1; i < n; i++){
            int m = n - i;
            if(m%i==0){
                f++;
                }
      }
              System.out.println(f);
              
  }
}