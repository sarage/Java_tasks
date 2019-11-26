import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] arr = new int[n][2];
        int m = 0, c = 0;
        for (int i=0; i<n;i++){
            for(int j=0; j<2;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<n;i++){
                if(arr[i][0]>arr[i][1]){
                    m++;
                }else if(arr[i][0]<arr[i][1]){
                    c++;
                }
        }
        if(m>c){
            System.out.println("Mishka");
        }else if(c>m){
            System.out.println("Chris");
        }else if(c==m){
            System.out.println("Friendship is magic!^^");
        }
    }
}