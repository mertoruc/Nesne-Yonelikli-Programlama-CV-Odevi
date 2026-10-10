package com.example;

public class Main {
    public static void main(String[] args) {
        
        
        CvGenerator cvUretici = new CvGenerator();

        
        String isim = "Muhammet Mert Oruc";
        String okulBilgisi = "Kirklareli Üniversitesi - Yazilim Mühendisligi (Öğrenci No: 1250505077)";

       
        String[] hayaliDeneyimler = {
            "2027 - 2029: Google - C ve Java Backend Geliştiricisi (Veri yapilari ve bellek yönetimi optimizasyonu)",
            "2029 - 2031: Tesla - Gömülü Sistemler Mühendisi (Otonom sürüş modülleri geliştirme)",
            "2031 - Güncel: OpenAI - Yapay Zeka Entegrasyon Uzmani (Büyük dil modellerinin sistemlere entegresi)"
        };

        
        String resimDosyasi = "foto.jpeg";
        String ciktiPdfDosyasi = "Muhammet_Mert_Oruc_CV.pdf";

        
        cvUretici.pdfOlustur(ciktiPdfDosyasi, isim, okulBilgisi, hayaliDeneyimler, resimDosyasi);
    }
}