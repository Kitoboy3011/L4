package laba414;

import java.util.Scanner;

public class chek extends papka {
public static int i=0;
private int c = 0;
    private String[] chek=new String[15];
     Scanner scan=new Scanner(System.in);
     public chek()
     {
         this.Create();
     }
    
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите номер чека");
                chek[c]=scan.nextLine();
        i++;
        c++;
    }
        else{
            System.out.println("Создано максимальное количество чеков");
        }
    }
    
    @Override
    public void Show(){
        if (c>0)
        {
        for (int j=0;j<c;j++) 
        {
            System.out.println(chek[j]);
        }
        }
    }
}
