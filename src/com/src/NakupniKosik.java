package com.src;

public class NakupniKosik {
    public static void main(String[] args){
        String zbozi[] = {"Rajče", "Jablko", "Cibule", "Brambora", "Mléko", "Chleba", "Lovečák"};
        int ceny[] = {10, 8, 5, 7, 12, 25, 30};
        int finalcena = 0;

        if(args.length == 0){
            System.out.println("Seznam prduktů: ");
            for (int i = 0; i < veci.length; i++){
                System.out.println(i + " - " + veci[i] + " - " + ceny[i] + "Kč,-");
            }
        }

        else{
            for (int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) <= veci.length-1){
                    System.out.println(args[i] + " - " + veci[Integer.parseInt(args[i])] + " - " + ceny[Integer.parseInt(args[i])] + "Kc.");
                    finalcena += ceny[Integer.parseInt(args[i])];
                }

                else{
                    System.out.println("Produkt nenalezen " + args[i]);
                }
            }

            System.out.println("Finální cena " + finalcena + "Kč,-");
        
        }
    }
}
