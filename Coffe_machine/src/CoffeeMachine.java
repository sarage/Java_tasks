import javax.swing.*;
import java.awt.*;

/**
 * Created by aizhan on 01.06.2017.
 */
public class CoffeeMachine extends JFrame {
    CoffeeMachine(String title){
        super(title);

        setLayout(null);
        JTextField coins = new JTextField("Please, enter coins here",25);
        coins.setBounds(10,10,200,30);
        add(coins);

        JTextArea result=new JTextArea();
        result.setBounds(200,120,200,100);
        result.setEditable(false);
        add(result);

        CheckboxGroup grp = new CheckboxGroup();
        Checkbox choice1 = new Checkbox("Cafe con Leche", grp, false);
        choice1.setBounds(10, 50, 150, 20);

        Label cost1 = new Label("50",Label.CENTER);
        cost1.setBounds(140,50,20,20);
        add(cost1);

        Checkbox choice2 = new Checkbox("Demi-creme", grp, false);
        choice2.setBounds(10, 80, 150, 20);

        Label cost2 = new Label("30",Label.CENTER);
        cost2.setBounds(140,80,20,20);
        add(cost2);

        Checkbox choice3 = new Checkbox("Granita de Caffe", grp, false);
        choice3.setBounds(10, 110, 150, 20);

        Label cost3 = new Label("45",Label.CENTER);
        cost3.setBounds(140,110,20,20);
        add(cost3);

        Checkbox choice4 = new Checkbox("Irish", grp, false);
        choice4.setBounds(10, 140, 150, 20);

        Label cost4 = new Label("70",Label.CENTER);
        cost4.setBounds(140,140,20,20);
        add(cost4);

        Checkbox choice5 = new Checkbox("Americano", grp, false);
        choice5.setBounds(10, 170, 150, 20);

        Label cost5 = new Label("35",Label.CENTER);
        cost5.setBounds(140,170,20,20);
        add(cost5);

        Checkbox choice6 = new Checkbox("Iced-coffee", grp, false);
        choice6.setBounds(10, 200, 150, 20);

        Label cost6 = new Label("15",Label.CENTER);
        cost6.setBounds(140,200,20,20);
        add(cost6);

        Checkbox choice7 = new Checkbox("Doppio", grp, false);
        choice7.setBounds(10, 230, 150, 20);

        Label cost7 = new Label("20",Label.CENTER);
        cost7.setBounds(140,230,20,20);
        add(cost7);

        Checkbox choice8 = new Checkbox("Cappuccino", grp, false);
        choice8.setBounds(10, 260, 150, 20);

        Label cost8 = new Label("35",Label.CENTER);
        cost8.setBounds(140,260,20,20);
        add(cost8);

        Checkbox choice9 = new Checkbox("Romano", grp, false);
        choice9.setBounds(10, 290, 150, 20);

        Label cost9 = new Label("50",Label.CENTER);
        cost9.setBounds(140,290,20,20);
        add(cost9);

        Checkbox choice0 = new Checkbox("Ristretto", grp, false);
        choice0.setBounds(10, 320, 150, 20);

        Label cost0 = new Label("80",Label.CENTER);
        cost0.setBounds(140,320,20,20);
        add(cost0);

        Checkbox choice01 = new Checkbox("Sugar",false);
        choice01.setBounds(200, 50, 150, 20);

        Label cost01 = new Label("3",Label.CENTER);
        cost01.setBounds(270,50,20,20);
        add(cost01);

        Checkbox choice02 = new Checkbox("Cream",false);
        choice02.setBounds(200, 80, 150, 20);

        Label cost02 = new Label("10",Label.CENTER);
        cost02.setBounds(270,80,20,20);
        add(cost02);

        add(choice1);
        add(choice2);
        add(choice3);
        add(choice4);
        add(choice5);
        add(choice6);
        add(choice7);
        add(choice8);
        add(choice9);
        add(choice0);
        add(choice01);
        add(choice02);

        JButton btn = new JButton("Go!");
        btn.setBounds(10,350,80,50);
        add(btn);

        btn.addActionListener(new Coffee(choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,
                choice9,choice0,choice01,choice02,result));

        btn.addActionListener(new Coins(coins,result,cost1,cost2,cost3,cost4,cost5,cost6,cost7,cost8,cost9,cost0,cost01,cost02));

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame f = new CoffeeMachine("CoffeeMachine");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
