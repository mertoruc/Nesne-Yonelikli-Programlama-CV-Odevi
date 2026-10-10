package com.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class CvGenerator {

   
    public void pdfOlustur(String dosyaAdi, String adSoyad, String egitim, String[] deneyimler, String fotografYolu) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(dosyaAdi));
            document.open();

           
            try {
                Image profilFotosu = Image.getInstance(fotografYolu);
                profilFotosu.scaleAbsolute(100f, 100f);
                profilFotosu.setAlignment(Element.ALIGN_RIGHT);
                document.add(profilFotosu);
            } catch (Exception e) {
                System.out.println("Uyari: Fotoğraf bulunamadı! Lutfen projenin ana klasorune 'foto.jpg' ekleyin.");
            }

          
            Font baslikFontu = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 22, BaseColor.BLACK);
            document.add(new Paragraph(adSoyad, baslikFontu));
            document.add(new Paragraph("Egitim: " + egitim));
            document.add(new Paragraph("\n"));

           
            Font bolumFontu = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLUE);
            document.add(new Paragraph("Is Deneyimleri", bolumFontu));
            document.add(new Paragraph("---------------------------------------------------"));

            for (String deneyim : deneyimler) {
                document.add(new Paragraph("- " + deneyim));
                document.add(new Paragraph("\n"));
            }

            document.close();
            System.out.println("Basarili: " + dosyaAdi + " isimli PDF basariyla uretildi!");

        } catch (Exception e) {
            System.out.println("PDF olusturulurken bir hata meydana geldi.");
            e.printStackTrace();
        }
    }
}