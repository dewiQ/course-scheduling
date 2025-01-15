package domainpenjadwalan;
import java.util.ArrayList;

public class Kelompok {
	private int kode;
	private String nama;
	private ArrayList<Matakuliah> matakuliah2;
	private int max_Mhs;
	
	public Kelompok(int kode, String nama, ArrayList<Matakuliah> matakuliah2, int max_Mhs) {
		this.kode = kode;
		this.nama = nama;
		this.matakuliah2 = matakuliah2;
		this.max_Mhs = max_Mhs;
	}
	
	public int getKode() {
		return kode;	
	}
	
	public String getNama() {
		return nama;
	}
	
	public ArrayList<Matakuliah> getMatakuliah2() {
		return matakuliah2;
	}
	
	public int getMax_Mhs() {
		return max_Mhs;
	}
}


//have name and list of courses that it offers 
//and constructor that initialize those 2 value 
//and get methods for each one of them