package com.xib.assessment.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	@Id
    @GeneratedValue
    private Long id;
	
    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    private List<Team> teams = new ArrayList<>();	
	    	
	public Manager() {
	}
	private String firstName;
    private String lastName;
    private String idNumber;
	public Manager(Long id, List<Team> teams, Team team, String firstName, String lastName, String idNumber) {
		this.id = id;
		this.teams = teams;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
}
