import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
 
 public class Main {
  public static void main(String[] args) {
      try{
           BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      StringTokenizer St=new StringTokenizer (br.readLine());
        String n = St.nextToken();
        int k = Integer.parseInt(St.nextToken());
          
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
      }catch(IOException exc) {
          exc.printStackTrace();
          }
  }
}