import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

 public class Main {
  public static void main(String[] args) {
      try{
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
      }
      for(int i = 0; i < n; i++){
            switch(arr[i]){
            case("Tetrahedron"):
                sum+=4;
            break;
            case("Cube"):
                sum+=6;
            break;
            case("Octahedron"):
                sum+=8;
            break;
            case("Dodecahedron"):
                sum+=12;
            break;
            case("Icosahedron"):
                sum+=20;
            break;
                }                
      }
      System.out.println(sum);
  }catch(IOException exc) {
          exc.printStackTrace();
          }
  }
}