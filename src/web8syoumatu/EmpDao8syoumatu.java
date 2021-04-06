package web8syoumatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpDao8syoumatu {

	private static String dbURL = "jdbc:mariadb://docker.rapideact.local:3307/furuki";

	private static String user = "furuki";

	private static String password = "furuki";

	public Emp8syoumatu selectById(int id) {
		Emp8syoumatu emp = null;

		try {
			//JDBCドライバ読み込み
			Class.forName(org.mariadb.jdbc.Driver.class.getName());

			//SQL
			String sql = "select * from emp where id = ?";

			try (Connection con = DriverManager.getConnection(dbURL, user, password);
					PreparedStatement pst = con.prepareStatement(sql);) {

				//SQLにパラメータ設定
				pst.setInt(1, id);

				//SQL発行
				ResultSet rs = pst.executeQuery();

				//ResultSetから読み込み
				while (rs.next()) {
					emp = new Emp8syoumatu(rs.getInt("id"), rs.getString("name"), rs.getDate("birth"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public List<Emp8syoumatu> selectall() {
		List<Emp8syoumatu> allemp = null;

		try {
			//JDBCドライバ読み込み
			Class.forName(org.mariadb.jdbc.Driver.class.getName());

			//SQL
			String sql = "select * from emp;";

			try (Connection con = DriverManager.getConnection(dbURL, user, password);
					PreparedStatement pst = con.prepareStatement(sql);) {

				//リスト作成
				List<Emp8syoumatu> list = new ArrayList<Emp8syoumatu>();

				//SQL発行
				ResultSet rs = pst.executeQuery();

				//ResultSetから読み込み
				while (rs.next()) {
					Integer id1 = rs.getInt("id");
					String name = rs.getString("name");
					Date birth = rs.getDate("birth");
					list.add(new Emp8syoumatu(id1, name, birth));
				}

				allemp = list;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return allemp;
	}

}
