package aiti.com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//CSD1.1 RESULTS CLASS
@Entity
@Table(name = "csd1_1results")
public class Csd1_1Results{
	
	
	


	private int id;
	@Id
	private String student_id;
	private int foc;
	private int html_css;
	private int javascript;
	private int se;
	private int database_tec;
	private int python;
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudent_id() {
		return student_id;
	}
	
	
	
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	
	
	public int getFoc() {
		return foc;
	}
	
	
	
	public void setFoc(int foc) {
		this.foc = foc;
	}
	
	
	
	public int getHtml_css() {
		return html_css;
	}
	
	
	
	public void setHtml_css(int html_css) {
		this.html_css = html_css;
	}
	
	
	
	public int getJavascript() {
		return javascript;
	}
	
	
	
	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}
	
	
	
	public int getSe() {
		return se;
	}
	
	
	
	public void setSe(int se) {
		this.se = se;
	}
	
	
	
	public int getDatabase_tec() {
		return database_tec;
	}
	
	
	
	public void setDatabase_tec(int database_tec) {
		this.database_tec = database_tec;
	}
	
	
	
	public int getPython() {
		return python;
	}
	
	
	
	public void setPython(int python) {
		this.python = python;
	}



	@Override
	public String toString() {
		return "Csd1_1Results [id=" + id + ", student_id=" + student_id + ", foc=" + foc + ", html_css=" + html_css
				+ ", javascript=" + javascript + ", se=" + se + ", database_tec=" + database_tec + ", python=" + python
				+ "]";
	}
	
	
	
	
	
	
	
	

}
