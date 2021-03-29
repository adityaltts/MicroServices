package com.ltts.Car.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	@Id
	@Column
	private int carid;
	@Column
	private String carname;
	@Column
	private String renumber;
	@Column
	private String Ownnername;
	@Column
	private int price;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getRenumber() {
		return renumber;
	}
	public void setRenumber(String renumber) {
		this.renumber = renumber;
	}
	public String getOwnnername() {
		return Ownnername;
	}
	public void setOwnnername(String ownnername) {
		Ownnername = ownnername;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
