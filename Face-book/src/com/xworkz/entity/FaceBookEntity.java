package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="ReadAll", query="select entity from FaceBookEntity entity")
public class FaceBookEntity {
@Id
	private int id;
@Column(name="first_name")
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String gender;
	private String dob;
		
	}

