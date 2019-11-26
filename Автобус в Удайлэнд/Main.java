import java.util.Scanner;

 public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      String[] str = new String[n];
      int m = 0, p = 0;
        for(int i=0; i<n;i++){
            str[i] = sc.next();
        }
    
        for(int i=0; i<n;i++){
            String s1 = str[i].substring(0,2);
            String s2 = str[i].substring(3,5);
            if(s1.equals("OO")){
                System.out.println("YES");
                m = i;
                p = 1;
                break;
            }else if(s2.equals("OO")){
                System.out.println("YES");
                m = i;
                p = 2;
                break;
            }
        }
        
        if(p==0){
            System.out.println("NO");
        }else{
            for(int i=0; i<n;i++){
                if(i!=m){
                    System.out.println(str[i]);
                }else{
                    if(p==1){
                        String s2 = str[i].substring(3,5);
                        System.out.print("++|" + s2);
                    }else if(p==2){
                        String s1 = str[i].substring(0,2);
                        System.out.print(s1+"|++");
                    }
                    System.out.println();                
                }
            }
        }
    }
}