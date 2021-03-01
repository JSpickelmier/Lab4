/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;

/**
 *
 * @author Jacks
 */
public class InsuranceLab {
    public static void main(String[] args) {
         System.out.println("What is your age?");
         
Scanner CustAge = new Scanner(System.in);
int Age = CustAge.nextInt();
TotCost(Age);
int price = TotCost(Age);




System.out.println("$" + price + " is the total cost of insurance for your age");


  }
    public static int TotCost(int agenumb){
    int Cost = 5 * agenumb + 300;
    return Cost;
    }
    
 }  

