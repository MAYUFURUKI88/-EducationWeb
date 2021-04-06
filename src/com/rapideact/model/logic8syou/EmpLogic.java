package com.rapideact.model.logic8syou;

import com.rapideact.model.dao8syou.EmpDao;
import com.rapideact.model.view8syou.EmpView;

//処理クラス
public class EmpLogic {

	public EmpView setEmpView(String id) {
		EmpView empView = new EmpView();

		//EmpDao
		EmpDao empDao = new EmpDao();

		//empテーブルをパラメーターから検索
		empView.setEmp(empDao.selectById(Integer.parseInt(id)));

		return empView;
	}

}
