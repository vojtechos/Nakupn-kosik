package com.src;

public class NakupniKosik {
    public static void main(String[] args){
        String[] zbozi = {"Rajče", "Jablko", "Cibule", "Brambora", "Mléko", "Chleba", "Lovečák"};
        int[] ceny = {10, 8, 5, 7, 12, 25, 30};
        int finalniCena = 0;

        if(args.length == 0){
            System.out.println("Seznam prduktů: ");
            for (int i = 0; i < zobzi.length; i++){
                System.out.println(i + " - " + zbozi[i] + " - " + ceny[i] + "Kč,-");
            }
        }

        else{
            for (int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) <= zbozi.length-1){
                    System.out.println(args[i] + " - " + zbozi[Integer.parseInt(args[i])] + " - " + ceny[Integer.parseInt(args[i])] + "Kc.");
                    finalniCena += ceny[Integer.parseInt(args[i])];
                    return;
                }
                System.out.println("Produkt nenalezen " + args[i]);
            }

            System.out.println("Finální cena " + finalniCena + "Kč,-");
        
        }
    }
}
