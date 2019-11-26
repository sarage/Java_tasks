import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aizhan on 01.06.2017.
 */
public class Coins implements ActionListener{
    private JTextField coins;
    private JTextArea result;
    private Label cost1;
    private Label cost2;
    private Label cost3;
    private Label cost4;
    private Label cost5;
    private Label cost6;
    private Label cost7;
    private Label cost8;
    private Label cost9;
    private Label cost0;
    private Label cost01;
    private Label cost02;
    private int coffeeCost;
    private int sugar_cost;
    private int cream_cost;

    Coins(int coffee_cost,int sugar_cost,int cream_cost){
        this.coffeeCost=coffee_cost;
        this.sugar_cost=sugar_cost;
        this.cream_cost=cream_cost;
    }

    private int getCoffeeCost(){
        return coffeeCost;
    }

    Coins(JTextField coins,JTextArea result,Label cost1,Label cost2,Label cost3,Label cost4,Label cost5,Label cost6,Label cost7,
          Label cost8,Label cost9,Label cost0,Label cost01,Label cost02){
        this.coins = coins;
        this.result = result;
        this.cost1=cost1;
        this.cost2=cost2;
        this.cost3=cost3;
        this.cost4=cost4;
        this.cost5=cost5;
        this.cost6=cost6;
        this.cost7=cost7;
        this.cost8=cost8;
        this.cost9=cost9;
        this.cost0=cost0;
        this.cost01=cost01;
        this.cost02=cost02;
    }

    public void actionPerformed(ActionEvent ae){
        String mny = coins.getText();
        String take_coffee_cost="";


        if(getCoffeeCost()==1)
            take_coffee_cost = cost1.getText();
        else if(getCoffeeCost()==2)
            take_coffee_cost = cost2.getText();
        else if(getCoffeeCost()==3)
            take_coffee_cost = cost3.getText();
//        else if(coffeeCost==4)
//            take_coffee_cost = cost4.getText();
//        else if(coffeeCost==5)
//            take_coffee_cost = cost5.getText();
//        else if(coffeeCost==6)
//            take_coffee_cost = cost6.getText();
//        else if(coffeeCost==7)
//            take_coffee_cost = cost7.getText();
//        else if(coffeeCost==8)
//            take_coffee_cost = cost8.getText();
//        else if(coffeeCost==9)
//            take_coffee_cost = cost9.getText();
//        else if(coffeeCost==0)
//            take_coffee_cost = cost0.getText();

        int money = Integer.parseInt(mny);
        int sum = Integer.parseInt(take_coffee_cost)+sugar_cost+cream_cost;

        int remainder = money - sum;
        //result.append(Integer.toString(remainder));
        result.append(take_coffee_cost);
    }
}
