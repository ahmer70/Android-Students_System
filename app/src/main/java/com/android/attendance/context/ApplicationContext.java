package com.android.attendance.context;

import java.util.ArrayList;

import android.app.Application;

import com.android.attendance.bean.StudentBean;

public class ApplicationContext extends Application {

	private ArrayList<StudentBean> studentBeanList;

	public ArrayList<StudentBean> getStudentBeanList() {
		return studentBeanList;
	}
	public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
		this.studentBeanList = studentBeanList;
	}

	
	

}
