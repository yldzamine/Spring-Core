package amine;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	public ApplicationEventPublisher getApplicationEventPublisher() {
		return applicationEventPublisher;
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void yayinla() {
		CustomOlay customolay = new CustomOlay(this);
		applicationEventPublisher.publishEvent(customolay);
	}

}
