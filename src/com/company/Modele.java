package com.company;

public class Modele  {

	String value="0";
	public Modele(){}
	public String getValue(){
		return value;
	}
	public void setValue(String value){
		this.value=value;
	}
	public double getDouble(){
		return Double.valueOf(value).doubleValue();
	}

}
