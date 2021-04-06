package web8syoumatu;

import java.io.Serializable;
import java.util.Date;

public class Emp8syoumatu implements Serializable {

	private int id;
	private String name;
	private Date birth;

	public Emp8syoumatu() {

	}

	public Emp8syoumatu(int id, String name, Date birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	//リストを格納するクラス

}
