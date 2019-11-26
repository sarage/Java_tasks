import java.util.Random;

/**
 * Created by aizhan on 13.04.2017.
 */
public class not_recently {
    public static void main(String[] args){
        Random rnd = new Random();

        int pages = rnd.nextInt(20)+1;
        System.out.println("Pages = "+pages);

        Classes obj1 = new Classes();


        int count0 =0;
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int answer;

        for(int i=0;i<pages;i++){
            int x=rnd.nextInt(2);
            int y=rnd.nextInt(2);
            System.out.println(x+" "+y);
            answer=obj1.pages1(x,y);
            if (answer==0)
                count0++;
            else if (answer==1)
                count1++;
            else if (answer==2)
                count2++;
            else if(answer==3)
                count3++;
        }

        System.out.println();


            if (count0!=0)
                System.out.println("Delete from 0 class");
            else if (count1!=0)
                System.out.println("Delete from 1 class");
            else if (count2!=0)
                System.out.println("Delete from 2 class");
            else if(count3!=0)
                System.out.println("Delete from 3 class");
        }
    }

class Classes{
    int R;
    int M;
    int t;

    int pages1(int a, int b){
        this.R= a;
        this.M= b;
        if(R==0 && M==0)
            t=0;
        else if(R==0 && M==1)
            t= 1;
        else if(R==1 && M==0)
           t= 2;
        else if(R==1 && M==1)
            t= 3;
        return t;
    }
}
