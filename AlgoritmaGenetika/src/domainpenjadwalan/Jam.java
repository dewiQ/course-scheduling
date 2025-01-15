package domainpenjadwalan;

import java.time.LocalTime;
//import java.util.concurrent.atomic.AtomicInteger;

public class Jam {
	//private static final AtomicInteger counter = new AtomicInteger(0);
	private int kd_jam;
	private int SKS;
	//private ArrayList<Jam> jam2;
	private final LocalTime mulai;
	private final LocalTime akhir;	
	//private final boolean slotType;
    //private final LocalTime startTime;
    //private final LocalTime endTime;
    //private final LocalTime between;
    //private final boolean isAfter;
    //private final String day;
    //private int maxInSlot;
    //private int minInSlot;

    //private ArrayList<Integer> overlappingSlotIDs;
    //private ArrayList<Integer> assignedIDs;

	
	public Jam(int kd_jam,  int SKS, LocalTime mulai,  LocalTime akhir) {
		this.kd_jam = kd_jam;
		
		this.SKS = SKS;
		this.mulai = mulai;
		this.akhir = akhir;

	}
	public int getKd_jam () {
		return kd_jam;
	}
	
	/*
	public boolean getType(){
        return slotType;
    }*/

	public int getSKS() {
		return SKS;
	}
	
	/*
	public ArrayList<Jam> getJam2() {
		return jam2;
	}*/
	
	public LocalTime getMulai(){
        return mulai;
    }

    public LocalTime getAkhir(){
        return akhir;
    }

    /*
    public String getDay(){
        return day;
    }*/

    /*
    public int getMax(){
        return maxInSlot;
    }

    public int getMin(){
        return minInSlot;
    }*/

    /*
    public ArrayList<Integer>  getOverlappingSlots(){
        return overlappingSlotIDs;
    }

    public ArrayList<Integer>  getCoursesAssigned(){
        return assignedIDs;
    }*/

    /*
    public void setMax(int max){
        maxInSlot = max;
    }

    public void setMin(int min){
        minInSlot = min;
    }*/

    /*
    public String getSlotInfo(){
        String info = this.day + ", " + (this.startTime).toString();
        return info;
    }*/
	/*
	public String getSesi_1() {
		return sesi_1;
	}
	
	public String getSesi_2() {
		return sesi_2;
	}*/
	
	/*
	public String getSesi_3() {
		return sesi_3;
	}
	public String getSesi_4() {
		return sesi_4;
	}*/
	
	/*
	public int getDurasi() {
		return durasi;
	}*/
}



//represent meeting time for various courses