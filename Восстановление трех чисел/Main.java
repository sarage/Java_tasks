import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] m = n.split(" ");
      int[] m1 = new int[3];
        int max = Integer.parseInt(m[0]);
      int a = 1, b = 0, c =1;
      int f = 0, j = 0;
      int y = 0;
      for(int i=0;i<m.length;i++){
          int s = Integer.parseInt(m[i]);
          if(s>max){
              max = s;
              f = i;}
          }
          for(int i=0;i<m.length;i++){
          int s = Integer.parseInt(m[i]);
          if(s!=max){
            m1[y] = s;
            y++;      
              }
          }
        a = max - m1[2];
          b = m1[0] - max + m1[2];
          c = m1[1] - max + m1[2];
          
        System.out.print(a + " " + b + " " + c);
    }
}