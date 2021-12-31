package com.assignment2.main;

import java.util.Scanner;
import com.assignment2.model.Company;
import com.assignment2.service.MergeSort;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort ms = new MergeSort();
		
		System.out.println("enter the no of companies");
		int companyCount = sc.nextInt();
		
		Company[] c = new Company[companyCount];
		double[] shares = new double[companyCount];
		int valueUpCount = 0;
		double searchValue;
		int choice;
		
		for(int i=0; i<companyCount; i++) {
			c[i] = new Company();
			System.out.println("Enter current stock price of the company " + (i+1));
			shares[i] = sc.nextDouble();
			c[i].setShareValue(shares[i]);
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			if(sc.nextBoolean()) {
				valueUpCount++;
				c[i].setValueUp(true);
			} else {
				c[i].setValueUp(false);
			}
		}
		
		ms.sort(shares, 0, shares.length-1); // Keep a sorted array of stock prices
		while(companyCount>0) {
			System.out.println("---------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("---------------------------");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				//ms.sort(shares, 0, shares.length-1);
				System.out.println("Stock prices in ascending order are :");
				for(int i=shares.length-1; i>=0; i--) {
					System.out.print(shares[i]);
					System.out.print(" ");
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 2:
				//ms.sort(shares, 0, shares.length-1);
				System.out.println("Stock prices in descending order are :");
				for(int i=0; i<shares.length; i++) {
					System.out.print(shares[i]);
					System.out.print(" ");
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today : " + valueUpCount);
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today :" + (companyCount - valueUpCount));
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 5:
				System.out.println("enter the key value");
				searchValue = sc.nextDouble();
				boolean test = false;
		        for (double element : shares) {
		            if (element == searchValue) {
		                test = true;
		                break;
		            }
		        }
				if(test) {
					System.out.println("Stock of value " + searchValue + " is present");
				} else {
					System.out.println("Value not found");
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				break;
			case 0:
				System.out.println("Exited successfully");
				System.exit(0);
			default:
				System.out.println("Invalid Input !!!");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		sc.close();
	}

}
