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
@Table(name="tbl_parking_capacity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingCapacity {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parkingCapacityId;
	
	 @OneToOne
	    @JoinColumn(name="user_id", referencedColumnName ="userId")
	    private User user;
	    
	    @OneToOne
	    @JoinColumn(name="category_id", referencedColumnName ="CategoryId")
	    private Category category;
	    
	    @Column
	    private int capacity;

		public Long getParkingCapacityId() {
			return parkingCapacityId;
		}

		public void setParkingCapacityId(Long parkingCapacityId) {
			this.parkingCapacityId = parkingCapacityId;
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

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
	
}
