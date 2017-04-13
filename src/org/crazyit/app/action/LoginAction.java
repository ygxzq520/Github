package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{

	private double number1;
	private double number2;
	/*private double result;*/
	private String Tip;
	
	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public String getTip() {
		return Tip;
	}

	public void setTip(String tip) {
		Tip = tip;
	}
public String Add() throws Exception{
	
	ActionContext.getContext().getSession().put("number1",getNumber1());
	ActionContext.getContext().getSession().put("number2",getNumber2());
		 double result= getNumber1() +getNumber2();
		 setTip(getNumber1()+"+"+getNumber2()+"="+result);
		 return SUCCESS;
		}
	
 public String execute() throws Exception{
	 		ActionContext.getContext().getSession().put("number1",getNumber1());
	 		ActionContext.getContext().getSession().put("number2",getNumber2());
			double result= getNumber1()-getNumber2();
			 setTip(getNumber1()+"-"+getNumber2()+"="+result);
	 return SUCCESS;
	}
	
}

