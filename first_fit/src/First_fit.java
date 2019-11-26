import java.util.Random;

/**
 * Created by aizhan on 13.04.2017.
 */
public class First_fit {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] memory = new int[10];

        int[] process = new int[5];
        int flag=0;

        for (int i = 0; i < 10; i++) {
            memory[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 5; i++) {
            process[i] = rand.nextInt(100);
        }

        System.out.print("process = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(process[i]+"  ");
        }
        System.out.println();
        System.out.print("memory = ");
        for (int i = 0; i < 10; i++) {
            System.out.print(memory[i]+"  ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (process[i] <= memory[j]) {
                    System.out.println("process = " + process[i] + " " + "memory = " + memory[j] + " " + "place = " + j);
                    int minus = memory[j] - process[i];
                    memory[j] = minus;
                    System.out.println("place " + j + " = " + memory[j]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("There is not enough memory");
        }
    }
}
