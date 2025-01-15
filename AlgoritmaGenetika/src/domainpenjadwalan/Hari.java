package domainpenjadwalan;

//import java.util.ArrayList;

public class Hari {
	private int kode;
	private String nama;
	//private int maxInSlot;
    //private int minInSlot;
    //private ArrayList<Matakuliah> matakuliah2;

	public Hari(int kode, String nama) {
		this.kode = kode;
		this.nama = nama;
	}
	public int getKode () {
		return kode;
	}
	
	public String getNama() {
		return nama;
	}
	
	/*
	public int getMax(){
        return maxInSlot;
    }

    public int getMin(){
        return minInSlot;
    }
	
	public void setMax(int max){
        maxInSlot = max;
    }

    public void setMin(int min){
        minInSlot = min;
    }*/
}
