package mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Manager {
	
	public static void main(String[] args) {
		List<Iphone> phoneItem = new ArrayList<>();
		//phoneItem 1-3
		Iphone phone01 = new Iphone();
		Iphone phone02 = new Iphone();
		Iphone phone03 = new Iphone();
		
		phoneItem.add(phone01);
		phoneItem.add(phone02);
		phoneItem.add(phone03);
		
		//////// phone01 /////////
		System.out.println("//// Slide phone01 ////");
		phone01.slideToUnlock();
		
		String playSong = phone01.playSong("double take");
		String playVideo = phone01.playVideo("My little pony");
		System.out.println(playSong);
		System.out.println(playVideo);
		
		phone01.makeCall("0998880077");
		phone01.receiveCall("0112223344");
		
		phone01.installApplication("Facebook");
		
		System.out.println("Number phone: ");
		phoneItem.forEach(phone -> System.out.println(phone));
		
		Map<String, Iphone> PhoneMapping = new HashMap<>();
		PhoneMapping.put("121-231-2121", phone01);
		PhoneMapping.put("122-232-2122", phone02);
		PhoneMapping.put("123-233-2123", phone03);
		System.out.println("Phone Number: ");
		PhoneMapping.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}