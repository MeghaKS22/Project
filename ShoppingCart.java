package MobileCart;

import java.util.ArrayList;

public class ShoppingCart
{
    public static void main(String[] args){
        Mobile m1=new Mobile("Samsung",6500,"Samsung",MobileType._6G,RingType._Silent,DailType._AutoDail);
        Mobile m2=new Mobile("Oneplus",9500,"Oneplus",MobileType._5G,RingType._RingTone,DailType._Manual);
        Mobile m3=new Mobile("Redmi",7500,"Redmi",MobileType._6G,RingType._Silent,DailType._AutoDail);
        Mobile m4=new Mobile("LG",8500,"LG",MobileType._5G,RingType._RingTone,DailType._Manual);

        ArrayList<Mobile> a1=new ArrayList<>();
        a1.add(m1);
        a1.add(m2);
        a1.add(m3);
        a1.add(m4);
        for (Mobile m:a1){
            System.out.println(m);
        }
        m1.Exchangable();
        m3.Repairable();
        m4.Sellable();
        m2.Talking();
    }
}
