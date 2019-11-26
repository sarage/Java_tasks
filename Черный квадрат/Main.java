import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int m = 0, j = 0;
        int[] arr = new int[4];
        for (int i=0; i<4;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String str = scanner.nextLine();
        while(str.length()!=j){
            String s = str.substring(j,j+1);
            j++;
            int e = (Integer.parseInt(s)-1);
            m+=arr[e];
        }
        
        System.out.println(m);
    }
}