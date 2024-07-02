package np.edu.nast.onlineparking.entity;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_parking_booking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingBooking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long booking_id;
	
	@OneToOne
    @JoinColumn(name="user_id", referencedColumnName ="userId")
    private User user;
    
    @OneToOne
    @JoinColumn(name="category_id", referencedColumnName ="CategoryId")
    private Category category;
    

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "timeFrom")
    private Time from;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "timeTo")
    private Time to;
    
    @Column
    private int totalHour;
    
    @Column
    private double amount;

	public Long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getFrom() {
		return from;
	}

	public void setFrom(Time from) {
		this.from = from;
	}

	public Time getTo() {
		return to;
	}

	public void setTo(Time to) {
		this.to = to;
	}

	public int getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    
}