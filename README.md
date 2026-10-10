# Kırklareli Üniversitesi - Nesneye Yönelik Programlama Ödevi

Bu proje, Java ve **iTextPDF** kütüphanesi kullanılarak nesne yönelimli programlama (OOP) prensiplerine uygun şekilde geliştirilmiş bir PDF CV oluşturucu uygulamasıdır. Konsol üzerinden çalışır ve girilen verileri otomatik olarak bir PDF dosyasına dönüştürür.

## 👨‍💻 Geliştirici Bilgileri
* **Ad Soyad:** Muhammet Mert Oruç
* **Bölüm:** Yazılım Mühendisliği

## 🚀 Proje İçeriği ve Mimari
Proje, "Separation of Concerns" (Sorumlulukların Ayrılığı) prensibine uygun olarak iki ana sınıfa ayrılmıştır:

1. **`Main.java` (Ana Sınıf):** Programın başlangıç noktasıdır. `CvGenerator` sınıfından yeni bir nesne üretilerek (nesne yaşam döngüsü başlatılarak) gerekli kişisel bilgiler ve hayali iş deneyimleri bu sınıf üzerinden gönderilir.
2. **`CvGenerator.java` (PDF Üretici Sınıf):** PDF oluşturma mantığının kapsüllendiği (encapsulation) sınıftır. Metotlar ve içerikler `public` / `private` erişim belirleyicileri ile kontrol altında tutulur. iTextPDF kütüphanesine ait `Document`, `Paragraph` ve `Image` nesneleri bu sınıf içerisinde yaşam bulur.

## 🛠️ Kurulum ve Çalıştırma
1. Bu depoyu bilgisayarınıza klonlayın.
2. Projenin ana klasöründe (pom.xml dosyasının yanında) `foto.jpg` adında bir vesikalık/profil fotoğrafı bulunduğundan emin olun.
3. IDE'niz (VS Code vb.) üzerinden Maven bağımlılıklarının (`pom.xml` içindeki iTextPDF) senkronize edildiğinden emin olun.
4. `Main.java` dosyasını çalıştırın.
5. Proje klasöründe `Muhammet_Mert_Oruc_CV.pdf` adlı dosya otomatik olarak oluşturulacaktır.
