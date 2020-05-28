package laba414;

import java.util.Scanner;

public class nakladnaya extends papka {

public static int i=0;
private int n = 0;
    private String[] nakladnaya=new String[35];
    Scanner scan=new Scanner(System.in);
    public nakladnaya()
    {
        this.Create();
    }
    
    @Override
    public void Create(){
        if (i<10){
        System.out.println("Введите номер накладной");
                nakladnaya[n]=scan.nextLine();
        i++;
        n++;
    }
        else{
            System.out.println("Создано максимальное количество накладных");
        }
    }
    
    @Override
    public void Show(){
        if (n>0)
        {
        for (int j=0;j<n;j++) 
        {
            System.out.println(nakladnaya[j]);
        }
        }
    }
   }
