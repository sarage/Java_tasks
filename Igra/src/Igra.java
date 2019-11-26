import java.util.Scanner;
public class Igra {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] ni = new int[n][m];
        int[][] bi = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ni[i][j] = sc.nextInt();
                bi[i][j]=0;
            }
        }

        int t=0,p=0;
        while(t!=k){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==0 && j==0){
                        if(ni[i][j+1]==2  && ni[i+1][j]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j+1]==2 || ni[i+1][j]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j+1]==3 || ni[i+1][j]==3 && ni[i][j]!=3)
                            bi[i][j]=p++;
                        else if(ni[i][j]!=1)
                            bi[i][j]=p++;
                    }
                    else if (i==0 && j!=0){
                        if(ni[i][j-1]==2 && ni[i+1][j]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j-1]==2 || ni[i+1][j]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j-1]==3 || ni[i+1][j]==3 || ni[i][j]!=3)
                            bi[i][j]=p++;
                        else if(ni[i][j+1]==2 && ni[i][j-1]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j]!=1)
                            bi[i][j]=p++;
                    }
                    else if(i!=0 && j==0){
                        if((ni[i-1][j]==2) && (ni[i][j+1]==2) && (ni[i][j]!=2))
                            bi[i][j]=p++;
                        else if((ni[i-1][j]==2) || (ni[i][j+1]==2) || (ni[i][j]!=2))
                            bi[i][j]=p++;
                        else if((ni[i-1][j]==3) || (ni[i][j+1]==3) || (ni[i][j]!=3))
                            bi[i][j]=p++;
                        else if(ni[i-1][j]==2 && ni[i+1][j]==2 && ni[i][j]!=2)
                            bi[i][j]=p++;
                        else if(ni[i][j]!=1)
                            bi[i][j]=p++;
                    }
                    else if(ni[i-1][j]==2 && ni[i][j-1]==2 && ni[i][j]!=2)
                        bi[i][j]=p++;
                    else if(ni[i-1][j]==2 || ni[i][j-1]==2 || ni[i][j]!=2)
                        bi[i][j]=p++;
                    else if(ni[i-1][j]==3 || ni[i][j-1]==3 || ni[i][j]!=3)
                        bi[i][j]=p++;
                    else if(ni[i][j]!=1)
                        bi[i][j]=p++;
                }
            }
            t++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(bi[i][j]);
            }
        }

    }
}