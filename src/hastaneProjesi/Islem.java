package hastaneProjesi;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) throws InterruptedException {
		Bashekim b = new Bashekim("Hakan", "Yurt", 8877, "Profesör", "İç Hastalıkları", 20);
		Kardiyoloji k = new Kardiyoloji("Gülhan", "Tan", 8876, "Doçent");
		Noroloji n = new Noroloji("Ceylin", "Gül", 8875, "Ankara Üniversitesi");
		Scanner scan = new Scanner(System.in);

		String komut = "Hastane Sistemine Hoşgeldiniz...\n" + "Yapılabilecek İşlemler:\n"
				+ "Başkekim birimiyle ilgili işlemler için 1'e\n" + "Kardiyoloji birimiyle ilgili işlemler için 2'ye\n"
				+ "Nöroloji birimiyle ilgili işlemler için 3'e\n" + "Sistemden çıkmak için 0'a basınız. ";

		while (true) {
			System.out.println("//////////////////////////////");
			System.out.println(komut);
			System.out.println("//////////////////////////////");
			System.out.println(" ");
			System.out.print("Lütfen yapmak istediğiniz işlemi giriniz: ");
			String secim = scan.nextLine();

			while (true) {
				if (secim.equals("0")) {
					System.out.println("Sistemden Çıkış Yapılıyor...");
					Thread.sleep(3000);
					System.out.println("Çıkış yapıldı.");
					return;
				} else if (secim.equals("1")) {
					System.out.println("Başhekim birimine hoşgeldiniz." + "Başhekim bilgiler tanımlanıyor...");
					b.yakaKartiOku();
					b.calis();
					System.out.println("Başhekim çalışmasını bitirdi.");
					break;
				} else if (secim.equals("2")) {
					System.out.println("Kardiyoloji birimine hoşgeldiniz." + "Kardiyoloji bilgiler tanımlanıyor...");
					k.yakaKartiOku();
					String s = "Kalp krizi riski hesaplamak için 1'e\n" + "EKG çektirmek için 2'ye basınız.";
					System.out.println(s);
					String secim2 = scan.nextLine();
					if (secim2.equals("1")) {
						k.riskHesapla();
						break;
					} else if (secim.endsWith("2")) {
						k.ekgCek();
						break;
					} else {
						System.out.println("Hatalı seçim yaptınız.");
					}
				} else if (secim.equals("3")) {
					System.out.println("Nöroloji birimine hoşgeldiniz." + "Nöroloji bilgileri tanımlanıyor...");
					n.yakaKartiOku();
					String s = "Baş ağrısı tedavisi için 1'e\n" + "Uyku bozukluğu tedavisi için 2'ye basınız";
					System.out.println(s);
					String secim3 = scan.nextLine();
					if (secim3.equals("1")) {
						n.basAgrisi();
						break;
					} else if (secim3.equals("2")) {
						n.uykuBozuklugu();
						break;
					} else {
						System.out.println("Hatalı bir işlem yaptınız.");
						break;
					}
				}

			}

		}

	}

}
