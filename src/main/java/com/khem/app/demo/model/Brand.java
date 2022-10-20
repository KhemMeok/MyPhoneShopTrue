package com.khem.app.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "brands")
public class Brand {
		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Integer Id;
	    private String name;
}
