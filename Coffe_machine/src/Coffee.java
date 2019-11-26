import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aizhan on 01.06.2017.
 */
public class Coffee implements ActionListener{
    private Checkbox choice1;
    private Checkbox choice2;
    private Checkbox choice3;
    private Checkbox choice4;
    private Checkbox choice5;
    private Checkbox choice6;
    private Checkbox choice7;
    private Checkbox choice8;
    private Checkbox choice9;
    private Checkbox choice0;
    private Checkbox choice01;
    private Checkbox choice02;
    private JTextArea result;

    Coffee(Checkbox choice1,Checkbox choice2,Checkbox choice3,Checkbox choice4,Checkbox choice5, Checkbox choice6,
           Checkbox choice7,Checkbox choice8,Checkbox choice9,Checkbox choice0,Checkbox choice01,Checkbox choice02,JTextArea result){
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.choice5 = choice5;
        this.choice6 = choice6;
        this.choice7 = choice7;
        this.choice8 = choice8;
        this.choice9 = choice9;
        this.choice0 = choice0;
        this.choice01 = choice01;
        this.choice02 = choice02;
        this.result = result;
    }
    private int coffee_cost=-1;
    private int sugar_cost=0;
    private int cream_cost=0;

    public void actionPerformed(ActionEvent ae){
        if (this.choice1.getState()){
            result.append("Cafe con Leche\n");
            coffee_cost=1;
        }
        else if (this.choice2.getState()){
            result.append("Demi-creme\n");
            coffee_cost=2;
        }
        else if (this.choice3.getState()){
            result.append("Granita de Caffe\n");
            coffee_cost=3;
        }
        else if (this.choice4.getState()){
            result.append("Irish\n");
            coffee_cost=4;
        }
        else if (this.choice5.getState()){
            result.append("Americano\n");
            coffee_cost=5;
        }
        else if (this.choice6.getState()){
            result.append("Iced-coffee\n");
            coffee_cost=6;
        }
        else if (this.choice7.getState()){
            result.append("Doppio\n");
            coffee_cost=7;
        }
        else if (this.choice8.getState()){
            result.append("Cappuccino\n");
            coffee_cost=8;
        }
        else if (this.choice9.getState()){
            result.append("Romano\n");
            coffee_cost=9;
        }
        else if (this.choice0.getState()){
            result.append("Ristretto\n");
            coffee_cost=0;
        }

        if(this.choice01.getState()){
            result.append("Sugar\n");
            sugar_cost=3;
        }
        if(this.choice02.getState()){
            result.append("Cream\n");
            cream_cost=10;
        }

        Coins sum = new Coins(coffee_cost,sugar_cost,cream_cost);
    }
}
