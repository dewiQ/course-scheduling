package penjadwalan;

import java.util.ArrayList;

import domainpenjadwalan.Kelas;

public class JadwalGA {
	public static final int populasi_size = 10; 
	public static final double mutation_rate = 0.05; 
	public static final double crossover_rate = 1; 
	public static final int turnamen_size = 5;
	public static final int num_elitisme = 2;
	//private int numJadwal = 0;
	private int numKelas = 1;
	private Data data;
	public static void main(String[] args) {
		JadwalGA jadwalGA = new JadwalGA();
		jadwalGA.data = new Data();
		int generasi = 0;
		//jadwalGA.printData();
		
		
		Genetika genetika = new Genetika(jadwalGA.data);
		Populasi populasi = new Populasi(JadwalGA.populasi_size, jadwalGA.data).UrutkanFitness();
		
		
		
		while (populasi.getJadwal2().get(0).getFitness() != 1) {
			System.out.println("Generasi " + ++generasi);
			
			populasi = genetika.evolve(populasi).UrutkanFitness();
			
			populasi.getJadwal2().forEach(jadwal -> System.out.println(String.format("Nilai Fitness: %5f", jadwal.getFitness() ))); //Nilai Fitness: %.5f
			//jadwalGA.numJadwal = 1;
		}
		
		jadwalGA.printJadwal(populasi.getJadwal2().get(0), generasi);
		jadwalGA.numKelas = 1;
	}
	
	
	private void printJadwal(Jadwal jadwal, int generasi) {
		ArrayList<Kelas> kelas2 = jadwal.getKelas2();
		System.out.print("\n   ");
		System.out.println("Kelas | Kelompok (mahasiswa) | Matakuliah (kode makul) | Ruang (kapasitas) | Dosen | Hari | Jam | Semester");
		System.out.println("                    ");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		kelas2.forEach(x->{
			int indexKelompok = data.getKelompok2().indexOf(x.getKelompok());
			int indexMakul = data.getMatakuliah2().indexOf(x.getMatakuliah());
			int indexDosen = data.getDosen2().indexOf(x.getDosen());
			int indexHari = data.getHari2().indexOf(x.getHari());
			int indexJam = data.getJam2().indexOf(x.getJam());
			int indexRuang = data.getRuang2().indexOf(x.getRuang());
			
			System.out.print(" ");
			System.out.print(numKelas + "  | ");
			System.out.print(data.getKelompok2().get(indexKelompok).getNama() +
							" (" + x.getKelompok().getMax_Mhs() +
							") | ");
			
			System.out.print(data.getMatakuliah2().get(indexMakul).getNama() + 
											" (" + data.getMatakuliah2().get(indexMakul).getKode_mk() +
										    ") | ");
											//" (" + x.getMatakuliah().getMaxJumlahMhs() + ") | ");
			
			System.out.print(data.getRuang2().get(indexRuang).getNama_ruang() + 
											" (" + x.getRuang().getKapasitasruang() + ") | ");
			
			System.out.print(data.getDosen2().get(indexDosen).getNama() + " | ");
											//+ " (" + data.getDosen2().get(indexDosen).getKd_dosen() + ")") + "| ");
			
			System.out.print(data.getHari2().get(indexHari).getNama() + " | ");
											//+ " (" + data.getHari2().get(indexHari).getKode()) + ")| ")
			
			System.out.print(data.getJam2().get(indexJam).getMulai() + "-" + data.getJam2().get(indexJam).getAkhir() + " | ");
					// + " (" + data.getJam2().get(indexJam).getKd_jam() +")");
			System.out.println(data.getMatakuliah2().get(indexMakul).getSemester() + " | ");
			numKelas++;
		});
		
		if (jadwal.getFitness() == 0) System.out.println("Solusi ditemukan pada generasi ke " + (generasi + 1));
		//System.out.print("--------------------------------------------------------------");
		//System.out.println("---------------------------------------------------------------------");
		
	}
	
	/*
	private void printData() {
		System.out.println("Kelompok Kelas");
		data.getKelompok2().forEach(x -> System.out.println("kelompok: "+x.getNama()+", matakuliah: "+x.getMatakuliah2()));
		System.out.println("Matakuliah");
		data.getMatakuliah2().forEach(x->System.out.println("kode: "+x.getKode()+", kode matakuliah: "+x.getKode_mk()+", matakuliah: "+x.getNama()+", mahasiswa: "+x.getMaxJumlahMhs()
		+", dosen: "+x.getDosen2()));
		System.out.println("Ruangan Kelas");
		data.getRuang2().forEach(x->System.out.println("ruang: "+x.getNama_ruang()+", kapasitas: "+x.getKapasitasruang()+", jenis Ruang: "+x.getJenis()));
		System.out.println("Dosen");
		data.getDosen2().forEach(x->System.out.println("kode: "+x.getKd_dosen()+", nama: "+x.getNama()));
		System.out.println("Jam");
		data.getJam2().forEach(x->System.out.println("kode: "+x.getKd_jam()+", jam: "+x.getRange_jam()));
		System.out.println("Hari");
		data.getHari2().forEach(x->System.out.println("kode: "+x.getKode()+", hari: "+x.getNama()));
		System.out.print("---------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	*/
	
	

}



//main method and driver for the while application