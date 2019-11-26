import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

 public class Main {
  public static void main(String[] args) {
      try{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
      String a = br.readLine();
      int fs = 0, sf = 0;
      for(int i=0;i<a.length()-1;i++){
          String str = a.substring(i,i+2);
          if(str.equals("FS")){
              fs++;}
            else if(str.equals("SF")){
                sf++;}
      }
      if(sf>fs){
              System.out.println("YES");}
            else {
                System.out.println("NO");}
      
      
  }catch(IOException exc) {
          exc.printStackTrace();
          }
    
    }
}