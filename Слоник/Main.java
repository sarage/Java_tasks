import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
      while(n>0){
          if(n-5>=0){
             a++;
             n-=5;
            }
              else if(n-4>=0){
                a++;
                n-=4;
              }
              else if(n-3>=0){
                a++;
                n-=3;
              }
              else if(n-2>=0){
                a++;
                n-=2;
              }
              else if(n-1>=0){
                a++;
                n-=1;
              }
              }
        System.out.println(a);
    }
}