package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result;
		
		while( true ) {
			
			//계산할 데이터 입력받음
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			//종료 방법
			if( "quit".equals( expression ) ) {
				break;
			}
			
			//받은 데이터를 쪼갠다
			String[] tokens = expression.split( " ");
			int a = Integer.parseInt( tokens[0] );
			String operator = tokens[1];
			int b = Integer.parseInt( tokens[2] );
			
			//연산 법칙에 따라 스위치문을 돌린다
			switch( operator ) {
			case "+" : {
				/*
				Add add = new Add();
				add.setValue(a,b);
				int result = add.calculate();
				*/
				/*
				Calc add = new Add();
				add.setValue(a, b);
				add.calculate();
				*/ 
				result = calc( new Add(), a, b );
				System.out.println(">> "+result);
				break;
			} case "-" : {
				result = calc( new Sub(), a, b );
				System.out.println(">> "+result);
				break;
			} case "*" : {
				result = calc( new Mul(), a, b );
				System.out.println(">> "+result);
				break;
			} case "/" : {
				result = calc( new Div(), a, b );
				System.out.println(">> "+result);
				break;
			}
			
			}
		}
		
		scanner.close();

	}
	
	//Calc로 부터 상속받은 add,sub,mul,div 를 한번에 계산하는 함수 
	public static int calc(Calc c, int a, int b) {
		c.setValue(a, b);
		return c.calculate();
	}

}
