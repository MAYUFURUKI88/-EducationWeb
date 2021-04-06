package web8syoumatu;

public class EmpLogic8syoumatu {

	public EmpView8syoumatu setEmpView(String id) {

		EmpView8syoumatu empView = new EmpView8syoumatu();

		//EmpDao
		EmpDao8syoumatu empDao = new EmpDao8syoumatu();

		//empテーブルをパラメータから検索
		empView.setEmp(empDao.selectById(Integer.parseInt(id)));

		return empView;
	}

	public EmpView8syoumatu allEmpView() {

		EmpView8syoumatu empView = new EmpView8syoumatu();

		//EmpDao
		EmpDao8syoumatu empDao = new EmpDao8syoumatu();

		//empテーブルをパラメータから検索
		empView.setAllemp(empDao.selectall());

		return empView;
	}

}
