package com.qa.ims.persistence.domain;

public class Order {
	// Order.java
	private Long orderid;
	private Long customerid;
	private Long itemid;
	private Long quantity;
	private Double cost;

	public Order(Long orderid, Long itemid, Long customerid, Long quantity, Double cost) {
		this.setQuantity(quantity);
		this.setItemid(itemid);
		this.setOrderid(orderid);
		this.setCustomerid(customerid);
		this.setCost(cost);
	}

	public Order(Long orderid, Long itemid, Long customerid, Long quantity ) {
		this.setQuantity(quantity);
		this.setItemid(itemid);
		this.setOrderid(orderid);
		this.setCustomerid(customerid);


	}

	public Order(Long customerid, Long itemid, Long quantity) {

		this.setCustomerid(customerid);
		this.setItemid(itemid);
		this.setQuantity(quantity);
	}

	public Long getOrderid() {
		return orderid;

	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getQuantity() {

		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Order ID:" + orderid + "Customer ID:" + customerid + "Item ID:" + itemid + "Quantity:" + quantity
				+ "Cost:" + cost;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getCustomerid() == null) {
			if (other.getCustomerid() != null)
				return false;
		} else if (!getCustomerid().equals(other.getCustomerid()))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.getOrderid()))
			return false;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

}