package Hot_Drink_Publisher;

import java.util.HashMap;

public class hotDrinkPublisherImpl implements hotDrinkPublisher {

	
	HashMap<String, Double> Tea = new HashMap<String, Double>();
	HashMap<String, Double> Coffee = new HashMap<String, Double>();

	
public hotDrinkPublisherImpl() {
		
	Tea.put("Black Tea", 850.0);
	Tea.put("English Tea", 1100.0);
	Tea.put("Green Tea", 1250.0);
	
	Coffee.put("Black coffee", 850.0);
	Coffee.put("Decaf", 850.0);
	Coffee.put("Cappuccino", 850.0);
	Coffee.put("Macchiato", 850.0);
			
		
	}
	
	
	@Override
	public void getHotDrink(int a) {
		// TODO Auto-generated method stub
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String Tea_name1 : Tea.keySet()) {
				String Tea_ID1 = Tea_name1.toString();
				String Tea_price1 = Tea.get(Tea_name1).toString();
				System.out.println(count + ". " + Tea_ID1 + " :- Rs" +Tea_price1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String Coffee_name2 : Coffee.keySet()) {
				String Coffee_ID2 = Coffee_name2.toString();
				String Coffee_price2 = Coffee.get(Coffee_name2).toString();
				System.out.println(count + ". " + Coffee_ID2 + " :- Rs" +Coffee_price2);
				count++;
			};
			break;
			
		}
		
		count = 0;
	}

	@Override
	public double getHotDrinkPrice(int type, int hotDrink) {
		// TODO Auto-generated method stub
		
		double Itemprice = 0; 
		if(type == 1) {
			switch (hotDrink) {
			case 1:
				Itemprice = Tea.get("Black Tea");
				break;
			case 2:
				Itemprice = Tea.get("English Tea");
				break;
			case 3:
				Itemprice = Tea.get("Green Tea");
				break;
			}
		}else if(type == 2) {
			switch (hotDrink) {
			case 1:
				Itemprice = Coffee.get("Black coffee");
				break;
				
			case 2:
				Itemprice = Coffee.get("Decaf");
				break;
				
			case 3:
				Itemprice = Coffee.get("Cappuccino");
				break;
								
			case 4:
				Itemprice = Coffee.get("Macchiato");
				break;
			}
			
		}		
		
		return Itemprice;
	}

	@Override
	public String getHotDrinkName(int type, int hotDrink) {
		// TODO Auto-generated method stub
		
		String Itemname = ""; 
		if(type == 1) {
			switch (hotDrink) {
			case 1:
				Itemname = "Black Tea";
				break;
			case 2:
				Itemname = "English Tea";
				break;
			case 3:
				Itemname = "Green Tea";
				break;
			}
		}else if(type == 2) {
			switch (hotDrink) {
			case 1:
				Itemname = "Black coffee";
				break;
			case 2:
				Itemname = "Decaf";
				break;
			case 3:
				Itemname = "Cappuccino";
				break;
			case 4:
				Itemname = "Macchiato";
				break;
			}
		
		}
		
			return Itemname;
		
		
	}


	@Override
	public void getlocation() {
		// TODO Auto-generated method stub
		
	}

}
