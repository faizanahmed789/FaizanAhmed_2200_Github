/********************************************************
 * @author Faizan Ahmed
 * @date 12/07/2022 [W]
 */

import java.lang.Math;

import java.util.Scanner;

public class Exercise07_01 {



	public static void main(String[] args){

		int highest=0;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter number of students");

	int i = input.nextInt();

	

	int[] marks = new int[i] ;

	String[] grade = new String[i];

	System.out.println("Please enter the marks");

	

	for(int a =0; a<i;a++){

		marks[a] = input.nextInt();

		highest = Math.max(highest,marks[a]);

		}

	for(int a =0; a<i;a++){

		if(marks[a]>=highest-10){

			grade[a] = "A";

		}

		else if(marks[a]>=highest-20){

			grade[a] = "B";

		}

		else if(marks[a]>=highest-30){

			grade[a] = "C";

		}

		else if(marks[a]>=highest-40){

			grade[a] = "D";

		}

		else{

			grade[a] = "F";

		}

		}

	

	for(int a =0; a<i;a++){

		System.out.println("Student "+a+" score is "+marks[a]+" and Grade is "+grade[a]);

	}

	

	}

	}