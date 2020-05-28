package laba414;

import java.util.Scanner;

public class dokyment extends papka {

public static int i=0;
private int d = 0;
    private String[] dokyment=new String[35];
     Scanner scan=new Scanner(System.in);
     public dokyment()
     {
         this.Create();
     }
    
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите название документа");
                dokyment[d]=scan.nextLine();
        i++;
        d++;
    }
        else{
            System.out.println("Создано максимальное количество документов");
        }
    }
    
    @Override
    public void Show(){
        if (d>0)
        {
        for (int j=0;j<d;j++) 
        {
            System.out.println(dokyment[j]);
        }
        }
    } 

}
