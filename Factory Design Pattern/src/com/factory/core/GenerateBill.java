package com.factory.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.factory.design.GetPlanFactory;
import com.factory.model.Plan;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class GenerateBill {
	
	public static void main(String[] args) throws IOException {
	
		GetPlanFactory bill = new GetPlanFactory();
		
		System.out.println("Enter type of Plan : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planType = br.readLine();
		
		System.out.println("Enter no. of Units : ");
		
		int numUnits = Integer.parseInt(br.readLine());
		
		Plan p = bill.getPlan(planType);
		
		System.out.println("Price of each plan is :  " + p.getPrice());
		System.out.println("Total bill is :  " + p.calcBill(numUnits));
	}
}
