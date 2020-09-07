package com.bridgelabz.qualifier.withxml;

import org.springframework.beans.factory.annotation.Required;


public class Student {
	
	  private Integer age;
	  private String name;
	  private String branch;
	     
	@Required
	public void setAge(Integer age) {
	     this.age = age;
	}
	public Integer getAge() {
	     return age;
	}
	@Required
	public void setName(String name) {
	     this.name = name;
	}
	public String getName() {
	      return name;
	  }
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	


}
