import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[][] arr = new int[5][5];
        int i1 = 0, j1 = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
      }
      for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(arr[i][j]==1){
                    i1 = i;
                    j1 = j;        
                }
            }            
      }
      int sum = Math.abs(2 - i1) + Math.abs(2 - j1);
      System.out.println(sum);
  }
}