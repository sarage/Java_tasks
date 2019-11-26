import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int i = 1, m = n;
      while(m != 0){
          int s = 0;
          m = n - i; 
          for(int j=1;j<=m;j++){
              if(m%j==0){
                  s++;
                }
            }
            if(s<=2){
                System.out.println(m);
            }
            i++;
        }
    }
}