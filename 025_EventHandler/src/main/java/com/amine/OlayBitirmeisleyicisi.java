package com.amine;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class OlayBitirmeisleyicisi implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		
		System.out.println("ContextStoppedEvent <OlayBitirmeİşleyicisi>");
	}

}
