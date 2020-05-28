package laba414;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class vse 
{
    private int i = 0;
    private ArrayList<chek> c = new ArrayList<chek>();
    private ArrayList<kvitanciya> k = new ArrayList<kvitanciya>();
    private ArrayList<nakladnaya> n = new ArrayList<nakladnaya>();
    private ArrayList<dokyment> d = new ArrayList<dokyment>();
    private Scanner scan = new Scanner(System.in);

    public void start() {
        while (i != 13) {
            try {
                System.out.println("=========================");
                System.out.println("Выберите действие");
                System.out.println("1.Добавить квитанцию");
                System.out.println("2.Показать все квитанции");
                System.out.println("3.Удалить все квитанции");
                System.out.println("4.Добавить накладную");
                System.out.println("5.Показать все накладные");
                System.out.println("6.Удалить все накладные");
                System.out.println("7.Добавить документ");
                System.out.println("8.Показать все документы");
                System.out.println("9.Удалить все документы");
                System.out.println("10.Добавить чек");
                System.out.println("11.Показать все чеки");
                System.out.println("12.Удалить все чеки");
                System.out.println("13.Выход");
                System.out.println("=========================");
                i = scan.nextInt();
                switch (i) {
                    case 1:
                        k.add(new kvitanciya());
                        break;
                    case 2:
                        System.out.println("Всего квитанций " + kvitanciya.i);
                        System.out.println("Квитанции:");
                        for (kvitanciya kvi : k)
                        {
                            kvi.Show();
                        }
                        break;
                    case 3:
                        kvitanciya.i = 0;
                        k.clear();
                        System.out.println("Готово!");
                        break;
                        /////////////////////////////////////////
                    case 4:
                        n.add(new nakladnaya());
                        break;
                    case 5:
                        System.out.println("Всего накладных " + nakladnaya.i);
                        System.out.println("Накладные:");
                        for (nakladnaya nak : n)
                        {
                            nak.Show();
                        }
                        break;
                    case 6:
                        nakladnaya.i = 0;
                        n.clear();
                        System.out.println("Готово!");
                        break;
                        ///////////////////////////////////////////
                    case 7:
                        d.add(new dokyment());
                        break;
                    case 8:
                        System.out.println("Всего документов " + dokyment.i);
                        System.out.println("Документы:");
                        for (dokyment dkm : d)
                        {
                            dkm.Show();
                        } 
                        break;
                    case 9:
                        dokyment.i = 0;
                        d.clear();
                        System.out.println("Готово!");
                        break;
                        ///////////////////////////////////////////
                    case 10:
                        c.add(new chek());
                        break;
                    case 11:
                        System.out.println("Всего чеков " + chek.i);
                        System.out.println("Чеки:");
                        for (chek chk : c)
                        {
                            chk.Show();
                        }
                        break;
                    case 12:
                        chek.i = 0;
                        c.clear();
                        System.out.println("Готово!");
                        break;
                        //////////////////////////////////////////
                    case 13:
                        System.out.println("Программа завершена");
                        break;
                    default:
                        System.out.println("Данного пункта не существует.");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Данного пунка не существует.");
                scan.next();
            }
        }
    }
}
