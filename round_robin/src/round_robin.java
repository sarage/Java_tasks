/**
 * Created by aizhan on 06.04.2017.
 */
import java.util.Random;

public class round_robin {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();

        int total_process = rnd.nextInt(10)+1;
        System.out.println("Total process number = "+total_process);
        int quantum_time = rnd.nextInt(5)+1;
        System.out.println("Quantum time = "+quantum_time);

        int[] process = new int[total_process];

        int flag=0;

        for (int i = 0; i < total_process; i++) {
            process[i]=rnd.nextInt(15)+1;
            System.out.println("Time for process, process: "+ (i+1)+" = "+process[i]);
        }

        while(flag!=total_process) {
            for (int i = 0; i < total_process; i++) {
                if (process[i] > 0) {
                    process[i] -= quantum_time;
                    System.out.println("process " + (i+1) + " " + quantum_time + " sec  "+process[i]);
                }
                else if (process[i] <= 0)
                    flag++;
            }
        }
    }
}




