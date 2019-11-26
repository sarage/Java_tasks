import java.io.*;
import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = new String[5];
      String firstChar = n.substring(0, 1);
      String secChar = n.substring(1, 2);
      int f = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = scanner.next();
      }
      for(int i = 0; i < 5; i++){
        String firstCheck = arr[i].substring(0, 1);
          String secCheck = arr[i].substring(1, 2);
          if(firstChar.equals(firstCheck) || secChar.equals(secCheck)){
              System.out.println("YES");
              f=1;
              break;
              } 
      }
      if(f!=1){
              System.out.println("NO");
              }
  }
}