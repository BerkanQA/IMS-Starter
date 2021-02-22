package com.qa.ims.persistence.domain;

public class Order {

		private Long orderID;
		private Long customerID;
		private Long itemID;
		public Long quantity;

		public Order(Long quantity) {
			this.setQuantity(quantity);
			
		}
		
		private void setQuantity(Long quantity2) {
			// TODO Auto-generated method stub
			
		}

		public Order(Long orderID, Long customerID, Long itemID, Long quantity) {
			this.setOrderID(orderID);
			this.setCustomerID(customerID);
			this.setItemID(itemID);
			this.setQuantity(quantity);
		}
		
		public Long getOrderID() {
			return orderID;
			
		}
		
		public void setOrderID(Long orderID) {
			this.orderID = orderID;
		}
		
		public Long getCustomerID() {
			return customerID;
		}
		
		public void setCustomerID(Long customerID) {
			this.customerID = customerID;
		}
		public Long getItemID() {
			return itemID;
		}
		
		public void setItemID(Long itemID) {
			this.itemID = itemID;
		}
		
		@Override
		public String toString() {
			return "Order:" + orderID + "Customer ID:" + customerID + "Item ID:" + itemID + "Quantity:" + quantity; 
			
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;

			result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
			result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
			result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
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
			if (getCustomerID() == null) {
				if (other.getCustomerID() != null)
					return false;
			} else if (!getCustomerID().equals(other.getCustomerID()))
				return false;
			if (orderID == null) {
				if (other.orderID != null)
					return false;
			} else if (!orderID.equals(other.getOrderID()))
				return false;
			if (itemID == null) {
				if (other.itemID != null)
					return false;
			} else if (!itemID.equals(other.itemID))
				return false;
			if (quantity == null) {
				if (other.quantity != null)
					return false;
			} else if (!quantity.equals(other.quantity))
				return false;
			return true;
		}
		
		
		
}