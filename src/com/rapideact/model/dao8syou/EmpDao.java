package com.rapideact.model.dao8syou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rapideact.model.entity8syou.Emp;

public class EmpDao {

	private static String dbURL = "jdbc:mariadb://docker.rapideact.local:3307/furuki";

	private static String user = "furuki";

	private static String password = "furuki";

	public Emp selectById(int id) {

		Emp emp = null;

		try {
			//jdbcドライバ読み込み
			Class.forName(org.mariadb.jdbc.Driver.class.getName());

			//SQL
			String sql = "select * from emp where id = ?";

			try (Connection con = DriverManager.getConnection(dbURL, user, password);
					PreparedStatement pst = con.prepareStatement(sql);) {

				//SQLにパラメータ設定
				pst.setInt(1, id);

				//SQl発行
				ResultSet rs = pst.executeQuery();

				//ResultSetから読み込み（カラム名を指定しても取得可能）
				while (rs.next()) {
					emp = new Emp(rs.getInt("id"), rs.getString("name"), rs.getDate("birth"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

		return emp;
	}
}
