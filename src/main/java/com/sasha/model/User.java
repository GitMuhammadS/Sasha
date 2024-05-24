package com.sasha.model;


import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native")
	private Long id;
	
	private String name;
	
	@Email(message="Invalid Email Format")
	@NotNull(message="Email cannot be null")
	private String email;
	
	private String mobile;
	
	//@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Invalid PAN format")
	private String pan;
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	private String username;
	
	/*@Column(name="is_Enabled")
	private Boolean isEnabled;
	
	@Column(name="is_Account_Locked")
	private Boolean isAccountLocked;
	
	@Column(name="pwd_Update_On")
	private Date pwdUpdateOn;
	
	@Column(name="created_On")
	private Date createdOn;
	*/
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bank_id",referencedColumnName = "id")
	@JsonIgnore
	private Bank bank;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@JsonIgnore
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER)
	private Set<Authority> authorities;
	
	@JsonIgnore
	@OneToOne(mappedBy="user",fetch=FetchType.EAGER)
	private EmailVerified emailVerified;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="")
	private Member member;*/
	
	
}
