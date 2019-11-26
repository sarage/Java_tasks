import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];  
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int k = 0;
        
        for(int i = 0; i < n; i++){
            if(array[i] == 1){
                k = 1;
                }
            }
        if(k==1){
            System.out.println("HARD");
            }else{
            System.out.println("EASY");    
                }
  }
}