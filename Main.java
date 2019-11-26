 import java.util.Scanner;
 
 public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String n = input.nextLine();
      int k = input.nextInt();
      
      for(int i = 0; i < k; i++){
          String lastChar = n.substring(n.length() - 1);
          int lastNum = Integer.parseInt(lastChar);
          if(lastNum != 0){
              n = Integer.toString(Integer.parseInt(n)-1);
              }
              else{
                  n = Integer.toString(Integer.parseInt(n)/10);
                }
    }
    System.out.println(n);
  }
}