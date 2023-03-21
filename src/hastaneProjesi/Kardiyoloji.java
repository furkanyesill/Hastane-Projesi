package hastaneProjesi;

public class Kardiyoloji extends IsGucu {
	public String unvan;

	public Kardiyoloji(String ad, String soyad, int kimlikNo,String unvan) {
		super(ad, soyad, kimlikNo);
		this.unvan = unvan;
	}

	void riskHesapla() throws InterruptedException {
		System.out.println(unvan + " doktor " + getAd() + " tarafından kalp krizi riski hesaplanıyor...");
		Thread.sleep(3000);
		System.out.println("inceleme başarıyla tamamlandı");
	}

	void ekgCek() throws InterruptedException {
		System.out.println(unvan + " doktor " + getAd() + " tarafından EKG çekimi yapılıyor...");
		Thread.sleep(3000);
		System.out.println("EKG başarıyla çekildi");
	}

	@Override
	void yakaKartiOku() {
		super.yakaKartiOku();
		System.out.println("Unvan: " + unvan);
	}

}
