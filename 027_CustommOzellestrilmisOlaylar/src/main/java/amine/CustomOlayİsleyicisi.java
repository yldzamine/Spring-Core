package amine;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomOlayİsleyicisi implements ApplicationListener<CustomOlay>{

	@Override
	public void onApplicationEvent(CustomOlay event) {
		// TODO Auto-generated method stub
		System.out.println("*_*_*_*_*_*" +event.toString() +"*_*_*_*_*_*");
	}

	

	
}
