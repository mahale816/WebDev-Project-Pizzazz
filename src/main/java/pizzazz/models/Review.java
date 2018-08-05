package pizzazz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Salon salon;
	private Customer customer;
	private boolean like;
	private String comment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Salon getSalon() {
		return salon;
	}
	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	public Customer getUser() {
		return customer;
	}
	public void setUser(Customer customer) {
		this.customer = customer;
	}
	public boolean isLike() {
		return like;
	}
	public void setLike(boolean like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
