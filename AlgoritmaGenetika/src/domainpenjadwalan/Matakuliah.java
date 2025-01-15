package domainpenjadwalan;
import java.util.ArrayList;

public class Matakuliah {
	private int kode;
	private String kode_mk = null;
	private String nama = null;
	private ArrayList<Dosen> dosen2;
	private int maxJumlahMhs;
	private boolean isPraktek;
	private int semester;

	private int sks;
	
	public Matakuliah(int kode, String kode_mk, String nama, ArrayList<Dosen> dosen2, int maxJumlahMhs, boolean isPraktek, int semester, int sks) {
		this.kode = kode;
		this.kode_mk = kode_mk;
		this.nama = nama;
		this.dosen2 = dosen2;
		this.maxJumlahMhs = maxJumlahMhs;
		this.isPraktek = isPraktek;
		this.semester = semester;
		this.sks = sks;
	}
	
	public int getKode() {
		return kode;
	}
	
	public String getKode_mk() {
		return kode_mk;
	}
	
	public String getNama() {
		return nama;
	}
	
	public ArrayList<Dosen> getDosen2() {
		return dosen2;
	}
	
	public int getMaxJumlahMhs() {
		return maxJumlahMhs;
	}
	
	public boolean getIsPraktek() {
		return isPraktek;
	}
	
	public int getSemester() {
		return semester;
	}
	
	public int getSks() {
		return sks;
	}
	
	/*
	public ArrayList<SKS> getSKS2() {
		return sks2;
	}*/
	
	public String toString() {
		return nama;
	}
}


//the course will have course number and course name and max number of student
//and a list of instructor that can teach this course
//and constructor that initialize each one of those values
//and get method that return them to get number and get name and get instructor 
//and get max number of student 
//and toString method that returns the name of this course