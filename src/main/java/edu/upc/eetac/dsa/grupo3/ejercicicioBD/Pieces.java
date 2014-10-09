package edu.upc.eetac.dsa.grupo3.ejercicicioBD;

public class Pieces {
	private int code;
	private String name; 

Pieces(String name, int code){
	    this.name = name;
	    this.code = code;
	   }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


