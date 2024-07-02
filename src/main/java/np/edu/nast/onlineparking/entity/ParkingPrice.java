package np.edu.nast.onlineparking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_parking_price")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ParkingPrice {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long priceId;
	
	@OneToOne
    @JoinColumn(name="category_id", referencedColumnName ="CategoryId")
    private Category category;
	
	@Column
	private float pricePerHrs;

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public float getPricePerHrs() {
		return pricePerHrs;
	}

	public void setPricePerHrs(float pricePerHrs) {
		this.pricePerHrs = pricePerHrs;
	}
	
}
