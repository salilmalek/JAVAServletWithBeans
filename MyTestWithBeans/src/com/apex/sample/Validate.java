package com.apex.sample;

public class Validate {

	public String isFirstNameValid(String name){
		String error;
		error=isSpecified(name,"FirstName","HRMS_R0009");
		error+=isLessChar(name, "FirstName", "HRMS_R0011" , 2);
		return error;
	}
	
	public String isLastNameValid(String name){
		String error;
		error=isSpecified(name,"LastName","HRMS_R0013");
		error+=isLessChar(name, "LastName", "HRMS_R0015" , 2);
		return error;
	}

	public String isSpecified(String name,String fieldName,String errorCode){
		if (isEmpty(name)) {
			return errorCode+ " Please specify " +fieldName + ". <br/>";
		}
		return "";
	}

	public String isLessChar(String name,String fieldName,String errorCode, int n){
		if (name.length() < n) {
			return errorCode +" "+ fieldName +" is less than "+ n +" Characters. <br/>";
		}
		return "";
	}
	
	public boolean isEmpty(String name) {
		return name == null || name.trim().length() == 0;
	}
	
}
