package penjadwalan;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Populasi {
	private ArrayList<Jadwal> jadwal2;
	public Populasi (int size, Data data) {
		jadwal2 = new ArrayList<Jadwal>(size);
		IntStream.range(0, size).forEach(x -> jadwal2.add(new Jadwal(data).initialize()));
	}
	
	public ArrayList<Jadwal> getJadwal2(){
		return this.jadwal2;
	}
	
	public Populasi UrutkanFitness() {
		jadwal2.sort((jadwalA, jadwalB) -> {
			int returnNilai = 0;
			if (jadwalA.getFitness() > jadwalB.getFitness()) returnNilai = -1;
			else if (jadwalA.getFitness() < jadwalB.getFitness()) returnNilai = 1;
			return returnNilai;
		});
		return this;
	}
}


//represent the population of schedules