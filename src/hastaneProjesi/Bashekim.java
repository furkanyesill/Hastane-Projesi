package hastaneProjesi;

public class Bashekim extends IsGucu {
	private String unvan;
	private String uzmanlikAlani;
	private int hizmetSuresi;

	public Bashekim(String ad, String soyad, int kimlikNo, String unvan, String uzmanlikAlani, int hizmetSuresi) {
		super(ad, soyad, kimlikNo);
		this.unvan = unvan;
		this.uzmanlikAlani = uzmanlikAlani;
		this.hizmetSuresi = hizmetSuresi;

	}

	void calis() throws InterruptedException {
		String s1 = "Başhekim " + getAd() + " doktorların yıllık izinlerini denetliyor...";
		Thread.sleep(3000);
		String s2 = "Başhekim " + getAd() + " labaratuvar hizmetlerini denetliyor...";
		Thread.sleep(3000);
		System.out.println(s1);
		System.out.println(s2);

	}

	@Override
	void yakaKartiOku() {
		super.yakaKartiOku();
		System.out.println("Unvan: " + unvan);
		System.out.println("Uzmanlık Alanı: " + uzmanlikAlani);
		System.out.println("Hizmet Süresi: " + hizmetSuresi);
	}

}
