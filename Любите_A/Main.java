import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int a = 0, th = 0;
      for(int i=0;i<n.length();i++){
          String str = n.substring(i,i+1);
          if(str.equals("a")){
              a ++;}
          else{
              th ++;
              }
        }
        if(a>(n.length()/2)){
              System.out.print(n.length());}
          else{
              System.out.print(a * 2 - 1);
              }
                    
        
    }
}