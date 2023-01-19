
package ilkharaolandizi;

import java.util.Scanner;

public class Ilkharaolandizi {

    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        String ad[]=new String [5];
        for(int i =0;i<5;i++) ad[i]=k.next(); //okuma kısmı
        for(int i=0;i<5;i++){
            if (ad[i].charAt(0)=='a'|| ad[i].charAt(0)=='A')
                System.out.println(ad[i]+" "+(i+1));
        }
        

    }
    
}
 