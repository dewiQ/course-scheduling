package domainpenjadwalan;

public class Ruang {
	private int kode;
	private String nama_ruang;
	private int kapasitasruang;
	//private String jenis;
	private boolean isLab;
	public Ruang(int kode, String nama_ruang, int kapasitasruang, boolean isLab) {
		this.kode = kode;
		this.nama_ruang = nama_ruang;
		this.kapasitasruang = kapasitasruang;
		this.isLab = isLab;
	}
	
	public int getKode() {
		return kode;
	}
	
	public String getNama_ruang() {
		return nama_ruang;
	}
	
	public int getKapasitasruang() {
		return kapasitasruang;
	}
	
	public boolean getIsLab() {
		return isLab;
	}
}
