package amine;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class OlayBaslatmaisleyicisi implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
	
		System.out.println("ContextStartedEvent OlayBaşlatmaİşleyicisi");
	}

	
		
	}
	


