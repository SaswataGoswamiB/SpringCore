package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//InitializingBean interface is used for inti() method. 
//Disposable Bean is used for Destrying bean.
public class Pepsi implements InitializingBean,DisposableBean{
	
	
	private double Price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [Price=" + Price + "]";
	}

	
	//init methid. 
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Init method");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("destroy call!!!");
	}
	
	

}
