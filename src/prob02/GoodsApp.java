package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		//카운트 수만큼 입력받는다.
		for ( int i = 0; i<COUNT_GOODS; i++ ) {
			//데이터를 입력받는다.
			String line = scanner.nextLine();
			
			//데이터를 " " 기준으로 쪼갠다.
			String[] tokens = line.split(" ");
			String name = tokens[0];
			int price = Integer.parseInt( tokens[1]);
			int stock = Integer.parseInt( tokens[2]);
			
			//Goods g를 생성하여 name, price, stock데이터를 set해준다.
			Goods g = new Goods();
			g.setName(name);
			g.setPrice(price);
			g.setStock(stock);
			
			// goods에 순서대로 입력된 g(Goods)를 넣어준다.
			goods[i] = g;
		}
		
		//카운트 수만큼 출력한다.
		System.out.println("");
		for ( int i = 0; i<COUNT_GOODS; i++ ) {
			goods[i].show();
		}
		
		
	}
}
