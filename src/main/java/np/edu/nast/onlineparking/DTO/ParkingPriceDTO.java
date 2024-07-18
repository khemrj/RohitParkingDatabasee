package np.edu.nast.onlineparking.DTO;

public class ParkingPriceDTO {
    private Long categoryId;
    private Long parkingPlaceId;
    private int pricePerHrs;

    // Getters and Setters
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getParkingPlaceId() {
        return parkingPlaceId;
    }

    public void setParkingPlaceId(Long parkingPlaceId) {
        this.parkingPlaceId = parkingPlaceId;
    }

    public int getPricePerHrs() {
        return pricePerHrs;
    }

    public void setPricePerHrs(int pricePerHrs) {
        this.pricePerHrs = pricePerHrs;
    }
}
