package com.Assignment1;

public class CafeteriaBill {
    public static void main(String[] args) {
        int Pizza_price = 200, puff_price = 40, Pepsi_price = 120;
        int NoOfPizzas = 5, NoOfPuffs = 6, NoOfPepsi = 2;

        int Totalcostofpizzas = CalTotalCost(Pizza_price,NoOfPizzas);
        int Totalcostofpuffs = CalTotalCost(puff_price, NoOfPuffs);
        int Totalcostofpepsi = CalTotalCost(Pepsi_price, NoOfPepsi);

        int GrandTotal = Totalcostofpizzas + Totalcostofpuffs + Totalcostofpepsi;;
        Displaybill(Totalcostofpizzas,Totalcostofpuffs,Totalcostofpepsi,GrandTotal);
    }
    public static int CalTotalCost(int price, int quantity){
        return price*quantity;
    }
    public static void Displaybill(int pizza, int puff, int pepsi, int total){
        System.out.println("BILL DETAILS");
        System.out.println("TotalCostofPizza: " + pizza);
        System.out.println("TotalCostofPuff: " + puff);
        System.out.println("TotalCostofPepsi: " + pepsi);
        System.out.println("Grand Total   : " + total);
    }
}
