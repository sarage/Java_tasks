import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
 
 public class Main {
  public static void main(String[] args) {
      try{
           BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      StringTokenizer St=new StringTokenizer (br.readLine());
        int a = Integer.parseInt(St.nextToken());
        int b = Integer.parseInt(St.nextToken());
        int i = 0;
        while(!(a > b)){
            a = a * 3;
            b = b * 2;
            i++;
        }  
    System.out.println(i);
      }catch(IOException exc) {
          exc.printStackTrace();
          }
  }
}