package laba414;

import java.util.Date;
import java.util.Scanner;

public class kvitanciya extends papka {
public static int i=0;
private int k = 0;
    private String[] kvitanciya=new String[35];
    Scanner scan=new Scanner(System.in);
    public kvitanciya() 
            {
                this.Create();
            }
    
    @Override
    public void Create(){
        Date date = new Date();
        if (i<10){
        System.out.println("Введите номер квитанции:");
                kvitanciya[k]=scan.nextLine()+" Дата создания: "+date;
        i++;
        k++;
    }
        else{
            System.out.println("Создано максимальное количество квитанций");
        }
    }
    
    @Override
    public void Show(){
        if (k>0)
        {
        for (int j=0;j<k;j++) 
        {
            System.out.println(kvitanciya[j]);
        }
        }
    }
  }

