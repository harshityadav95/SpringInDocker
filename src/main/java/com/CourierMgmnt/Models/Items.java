package com.CourierMgmnt.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
	
	@Id
	//tracking Number of the package
	private int trackingnumbner;
	
	//destination Address of the packet
	private String destinationaddress;
	
	//Sender address of the packet
	private String senderaddress;
	
	//Weight of the package in Kg
	private float weight;
	
	//priority of the postal out of 5
	private int priority;

	public int getTrackingnumbner() {
		return trackingnumbner;
	}

	public void setTrackingnumbner(int trackingnumbner) {
		this.trackingnumbner = trackingnumbner;
	}

	public String getDestinationaddress() {
		return destinationaddress;
	}

	public void setDestinationaddress(String destinationaddress) {
		this.destinationaddress = destinationaddress;
	}

	public String getSenderaddress() {
		return senderaddress;
	}

	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinationaddress == null) ? 0 : destinationaddress.hashCode());
		result = prime * result + priority;
		result = prime * result + ((senderaddress == null) ? 0 : senderaddress.hashCode());
		result = prime * result + trackingnumbner;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (destinationaddress == null) {
			if (other.destinationaddress != null)
				return false;
		} else if (!destinationaddress.equals(other.destinationaddress))
			return false;
		if (priority != other.priority)
			return false;
		if (senderaddress == null) {
			if (other.senderaddress != null)
				return false;
		} else if (!senderaddress.equals(other.senderaddress))
			return false;
		if (trackingnumbner != other.trackingnumbner)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Items [trackingnumbner=" + trackingnumbner + ", destinationaddress=" + destinationaddress
				+ ", senderaddress=" + senderaddress + ", weight=" + weight + ", priority=" + priority + "]";
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
