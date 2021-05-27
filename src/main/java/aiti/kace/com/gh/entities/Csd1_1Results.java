package aiti.kace.com.gh.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



//CSD1.1 RESULTS CLASS
@Entity
@Table(name = "csd1_1results")
public class Csd1_1Results{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int foc;
	private int html_css;
	private int javascript;
	private int se;
	private int database_tec;
	private int python;
	
	
	@OneToOne
	private Csd1_1Info csd1_1;

	
	public Csd1_1Results() {
		super();
	}


	public Csd1_1Results(int id, int foc, int html_css, int javascript, int se, int database_tec, int python,
			Csd1_1Info csd1_1) {
		super();
		this.id = id;
		this.foc = foc;
		this.html_css = html_css;
		this.javascript = javascript;
		this.se = se;
		this.database_tec = database_tec;
		this.python = python;
		this.csd1_1 = csd1_1;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Csd1_1Info getCsd1_1() {
		return csd1_1;
	}


	public void setCsd1_1(Csd1_1Info csd1_1) {
		this.csd1_1 = csd1_1;
	}


	@Override
	public String toString() {
		return "Csd1_1Results [id=" + id + ", foc=" + foc + ", html_css=" + html_css + ", javascript=" + javascript
				+ ", se=" + se + ", database_tec=" + database_tec + ", python=" + python + ", csd1_1=" + csd1_1 + "]";
	}


	
	



	
	
	

}
