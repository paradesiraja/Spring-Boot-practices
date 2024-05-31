package com.nt.arithmetic;

 interface Arithmetic {
	 
	 public int add(int a,int b);


 public class LambdaTest{
	 public static void main(String[] args) {
		Arithmetic ar=(int a,int b)->{
			int c=0;
			c=a+b;
			
			return c;
		};
		System.out.println("result1::"+ar.add(10,20));
		System.out.println("---------------------");
		
		Arithmetic ar1=(int a,int b)->{
			
			
			return a+b;
		};
		System.out.println("result2::"+ar1.add(10,20));
		System.out.println("---------------------");
		
		
		Arithmetic ar2=(int a,int b)->{return a+b;
		};
		System.out.println("result3::"+ar2.add(10,20));
		System.out.println("---------------------");
		
		Arithmetic ar3=(a, b)->{return a+b;
		};
		System.out.println("result4::"+ar3.add(10,20));
		System.out.println("---------------------");
		Arithmetic ar4=(a,b)-> a+b;
		
		System.out.println("result5::"+ar4.add(10,20));
		System.out.println("---------------------");
		
		
	}
 }
 }
