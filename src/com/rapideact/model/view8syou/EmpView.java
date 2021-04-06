package com.rapideact.model.view8syou;

import java.io.Serializable;

import com.rapideact.model.entity8syou.Emp;

public class EmpView implements Serializable {

	private Emp emp;

	public EmpView() {

	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
