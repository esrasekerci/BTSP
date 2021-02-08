package com.mycompany.calisan;

public class calisan {

    private long sicilNo;
    private String adSoyad;
    private double satisTutari;
    private double prim;

    public calisan(long sicilNo, String adSoyad, double satisTutari) {
        this.sicilNo = sicilNo;
        this.adSoyad = adSoyad;
        this.satisTutari = satisTutari;
        this.prim = 0;
    }

    public long getSicilNo() {
        return sicilNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public double getSatisTutari() {
        return satisTutari;
    }

    public double getPrim() {
        return prim;
    }

    public void setAdSoyad(String s) {

        if (s.length() == 0) {
            throw new RuntimeException("Hata: Ad bos");
        }
        adSoyad = s;
    }

    public void setSicilNo(long n) {

        if (n < 0) {
            throw new RuntimeException("Hata: Negatif satisTutari");
        }
        sicilNo = n;
    }

    public void setSatisTutari(double n) {

        if (n < 0) {
            throw new RuntimeException("Hata: Negatif satisTutari");
        }
        satisTutari = n;
    }

    public void setPrim(double n) {

        if (n < 0) {
            throw new RuntimeException("Hata: Negatif satisTutari");
        }
        prim = n;
    }

    public static void guncelle(calisan[] calisanlar, calisan[] liste) {
        int indis = 0;
        for (calisan k : liste) {
            int varmi = 1;
            if (k == null) {
                break;
            }
            for (calisan j : calisanlar) {
                if (j != null && k.getSicilNo() == j.getSicilNo()) {
                    j.setSatisTutari(j.getSatisTutari() + k.getSatisTutari());
                    varmi = 0;
                    break;
                }
            }
            if (varmi == 1) {
                calisanlar[indis] = k;
                indis++;
            }
        }
    }

    public static void primHesapla(calisan[] calisanlar, double primOrani) {
        for (calisan i : calisanlar) {
            if (i != null) {
                i.setPrim(i.getSatisTutari() * primOrani);
            }
        }
    }

    public static void listele(calisan[] calisanlar) {
        for (calisan i : calisanlar) {
            if (i != null) {
                System.out.println("Sicil No: " + i.getSicilNo() + ", Ad-Soyad: " + i.getAdSoyad() + ", Satis Tutari: " + i.getSatisTutari() + ", Prim: " + i.getPrim());
            }
        }
    }

    public static void main(String[] args) {

        calisan[] liste = {new calisan(1111111111l, "Ali Deniz", 23455.0),
            new calisan(2222222222l, "Derya Gunes", 5696.70),
            new calisan(3333333333l, "Mehmet Mavi", 2750.0),
            new calisan(4444444444l, "Ada Yesil", 7255),
            new calisan(5555555555l, "Yagmur Kirmizi", 2753),
            new calisan(4444444444l, "Ada Yesil", 2750.0)};

        calisan[] calisanlar = new calisan[30];

        guncelle(calisanlar, liste);

        primHesapla(calisanlar, 0.1);

        System.out.println("ORNEK 1: -- Prim: 0.1");

        listele(calisanlar);

        System.out.println("\n");

    }

}
