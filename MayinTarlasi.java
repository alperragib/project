/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasi;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alper
 */
public class MayinTarlasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bos=0;
         Random rand = new Random();
        Scanner input = new Scanner (System.in);
        int Dizi [][] = {
            {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
            {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
            {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
            {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
            {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)}
        };
        
        for(int k=0;k<Dizi.length;k++)
        {
        for(int l=0;l<Dizi.length;l++)
        {
          if(Dizi[k][l]==0)
          {
             bos++;
          }
        }
        }
        System.out.println(bos);
        
        int puan =0;
        System.out.println("--- Mayın Tarlası (5x5) ---");
        System.out.println("Oyuna Başlamak İçin Konum Giriniz");
        System.out.println("Satır Giriniz (1-5)");
        int satir = input.nextInt()-1;
        System.out.println("Sütun Giriniz (1-5)");
        int sutun = input.nextInt()-1;
        int i;
        for (i=0;i<bos;i++){
            
             if (sutun<0 || sutun>4 || satir<0 || satir>4 )
        {
           System.out.println("Lütfen 1 ile 5 arası değerler giriniz.");
            System.out.println("Satır Giriniz (1-5)");
           satir = input.nextInt()-1;
           System.out.println("Sütun Giriniz (1-5)");
           sutun = input.nextInt()-1;
           continue;
        }
                     else if(Dizi[satir][sutun] == 1)
        {
            System.out.println("Mayına Bastın!");
            System.out.println("Puan : "+puan);
            System.out.println("---  Developer by Alper Ragıb  --");
            break;
        }
        else if(Dizi[satir][sutun] == 2)
        {
            System.out.println("Aynı konuma tekrar basamassın! başka koordinatlar denemelisin.");
            System.out.println("Satır Giriniz (1-5)");
           satir = input.nextInt()-1;
           System.out.println("Sütun Giriniz (1-5)");
           sutun = input.nextInt()-1;
           i--;
           continue;
        }
        else
        {
            Dizi[satir][sutun] = 2;
            puan = puan +5;
           System.out.println("Doğru tespit. Puan : "+puan);
           System.out.println("Satır Giriniz (1-5)");
           satir = input.nextInt()-1;
           System.out.println("Sütun Giriniz (1-5)");
           sutun = input.nextInt()-1;
           continue;
        }
        }
        if (Dizi[satir][sutun] != 1)
        {
            System.out.println("Başarıyla Tamamladın!");
            System.out.println("Puan : "+puan);
            System.out.println("---  Developer by Alper Ragıb  --");
        }
    }
    
}
