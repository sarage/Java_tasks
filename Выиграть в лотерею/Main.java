import java.io.*;
import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
      while(n>0){
        if(n/100>0){
            f+=n/100;
            n%=100;
            }
            else if(n/20>0){
                f+=n/20;
            n%=20;
            }
            else if(n/10>0){
                f+=n/10;
            n%=10;
            }
            else if(n/5>0){
                f+=n/5;
            n%=5;
            }
            else if(n/1>0){
                f+=n/1;
            n%=1;
            }}
              System.out.println(f);
              
  }
}