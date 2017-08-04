package calc;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result;
		Arith arith = null;
		
		while( true ) {
			
			//계산할 데이터 입력받음
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			//종료 방법
			if( "quit".equals( expression ) ) {
				break;
			}
			
			arith = null;
			
			//받은 데이터를 쪼갠다
			String[] tokens = expression.split( " ");
			
			String operator = tokens[1];
			int a = Integer.parseInt( tokens[0] );
			int b = Integer.parseInt( tokens[2] );
			
			//연산 법칙에 따라 스위치문을 돌린다
			switch( operator ) {
				case "+" : {
					arith = new Add();
					break;
				} case "-" : {
					arith = new Sub();
					break;
				} case "*" : {
					arith = new Mul();
					break;
				} case "/" : {
					arith = new Div();
					break;
				} 
				
			}
			
			if ( arith == null) {
				System.out.println("알수없는 연산");
				continue;
			}
			
			System.out.println(">> "+ arith.calculate(a, b) );
			
		}
		
		scanner.close();

	}
	
	

}
