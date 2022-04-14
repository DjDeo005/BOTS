package com.bots.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerFinder 
{
	@Id
	@GeneratedValue
	private long id;
	private String sport;
	private String location;
	private int reqplayers;
	private int availableplayers;
	private String contpername;
	private String contact;
	@OneToOne
	private TimeSlot t;

	public PlayerFinder(long id, String sport, String location, TimeSlot t) 
	{
		super();
		this.id = id;
		this.sport = sport;
		this.location = location;
		this.t = t;
	}
	
	@Override
	public String toString() 
	{
		return "PlayerFinder [sport=" + sport + ", location=" + location + ", t=" + t + "]";
	}	
}
