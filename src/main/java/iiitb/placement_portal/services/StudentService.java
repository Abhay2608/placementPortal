package iiitb.placement_portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iiitb.placement_portal.entity.Student;
import iiitb.placement_portal.repository.StudentRepository;;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public boolean registerStudent(Student student) {
		boolean res=true;
		try {
			studentRepository.save(student);
		}catch(Exception e) {
			res=false;
			System.out.println(e);
		}
		return res;
	}
	
	public Student getStudentByRollNo(String rollNo){
		Student student=null;
		try {
			student=studentRepository.findByRollNo(rollNo);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return student;
	}
	
	public boolean authenticateStudent(Student student) {
		boolean res = false;
		try {
			Student stu = studentRepository.findByRollNo(student.getRollNo());
			if(stu.getPassword() == student.getPassword()) {
				res = true;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return res;
	}
	
	public boolean updatePassword(Student student) {
		boolean res = false;
		try {
			Student stu = studentRepository.findByRollNo(student.getRollNo());
			stu.setPassword(student.getPassword());
			studentRepository.save(stu);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return res;
	}
	
	public boolean updateStudentDetails(Student student) {
		boolean res = true;
		try {
			Student studentObj = studentRepository.findByRollNo(student.getRollNo());
			studentObj.setAddress(student.getAddress());
			studentObj.setBatch(student.getBatch());
			studentObj.setCgpa(student.getCgpa());
			studentObj.setDob(student.getDob());
			studentObj.setEmail(student.getEmail());
			studentObj.setGender(student.getGender());
			studentObj.setImage(student.getImage());
			studentObj.setName(student.getName());
			studentObj.setNationality(student.getNationality());
			studentObj.setPassword(student.getPassword());
			studentObj.setPhone(student.getPhone());
			studentObj.setPincode(student.getPincode());
			studentObj.setPlacementYear(student.getPlacementYear());
			studentObj.setState(student.getState());
			studentObj.setStream(student.getStream());
			studentObj.setUndergraduateDegree(student.getUndergraduateDegree());
			studentObj.setUndergraduatePercentage(student.getUndergraduatePercentage());
			studentObj.setUndergraduateUniversity(student.getUndergraduateUniversity());
			studentObj.setUndergraduateYear(student.getUndergraduateYear());
			studentObj.setxBoard(student.getxBoard());
			studentObj.setXiiBoard(student.getXiiBoard());
			studentObj.setXiiPercentage(student.getXiiPercentage());
			studentObj.setXiiYear(student.getXiiYear());
			studentObj.setxPercentage(student.getxPercentage());
			studentObj.setxYear(student.getxYear());
			studentRepository.save(studentObj);
		}
		catch(Exception e) {
			res = false;
			System.out.println(e);
		}
		return res;
	}
}
