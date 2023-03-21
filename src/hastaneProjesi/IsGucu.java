package hastaneProjesi;

public class IsGucu {
	private String ad;
	private String soyad;
	private int kimlikNo;

	public IsGucu(String ad, String soyad, int kimlikNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.kimlikNo = kimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	void yakaKartiOku() {
		System.out.println("Ad:" + ad + "\nSoyad:" + soyad + "\nKimlik No:" + kimlikNo);

	}

}
