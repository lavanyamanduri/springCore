package com.list.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class FruitShop {

	 private String shopName;
	    private List<String> listOfAvailableFruits;
	    private  Set<String> setofAvaliableFruits;
	    private Properties pros;
	   
	    
	  

		public FruitShop(String shopName, Properties pros) {
			
			this.shopName = shopName;
			this.pros = pros;
		}

		public FruitShop(String shopName, List<String> listOfAvailableFruits)
	    {
	        System.out.println(
	                "FruitShop(String shopName, List<String> listOfAvailableFruits) "
	                        + "constructor is called by the Spring container");
	        this.shopName = shopName;
	        this.listOfAvailableFruits = listOfAvailableFruits;
	    }

	    public FruitShop(String shopName, Set<String> setofAvaliableFruits)
	    {
	        System.out.println(
	                "FruitShop(String shopName, Set<String> setofAvaliableFruits) "
	                        + "constructor is called by the Spring container");
	        this.shopName = shopName;
	        this.setofAvaliableFruits = setofAvaliableFruits;
	    }
	    
	    public void displayFruitShopInfo()
	    {
	        System.out.println("FruitShop [shopName=" + shopName
	                + ", listOfAvailableFruits=" + listOfAvailableFruits + "]");
	    }
	    
	    public void displayFruitShopInfoSet()
	    {
	        System.out.println("FruitShop [shopName=" + shopName
	                + ", setofAvaliableFruits=" + setofAvaliableFruits + "]");
	    }

	    
	    public void displayFruitShopInfoProp()
	    {
	        System.out.println("FruitShop [shopName=" + shopName
	                + ", pros=" + pros + "]");
	    }
	    
	 
}
