package com.list.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	 public static void main(String[] args)
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext.xml");

	        System.out.println("---------------------------------------");

	        FruitShop fruit = (FruitShop) context.getBean("fruitShop");
	        System.out.println(
	                "Got fruitShop object from the ApplicationContext(Spring Container)");
	        fruit.displayFruitShopInfo();
	        FruitShop fruits = (FruitShop) context.getBean("fruitset");
	        
	        fruits.displayFruitShopInfoSet();
	        
	        FruitShop fru = (FruitShop) context.getBean("fruit");
	        
	        fru.displayFruitShopInfoProp();
	    
	    }

	
}
