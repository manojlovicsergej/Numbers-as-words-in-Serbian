public class BrojeviClass {

	
	private String broj;
	private String rec;
	
	public BrojeviClass() {
		broj = "";
		rec = "";
	}

	public BrojeviClass(String broj, String rec) {
		super();
		this.broj = broj;
		this.rec = rec;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}

	@Override
	public String toString() {
		return "BrojeviClass [broj=" + broj + ", rec=" + rec + "]";
	}
	
	
	
	
}
