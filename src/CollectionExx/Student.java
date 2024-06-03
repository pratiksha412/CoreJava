package CollectionExx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Student {
	private int RollNo;
	private String sname;
	private String dpet;
	private String college;

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDpet() {
		return dpet;
	}

	public void setDpet(String dpet) {
		this.dpet = dpet;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student(int rollNo, String sname, String dpet, String college) {
		super();
		RollNo = rollNo;
		this.sname = sname;
		this.dpet = dpet;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", sname=" + sname + ", dpet=" + dpet + ", college=" + college + "]";
	}

}
 