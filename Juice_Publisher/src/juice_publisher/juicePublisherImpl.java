package juice_publisher;

import java.util.HashMap;

public class juicePublisherImpl implements juicePublisher  {

	
	
	
	HashMap<String, Double> lime_juice = new HashMap<String, Double>();
	HashMap<String, Double> lemon_juice = new HashMap<String, Double>();
	HashMap<String, Double> Apple_juice = new HashMap<String, Double>();
	HashMap<String, Double> Watermelon_juice = new HashMap<String, Double>();
	HashMap<String, Double>  Avacado_juice = new HashMap<String, Double>();
	HashMap<String, Double>  Grapes_juice = new HashMap<String, Double>();
	

	
public juicePublisherImpl() {
		
	lime_juice.put("juice", 250.0);
	lime_juice.put("Lime with sprite", 300.0);
	
	lemon_juice.put("juice", 250.0);
	lemon_juice.put("Lemonade ", 450.0);
	
	
	Apple_juice.put("juice", 250.0);
	
	Watermelon_juice.put("juice", 250.0);
	Watermelon_juice.put("juice with strawberry ice cream", 350.0);
	
	
	Avacado_juice.put("juice", 250.0);
	Avacado_juice.put("Shake", 300.0);
	Avacado_juice.put("Avacado with Ice Cream", 350.0);
	
	Grapes_juice.put("Black Grapes", 250.0);
	Grapes_juice.put("White Grapes", 250.0);
	
		
	}
	
	
	
	
	@Override
	public void getJuice(int value) {
		// TODO Auto-generated method stub
		
		int count ;
		switch (value) {
		case 1:
			count = 1 ;
			for(String juice_name1 : lime_juice.keySet()) {
				String juice_ID1 = juice_name1.toString();
				String juice_price1 = lime_juice.get(juice_name1).toString();
				System.out.println(count + ". " + juice_ID1 + " :- Rs" +juice_price1);
				count++;
			};
			break;
		case 2:
			count = 1 ;
			for(String juice_name2 : lemon_juice.keySet()) {
				String juice_ID2 = juice_name2.toString();
				String juice_price2 = lemon_juice.get(juice_name2).toString();
				System.out.println(count + ". " + juice_ID2 + " :- Rs" +juice_price2);
				count++;
			};
			break;
			
			
		case 3:
			count = 1 ;
			for(String juice_name3 : Apple_juice.keySet()) {
				String juice_ID3 = juice_name3.toString();
				String juice_price3 = Apple_juice.get(juice_name3).toString();
				System.out.println(count + ". " + juice_ID3 + " :- Rs" +juice_price3);
				count++;
			};
			break;
			
			
		case 4:
			count = 1 ;
			for(String juice_name4 : Watermelon_juice.keySet()) {
				String juice_ID4 = juice_name4.toString();
				String juice_price4 = Watermelon_juice.get(juice_name4).toString();
				System.out.println(count + ". " + juice_ID4 + " :- Rs" +juice_price4);
				count++;
			};
			break;
			
			
		case 5:
			count = 1 ;
			for(String juice_name5 : Avacado_juice.keySet()) {
				String juice_ID5 = juice_name5.toString();
				String juice_price5 = Avacado_juice.get(juice_name5).toString();
				System.out.println(count + ". " + juice_ID5 + " :- Rs" +juice_price5);
				count++;
			};
			break;
			
		case 6:
			count = 1 ;
			for(String juice_name6 : Grapes_juice.keySet()) {
				String juice_ID6 = juice_name6.toString();
				String juice_price6 = Grapes_juice.get(juice_name6).toString();
				System.out.println(count + ". " + juice_ID6 + " :- Rs" +juice_price6);
				count++;
			};
			break;
			
		}
		
		count = 0;
		
	}

	@Override
	public double getPrice(int type, int juice) {
		// TODO Auto-generated method stub
		double Itemprice = 0; 
		if(type == 1) {
			switch (juice) {
			case 1:
				Itemprice = lime_juice.get("juice");
				break;
			case 2:
				Itemprice = lime_juice.get("Lime with sprite");
				break;			
			}
		}else if(type == 2) {
			switch (juice) {
			case 1:
				Itemprice = lemon_juice.get("juice");
				break;
				
			case 2:
				Itemprice = lemon_juice.get("Lemonade");
				break;
							
			}
			
		}else if(type == 3) {
				
				switch (juice) {
				case 1:
					Itemprice = Apple_juice.get("juice");
					break;
												
			}
			
		}else if(type == 4) {
			
			switch (juice) {
			case 1:
				Itemprice = Grapes_juice.get("juice");
				break;
								
			case 2:
				Itemprice = Grapes_juice.get("juice with strawberry ice cream");
				break;
		}
		}else if(type == 5) {
			
			switch (juice) {
			case 1:
				Itemprice = Avacado_juice.get("juice");
				break;
								
			case 2:
				Itemprice = Avacado_juice.get("Shake");
				break;
			case 3:
				Itemprice = Avacado_juice.get("Avacado with Ice Cream");
				break;	
				
		}
		
	}else if(type == 6) {
		
		switch (juice) {
		case 1:
			Itemprice = Grapes_juice.get("Black Grapes");
			break;
							
		case 2:
			Itemprice = Avacado_juice.get("White Grapes");
			break;
			
	}
	
}					
		
		return Itemprice;
	}

	
	
	@Override
	public String getName(int type, int juice) {
		// TODO Auto-generated method stub
		
		String Itemname = ""; 
		if(type == 1) {
			switch (juice) {
			case 1:
				Itemname = "juice";
				break;
			case 2:
				Itemname = "Lime with sprite";
				break;	
			}
		}else if(type == 2) {
			switch (juice) {
			case 1:
				Itemname = "juice";
				break;
			case 2:
				Itemname = "Lemonade";
				break;
			
			
			}
		
		}else if(type == 3) {
			switch (juice) {
			case 1:
				Itemname = "juice";
				break;
		
			
			}
		
		}else if(type == 3) {
			switch (juice) {
			case 1:
				Itemname = "juice";
				break;
			case 2:
				Itemname = "juice with strawberry ice cream";
				break;
			
			}
			
		}{
			switch (juice) {
			case 1:
				Itemname = "juice";
				break;
			case 2:
				Itemname = "Shake";
				break;
			case 3:
				Itemname = "Avacado with Ice Cream";
				break;
			
			}
			
		}{
			switch (juice) {
			case 1:
				Itemname = "Black Grapes";
				break;
			case 2:
				Itemname = "White Grapes";
				break;			
			}
			
		}
		
			return Itemname;
		
	}

}
