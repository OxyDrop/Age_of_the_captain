/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import exceptions.*;
import java.util.Scanner;
/**
 *
 * @author Serero
 */
public class AgeduCapitaine {
	public static void main(String[] args){
		int ageADeviner = (int)(Math.random()*(67-18)+18);
		int x, nbEssais = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("(Essai "+nbEssais+") entrez un age : ");
			x = sc.nextInt();
			try{
				if(TestAgeCapitaine.testAge(ageADeviner,x))
					break;
			}catch(MauvaisAgeException e){
				System.out.println(e.getMessage());
				continue;
			}
			nbEssais++;
		}while(nbEssais<10);
		if(nbEssais==10)
			System.out.println("Perdu ! Le capitaine a "+ageADeviner+" ans");
		else
			System.out.println("Gagné ! Le capitaine a "+ageADeviner+" ans");
	}
}
