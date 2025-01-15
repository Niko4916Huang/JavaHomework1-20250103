package com;

public class Order {
	private String itemName;
	private Integer cup;		// 0: 大杯;  1: 中杯
	private static Integer mid_price = 25;		// 中杯價格
	private static Integer big_price = 35;		// 大杯價格
	private Integer qty;
	private Integer sugar;		// 0: 正常糖; 1: 半糖;  2: 去糖;
	private Integer ice;		// 0: 正常冰; 1: 少冰;  2: 去冰;
	private Integer sum;
	
	public Order(String itemName, Integer cup, Integer qty, Integer sugar, Integer ice) {
		super();
		this.itemName = itemName;
		this.cup = cup;
		this.qty = qty;
		this.sugar = sugar;
		this.ice = ice;
		if (cup == 1)
		{
			sum = mid_price * qty;
		}
		else
		{
			sum = big_price * qty;
		}
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getCup() {
		return cup;
	}

	public void setCup(Integer cup) {
		this.cup = cup;
	}	

	static Integer getMidprice() {
		return Order.mid_price;
	}

	static Integer getBigprice() {
		return Order.big_price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getSugar() {
		return sugar;
	}

	public void setSugar(Integer sugar) {
		this.sugar = sugar;
	}

	public Integer getIce() {
		return ice;
	}

	public void setIce(Integer ice) {
		this.ice = ice;
	}

	public Integer getSum() {
		return sum;
	}


	
	
	

}
