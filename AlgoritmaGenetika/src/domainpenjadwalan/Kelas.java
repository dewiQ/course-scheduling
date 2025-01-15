package domainpenjadwalan;

public class Kelas {
	private int kd_kelas;
	private Kelompok kelompok;
	private Matakuliah matakuliah;
	private Dosen dosen;
	private Jam jam;
	private Hari hari;
	private Ruang ruang;
	public Kelas(int kd_kelas, Kelompok kelompok, Matakuliah matakuliah) {
		this.kd_kelas = kd_kelas;
		this.kelompok = kelompok;
		this.matakuliah = matakuliah;
	}
	
	public void setDosen(Dosen dosen) {
		this.dosen = dosen;
	}
	public Dosen getDosen() {
		return dosen;
	}
	

	public void setJam(Jam jam) {
		this.jam = jam;
	}
	public Jam getJam() {
		return jam;
	}
	
	public void setHari(Hari hari) {
		this.hari = hari;
	}
	public Hari getHari() {
		return hari;
	}
	
	public void setRuang(Ruang ruang) {
		this.ruang = ruang;
	}
	public Ruang getRuang() {
		return ruang;
	}
	
	public int getKode() {
		return kd_kelas;
	}
	public Kelompok getKelompok() {
		return kelompok;
	}
	public Matakuliah getMatakuliah() {
		return matakuliah;
	}
	
	public String toString() {
		return "["+kelompok.getKode()+","+matakuliah.getKode()+","+dosen.getKd_dosen()+","+jam.getKd_jam()+","+hari.getKode()+","+ruang.getKode()+"]";
	} 
}


