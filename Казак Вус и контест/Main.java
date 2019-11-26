import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = n.split(" ");
        int m = Integer.parseInt(arr[0]);
        int p = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);
        if(p>=m && y>=m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}