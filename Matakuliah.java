package Tugas7;

public class Matakuliah {

	  private String kode;
	    private String nama;
	    private int sks;

	    public Matakuliah(String kode, String nama, int sks) {
	        this.kode = kode;
	        this.nama = nama;
	        this.sks = sks;
	    }

	    // Getter kode
	    public String getKode() {
	        return kode;
	    }

	    // Setter kode
	    public void setKode(String kode) {
	        this.kode = kode;
	    }

	    // Getter nama
	    public String getNama() {
	        return nama;
	    }

	    // Setter nama
	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    // Getter sks
	    public int getSks() {
	        return sks;
	    }

	    // Setter sks
	    public void setSks(int sks) {
	        this.sks = sks;
	    }
}
