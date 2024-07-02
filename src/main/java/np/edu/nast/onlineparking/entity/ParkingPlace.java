package np.edu.nast.onlineparking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_parking_place")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingPlace {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parkingPlaceId;
	 
	@Column
	private String placeName;
	@Column
	 private String ownerName;
	@Column
	 private String address;
	
	@Column
	private Long phoneNumber;
	
	@Column
	 private Double latitude;
	@Column
	 private Double longitude;
	public Long getParkingPlaceId() {
		return parkingPlaceId;
	}
	public void setParkingPlaceId(Long parkingPlaceId) {
		this.parkingPlaceId = parkingPlaceId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
