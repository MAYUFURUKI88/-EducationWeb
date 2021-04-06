package web8syoumatu;

import java.io.Serializable;
import java.util.List;

public class EmpView8syoumatu implements Serializable {

	private Emp8syoumatu emp;
	private List<Emp8syoumatu> allemp;

	public List<Emp8syoumatu> getAllemp() {
		return allemp;
	}

	public void setAllemp(List<Emp8syoumatu> allemp) {
		this.allemp = allemp;
	}

	public EmpView8syoumatu() {

	}

	public Emp8syoumatu getEmp() {
		return emp;
	}

	public void setEmp(Emp8syoumatu emp) {
		this.emp = emp;
	}
//型を統一する




}
