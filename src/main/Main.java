package main;

public class Main {
    public static void main(String[] args) {
    int mainCount=0;
//        mainField.first_turn();
        int a=1;
        mainField firsField=new mainField();
        while (mainCount<6){
            firsField.field();
            firsField.first_turn();
            new AIturn().check();
            new AIturn().turn();
            System.out.println(a+++"ход");
            mainCount++;
        }

    }


}
