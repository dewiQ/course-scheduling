package penjadwalan;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import domainpenjadwalan.Dosen;
import domainpenjadwalan.Hari;
import domainpenjadwalan.Matakuliah;
import domainpenjadwalan.Ruang;
//import domainpenjadwalan.SKS;
import domainpenjadwalan.Jam;
import domainpenjadwalan.Kelompok;

public class Data {
	private ArrayList<Ruang> ruang2;
	private ArrayList<Dosen> dosen2;
	private ArrayList<Matakuliah> matakuliah2;
	private ArrayList<Kelompok> kelompok2;
	private ArrayList<Jam> jam2;
	private ArrayList<Hari> hari2;
	//private ArrayList<SKS> sks2;
	private int nomorKelas = 0;	
	
	
	public Data() {
		initialize();
	}
	
	private Data initialize(){
		Ruang room1 = new Ruang(1,"D.2.A",45,true);
		Ruang room2 = new Ruang(2,"D.2.H",45,true);
		Ruang room3 = new Ruang(3,"D.2.I",45,true);
		Ruang room4 = new Ruang(4,"D.2.K",45,false);
		Ruang room5 = new Ruang(5,"H.2.2",45,false);
		Ruang room6 = new Ruang(6,"D.1.1",20,false);
		Ruang room7 = new Ruang(7,"H.3.1",65,false);
		Ruang room8 = new Ruang(8,"H.3.2",65,false);
		Ruang room9 = new Ruang(9,"H.3.3",65,false);
		Ruang room10 = new Ruang(10,"H.3.4",65,false);
		Ruang room11 = new Ruang(11,"H.3.5",45,false);
		Ruang room12 = new Ruang(12,"H.3.6",45,false);
		Ruang room13 = new Ruang(13,"H.3.7",45,false);
		Ruang room14 = new Ruang(14,"H.3.8",45,false);
		Ruang room15 = new Ruang(15,"H.3.9",45,false);
		Ruang room16 = new Ruang(16,"H.3.10",45,false);		
		Ruang room17 = new Ruang(17,"H.3.11",45,false);
		Ruang room18 = new Ruang(18,"H.3.12",45,false);
		Ruang room19 = new Ruang(19,"H.3.13",45,false);
		Ruang room20 = new Ruang(20,"H.4.1",65,false);
		Ruang room21 = new Ruang(21,"H.4.2",65,false);
		Ruang room22 = new Ruang(22,"H.4.3",65,false);
		Ruang room23 = new Ruang(23,"H.4.4",65,false);
		Ruang room24 = new Ruang(24,"H.4.5",40,false);
		Ruang room25 = new Ruang(25,"H.4.6",45,false);
		Ruang room26 = new Ruang(26,"H.4.7",40,false);
		Ruang room27 = new Ruang(27,"H.4.8",40,false);
		Ruang room28 = new Ruang(28,"H.4.9",40,false);
		Ruang room29 = new Ruang(29,"H.5.1",65,false);
		Ruang room30 = new Ruang(30,"H.5.2",65,false);
		Ruang room31 = new Ruang(31,"H.5.3",65,false);
		Ruang room32 = new Ruang(32,"H.5.4",65,false);			
		Ruang room33 = new Ruang(33,"H.5.5",65,false);
		Ruang room34 = new Ruang(34,"H.5.6",40,false);
		Ruang room35 = new Ruang(35,"H.5.7",40,false);
		Ruang room36 = new Ruang(36,"H.5.8",40,false);
		Ruang room37 = new Ruang(37,"H.5.9",40,false);
		Ruang room38 = new Ruang(38,"H.5.10",40,false);
		Ruang room39 = new Ruang(39,"H.5.11",40,false);
		Ruang room40 = new Ruang(40,"H.4.10",40,false);
		Ruang room41 = new Ruang(41,"H.4.11",40,false);
		Ruang room42 = new Ruang(42,"H.4.12",40,false);
		Ruang room43 = new Ruang(43,"H.4.13",40,false);
		Ruang room44 = new Ruang(44,"H.4.14",40,false);
		Ruang room45 = new Ruang(45,"H.5.12",40,false);
		Ruang room46 = new Ruang(46,"H.6.3",65,false);
		Ruang room47 = new Ruang(47,"H.6.4",65,false);
		Ruang room48 = new Ruang(48,"H.6.1",40,false);		
		Ruang room49 = new Ruang(49,"H.6.2",40,false);
		Ruang room50 = new Ruang(50,"H.6.05",40,false);
		Ruang room51 = new Ruang(51,"H.6.6",40,false);
		Ruang room52 = new Ruang(52,"H.6.7",40,false);
		Ruang room53 = new Ruang(53,"H.6.8",40,false);
		Ruang room54 = new Ruang(54,"H.6.9",40,false);
		Ruang room55 = new Ruang(55,"H.6.10",40,false);
		Ruang room56 = new Ruang(56,"H.6.12",40,false);
		Ruang room57 = new Ruang(57,"H.7.1",40,false);
		Ruang room58 = new Ruang(58,"H.7.2",40,false);
		Ruang room59 = new Ruang(59,"H.7.3",40,false);
		Ruang room60 = new Ruang(60,"H.7.4",40,false);
		Ruang room61 = new Ruang(61,"H.5.8.A",40,false);
		ruang2 = new ArrayList<Ruang>(Arrays.asList(room1,room2,room3,room4,room5,room6,room7,room8,room9,room10,
				room11,room12,room13,room14,room15,room16,room17,room18,room19,room20,
				room21,room22,room23,room24,room25,room26,room27,room28,room29,room30,
				room31,room32,room33,room34,room35,room36,room37,room38,room39,room40,
				room41,room42,room43,room44,room45,room46,room47,room48,room49,room50,
				room51,room52,room53,room54,room55,room56,room57,room58,room59,room60,room61));
		
		Hari day1 = new Hari(1,"Senin");
		Hari day2 = new Hari(2,"Selasa");
		Hari day3 = new Hari(3,"Rabu");
		Hari day4 = new Hari(4,"Kamis");
		Hari day5 = new Hari(5,"Jumat");
		hari2 = new ArrayList<Hari>(Arrays.asList(
				day1,day2,day3,day4,day5));
		
		/*
		//Jam time1 = new Jam(LocalTime.of(7, 0), LocalTime.of(7, 50));//awal sama, 100mnt
		Jam time2 = new Jam(LocalTime.of(7, 0),  LocalTime.of(8, 40));//awal sama, 150mnt
		Jam time3 = new Jam(LocalTime.of(7, 0),  LocalTime.of(9, 30));//100 mnt
		Jam time4 = new Jam(LocalTime.of(8, 40),  LocalTime.of(10, 20));//akhir sama, 150 mnt
		//Jam time5 = new Jam(LocalTime.of(10, 20), LocalTime.of(11, 10));//akhir sama, 100 mnt
		Jam time6 = new Jam(LocalTime.of(9, 30), LocalTime.of(12, 0));//awal sama, 100 mnt
		Jam time7 = new Jam(LocalTime.of(10, 20), LocalTime.of(12, 0));//awal sama, 150 mnt
		Jam time8 = new Jam(LocalTime.of(12, 30), LocalTime.of(14, 10));//150 mnt
		Jam time9 = new Jam(LocalTime.of(12, 30), LocalTime.of(15, 0));//akhir sama, 150 mnt
		Jam time10 = new Jam(LocalTime.of(14, 10), LocalTime.of(16, 20));//akhir sama, 100 mnt
		//Jam time11 = new Jam(LocalTime.of(16, 20), LocalTime.of(17, 10));//awal sama, 100 mnt
		Jam time12 = new Jam(LocalTime.of(15, 30), LocalTime.of(18, 0));//awal sama, 150 mnt
		Jam time13 = new Jam(LocalTime.of(16, 20), LocalTime.of(18, 0));
		Jam time14 = new Jam(LocalTime.of(18, 30), LocalTime.of(20, 10));
		Jam time15 = new Jam(LocalTime.of(18, 30), LocalTime.of(21, 0));
		//Jam time13 = new Jam(3,"08.40","09.30","09.30","10.20");//100 mnt
		//Jam time14 = new Jam(8,"14.10","15.00","15.00","16.20");//150 mnt
		jam2 = new ArrayList<Jam>(Arrays.asList(time2,time3,time4,
				time6,time7,time8,
				time9,time10,time12,time13,time14,time15));
		*/
		
		
		
		Jam time2 = new Jam(1,2, LocalTime.of(7, 0), LocalTime.of(7, 0).plusMinutes(100));
		Jam time3 = new Jam(2,3, LocalTime.of(7, 0), LocalTime.of(7, 0).plusMinutes(150));
		Jam time5 = new Jam(3,2, LocalTime.of(8, 40), LocalTime.of(8, 40).plusMinutes(100));
		Jam time7 = new Jam(4,2, LocalTime.of(9, 30), LocalTime.of(9, 30).plusMinutes(100));
		Jam time8 = new Jam(5,3, LocalTime.of(9, 30), LocalTime.of(9, 30).plusMinutes(150));
		Jam time10 = new Jam(6,2, LocalTime.of(13, 0), LocalTime.of(13, 0).plusMinutes(100));
		Jam time11 = new Jam(7,3, LocalTime.of(13, 0), LocalTime.of(13, 0).plusMinutes(150));
		Jam time13 = new Jam(8,2, LocalTime.of(14, 40), LocalTime.of(14, 40).plusMinutes(100));
		Jam time15 = new Jam(9,2, LocalTime.of(15, 30), LocalTime.of(15, 30).plusMinutes(100));
		Jam time16 = new Jam(10,3, LocalTime.of(15, 30), LocalTime.of(15, 30).plusMinutes(150));
		Jam time18 = new Jam(11,2, LocalTime.of(16, 20), LocalTime.of(16, 20).plusMinutes(100));
		Jam time20 = new Jam(12,2, LocalTime.of(18, 30), LocalTime.of(18, 30).plusMinutes(100));
		Jam time21 = new Jam(13, 3, LocalTime.of(18, 30), LocalTime.of(18, 30).plusMinutes(150));
		jam2 = new ArrayList<Jam>(Arrays.asList(time2,time3,time5,time7,time8,
				time10,time11,time13,time15,time16,time18,time20,
				time21));
		
		
		Dosen dsn1 = new Dosen(1,"NISA'UL HAFIDHOH");
		Dosen dsn2 = new Dosen(2,"ROBERTUS HERI SU");
		Dosen dsn3 = new Dosen(3,"Sulis Adyana");
		Dosen dsn4 = new Dosen(4,"T. SUTOJO");
		Dosen dsn5 = new Dosen(5,"YUSTIONO");
		Dosen dsn6 = new Dosen(6,"ZAENAL ARIFIN");
		Dosen dsn7 = new Dosen(7,"ACHMAD WAHID KURNIAWAN");
		Dosen dsn8 = new Dosen(8,"Ana Putri Nastiti");
		Dosen dsn9 = new Dosen(9,"RINDRA YUSIANTO");
		Dosen dsn10 = new Dosen(10,"SARI AYU WULANDARI");
		Dosen dsn11 = new Dosen(11,"WISE HEROWATI");
		Dosen dsn12 = new Dosen(12,"YANI PARTI ASTUTI");
		Dosen dsn13 = new Dosen(13,"DANANG WAHYU UTOMO");
		Dosen dsn14 = new Dosen(14,"DIAN ARIF RACHMAN");
		Dosen dsn15 = new Dosen(15,"VALENTINA WIDYA S");
		Dosen dsn16 = new Dosen(16,"WAHYU AJI EKO PRABOWO");
		Dosen dsn17 = new Dosen(17,"Filmada Ocky Saputra");
		Dosen dsn18 = new Dosen(18,"MARYA ULFA");
		Dosen dsn19 = new Dosen(19,"USMAN SUDIBYO");
		Dosen dsn20 = new Dosen(20,"VINCENT SUHARTONO");
		Dosen dsn21 = new Dosen(21,"WIJANARTO");
		Dosen dsn22 = new Dosen(22,"ACUN KARDIANAWATI");
		Dosen dsn23 = new Dosen(23,"DEDI NURCIPTO");
		Dosen dsn24 = new Dosen(24,"DESI PURWANTI KUSUMANINGRUM");
		//Dosen dsn25 = new Dosen("D25","SETIA ASTUTI");
		Dosen dsn26 = new Dosen(26,"ERLIN DOLPHINA");
		Dosen dsn27 = new Dosen(27,"ERNA ZUNI ASTUTI");
		Dosen dsn28 = new Dosen(28,"IFAN RIZQA");
		Dosen dsn29 = new Dosen(29,"NUR CAHYO HENDRO W");
		Dosen dsn30 = new Dosen(30,"EDI FAISAL");
		Dosen dsn31 = new Dosen(31,"ARIES JEHAN TAMAMY");
		Dosen dsn32 = new Dosen(32,"FAHRI FIRDAUSILLAH");
		Dosen dsn33 = new Dosen(33,"TAUFIQ ANNAS");
		Dosen dsn34 = new Dosen(34,"YUNIARSI RAHAYU");
		Dosen dsn35 = new Dosen(35,"TRISMANTO");
		Dosen dsn36 = new Dosen(36,"ABAS SETIAWAN");
		Dosen dsn37 = new Dosen(37,"B.J RIDWAN HARTONO");
		Dosen dsn38 = new Dosen(38,"EKO HARI RACHMAWANTO");
		Dosen dsn39 = new Dosen(39,"ETIKA KARTIKADARMA");
		Dosen dsn40 = new Dosen(40,"HERWIN SUPRIJONO");
		Dosen dsn41 = new Dosen(41,"Nurul Anisa Sri Winarsih");
		Dosen dsn42 = new Dosen(42,"EDI NOERSASONGKO");
		Dosen dsn43 = new Dosen(43,"M ARY HERYANTO");
		Dosen dsn44 = new Dosen(44,"SUPRIADI RUSTAD");
		Dosen dsn45 = new Dosen(45,"NOVITA KURNIA NINGRUM");
		Dosen dsn46 = new Dosen(46,"DEWI AGUSTINI SANTOSO");
		Dosen dsn47 = new Dosen(47,"SOEISNIWATI LIDWINA ");
		Dosen dsn48 = new Dosen(48,"DIYAMON PRASANDHA");
		Dosen dsn49 = new Dosen(49,"LUKAS YULIANTO");
		Dosen dsn50 = new Dosen(50,"LAILA ISNAINA FATIMA");
		Dosen dsn51 = new Dosen(51,"DEFRI KURNIAWAN");
		Dosen dsn52 = new Dosen(52,"FAUZI ADI RAFRASTARA");
		Dosen dsn53 = new Dosen(53,"M. ARIEF SOELEMAN");
		Dosen dsn54 = new Dosen(54,"SLAMET SUDARYANTO N.");
		Dosen dsn55 = new Dosen(55,"SUPRAYOGI");
		Dosen dsn56 = new Dosen(56,"Ajib Susanto");
		Dosen dsn57 = new Dosen(57,"EGIA ROSI SUBHIYAKTO");
		Dosen dsn58 = new Dosen(58,"HERIBERTUS HIMAWAN");
		Dosen dsn59 = new Dosen(59,"L.BUDI HANDOKO");
		Dosen dsn60 = new Dosen(60,"ADHITYA NUGRAHA");
		Dosen dsn61 = new Dosen(61,"DAURAT SINAGA");
		Dosen dsn62 = new Dosen(62,"Galuh Wilujeng Saraswati");
		Dosen dsn63 = new Dosen(63,"MOHAMAD SIDIQ");
		Dosen dsn64 = new Dosen(64,"PURWANTO");
		Dosen dsn65 = new Dosen(65,"SITI HADIATI NUGRAINI");
		Dosen dsn66 = new Dosen(66,"Ardiawan Bagus Harisa");
		Dosen dsn67 = new Dosen(67,"CAHAYA JATMOKO");
		Dosen dsn68 = new Dosen(68,"SENDI NOVIANTO");
		Dosen dsn69 = new Dosen(69,"ARIPIN");
		Dosen dsn70 = new Dosen(70,"SOLICHUL HUDA");
		Dosen dsn71 = new Dosen(71,"WIBOWO WICAKSONO");
		Dosen dsn72 = new Dosen(72,"Muhammad Syaifur Rohman");
		Dosen dsn73 = new Dosen(73,"NOOR AGENG SETIYANTO");
		Dosen dsn74 = new Dosen(74,"RICARDUS ANGGI PRAMUNENDAR");
		Dosen dsn75 = new Dosen(75,"AHMAD ZAINUL FANANI");
		Dosen dsn76 = new Dosen(76,"AYU PERTIWI");
		Dosen dsn77 = new Dosen(77,"DE ROSAL IGNATIUS MOSES SETIADI");
		Dosen dsn78 = new Dosen(78,"MULJONO");
		Dosen dsn79 = new Dosen(79,"CATUR SUPRIYANTO");
		Dosen dsn80 = new Dosen(80,"CINANTYA PARAMITA");
		Dosen dsn81 = new Dosen(81,"ARIS MARJUNI");
		Dosen dsn82 = new Dosen(82,"EDY MULYANTO");
		Dosen dsn83 = new Dosen(83,"UMI ROSYIDAH");
		Dosen dsn84 = new Dosen(84,"ERWIN YUDI HIDAYAT");
		Dosen dsn85 = new Dosen(85,"FERI AGUSTINA");
		Dosen dsn86 = new Dosen(86,"CHARISMA TUBAGUS SETYOBUDHI");
		Dosen dsn87 = new Dosen(87,"ELKAF RAHMAWAN P.");
		Dosen dsn88 = new Dosen(88,"HERU LESTIAWAN");
		Dosen dsn89 = new Dosen(89,"AHMAD ZAINUL FANANI");
		Dosen dsn90 = new Dosen(90,"ANA WAHYUNI");
		Dosen dsn91 = new Dosen(91,"ABDUSSALAM");
		Dosen dsn92 = new Dosen(92,"RAMA ARIA MEGANTARA");
		Dosen dsn93 = new Dosen(93,"ARDYTHA LUTHFIARTA");
		Dosen dsn94 = new Dosen(94,"CHAERUL UMAM");
		Dosen dsn95 = new Dosen(95,"HERIBERTUS HIMAWAN");
		Dosen dsn96 = new Dosen(96,"AMIQ FAHMI");
		Dosen dsn97 = new Dosen(97,"CHRISTY ATIKA SARI");
		Dosen dsn98 = new Dosen(98,"FIKRI BUDIMAN");
		Dosen dsn99 = new Dosen(99,"JUNTA ZENIARJA");
		Dosen dsn100 = new Dosen(100,"GURUH FAJAR SHIDIK");
		Dosen dsn101 = new Dosen(101,"HERU AGUS SANTOSO");
		Dosen dsn102 = new Dosen(102,"ADI PRIHANDONO");
		Dosen dsn103 = new Dosen(103,"HANNY HARYANTO");
		Dosen dsn104 = new Dosen(104,"ABU SALAM");
		Dosen dsn105 = new Dosen(105,"ANDIK SETYONO");
		Dosen dsn106 = new Dosen(106,"PULUNG NURTANTIO ANDONO");
		Dosen dsn107 = new Dosen(107,"KHAFIIZH HASTUTI");
		Dosen dsn108 = new Dosen(108,"RURI SUKO BASUKI");
		Dosen dsn109 = new Dosen(109,"Deny Salvana Ervan");
		Dosen dsn200 = new Dosen(200,"SRI WINARNO");
		Dosen dsn201 = new Dosen(201,"BUDI HARJO");
		Dosen dsn202 = new Dosen(202,"PRAJANTO WAHYU ADI");
		Dosen dsn203 = new Dosen(203,"Asisten Laboratorium");
		dosen2 = new ArrayList<Dosen>(Arrays.asList(dsn1,dsn2,dsn3,dsn4,dsn5,dsn6,dsn7,dsn8,dsn9,dsn10,
				dsn11,dsn12,dsn13,dsn14,dsn15,dsn16,dsn17,dsn18,dsn19,dsn20,
				dsn21,dsn22,dsn23,dsn24,dsn26,dsn27,dsn28,dsn29,dsn30,
				dsn31,dsn32,dsn33,dsn34,dsn35,dsn36,dsn37,dsn38,dsn39,dsn40,
				dsn41,dsn42,dsn43,dsn44,dsn45,dsn46,dsn47,dsn48,dsn49,dsn50,
				dsn51,dsn52,dsn53,dsn54,dsn55,dsn56,dsn57,dsn58,dsn59,dsn60,
				dsn61,dsn62,dsn63,dsn64,dsn65,dsn66,dsn67,dsn68,dsn69,dsn70,
				dsn71,dsn72,dsn73,dsn74,dsn75,dsn76,dsn77,dsn78,dsn79,dsn80,
				dsn81,dsn82,dsn83,dsn84,dsn85,dsn86,dsn87,dsn88,dsn89,dsn90,
				dsn91,dsn92,dsn93,dsn94,dsn95,dsn96,dsn97,dsn98,dsn99,dsn100,
				dsn101,dsn102,dsn103,dsn104,dsn105,dsn106,dsn107,dsn108,dsn109,dsn200,
				dsn201,dsn202,dsn203));
		
		
		Matakuliah makul1 = new Matakuliah(1,"A11.54201","KALKULUS 2", new ArrayList<Dosen>(Arrays.asList(dsn2,dsn7,dsn12,dsn19,dsn27,dsn34)),41,false,2, 2);
		Matakuliah makul2 = new Matakuliah(2,"A11.54202","FISIKA 2", new ArrayList<Dosen>(Arrays.asList(dsn4,dsn11,dsn14,dsn17,dsn29,dsn16,dsn44)),40,false,2,2);
		Matakuliah makul3 = new Matakuliah(3,"A11.54206","ALGORITMA DAN PEMROGRAMAN", new ArrayList<Dosen>(Arrays.asList(dsn1,dsn12,dsn21,dsn24,dsn28,dsn32,dsn36,dsn38,dsn41)),40,false,2, 2);
		Matakuliah makul4 = new Matakuliah(4,"A11.54207","RANGKAIAN LOGIKA DIGITAL", new ArrayList<Dosen>(Arrays.asList(dsn6,dsn10,dsn4,dsn16,dsn20,dsn23,dsn31,dsn17,dsn40,dsn43)),41,false,2,2);
		Matakuliah makul5 = new Matakuliah(5,"A11.54401","OTOMATA & TEORI BAHASA", new ArrayList<Dosen>(Arrays.asList(dsn52,dsn27,dsn62,dsn78,dsn80,dsn84)),42,false,4, 3);
		Matakuliah makul6 = new Matakuliah(6,"A11.54402","PEMROGRAMAN BERORIENTASI OBJEK", new ArrayList<Dosen>(Arrays.asList(dsn41,dsn36,dsn66,dsn56,dsn72,dsn77,dsn86,dsn21,dsn61)),40,false,4,2);
		Matakuliah makul7 = new Matakuliah(7,"A11.54404","BASIS DATA", new ArrayList<Dosen>(Arrays.asList(dsn54,dsn95,dsn65,dsn69,dsn46,dsn75,dsn82,dsn85,dsn81,dsn52,dsn67)),46,false,4, 3);
		Matakuliah makul8 = new Matakuliah(8,"A11.54405","REKAYASA PERANGKAT LUNAK", new ArrayList<Dosen>(Arrays.asList(dsn51,dsn57,dsn63,dsn39,dsn45,dsn83,dsn76,dsn88,dsn54)),42,false,4, 3);
		Matakuliah makul9 = new Matakuliah(9,"A11.54406","LOGIKA INFORMATIKA", new ArrayList<Dosen>(Arrays.asList(dsn12,dsn62,dsn64,dsn74,dsn79,dsn89,dsn19)),44,false,4, 3);
		Matakuliah makul10 = new Matakuliah(10,"A11.54408","PEMROGRAMAN WEB LANJUT", new ArrayList<Dosen>(Arrays.asList(dsn55,dsn56,dsn61,dsn67,dsn72,dsn73,dsn41)),40,false,4, 2);
		Matakuliah makul11 = new Matakuliah(11,"A11.54507","SISTEM OPERASI", new ArrayList<Dosen>(Arrays.asList(dsn53,dsn59,dsn60,dsn68,dsn30,dsn70,dsn87,dsn71,dsn91,dsn92)),42,false,4, 3);
		Matakuliah makul12 = new Matakuliah(12,"A11.54603","INTERAKSI MANUSIA DAN KOMPUTER", new ArrayList<Dosen>(Arrays.asList(dsn200,dsn73,dsn96,dsn83,dsn102,dsn28,dsn45)),41,false,6,3);
		Matakuliah makul13 = new Matakuliah(13,"A11.54605","KECERDASAN BUATAN", new ArrayList<Dosen>(Arrays.asList(dsn84,dsn201,dsn98,dsn78,dsn82,dsn103,dsn68)),42,false,6, 3);
		Matakuliah makul14 = new Matakuliah(14,"A11.54606","KRIPTOGRAFI", new ArrayList<Dosen>(Arrays.asList(dsn70,dsn202,dsn38,dsn97,dsn100,dsn60,dsn53)),40,false,6, 3);
		Matakuliah makul15 = new Matakuliah(15,"A11.54607","METODOLOGI PENELITIAN", new ArrayList<Dosen>(Arrays.asList(dsn106,dsn107,dsn108,dsn69,dsn101,dsn93,dsn103,dsn77)),44,false,6,2);
		Matakuliah makul16 = new Matakuliah(16,"A11.54609","SISTEM TERDISTRIBUSI", new ArrayList<Dosen>(Arrays.asList(dsn94,dsn95,dsn88,dsn71,dsn30,dsn59,dsn92)),45,false,6, 3);
		Matakuliah makul17 = new Matakuliah(17,"A11.54806","DATA MINING", new ArrayList<Dosen>(Arrays.asList(dsn79,dsn93,dsn99,dsn55,dsn101,dsn201,dsn104)),40,false,6, 3);
		Matakuliah makul18 = new Matakuliah(18,"A11.54814","OBJECT ORIENTED ANALYSIS AND DESIGN", new ArrayList<Dosen>(Arrays.asList(dsn51,dsn57,dsn76,dsn78,dsn12)),43,false,8, 3);
		Matakuliah makul19 = new Matakuliah(19,"A11.54822","PROYEK PERANGKAT LUNAK", new ArrayList<Dosen>(Arrays.asList(dsn1,dsn28,dsn85,dsn57,dsn66,dsn109,dsn39)),42,false,6, 2);
		Matakuliah makul20 = new Matakuliah(20,"A11.54829","SOFTWARE REQUIREMENT ENGINEERING", new ArrayList<Dosen>(Arrays.asList(dsn39,dsn57)),40,false,8, 3);
		Matakuliah makul21 = new Matakuliah(21,"A11.54834","WIRELESS AND MOBILE COMPUTING", new ArrayList<Dosen>(Arrays.asList(dsn87,dsn91,dsn92,dsn105)),40,false,8, 3);
		Matakuliah makul22 = new Matakuliah(22,"A11.54836","PENGOLAHAN CITRA DIGITAL LANJUT", new ArrayList<Dosen>(Arrays.asList(dsn74,dsn97,dsn202)),45,false,8, 3);
		Matakuliah makul23 = new Matakuliah(23,"A11.54838","RISET OPERASI", new ArrayList<Dosen>(Arrays.asList(dsn81,dsn90)),42,false,8, 3);
		Matakuliah makul24 = new Matakuliah(24,"N201701","BAHASA INDONESIA", new ArrayList<Dosen>(Arrays.asList(dsn3,dsn8,dsn18,dsn26,dsn35,dsn47,dsn48)),41,false,2, 2);
		Matakuliah makul25 = new Matakuliah(25,"U201701","DASAR KEWIRAUSAHAAN", new ArrayList<Dosen>(Arrays.asList(dsn5,dsn9,dsn15,dsn22,dsn30,dsn33,dsn37,dsn39,dsn42,dsn45,dsn46,dsn49,dsn50)),42,false,3, 2);
		Matakuliah makul26 = new Matakuliah(26,"A11.54206","ALGORITMA DAN PEMROGRAMAN", new ArrayList<Dosen>(Arrays.asList(dsn203)),40,true,2, 2);
		Matakuliah makul27 = new Matakuliah(27,"A11.54402","PEMROGRAMAN BERORIENTASI OBJEK", new ArrayList<Dosen>(Arrays.asList(dsn203)),40,true,4, 2);
		matakuliah2 = new ArrayList<Matakuliah>(Arrays.asList(makul1,makul2,makul3,makul4,makul5,makul6,makul7,makul8,makul9,makul10,
				makul11,makul12,makul13,makul14,makul15,makul16,makul17,makul18,makul19,makul20,
				makul21,makul22,makul23,makul24,makul25,makul26,makul27));
		
		

		Kelompok klp1 = new Kelompok(1,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul1)), 40);
		Kelompok klp2 = new Kelompok(2,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul2)), 40);
		Kelompok klp3 = new Kelompok(3,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul3)), 40);
		Kelompok klp4 = new Kelompok(4,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul4)), 40);
		Kelompok klp5 = new Kelompok(5,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul24)), 40);
		Kelompok klp6 = new Kelompok(6,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul25)), 40);
		Kelompok klp7 = new Kelompok(7,"A11.4201", new ArrayList<Matakuliah>(Arrays.asList(makul26)), 40);
		
		Kelompok klp8 = new Kelompok(8,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul1)),39);
		Kelompok klp9 = new Kelompok(9,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul2)),39);
		Kelompok klp10 = new Kelompok(10,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul3)),39);
		Kelompok klp11 = new Kelompok(11,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul4)),39);
		Kelompok klp12 = new Kelompok(12,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul24)),39);
		Kelompok klp13 = new Kelompok(13,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul25)),40);
		Kelompok klp14 = new Kelompok(14,"A11.4202", new ArrayList<Matakuliah>(Arrays.asList(makul26)),39);
		
		Kelompok klp15 = new Kelompok(15,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul1)),38);
		Kelompok klp16 = new Kelompok(16,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul2)),40);
		Kelompok klp17 = new Kelompok(17,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul3)),39);
		Kelompok klp18 = new Kelompok(18,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul4)),40);
		Kelompok klp19 = new Kelompok(19,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul24)),39);
		Kelompok klp20 = new Kelompok(20,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul25)),38);
		Kelompok klp21 = new Kelompok(21,"A11.4203", new ArrayList<Matakuliah>(Arrays.asList(makul26)),39);
		
		Kelompok klp22 = new Kelompok(22,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul1)),41);
		Kelompok klp23 = new Kelompok(23,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul2)),40);
		Kelompok klp24 = new Kelompok(24,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul3)),39);
		Kelompok klp25 = new Kelompok(25,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul4)),41);
		Kelompok klp26 = new Kelompok(26,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul24)),41);
		Kelompok klp27 = new Kelompok(27,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul25)),39);
		Kelompok klp28 = new Kelompok(28,"A11.4204", new ArrayList<Matakuliah>(Arrays.asList(makul26)),39);
		
		Kelompok klp29 = new Kelompok(29,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul1)), 38);
		Kelompok klp30 = new Kelompok(30,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul2)), 39);
		Kelompok klp31 = new Kelompok(31,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul3)), 39);
		Kelompok klp32 = new Kelompok(32,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul4)), 39);
		Kelompok klp33 = new Kelompok(33,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul24)), 39);
		Kelompok klp34 = new Kelompok(34,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul25)), 39);
		Kelompok klp35 = new Kelompok(35,"A11.4205", new ArrayList<Matakuliah>(Arrays.asList(makul26)), 39);
		
		Kelompok klp36 = new Kelompok(36,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul1)),36);
		Kelompok klp37 = new Kelompok(37,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul2)),37);
		Kelompok klp38 = new Kelompok(38,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul3)),37);
		Kelompok klp39 = new Kelompok(39,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul4)),37);
		Kelompok klp40 = new Kelompok(40,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp41 = new Kelompok(41,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul25)),36);
		Kelompok klp42 = new Kelompok(42,"A11.4206", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);
		
		Kelompok klp43 = new Kelompok(43,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul1)),39);
		Kelompok klp44 = new Kelompok(44,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul2)),40);
		Kelompok klp45 = new Kelompok(45,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul3)),40);
		Kelompok klp46 = new Kelompok(46,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul4)),40);
		Kelompok klp47 = new Kelompok(47,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul24)),41);
		Kelompok klp48 = new Kelompok(48,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul25)),39);
		Kelompok klp49 = new Kelompok(49,"A11.4207", new ArrayList<Matakuliah>(Arrays.asList(makul26)),40);
		
		Kelompok klp50 = new Kelompok(50,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul1)),37);
		Kelompok klp51 = new Kelompok(51,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul2)),38);
		Kelompok klp52 = new Kelompok(52,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul3)),36);
		Kelompok klp53 = new Kelompok(53,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul4)),37);
		Kelompok klp54 = new Kelompok(54,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul25)),37);
		Kelompok klp55 = new Kelompok(55,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);
		Kelompok klp56 = new Kelompok(56,"A11.4208", new ArrayList<Matakuliah>(Arrays.asList(makul27)),36);
		
		Kelompok klp57 = new Kelompok(57,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul1)),38);
		Kelompok klp58 = new Kelompok(58,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul2)),38);
		Kelompok klp59 = new Kelompok(59,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul3)),37);
		Kelompok klp60 = new Kelompok(60,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul4)),38);
		Kelompok klp61 = new Kelompok(61,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul24)),29);
		Kelompok klp62 = new Kelompok(62,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul25)),37);
		Kelompok klp63 = new Kelompok(63,"A11.4209", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);
		
		Kelompok klp64 = new Kelompok(64,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul1)),31);
		Kelompok klp65 = new Kelompok(65,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul2)),31);
		Kelompok klp66 = new Kelompok(66,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul3)),31);
		Kelompok klp67 = new Kelompok(67,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul4)),31);
		Kelompok klp68 = new Kelompok(68,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul24)),31);
		Kelompok klp69 = new Kelompok(69,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul25)),31);
		Kelompok klp70 = new Kelompok(70,"A11.4210", new ArrayList<Matakuliah>(Arrays.asList(makul26)),31);

		
		Kelompok klp71 = new Kelompok(71,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul1)),31);
		Kelompok klp72 = new Kelompok(72,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul2)),31);
		Kelompok klp73 = new Kelompok(73,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul3)),31);
		Kelompok klp74 = new Kelompok(74,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul4)),31);
		Kelompok klp75 = new Kelompok(75,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul24)),31);
		Kelompok klp76 = new Kelompok(76,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul25)),30);
		Kelompok klp77 = new Kelompok(77,"A11.4211", new ArrayList<Matakuliah>(Arrays.asList(makul26)),31);

		Kelompok klp78 = new Kelompok(78,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul1)),34);
		Kelompok klp79 = new Kelompok(79,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul2)),34);
		Kelompok klp80 = new Kelompok(80,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul3)),34);
		Kelompok klp81 = new Kelompok(81,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul4)),34);
		Kelompok klp82 = new Kelompok(82,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul24)),33);
		Kelompok klp83 = new Kelompok(83,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul25)),33);
		Kelompok klp84 = new Kelompok(84,"A11.4212", new ArrayList<Matakuliah>(Arrays.asList(makul26)),34);

		Kelompok klp85 = new Kelompok(85,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul1)),37);
		Kelompok klp86 = new Kelompok(86,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul2)),35);
		Kelompok klp87 = new Kelompok(87,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul3)),36);
		Kelompok klp88 = new Kelompok(88,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul4)),36);
		Kelompok klp89 = new Kelompok(89,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp90 = new Kelompok(90,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul25)),36);
		Kelompok klp91 = new Kelompok(91,"A11.4213", new ArrayList<Matakuliah>(Arrays.asList(makul26)),36);

		Kelompok klp92 = new Kelompok(92,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul1)),37);
		Kelompok klp93 = new Kelompok(93,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul2)),37);
		Kelompok klp94 = new Kelompok(94,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul3)),37);
		Kelompok klp95 = new Kelompok(95,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul4)),37);
		Kelompok klp96 = new Kelompok(96,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp97 = new Kelompok(97,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul25)),37);
		Kelompok klp98 = new Kelompok(98,"A11.4214", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);

		Kelompok klp99 = new Kelompok(99,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul1)),36);
		Kelompok klp100 = new Kelompok(100,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul2)),36);
		Kelompok klp101 = new Kelompok(101,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul3)),38);
		Kelompok klp102 = new Kelompok(102,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul4)),38);
		Kelompok klp103 = new Kelompok(103,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp104 = new Kelompok(104,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul25)),37);
		Kelompok klp1041 = new Kelompok(105,"A11.4215", new ArrayList<Matakuliah>(Arrays.asList(makul26)),38);

		Kelompok klp105 = new Kelompok(106,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul1)),39);
		Kelompok klp106 = new Kelompok(107,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul2)),39);
		Kelompok klp107 = new Kelompok(108,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul3)),39);
		Kelompok klp108 = new Kelompok(109,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul4)),38);
		Kelompok klp109 = new Kelompok(110,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp110 = new Kelompok(111,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul25)),39);
		Kelompok klp111 = new Kelompok(112,"A11.4216", new ArrayList<Matakuliah>(Arrays.asList(makul26)),39);

		Kelompok klp112 = new Kelompok(113,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul1)),37);
		Kelompok klp113 = new Kelompok(114,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul2)),35);
		Kelompok klp114 = new Kelompok(115,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul3)),37);
		Kelompok klp115 = new Kelompok(116,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul4)),39);
		Kelompok klp116 = new Kelompok(117,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp117 = new Kelompok(118,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul25)),39);
		Kelompok klp118 = new Kelompok(119,"A11.4217", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);

		Kelompok klp119 = new Kelompok(120,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul1)),35);
		Kelompok klp120 = new Kelompok(121,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul2)),33);
		Kelompok klp121 = new Kelompok(122,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul3)),33);
		Kelompok klp122 = new Kelompok(123,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul4)),40);
		Kelompok klp123 = new Kelompok(124,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul24)),37);
		Kelompok klp124 = new Kelompok(125,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul25)),35);
		Kelompok klp125 = new Kelompok(126,"A11.4218", new ArrayList<Matakuliah>(Arrays.asList(makul26)),33);

		Kelompok klp126 = new Kelompok(127,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul1)),31);
		Kelompok klp127 = new Kelompok(128,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul2)),35);
		Kelompok klp128 = new Kelompok(129,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul3)),37);
		Kelompok klp129 = new Kelompok(130,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul4)),34);
		Kelompok klp130 = new Kelompok(131,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul24)),30);
		Kelompok klp131 = new Kelompok(132,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul25)),32);
		Kelompok klp132 = new Kelompok(133,"A11.4219", new ArrayList<Matakuliah>(Arrays.asList(makul26)),37);

		Kelompok klp133 = new Kelompok(134,"A11.4220", new ArrayList<Matakuliah>(Arrays.asList(makul24)),14);
		Kelompok klp134 = new Kelompok(135,"A11.4220", new ArrayList<Matakuliah>(Arrays.asList(makul25)),24);
		
		Kelompok klp135 = new Kelompok(136,"A11.4221", new ArrayList<Matakuliah>(Arrays.asList(makul1)),34);
		Kelompok klp136 = new Kelompok(137,"A11.4221", new ArrayList<Matakuliah>(Arrays.asList(makul4)),35);
		Kelompok klp137 = new Kelompok(138,"A11.4221", new ArrayList<Matakuliah>(Arrays.asList(makul24)),24);

		Kelompok klp138 = new Kelompok(139,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp139 = new Kelompok(140,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp140 = new Kelompok(141,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp141 = new Kelompok(142,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp142 = new Kelompok(143,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp143 = new Kelompok(144,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp144 = new Kelompok(145,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp145 = new Kelompok(146,"A11.4401", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);		
		
		Kelompok klp146 = new Kelompok(147,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp147 = new Kelompok(148,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp148 = new Kelompok(149,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp149 = new Kelompok(150,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp150 = new Kelompok(151,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp151 = new Kelompok(152,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp152 = new Kelompok(153,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp153 = new Kelompok(154,"A11.4401U", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp154 = new Kelompok(155,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp155 = new Kelompok(156,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp156 = new Kelompok(157,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp157 = new Kelompok(158,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp158 = new Kelompok(159,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp159 = new Kelompok(160,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp160 = new Kelompok(161,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp161 = new Kelompok(162,"A11.4402", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp162 = new Kelompok(163,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp163 = new Kelompok(164,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp164= new Kelompok(165,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp165= new Kelompok(166,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp166 = new Kelompok(167,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp167= new Kelompok(168,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp168 = new Kelompok(169,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp169= new Kelompok(170,"A11.4403", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp170 = new Kelompok(171,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp171= new Kelompok(172,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp172= new Kelompok(173,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp173= new Kelompok(174,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp174= new Kelompok(175,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp175= new Kelompok(176,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp176 = new Kelompok(177,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp177 = new Kelompok(178,"A11.4404", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp178 = new Kelompok(179,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp179= new Kelompok(180,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp180 = new Kelompok(181,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp181= new Kelompok(182,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp182= new Kelompok(183,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp183= new Kelompok(184,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp184= new Kelompok(185,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp185= new Kelompok(186,"A11.4405", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp186= new Kelompok(187,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp187= new Kelompok(188,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp188= new Kelompok(189,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp189= new Kelompok(190,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp190= new Kelompok(191,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp191= new Kelompok(192,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp192= new Kelompok(193,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp193= new Kelompok(194,"A11.4406", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp194= new Kelompok(195,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp195= new Kelompok(196,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp196= new Kelompok(197,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp197= new Kelompok(198,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp198 = new Kelompok(199,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp199= new Kelompok(200,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp200= new Kelompok(201,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp201= new Kelompok(202,"A11.4407", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp202= new Kelompok(203,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp203= new Kelompok(204,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp204= new Kelompok(205,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp205= new Kelompok(206,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp206= new Kelompok(207,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp207= new Kelompok(208,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp208= new Kelompok(209,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp209= new Kelompok(210,"A11.4408", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp210 = new Kelompok(211,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp211 = new Kelompok(212,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp212 = new Kelompok(213,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp213 = new Kelompok(214,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp214 = new Kelompok(215,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp215 = new Kelompok(216,"A11.4409", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp216 = new Kelompok(217,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp217= new Kelompok(218,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp218= new Kelompok(219,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp219= new Kelompok(220,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp220= new Kelompok(221,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp221= new Kelompok(222,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp222= new Kelompok(223,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp223= new Kelompok(224,"A11.4410", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp224 = new Kelompok(225,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp225 = new Kelompok(226,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp226 = new Kelompok(227,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp227 = new Kelompok(228,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp228 = new Kelompok(229,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp229 = new Kelompok(230,"A11.4411", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp230 = new Kelompok(231,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp231 = new Kelompok(232,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp232 = new Kelompok(233,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp233 = new Kelompok(234,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp234 = new Kelompok(235,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp235 = new Kelompok(236,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp236 = new Kelompok(237,"A11.4412", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp237 = new Kelompok(238,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp238 = new Kelompok(239,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp239 = new Kelompok(240,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp240 = new Kelompok(241,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp241 = new Kelompok(242,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp242 = new Kelompok(243,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp243 = new Kelompok(244,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp244 = new Kelompok(245,"A11.4413", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		
		Kelompok klp245 = new Kelompok(246,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp246= new Kelompok(247,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp247= new Kelompok(248,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp248= new Kelompok(249,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp249 = new Kelompok(250,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp250= new Kelompok(251,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp251= new Kelompok(252,"A11.4414", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		
		Kelompok klp252 = new Kelompok(253,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp253 = new Kelompok(254,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp254 = new Kelompok(255,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp255 = new Kelompok(256,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp256 = new Kelompok(257,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp257 = new Kelompok(258,"A11.4415", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp258 = new Kelompok(259,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp259 = new Kelompok(260,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp260 = new Kelompok(261,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp261 = new Kelompok(262,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp262 = new Kelompok(263,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp263 = new Kelompok(264,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp264 = new Kelompok(265,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp265 = new Kelompok(266,"A11.4416", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp266 = new Kelompok(267,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp267 = new Kelompok(268,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp268 = new Kelompok(269,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp269 = new Kelompok(270,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp270 = new Kelompok(271,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp271 = new Kelompok(272,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp272 = new Kelompok(273,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp273 = new Kelompok(274,"A11.4417", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp274 = new Kelompok(275,"A11.4418", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp275 = new Kelompok(276,"A11.4418", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp276 = new Kelompok(277,"A11.4418", new ArrayList<Matakuliah>(Arrays.asList(makul8)),40);
		Kelompok klp277 = new Kelompok(278,"A11.4418", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp278 = new Kelompok(279,"A11.4418", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		
		Kelompok klp279 = new Kelompok(280,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp280 = new Kelompok(281,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul6)),40);
		Kelompok klp281 = new Kelompok(282,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul7)),40);
		Kelompok klp282 = new Kelompok(283,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp283 = new Kelompok(284,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul10)),35);
		Kelompok klp284 = new Kelompok(285,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);
		Kelompok klp285 = new Kelompok(286,"A11.4419", new ArrayList<Matakuliah>(Arrays.asList(makul27)),40);
		
		Kelompok klp286 = new Kelompok(287,"A11.4420", new ArrayList<Matakuliah>(Arrays.asList(makul5)),41);
		Kelompok klp287 = new Kelompok(288,"A11.4420", new ArrayList<Matakuliah>(Arrays.asList(makul9)),40);
		Kelompok klp288 = new Kelompok(289,"A11.4420", new ArrayList<Matakuliah>(Arrays.asList(makul11)),36);		
		
		
		Kelompok klp289 = new Kelompok(290,"A11.4601", new ArrayList<Matakuliah>(Arrays.asList(makul12)),24);
		Kelompok klp290 = new Kelompok(291,"A11.4601", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp291 = new Kelompok(292,"A11.4601", new ArrayList<Matakuliah>(Arrays.asList(makul14)),35);
		Kelompok klp292= new Kelompok(293,"A11.4601", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp293= new Kelompok(294,"A11.4601", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp294 = new Kelompok(295,"A11.4601U", new ArrayList<Matakuliah>(Arrays.asList(makul12)),36);
		
		Kelompok klp295 = new Kelompok(296,"A11.4602", new ArrayList<Matakuliah>(Arrays.asList(makul12)),41);
		Kelompok klp296 = new Kelompok(297,"A11.4602", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp297 = new Kelompok(298,"A11.4602", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp298= new Kelompok(299,"A11.4602", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp299= new Kelompok(300,"A11.4602", new ArrayList<Matakuliah>(Arrays.asList(makul17)),28);
		
		Kelompok klp300 = new Kelompok(301,"A11.4603", new ArrayList<Matakuliah>(Arrays.asList(makul12)),39);
		Kelompok klp301 = new Kelompok(302,"A11.4603", new ArrayList<Matakuliah>(Arrays.asList(makul13)),41);
		Kelompok klp302 = new Kelompok(303,"A11.4603", new ArrayList<Matakuliah>(Arrays.asList(makul14)),31);
		Kelompok klp303= new Kelompok(304,"A11.4603", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp304 = new Kelompok(305,"A11.4604", new ArrayList<Matakuliah>(Arrays.asList(makul12)),41);
		Kelompok klp305 = new Kelompok(306,"A11.4604", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp306 = new Kelompok(307,"A11.4604", new ArrayList<Matakuliah>(Arrays.asList(makul14)),39);
		Kelompok klp307 =new Kelompok(308,"A11.4604", new ArrayList<Matakuliah>(Arrays.asList(makul16)),40);
		Kelompok klp308= new Kelompok(309,"A11.4604", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp309 = new Kelompok(310,"A11.4605", new ArrayList<Matakuliah>(Arrays.asList(makul12)),33);
		Kelompok klp310 = new Kelompok(311,"A11.4605", new ArrayList<Matakuliah>(Arrays.asList(makul13)),39);
		Kelompok klp311 = new Kelompok(312,"A11.4605", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp312= new Kelompok(313,"A11.4605", new ArrayList<Matakuliah>(Arrays.asList(makul16)),29);
		Kelompok klp313= new Kelompok(314,"A11.4605", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp314 = new Kelompok(315,"A11.4606", new ArrayList<Matakuliah>(Arrays.asList(makul12)),30);
		Kelompok klp315 = new Kelompok(316,"A11.4606", new ArrayList<Matakuliah>(Arrays.asList(makul13)),41);
		Kelompok klp316 = new Kelompok(317,"A11.4606", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp317= new Kelompok(318,"A11.4606", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp318= new Kelompok(319,"A11.4606", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp319 = new Kelompok(320,"A11.4607", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp320 = new Kelompok(321,"A11.4607", new ArrayList<Matakuliah>(Arrays.asList(makul13)),33);
		Kelompok klp321 = new Kelompok(322,"A11.4607", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp323= new Kelompok(323,"A11.4607", new ArrayList<Matakuliah>(Arrays.asList(makul16)),40);
		Kelompok klp324= new Kelompok(324,"A11.4607", new ArrayList<Matakuliah>(Arrays.asList(makul17)),39);
		
		Kelompok klp325 = new Kelompok(325,"A11.4608", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp326 = new Kelompok(326,"A11.4608", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp327= new Kelompok(327,"A11.4608", new ArrayList<Matakuliah>(Arrays.asList(makul16)),40);
		
		
		Kelompok klp328 = new Kelompok(328,"A11.4609", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp329 = new Kelompok(329,"A11.4609", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp330 = new Kelompok(330,"A11.4609", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp331= new Kelompok(331,"A11.4609", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp332= new Kelompok(332,"A11.4609", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp333 = new Kelompok(333,"A11.4610", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp334 = new Kelompok(334,"A11.4610", new ArrayList<Matakuliah>(Arrays.asList(makul13)),41);
		Kelompok klp335 = new Kelompok(335,"A11.4610", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp336= new Kelompok(336,"A11.4610", new ArrayList<Matakuliah>(Arrays.asList(makul16)),30);
		Kelompok klp337= new Kelompok(337,"A11.4610", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp338 = new Kelompok(338,"A11.4611", new ArrayList<Matakuliah>(Arrays.asList(makul12)),41);
		Kelompok klp339 = new Kelompok(339,"A11.4611", new ArrayList<Matakuliah>(Arrays.asList(makul13)),39);
		Kelompok klp340 = new Kelompok(340,"A11.4611", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp341= new Kelompok(341,"A11.4611", new ArrayList<Matakuliah>(Arrays.asList(makul16)),18);
		Kelompok klp342= new Kelompok(342,"A11.4611", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp344 = new Kelompok(343,"A11.4612", new ArrayList<Matakuliah>(Arrays.asList(makul13)),41);
		Kelompok klp345 = new Kelompok(344,"A11.4612", new ArrayList<Matakuliah>(Arrays.asList(makul14)),39);
		Kelompok klp346= new Kelompok(345,"A11.4612", new ArrayList<Matakuliah>(Arrays.asList(makul16)),40);
		Kelompok klp347= new Kelompok(346,"A11.4612", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp348 = new Kelompok(347,"A11.4613", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp349 = new Kelompok(348,"A11.4613", new ArrayList<Matakuliah>(Arrays.asList(makul13)),12);
		Kelompok klp350 = new Kelompok(349,"A11.4613", new ArrayList<Matakuliah>(Arrays.asList(makul14)),11);
		
		Kelompok klp351 = new Kelompok(350,"A11.4614", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp352 = new Kelompok(351,"A11.4614", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp353 = new Kelompok(352,"A11.4614", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp354= new Kelompok(353,"A11.4614", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp355= new Kelompok(354,"A11.4614", new ArrayList<Matakuliah>(Arrays.asList(makul17)),18);
		
		Kelompok klp356 = new Kelompok(355,"A11.4615", new ArrayList<Matakuliah>(Arrays.asList(makul12)),40);
		Kelompok klp357 = new Kelompok(356,"A11.4615", new ArrayList<Matakuliah>(Arrays.asList(makul13)),35);
		Kelompok klp358 = new Kelompok(357,"A11.4615", new ArrayList<Matakuliah>(Arrays.asList(makul14)),30);
		Kelompok klp359= new Kelompok(358,"A11.46015", new ArrayList<Matakuliah>(Arrays.asList(makul16)),45);
		Kelompok klp360= new Kelompok(359,"A11.4615", new ArrayList<Matakuliah>(Arrays.asList(makul17)),42);
		
		Kelompok klp361 = new Kelompok(360,"A11.4616", new ArrayList<Matakuliah>(Arrays.asList(makul12)),27);
		Kelompok klp362 = new Kelompok(361,"A11.4616", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp363 = new Kelompok(362,"A11.4616", new ArrayList<Matakuliah>(Arrays.asList(makul14)),39);
		Kelompok klp364= new Kelompok(363,"A11.4616", new ArrayList<Matakuliah>(Arrays.asList(makul16)),43);
		Kelompok klp365= new Kelompok(364,"A11.4616", new ArrayList<Matakuliah>(Arrays.asList(makul17)),30);


		Kelompok klp366 = new Kelompok(365,"A11.4617", new ArrayList<Matakuliah>(Arrays.asList(makul12)),25);
		Kelompok klp367 = new Kelompok(366,"A11.4617", new ArrayList<Matakuliah>(Arrays.asList(makul13)),42);
		Kelompok klp368 = new Kelompok(367,"A11.4617", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp369= new Kelompok(368,"A11.4617", new ArrayList<Matakuliah>(Arrays.asList(makul16)),43);
		Kelompok klp370= new Kelompok(369,"A11.4617", new ArrayList<Matakuliah>(Arrays.asList(makul17)),27);
		
		Kelompok klp371 = new Kelompok(370,"A11.4618", new ArrayList<Matakuliah>(Arrays.asList(makul12)),35);
		Kelompok klp372 = new Kelompok(371,"A11.4618", new ArrayList<Matakuliah>(Arrays.asList(makul13)),41);
		Kelompok klp373 = new Kelompok(372,"A11.4618", new ArrayList<Matakuliah>(Arrays.asList(makul14)),40);
		Kelompok klp374= new Kelompok(373,"A11.4618", new ArrayList<Matakuliah>(Arrays.asList(makul16)),45);
		Kelompok klp375= new Kelompok(374,"A11.4618", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp376 = new Kelompok(375,"A11.4619", new ArrayList<Matakuliah>(Arrays.asList(makul13)),26);
		Kelompok klp377 = new Kelompok(376,"A11.4619", new ArrayList<Matakuliah>(Arrays.asList(makul14)),33);
		Kelompok klp378= new Kelompok(377,"A11.4619", new ArrayList<Matakuliah>(Arrays.asList(makul16)),45);
		Kelompok klp379= new Kelompok(378,"A11.4619", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp380 = new Kelompok(379,"A11.4620", new ArrayList<Matakuliah>(Arrays.asList(makul12)),24);
		Kelompok klp381 = new Kelompok(380,"A11.4620", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp382 = new Kelompok(381,"A11.4620", new ArrayList<Matakuliah>(Arrays.asList(makul14)),35);
		Kelompok klp383= new Kelompok(382,"A11.4620", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp384= new Kelompok(383,"A11.4620", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp385 = new Kelompok(384,"A11.4621", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp386 = new Kelompok(385,"A11.4621", new ArrayList<Matakuliah>(Arrays.asList(makul14)),35);
		Kelompok klp387= new Kelompok(386,"A11.4621", new ArrayList<Matakuliah>(Arrays.asList(makul16)),39);
		Kelompok klp388= new Kelompok(387,"A11.4621", new ArrayList<Matakuliah>(Arrays.asList(makul17)),40);
		
		Kelompok klp389 = new Kelompok(388,"A11.4622", new ArrayList<Matakuliah>(Arrays.asList(makul12)),24);
		Kelompok klp390 = new Kelompok(389,"A11.4622", new ArrayList<Matakuliah>(Arrays.asList(makul13)),40);
		Kelompok klp391 = new Kelompok(390,"A11.4622", new ArrayList<Matakuliah>(Arrays.asList(makul14)),35);		
		
		Kelompok klp392 = new Kelompok(391,"A11.4801", new ArrayList<Matakuliah>(Arrays.asList(makul18)),40);
		Kelompok klp393= new Kelompok(392,"A11.4801", new ArrayList<Matakuliah>(Arrays.asList(makul20)),31);
		Kelompok klp394= new Kelompok(393,"A11.4801", new ArrayList<Matakuliah>(Arrays.asList(makul21)),16);
		
		Kelompok klp395 = new Kelompok(394,"A11.4801U", new ArrayList<Matakuliah>(Arrays.asList(makul23)),11);
		
		Kelompok klp396 = new Kelompok(395,"A11.4802", new ArrayList<Matakuliah>(Arrays.asList(makul22)),23);
		
		Kelompok klp397 = new Kelompok(396,"A11.4803", new ArrayList<Matakuliah>(Arrays.asList(makul20)), 31);
		Kelompok klp398 = new Kelompok(397,"A11.4803", new ArrayList<Matakuliah>(Arrays.asList(makul21)),37);
		Kelompok klp399 = new Kelompok(398,"A11.4803", new ArrayList<Matakuliah>(Arrays.asList(makul22)),10);
		Kelompok klp400 = new Kelompok(399,"A11.4803", new ArrayList<Matakuliah>(Arrays.asList(makul23)),30);
		
		Kelompok klp401 = new Kelompok(400,"A11.4804", new ArrayList<Matakuliah>(Arrays.asList(makul18)),29);
		
		Kelompok klp402 = new Kelompok(401,"A11.4805", new ArrayList<Matakuliah>(Arrays.asList(makul22)),40);
		
		Kelompok klp403 = new Kelompok(402,"A11.4806", new ArrayList<Matakuliah>(Arrays.asList(makul18)),12);
		Kelompok klp404 = new Kelompok(403,"A11.4806", new ArrayList<Matakuliah>(Arrays.asList(makul21)),24);
		Kelompok klp405= new Kelompok(404,"A11.4806", new ArrayList<Matakuliah>(Arrays.asList(makul22)),34);
		Kelompok klp406= new Kelompok(405,"A11.4806", new ArrayList<Matakuliah>(Arrays.asList(makul23)),36);
		
		Kelompok klp407 = new Kelompok(406,"A11.4807", new ArrayList<Matakuliah>(Arrays.asList(makul18)),18);
		Kelompok klp408 = new Kelompok(407,"A11.4807", new ArrayList<Matakuliah>(Arrays.asList(makul23)),24);
		
		Kelompok klp409 = new Kelompok(408,"A11.4808", new ArrayList<Matakuliah>(Arrays.asList(makul21)),38);
		Kelompok klp410 = new Kelompok(409,"A11.4808", new ArrayList<Matakuliah>(Arrays.asList(makul22)),39);
		
		Kelompok klp411 = new Kelompok(410,"A11.4810", new ArrayList<Matakuliah>(Arrays.asList(makul21)),23);
		Kelompok klp412 = new Kelompok(411,"A11.4812", new ArrayList<Matakuliah>(Arrays.asList(makul21)),34);
		Kelompok klp413 = new Kelompok(412,"A11.4813", new ArrayList<Matakuliah>(Arrays.asList(makul21)),40);
		
		Kelompok klp414 = new Kelompok(413,"A11.4814", new ArrayList<Matakuliah>(Arrays.asList(makul18)),43);
		Kelompok klp415 = new Kelompok(414,"A11.4814", new ArrayList<Matakuliah>(Arrays.asList(makul20)),40);
		Kelompok klp416 = new Kelompok(415,"A11.4814", new ArrayList<Matakuliah>(Arrays.asList(makul21)),23);
		Kelompok klp417 = new Kelompok(416,"A11.4814", new ArrayList<Matakuliah>(Arrays.asList(makul22)),45);
		Kelompok klp418 = new Kelompok(417,"A11.4814", new ArrayList<Matakuliah>(Arrays.asList(makul23)),42);
		
		Kelompok klp419 = new Kelompok(418,"A11.4815", new ArrayList<Matakuliah>(Arrays.asList(makul18)),12);
		Kelompok klp420 = new Kelompok(419,"A11.4815", new ArrayList<Matakuliah>(Arrays.asList(makul20)),32);
		Kelompok klp421 = new Kelompok(420,"A11.4815", new ArrayList<Matakuliah>(Arrays.asList(makul21)),34);
		
		Kelompok klp422 = new Kelompok(421,"A11.4816", new ArrayList<Matakuliah>(Arrays.asList(makul23)),12);
		
		Kelompok klp423 = new Kelompok(422,"A11.RPL.4601", new ArrayList<Matakuliah>(Arrays.asList(makul15)),38);
		Kelompok klp424 = new Kelompok(423,"A11.RPL.4602", new ArrayList<Matakuliah>(Arrays.asList(makul15)),12);
		Kelompok klp425 = new Kelompok(424,"A11.RPL.4605", new ArrayList<Matakuliah>(Arrays.asList(makul15)),40);
		
		Kelompok klp426 = new Kelompok(425,"A11.RPL.4606", new ArrayList<Matakuliah>(Arrays.asList(makul15)),35);
		Kelompok klp427 = new Kelompok(426,"A11.RPL.4606", new ArrayList<Matakuliah>(Arrays.asList(makul19)),39);
		
		Kelompok klp428 = new Kelompok(427,"A11.RPL.4607", new ArrayList<Matakuliah>(Arrays.asList(makul19)),39);
		
		Kelompok klp429 = new Kelompok(428,"A11.RPL.4609", new ArrayList<Matakuliah>(Arrays.asList(makul11)), 39);
		Kelompok klp430 = new Kelompok(429,"A11.RPL.4609", new ArrayList<Matakuliah>(Arrays.asList(makul19)),40);
		
		Kelompok klp431 = new Kelompok(430,"A11.RPL.4610", new ArrayList<Matakuliah>(Arrays.asList(makul19)),39);
		
		Kelompok klp432 = new Kelompok(431,"A11.RPL.4614", new ArrayList<Matakuliah>(Arrays.asList(makul15)),42);
		Kelompok klp433 = new Kelompok(432,"A11.RPL.4614", new ArrayList<Matakuliah>(Arrays.asList(makul19)),40);
		
		Kelompok klp434 = new Kelompok(433,"A11.RPL.4615", new ArrayList<Matakuliah>(Arrays.asList(makul15)),44);
		Kelompok klp435 = new Kelompok(434,"A11.RPL.4615", new ArrayList<Matakuliah>(Arrays.asList(makul19)),44);
		
		Kelompok klp436 = new Kelompok(435,"A11.RPL.4616", new ArrayList<Matakuliah>(Arrays.asList(makul19)),17);
		Kelompok klp437 = new Kelompok(436,"A11.RPL.4618", new ArrayList<Matakuliah>(Arrays.asList(makul15)),32);
		Kelompok klp438 = new Kelompok(437,"A11.RPL.4619", new ArrayList<Matakuliah>(Arrays.asList(makul19)),41);
		Kelompok klp439 = new Kelompok(438,"A11.SC.4601", new ArrayList<Matakuliah>(Arrays.asList(makul19)),40);
		Kelompok klp440 = new Kelompok(439,"A11.SC.4602", new ArrayList<Matakuliah>(Arrays.asList(makul19)),40);
		
		Kelompok klp441 = new Kelompok(440,"A11.SC.4603", new ArrayList<Matakuliah>(Arrays.asList(makul15)),42);
		Kelompok klp442 = new Kelompok(441,"A11.SC.4603", new ArrayList<Matakuliah>(Arrays.asList(makul19)),42);
		
		Kelompok klp443 = new Kelompok(442,"A11.SC.4604", new ArrayList<Matakuliah>(Arrays.asList(makul15)), 41);
		Kelompok klp444 = new Kelompok(443,"A11.SC.4603", new ArrayList<Matakuliah>(Arrays.asList(makul19)),39);
		
		Kelompok klp445 = new Kelompok(444,"A11.SC.4605", new ArrayList<Matakuliah>(Arrays.asList(makul19)),39);
		Kelompok klp446 = new Kelompok(445,"A11.SC.4607", new ArrayList<Matakuliah>(Arrays.asList(makul15)),48);
		Kelompok klp447 = new Kelompok(446,"A11.SC.4608", new ArrayList<Matakuliah>(Arrays.asList(makul15)),40);
		Kelompok klp448 = new Kelompok(447,"A11.SC.4611", new ArrayList<Matakuliah>(Arrays.asList(makul15)),40);
		Kelompok klp449 = new Kelompok(448,"A11.SC.4612", new ArrayList<Matakuliah>(Arrays.asList(makul19)),40);
		
		Kelompok klp450 = new Kelompok(449,"A11.SC.4613", new ArrayList<Matakuliah>(Arrays.asList(makul15)),39);
		Kelompok klp451 = new Kelompok(450,"A11.SC.4613", new ArrayList<Matakuliah>(Arrays.asList(makul19)),41);
		
		Kelompok klp452 = new Kelompok(451,"A11.SC.4616", new ArrayList<Matakuliah>(Arrays.asList(makul15)),39);
		
		Kelompok klp453 = new Kelompok(452,"A11.SC.4617", new ArrayList<Matakuliah>(Arrays.asList(makul15)),41);
		Kelompok klp454 = new Kelompok(453,"A11.SC.4617", new ArrayList<Matakuliah>(Arrays.asList(makul19)),42);
		
		Kelompok klp455 = new Kelompok(454,"A11.SC.4618", new ArrayList<Matakuliah>(Arrays.asList(makul19)),31);
		Kelompok klp456 = new Kelompok(455,"A11.SC.4619", new ArrayList<Matakuliah>(Arrays.asList(makul15)),24);// 455
		kelompok2 = new ArrayList<Kelompok>(Arrays.asList(klp1,klp2,klp3,klp4,klp5,klp6,klp7,klp8,klp9,klp10,
				klp11,klp12,klp13,klp14,klp15,klp16,klp17,klp18,klp19,klp20,
				klp21,klp22,klp23,klp24,klp25,klp26,klp27,klp28,klp29,klp30,
				klp31,klp32,klp33,klp34,klp35,klp36,klp37,klp38,klp39,klp40,
				klp41,klp42,klp43,klp44,klp45,klp46,klp47,klp48,klp49,klp50,
				klp51,klp52,klp53,klp54,klp55,klp56,klp57,klp58,klp59,klp60,
				klp61,klp62,klp63,klp64,klp65,klp66,klp67,klp68,klp69,klp70,
				klp71,klp72,klp73,klp74,klp75,klp76,klp77,klp78,klp79,klp80,
				klp81,klp82,klp83,klp84,klp85,klp86,klp87,klp88,klp89,klp90,
				klp91,klp92,klp93,klp94,klp95,klp96,klp97,klp98,klp99,klp100,
				klp101,klp102,klp103,klp104,klp105,klp106,klp107,
				klp108,klp109,klp110,klp111,klp112,klp113,klp114,klp115,klp116,klp117,
				klp118,klp119,klp120,klp121,klp122,klp123,klp124,klp125,klp126,klp127,
				klp128,klp129,klp130,klp131,klp132,klp133,klp134,klp135,klp136,klp137,
				klp138,klp139,klp140,klp141,klp142,klp143,klp144,klp145,klp146,klp147,
				klp148,klp149,klp150,klp151,klp152,klp153,klp154,klp155,klp156,klp157,
				klp158,klp159,klp160,klp161,klp162,klp163,klp164,klp165,klp166,
				klp167,klp168,klp169,klp170,klp171,klp172,klp173,klp174,klp175,klp176,
				klp177,klp178,klp179,klp180,klp181,klp182,klp183,klp184,klp185,klp186,
				klp186,klp187,klp188,klp189,klp190,klp191,klp192,klp193,klp194,klp195,
				klp195,klp196,klp196,klp197,klp198,klp199,klp200,
				klp201,klp202,klp203,klp204,klp205,klp206,klp207,klp208,klp209,klp210,klp211,klp212,
				klp213,klp214,klp215,klp216,klp217,klp218,klp219,klp220,klp221,klp222,klp223,klp224,
				klp225,klp226,klp227,klp228,klp229,klp230,klp231,klp232,klp233,klp234,
				klp235,klp236,klp237,klp238,klp239,klp240,klp241,klp242,klp243,klp244,
				klp245,klp246,klp247,klp248,klp249,klp250,klp251,klp252,klp253,klp254,
				klp255,klp256,klp257,klp258,klp259,klp260,klp261,klp262,klp263,klp264,
				klp265,klp266,klp267,klp268,klp269,klp270,klp271,klp272,klp273,klp274,klp1041,
				klp275,klp276,klp277,klp278,klp279,klp280,klp281,klp282,klp283,klp284,
				klp265,klp266,klp267,klp268,klp269,klp270,klp271,klp272,klp273,klp274,
				klp275,klp276,klp277,klp278,klp279,klp280,klp281,klp282,klp283,klp284,
				klp285,klp286,klp287,klp288,klp289,klp290,klp291,klp292,klp293,klp294,
				klp295,klp296,klp297,klp298,klp299,klp300,klp301,klp302,klp303,klp304,
				klp305,klp306,klp307,klp308,klp309,klp310,klp311,klp312,klp313,klp314,
				klp315,klp316,klp317,klp318,klp319,klp320,klp321,klp323,klp324,
				klp325,klp326,klp327,klp328,klp329,klp330,klp331,klp332,klp333,klp334,
				klp335,klp336,klp337,klp338,klp339,klp340,klp341,klp342,klp344,
				klp345,klp346,klp347,klp348,klp349,klp350,klp351,klp352,klp353,klp354,
				klp355,klp356,klp357,klp358,klp359,klp360,klp361,klp362,klp363,klp364,
				klp365,klp366,klp367,klp368,klp369,klp370,klp371,klp372,klp373,klp374,
				klp375,klp376,klp377,klp378,klp379,klp380,klp381,klp382,klp383,klp384,
				klp385,klp386,klp387,klp388,klp389,klp390,klp391,klp392,klp393,klp394,
				klp395,klp396,klp397,klp398,klp399,klp400,klp401,klp402,klp403,klp404,
				klp405,klp406,klp407,klp408,klp409,klp410,klp411,klp412,klp413,klp414,
				klp415,klp416,klp417,klp418,klp419,klp420,klp421,klp422,klp423,klp424,
				klp425,klp426,klp427,klp428,klp429,klp430,klp431,klp432,klp433,klp434,
				klp435,klp436,klp437,klp438,klp439,klp440,klp441,klp442,klp443,klp444,
				klp445,klp446,klp447,klp448,klp449,klp450,klp451,klp452,klp453,klp454,
				klp455,klp456
				));
		
		kelompok2.forEach(x -> nomorKelas += x.getMatakuliah2().size());
		return this;
	}
	
	public  ArrayList<Ruang> getRuang2() {
		return ruang2;
	}
	
	public  ArrayList<Dosen> getDosen2() {
		return dosen2;
	}
	
	public  ArrayList<Matakuliah> getMatakuliah2() {
		return matakuliah2;
	}
	
	public  ArrayList<Kelompok> getKelompok2() {
		return kelompok2;
	}
	
	public  ArrayList<Jam> getJam2() {
		return jam2;
	}
	
	public  ArrayList<Hari> getHari2() {
		return hari2;
	}
	
	
	/*
	public  ArrayList<SKS> getSKS2() {
		return sks2;
	}*/

	
	public  int getNomorKelas() {
		return this.nomorKelas;
	}
}



