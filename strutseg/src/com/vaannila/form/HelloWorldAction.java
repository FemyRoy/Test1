package com.vaannila.form;

public class HelloWorldAction {
	private String name;

	   public String execute() throws Exception {
		   
		   if(name.equals("Femy")){
			   return "success";
		   }else{
			   return "error";
		   }
	     
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
