package iiitb.placement_portal.entity;

import java.util.Date;

import iiitb.placement_portal.entity.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private CompanyContacts contact[];
	private String jd[];
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date opentime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date closetime;
	private String courseRequirement[];
	private String streamRequirement[];
	private float cgpaRequired;
	private boolean type[];	//summer intern, intern, full time, I+F
	
}
