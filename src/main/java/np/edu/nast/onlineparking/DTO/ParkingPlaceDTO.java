package np.edu.nast.onlineparking.DTO;



public class ParkingPlaceDTO {
	
	private Long parkingPlaceId;
	private String placeName;
	 private String ownerName;
	 private String address;
	private Long phoneNumber;
	private Double distance;
	 private Double latitude;
	 private Double longitude;
	 private Float pricePerHour;
	public Float getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(Float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
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

}
