package iiitb.placement_portal.entity;

import iiitb.placement_portal.entity.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class CompanyParticipation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer companyId;
	private Integer studentId;
	private boolean appliedFor[];	//summer intern, intern, full time, I+F
	
	public CompanyParticipation(Integer id, Integer companyId, Integer studentId, boolean[] appliedFor) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.studentId = studentId;
		this.appliedFor = appliedFor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public boolean[] getAppliedFor() {
		return appliedFor;
	}
	public void setAppliedFor(boolean[] appliedFor) {
		this.appliedFor = appliedFor;
	}
	
	
}
