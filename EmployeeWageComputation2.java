package Assign;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation2 {
	
	  public static void calculate(String cname,int m_w_d,int m_w_h)
	  {
		 final int part_time_hour=4;
		  final int full_time_hour=8;
		  int working_day_pm=0;
		  int working_h_pm=0;
		  
		  System.out.println("enter your choice");
			System.out.println(" 1.full time employee wage\n 2.part time employee wage");
			Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			 switch(ch)
			  {
			       case 1:
			       { 
			    	   int monthly_wage=0;
			    	   System.out.println("full time employee wage");
			    	   while(working_day_pm<=m_w_d && working_h_pm<=m_w_h)
			    	   {
			    	   
				           int daily_emp_wage=full_time_hour*20;
				           
				           monthly_wage=daily_emp_wage+monthly_wage;
				           working_day_pm++;
				           working_h_pm++;
				      
			    	   }
			    	   System.out.println("company name"+cname);
			    	   System.out.println("daily employee wage="+(full_time_hour*20));
			    	   System.out.println("monthly employee wage="+monthly_wage);
				      break;
				      
			       }
			       case 2:
			       { 
			    	   int monthly_wage=0;
			    	   System.out.println("part time employee wage");
			    	   while(working_day_pm<=20 && working_h_pm<=m_w_h)
			    	   {
			    	   
				           int daily_emp_wage=part_time_hour*20;
				           monthly_wage=daily_emp_wage+monthly_wage;
				           working_day_pm++;
				           working_h_pm++;
				      
			    	   }
			    	   System.out.println("company name "+cname);
			    	   System.out.println("daily employee wage="+part_time_hour*20);
			    	   System.out.println("monthly employee wage="+monthly_wage);
				      break;
			       }
			  }
			
	  }
	
	public static void main(String[] args) {
		
		System.out.println("***Welcome to Employee Wage Computation***");
		
		//Uc1
		Random rand=new Random();
		int a=rand.nextInt(2);
		if(a==0)
		{
			System.out.println("employee is absent");
			
		}
		else
		{
			System.out.println("employee is present");
		}
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter company name");
		String cname=s.next();
		System.out.println("enter the monthly no of working hour");
		int w_h=s.nextInt();
		System.out.println("enter monthly number of working days");
		int w_d=s.nextInt();
		
		calculate(cname,w_h,w_d);
		
	}

}
