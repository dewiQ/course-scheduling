package domainpenjadwalan;

public class Dosen {
	private int kd_dosen;
	private String nama;
	
	public Dosen(int kd_dosen, String nama) {
		this.kd_dosen = kd_dosen;
		this.nama = nama;
	}
	public int getKd_dosen() {
		return kd_dosen;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String toString() {
		return nama;
	}
}

//toString method to return the name of this instructor