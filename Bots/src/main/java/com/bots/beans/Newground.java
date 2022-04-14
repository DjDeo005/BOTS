package com.bots.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Newground 
{
	@Id
	@GeneratedValue
	private long id;
	private String groundname;
	private String location;
	private String groundtype;
	private String sports;	
	private String contact;
	private String Rating;
	private double price;
}
