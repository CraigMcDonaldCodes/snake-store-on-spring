package codes.mcdonald.craig.snakestore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 100)
	private String firstName;
	
	@Column(length = 150)
	private String lastName;
	
	// TODO Better data type for email?
	@Column(length = 300)
	private String email;
	
	// TODO How to implement address value
}
