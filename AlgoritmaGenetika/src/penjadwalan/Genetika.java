package penjadwalan;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Genetika {
	private Data data;
	public Genetika(Data data) {
		this.data = data;
	}
	
	public Populasi evolve(Populasi populasi) {
		return populasiMutasi(populasiCrossover(populasi));
	}
	
	Populasi populasiCrossover(Populasi populasi) {
		Populasi populasiCrossover = new Populasi(populasi.getJadwal2().size(), data);
		IntStream.range(0, JadwalGA.num_elitisme).forEach(x -> 
						populasiCrossover.getJadwal2().set(x, populasi.getJadwal2().get(x)));
		IntStream.range(JadwalGA.num_elitisme, populasi.getJadwal2().size()).forEach(x -> {
			if (JadwalGA.crossover_rate > Math.random()) {
				Jadwal jadwalA = populasiSeleksiTurnamen(populasi).UrutkanFitness().getJadwal2().get(0);
				Jadwal jadwalB = populasiSeleksiTurnamen(populasi).UrutkanFitness().getJadwal2().get(0);
				populasiCrossover.getJadwal2().set(x, jadwalCrossover(jadwalA, jadwalB));				
			}else 
				populasiCrossover.getJadwal2().set(x, populasi.getJadwal2().get(x));
			
		});
		return populasiCrossover;
	}
	
	Jadwal jadwalCrossover(Jadwal jadwalA, Jadwal jadwalB) {
		Jadwal jadwalCrossover = new Jadwal(data).initialize();
		IntStream.range(0, jadwalCrossover.getKelas2().size()).forEach(x -> {
			if (Math.random() > 0.5) jadwalCrossover.getKelas2().set(x, jadwalA.getKelas2().get(x));
			else jadwalCrossover.getKelas2().set(x, jadwalB.getKelas2().get(x));
		});
		return jadwalCrossover;
	}
	
	Populasi populasiMutasi(Populasi populasi) {
		Populasi populasiMutasi = new Populasi(populasi.getJadwal2().size(), data);
		ArrayList<Jadwal> jadwal2 = populasiMutasi.getJadwal2();
		IntStream.range(0, JadwalGA.num_elitisme).forEach(x -> 
													jadwal2.set(x, populasi.getJadwal2().get(x)));
		IntStream.range(JadwalGA.num_elitisme, populasi.getJadwal2().size()).forEach(x -> {
										jadwal2.set(x, jadwalMutasi(populasi.getJadwal2().get(x)));
		});
		return populasiMutasi;
	}
	
	Jadwal jadwalMutasi(Jadwal jadwalMutasi) {
		Jadwal jadwal = new Jadwal(data).initialize();
		IntStream.range(0, jadwalMutasi.getKelas2().size()).forEach(x -> {
			if (JadwalGA.mutation_rate > Math.random()) 
				jadwalMutasi.getKelas2().set(x, jadwal.getKelas2().get(x));
		});
		return jadwalMutasi;
	}
	
	Populasi populasiSeleksiTurnamen (Populasi populasi) {
		Populasi populasiTurnamen = new Populasi(JadwalGA.turnamen_size, data);
		IntStream.range(0, JadwalGA.turnamen_size).forEach(x -> {
			populasiTurnamen.getJadwal2().set(x, populasi.getJadwal2().get(
					(int)(Math.random() * populasi.getJadwal2().size())));
			
		});
		return populasiTurnamen;
	}
	
}


