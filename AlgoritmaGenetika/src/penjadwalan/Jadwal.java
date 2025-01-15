package penjadwalan;
import java.util.ArrayList;
import domainpenjadwalan.Kelas;
import domainpenjadwalan.Kelompok;

public class Jadwal {
	private ArrayList<Kelas> kelas2;
	private boolean isFitnessBerubah = true;
	private double fitness = -1;
	private int noKelas = 0;
	private int jmlKonflik = 0;
	/*
	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int d = 0;
	private int e = 0;
	private int f = 0;
	*/
	private Data data;
	
	public Data getData() {
		return data;
	}
	
	public Jadwal(Data data) {
		this.data = data;
		kelas2 = new ArrayList<Kelas>(data.getNomorKelas());	
	}
	
	public Jadwal initialize() {
		new ArrayList<Kelompok>(data.getKelompok2()).forEach(kelompok -> {
			kelompok.getMatakuliah2().forEach(matakuliah -> {
				Kelas newKelas = new Kelas(noKelas++, kelompok, matakuliah);
				newKelas.setHari(data.getHari2().get((int)(data.getHari2().size() * Math.random())));
				newKelas.setJam(data.getJam2().get((int) (data.getJam2().size() * Math.random())));
				newKelas.setRuang(data.getRuang2().get((int)(data.getRuang2().size() * Math.random())));
				newKelas.setDosen(matakuliah.getDosen2().get((int) (matakuliah.getDosen2().size() * Math.random())));
				kelas2.add(newKelas);
			});
		});
		return this;
	}
	
	
	public int getJmlKonflik() {
		return jmlKonflik;
	}
	
	/*
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public int getD() {
		return d;
	}
	
	public int getE() {
		return e;
	}
	
	public int getF() {
		return f;
	}
	*/
	
	public ArrayList<Kelas> getKelas2(){
		isFitnessBerubah = true;
		return kelas2;
	}
	
	public double getFitness() {
		if (isFitnessBerubah == true) {
			fitness = hitungFitness();
			isFitnessBerubah = false;
		}
		return fitness;
	}
	
	/*
	private int hardConstraint() {
		 a = 0;
		 b = 0;
		 c = 0;
		kelas2.forEach(x -> {
			if (x.getMatakuliah().getIsPraktek() != x.getRuang().getIsLab()) {
				a++;
			}
		
		
			kelas2.stream().filter(y -> kelas2.indexOf(y) >= kelas2.indexOf(x)).forEach(y -> {
				if (x.getKelompok().getKode() == y.getKelompok().getKode()
						&& x.getHari().getKode() == y.getHari().getKode()
						&& x.getJam().getKd_jam() == y.getJam().getKd_jam()
						&& x.getKode() != y.getKode()) {
					b++;
				}
			
				if (x.getDosen().getKd_dosen() == y.getDosen().getKd_dosen()
						&& x.getHari().getKode() == y.getHari().getKode()
						&& x.getJam().getKd_jam() == y.getJam().getKd_jam()
						&& x.getKode() != y.getKode()) {
					c++;
				}
				
				if (x.getRuang().getKode() == y.getRuang().getKode()
						&& x.getKelompok().getKode() == y.getKelompok().getKode()
						&& x.getHari().getKode() == y.getHari().getKode()
						&& x.getJam().getKd_jam() == y.getJam().getKd_jam()
						&& x.getKode() != y.getKode()) {
					c++;
				}

			
			});
		});
		return 2*b + c + 4*a;
	}
	
	private int softConstraint() {
		d = 0;
		e = 0;
		f = 0;
		kelas2.forEach(x -> {
			if (x.getRuang().getKapasitasruang() < x.getKelompok().getMax_Mhs()) {
				d++;
			}
			
			if (x.getMatakuliah().getSks() != x.getJam().getSKS()) {
				e++;
			}
			
			kelas2.stream().filter(y -> kelas2.indexOf(y) >= kelas2.indexOf(x)).forEach(y -> {
				if (x.getKelompok().getKode() == y.getKelompok().getKode()
						&& x.getHari().getKode() == y.getHari().getKode()
						&& x.getJam().getMulai().isBefore(y.getJam().getMulai()) 
						||  x.getJam().getAkhir().isAfter(y.getJam().getAkhir())
						&& x.getKode() != y.getKode()) {
					f++;
				}		
				
				
			
			});
		});
		return 4*d + e + 4*f;
	}
		
	private int hitungFitness() {
		return -1*(1000*hardConstraint() + softConstraint());
	}
	*/
	
	
	
	
	
	private double hitungFitness() {
		jmlKonflik = 0;
		kelas2.forEach(x -> {
			if (x.getRuang().getKapasitasruang() < x.getKelompok().getMax_Mhs()) {
				 jmlKonflik++;
				}
			if (x.getMatakuliah().getIsPraktek() != x.getRuang().getIsLab()) {
				 jmlKonflik++;
				}
			if (x.getMatakuliah().getSks() != x.getJam().getSKS()) {
				jmlKonflik++;
				}
			
			kelas2.stream().filter(y -> kelas2.indexOf(y) >= kelas2.indexOf(x)).forEach(y -> {
				if (x.getJam().getKd_jam() == y.getJam().getKd_jam()
						&&  x.getJam().getMulai().isBefore(y.getJam().getMulai()) 
						&&  x.getJam().getAkhir().isAfter(y.getJam().getAkhir())
						
						//&& x.getJam().getMulai() == y.getJam().getMulai()
						//&& x.getMatakuliah().getSks() == x.getJam().getSKS()
						 && x.getKelompok().getKode() == y.getKelompok().getKode()
						  && x.getHari() == y.getHari()
						  //&& x.getDosen() == y.getDosen()
						//&& x.getRuang() == y.getRuang()
						&& x.getKode() != y.getKode())
						
					
				{	
					jmlKonflik++;
				}
			
				if (x.getJam().getKd_jam() == y.getJam().getKd_jam()
						  && x.getJam().getMulai().isBefore(y.getJam().getMulai()) 
						&&  x.getJam().getAkhir().isAfter(y.getJam().getAkhir())
						//&& x.getJam().getMulai() == y.getJam().getMulai()
						  && x.getKelompok().getKode() == y.getKelompok().getKode()
						  && x.getHari() == y.getHari()
						 && x.getRuang() == y.getRuang()
						&& x.getKode() != y.getKode())
						
					
				{	
					jmlKonflik++;
				}
			
				if (x.getJam().getKd_jam() == y.getJam().getKd_jam()
						  && x.getJam().getMulai().isBefore(y.getJam().getMulai()) 
						&&  x.getJam().getAkhir().isAfter(y.getJam().getAkhir())
						//&& x.getJam().getMulai() == y.getJam().getMulai()
						 && x.getKelompok().getKode() == y.getKelompok().getKode()
						  && x.getHari() == y.getHari()
						  && x.getDosen() == y.getDosen()
						//&& x.getRuang() == y.getRuang()
						&& x.getKode() != y.getKode())
				{	
					jmlKonflik++;
				}
			});
								
		});
		
		return 1/(double)(jmlKonflik + 1);
	}
	
	
	public String toString() {
		String returnNilai = new String();
		for (int x=0; x < kelas2.size()-1; x++) returnNilai += kelas2.get(x) + ",";
		returnNilai += kelas2.get(kelas2.size()-1);
		return returnNilai;
	}
	
	
}

