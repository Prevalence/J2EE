package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 用户名</th><th>交易时间</th><th>货物</th><th>单价</th><th>数量</th><th>总价</th><th>订单ID
	/**
	 * 订单ID
	 */
	@Id
	private int ID;
	/**
	 * 订单用户名
	 */
	private String userName;
	/**
	 * 订单交易时间
	 */
	private String time;
	/**
	 * 订单货物名
	 */
	private String item;
	/**
	 * 货物单价
	 */
	private double unitPrice;
	/**
	 * 订单所订的货物数量
	 */
	private int number;
	/**
	 * 订单总价
	 */
	private double totalPrice;

	public Order(int ID, String userName, String time, String item, double unitPrice, int number, double totalPrice) {
		super();
		this.ID = ID;
		this.userName = userName;
		this.time = time;
		this.item = item;
		this.unitPrice = unitPrice;
		this.number = number;
		this.totalPrice = totalPrice;
	}

	public Order() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
