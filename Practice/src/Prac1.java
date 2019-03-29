import java.util.Scanner;

public class Prac1 {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Type first num ");
		a=input.nextInt();
		
		System.out.println("input second number");
		b=input.nextInt();
		
		if(a==b) {
			System.out.printf("%d equal to %d\n ",a,b);
		}else if(a>b) {
			System.out.printf("%d greater than %b\n",a,b);
		}else if(a<b) {
			System.out.printf("%d less than %d\n",a,b);
		}else if(a!=b) {
			System.out.printf("%d not equal to %d\n",a,b);
		}else if (a>=b){
			System.out.printf("%d greater or equal to %d\n",a,b);
		}else  if(a<=b) {
			System.out.printf("%d less or equal to %d\n",a,b);
			
		}
		  int sum=1;
	        for(int i=2;i<=5;i++){
	            sum=sum+i;
	        
	            System.out.println(sum);
	        }
	    }
	
	}

/*
 * 32. Write a Java program to compare two numbers. Go to the editor Input Data:
 * Input first integer: 25 Input second integer: 39 Expected Output 25 != 39 25
 * < 39 25 <= 39
 */
