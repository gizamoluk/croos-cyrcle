package main;

import java.util.Scanner;


public  class mainField  {
    char cell1=' ';
    static char cell2=' ';
    static char cell3=' ';
    static char cell4=' ';
    char cell5=' ';
    static char cell6=' ';
    static char cell7=' ';
    static char cell8=' ';
    static char cell9=' ';
    char cross='x';
    char cycle='o';
    AIturn ai =new AIturn();

//    public char cross(char cross);
//
//
        public void field(){
        System.out.println("_________");
        System.out.println("_"+cell1+"__"+cell2+"__"+cell3+"_");
        System.out.println("_"+cell4+"__"+cell5+"__"+cell6+"_");

        }
//        return cross;}



    public  void first_turn() {
        System.out.println("Нажмите цифру от 1 до 9 куда хотите поставить 'крест'");
//        field(char cross );
        Scanner console=new Scanner(System.in);

        int turn=console.nextInt();
        if (turn==1) cell1 = cross;{
         ai.check();
            if (ai.cell1==true)
                cell5 = cycle;
        }

        if (turn==2) cell2 = cross;
        if (turn==3) cell3 = cross;
        if (turn==4) cell4 = cross;
        if (turn==5) cell5 = cross;
        if (turn==6) cell6 = cross;

        }

}

//
////    private static void field() {
//    }
//}
