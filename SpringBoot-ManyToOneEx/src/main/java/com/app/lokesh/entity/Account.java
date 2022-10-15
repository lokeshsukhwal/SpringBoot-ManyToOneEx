package com.app.lokesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Account {
	@Id
	private Integer accountId;
	private String accountType;
	private String bankName;
 
	@ManyToOne
	@JoinColumn(name = "custFK")
	private Customer customer;
}
