package softdrink_publisher;

import java.util.HashMap;

public class softDrinkPublisherImpl implements softDrinkPublisher {

	
	
	HashMap<String, Double> Coca_Cola = new HashMap<String, Double>();
	HashMap<String, Double> Sprite = new HashMap<String, Double>();
	HashMap<String, Double> Pepsi = new HashMap<String, Double>();
	HashMap<String, Double> Mirinda = new HashMap<String, Double>();
	
public softDrinkPublisherImpl() {
		
	Coca_Cola.put("Buddy", 80.0);
	Coca_Cola.put("Regular", 220.0);
	Coca_Cola.put("Cup", 100.0);
	
	Sprite.put("Buddy", 80.0);
	Sprite.put("Regular", 220.0);
	Sprite.put("Cup", 100.0);
	
	Pepsi.put("Buddy", 80.0);
	Pepsi.put("Regular", 220.0);
	Pepsi.put("Cup", 100.0);
	
	Mirinda.put("Buddy", 80.0);
	Mirinda.put("Regular", 220.0);
	Mirinda.put("Cup", 100.0);
			
		
	}
	
	
	
	
	
	
	@Override
	public void displaySoftDrink(int a) {
		// TODO Auto-generated method stub		
		int count ;
		switch (a) {
		case 1:
			count = 1 ;
			for(String SoftDrink_Name1 : Coca_Cola.keySet()) {
				String Drink_ID1 = SoftDrink_Name1.toString();
				String Drink_price1 = Coca_Cola.get(SoftDrink_Name1).toString();
				System.out.println(count + ". " + Drink_ID1 + " :- Rs" +Drink_price1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String SoftDrink_Name2 : Sprite.keySet()) {
				String Drink_ID2 = SoftDrink_Name2.toString();
				String Drink_price2 = Sprite.get(SoftDrink_Name2).toString();
				System.out.println(count + ". " + Drink_ID2 + " :- Rs" +Drink_price2);
				count++;
			};
			break;
		case 3:
			count = 1 ;
			for(String SoftDrink_Name3 : Pepsi.keySet()) {
				String Drink_ID3 = SoftDrink_Name3.toString();
				String Drink_price3 = Pepsi.get(SoftDrink_Name3).toString();
				System.out.println(count + ". " + Drink_ID3 + " :- Rs" +Drink_price3);
				count++;
			};
			break;
		case 4:
			count = 1 ;
			for(String SoftDrink_Name4 : Mirinda.keySet()) {
				String Drink_ID4 = SoftDrink_Name4.toString();
				String Drink_price4 = Mirinda.get(SoftDrink_Name4).toString();
				System.out.println(count + ". " + Drink_ID4 + " :- Rs" +Drink_price4);
				count++;
			};
			break;
		
		}
		
		count = 0;
			
	}

	@Override
	public double getPrice(int type, int softDrink) {
		// TODO Auto-generated method stub
		double Itemprice = 0; 
		if(type == 1) {
			switch (softDrink) {
			case 1:
				Itemprice = Coca_Cola.get("Buddy");
				break;
			case 2:
				Itemprice = Coca_Cola.get("Regular");
				break;		
			case 3:
				Itemprice = Coca_Cola.get("Cup");
				break;
			}
		}else if(type == 2) {
			switch (softDrink) {
			case 1:
				Itemprice = Sprite.get("Buddy");
				break;
			case 2:
				Itemprice = Sprite.get("Regular");
				break;		
			case 3:
				Itemprice = Sprite.get("Cup");
				break;
							
			}
			
		}else if(type == 3) {
				
			switch (softDrink) {
			case 1:
				Itemprice = Pepsi.get("Buddy");
				break;
			case 2:
				Itemprice = Pepsi.get("Regular");
				break;		
			case 3:
				Itemprice = Pepsi.get("Cup");
				break;				
			}
			
		}else if(type == 4) {
			
			switch (softDrink) {
			case 1:
				Itemprice = Mirinda.get("Buddy");
				break;
			case 2:
				Itemprice = Mirinda.get("Regular");
				break;		
			case 3:
				Itemprice = Mirinda.get("Cup");
				break;
		}
		}
					
		
		return Itemprice;
	}

	@Override
	public String getName(int type, int softDrink) {
		// TODO Auto-generated method stub
		
		String Itemname = ""; 
		if(type == 1) {
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;
			}
		}else if(type == 2) {
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;
			}
		
		}else if(type == 3) {
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;
			}
		
		}else if(type == 3) {
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;
			}
			
		}{
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;
			
			}
			
		}{
			switch (softDrink) {
			case 1:
				Itemname = "Buddy";
				break;
			case 2:
				Itemname = "Regular";
				break;	
				
			case 3:
				Itemname = "Cup";
				break;		
			}
			
		}
		
			return Itemname;
	}

}
