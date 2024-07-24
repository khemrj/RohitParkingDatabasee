package np.edu.nast.onlineparking.DTO;

import java.sql.Time;
import java.time.LocalDate;



public class ParkingBookingDTO {
	
	private Long booking_id;
	
	
    private Long user_id;
    
    private int category_id;
    
    
    private LocalDate date   ;
    
   
   
    public Long getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
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


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Long getParkingPlaceId() {
		return parkingPlaceId;
	}


	public void setParkingPlaceId(Long parkingPlaceId) {
		this.parkingPlaceId = parkingPlaceId;
	}


	private Time from;
    
   
   
    private Time to ;
    
   
    private int amount;
    

   private Long parkingPlaceId;

}
