package com.switchman.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // le dice a spring que esta clase es una entidad
@Table(name = "users")// Mapea con la tabla "users" en base de datos
public class User implements Serializable {
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	private static final long serialVersionUID = 2895849443998897704L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )//identificador unico 
	private Long id;
	
	@Column(length = 50)
	private String name;

	private String surname;

	private String email;

	private Boolean enable;

}