package com.sasha.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name="bank_details")
@Entity
public class Bank{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String IFSC;
	
	private String name;
	
	private String branch;
	
	@Column(name="account_no")
	private Long accountNo;
	
	@Column(name="account_holder_name")
	private String accountHolderName;
	
	@Column(name="account_type")
	private String accountType;
	
	@OneToOne(mappedBy="bank")
	private User user;
}
