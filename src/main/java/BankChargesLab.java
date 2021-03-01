
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacks
 */
public class BankChargesLab {
    public static void main(String[] args) {
         System.out.println("How many checks would you like for this month?");
    double basefee = 10;
    Scanner key = new Scanner(System.in);
    int checknumb1 = key.nextInt();
double CheckFee1= CheckFee(checknumb1);
double TotFee1 = TotFee(CheckFee1, basefee, checknumb1);
TotPrint(checknumb1, TotFee1);
    }
    
    public static double CheckFee(int checknumb){
     double checkfee = 0;
     if (checknumb < 20) {checkfee = 0.10; }
    else;
    if (checknumb >= 20 && checknumb <=39) {checkfee = 0.08;}
    else;
    if  (checknumb >= 40 && checknumb <=59) {checkfee = 0.06;}
    else;
    if  (checknumb >= 60) {checkfee = 0.04;}
    return checkfee;
    }
    
    public static double TotFee(double checkfee, double basefee, int checknumb){
        double totfee = basefee + (checkfee * checknumb);
        return totfee;
    }
    
    public static void TotPrint(int checknumb, double totfee){
    System.out.println("your total fee for the purchase of " + checknumb + " checks is " + totfee +" dollars");
    }
    
            
    
}
