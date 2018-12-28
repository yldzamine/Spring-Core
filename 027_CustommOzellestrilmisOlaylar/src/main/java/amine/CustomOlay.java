package amine;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent  {


	private static final long serialVersionUID = 1L;
	public CustomOlay(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomOlay [Özelleştirilmiş Olay]";
	}
 
	

}
