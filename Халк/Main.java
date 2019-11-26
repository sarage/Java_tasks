import java.util.Scanner; 
 
 public class Main {
  public static void main(String[] args) {
    
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          String[] str = {"I hate","I love"};
          String str1 = "";
        for(int i = 1; i <= n; i++){
          if(i % 2 != 0){
                str1+=str[0];
            }else{
                str1+=str[1];
                }
        if(i != n){
            str1+=" that ";
            }
        else{
            str1+=" it";
        }    
      }
      System.out.println(str1);
  }
}