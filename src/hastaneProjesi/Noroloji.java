package hastaneProjesi;

public class Noroloji extends IsGucu {
	private String diplomaAldigiKurum;

	public Noroloji(String ad, String soyad, int kimlikNo, String diplomaAldigiKurum) {
		super(ad, soyad, kimlikNo);
		this.diplomaAldigiKurum = diplomaAldigiKurum;
	}

	void uykuBozuklugu() throws InterruptedException {
		System.out.println("Doktor " + getAd() + " tarafından uyku bozukluğuna yönelik tedavi uygulanıyor...");
		Thread.sleep(3000);
		System.out.println("Tedavi başarıyla gerçekleşti");
	}

	void basAgrisi() throws InterruptedException {
		System.out.println("Doktor " + getAd() + " tarafından baş ağrısına yönelik tedavi uygulanıyor...");
		Thread.sleep(3000);
		System.out.println("Tedavi başarıyla gerçekleşti");
	}

	@Override
	void yakaKartiOku() {
		super.yakaKartiOku();
		System.out.println("Diploma aldığı Yüksek Öğretim Kurumu: " + diplomaAldigiKurum);
	}

}
