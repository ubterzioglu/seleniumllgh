package selfin;

// 1. SINIF (Class) - Köpek taslağı
class Kopek {
    // Özellikler
    String isim;
    int yas;
    String renk;

    // Constructor - Yeni köpek oluşturulunca çalışır
    public Kopek(String isim, int yas, String renk) {
        this.isim = isim;
        this.yas = yas;
        this.renk = renk;
        System.out.println("✅ Yeni köpek oluşturuldu: " + isim);
    }

    // Methodlar - Köpeğin yapabilecekleri
    public void havla() {
        System.out.println(isim + ": HAV HAV! 🐕");
    }

    public void bilgiGoster() {
        System.out.println("---");
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Renk: " + renk);
        System.out.println("---");
    }

    public void oyna() {
        System.out.println(isim + " top oynuyor! ⚽");
    }
}


// 2. ANA PROGRAM (Main)
public class JavaObject {
    public static void main(String[] args) {

        System.out.println("🐶 KÖPEK PROGRAMI BAŞLADI 🐶\n");

        // İŞTE OBJELER OLUŞTURULUYOR! ⬇️⬇️⬇️

        Kopek kopek1 = new Kopek("Karabaş", 3, "Kahverengi");
        Kopek kopek2 = new Kopek("Minnoş", 2, "Beyaz");
        Kopek kopek3 = new Kopek("Rex", 5, "Siyah");

        System.out.println("\n--- KÖPEK 1 ---");
        kopek1.bilgiGoster();
        kopek1.havla();
        kopek1.oyna();

        System.out.println("\n--- KÖPEK 2 ---");
        kopek2.bilgiGoster();
        kopek2.havla();
        kopek2.oyna();

        System.out.println("\n--- KÖPEK 3 ---");
        kopek3.bilgiGoster();
        kopek3.havla();
        kopek3.oyna();

        System.out.println("\n--- HEPSİ BİRLİKTE HAVLASIN ---");
        kopek1.havla();
        kopek2.havla();
        kopek3.havla();

        System.out.println("\n🎉 PROGRAM BİTTİ 🎉");
    }
}