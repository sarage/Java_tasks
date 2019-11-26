import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        String str = "";

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt(); 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j < n;j++){
                if(arr[j] == i+1){
                    str+=Integer.toString(j+1);
                    if(i!=n){
                        str+=" ";
                    }
                }
            }
        }
        System.out.print(str);
    }
}