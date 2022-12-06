import java.util.Scanner;

public class ANA {
    public static void main(String[] args) {
        ANA nesneANA = new ANA();
        gruba nesneA = new gruba();
        grupb nesneB = new grupb();
        grupc nesneC = new grupc();
        grupd nesneD = new grupd();
        grupe nesneE = new grupe();
        grupf nesneF = new grupf();
        grupg nesneG = new grupg();
        grubh nesneH = new grubh();
        Scanner scan = new Scanner(System.in);
        int i;
        String sorguPuanDurumu, sorguHangiPuanDurumu;

        if (true) {
            System.out.println("\n\n\t\tŞAMPİYONLAR LİGİNE HOŞGELDİNİZ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nGruplar dakikalar içinde belli oluyorrr...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nGruplar Belli oldu işte gruplar\n\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("GRUB A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneA.tabloTakımlar(0);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneB.tabloTakımlar(1);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB C");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneC.tabloTakımlar(2);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB D");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneD.tabloTakımlar(3);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB E");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneE.tabloTakımlar(4);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB F");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneF.tabloTakımlar(5);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB G");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneG.tabloTakımlar(6);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\nGRUB H");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nesneH.tabloTakımlar(7);
        }

        // üstte grupları ekrana yazdırdık; Altta takımlar[] ve güç[] arraylerini
        // doldurduk
        nesneA.takımAdlar(0);
        nesneB.takımAdlar(1);
        nesneC.takımAdlar(2);
        nesneD.takımAdlar(3);
        nesneE.takımAdlar(4);
        nesneF.takımAdlar(5);
        nesneG.takımAdlar(6);
        nesneH.takımAdlar(7);
        System.out.println("\n");

        for (i = 1; i <= 6; i++) {

            nesneANA.macProgramıYazdır(i, nesneA, nesneB, nesneC, nesneD, nesneE, nesneF,
                    nesneG, nesneH);
            System.out.println("\n" + i + ".hafta maçları birazdan başlayacak...");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("İşte " + i + ".haftanın sonuçları\n");

            nesneA.takımEsle(0, i);
            System.out.println();
            nesneB.takımEsle(1, i);
            System.out.println();
            nesneC.takımEsle(2, i);
            System.out.println();
            nesneD.takımEsle(3, i);
            System.out.println();
            nesneE.takımEsle(4, i);
            System.out.println();
            nesneF.takımEsle(5, i);
            System.out.println();
            nesneG.takımEsle(6, i);
            System.out.println();
            nesneH.takımEsle(7, i);

            System.out.println("\nPuan durumlarını görmek için evet/hayır yazın.");
            sorguPuanDurumu = scan.next();
            if (sorguPuanDurumu.equalsIgnoreCase("Evet")) {
                while (true) {
                    System.out.println("\nHangi takımın puan durumunu görmek istiyorsunuz ? (Grup harfi/hayır)\n");
                    sorguHangiPuanDurumu = scan.next();
                    if (sorguHangiPuanDurumu.equalsIgnoreCase("A")) {
                        System.out.println("GRUP A");
                        nesneA.tablo(0);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("B")) {
                        System.out.println("GRUP B");
                        nesneB.tablo(1);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("C")) {
                        System.out.println("GRUP C");
                        nesneB.tablo(2);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("D")) {
                        System.out.println("GRUP D");
                        nesneB.tablo(3);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("E")) {
                        System.out.println("GRUP E");
                        nesneB.tablo(4);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("F")) {
                        System.out.println("GRUP F");
                        nesneB.tablo(5);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("G")) {
                        System.out.println("GRUP G");
                        nesneB.tablo(6);
                    } else if (sorguHangiPuanDurumu.equalsIgnoreCase("H")) {
                        System.out.println("GRUP H");
                        nesneB.tablo(7);
                    } else
                        break;
                    System.out.println("\n");
                }
            }
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("\nGRUP AŞAMASI TAMAMLANDI...");
        
        nesneA.son16belirle(0);
        nesneB.son16belirle(1);
        nesneC.son16belirle(2);
        nesneD.son16belirle(3);
        nesneE.son16belirle(4);
        nesneF.son16belirle(5);
        nesneG.son16belirle(6);
        nesneH.son16belirle(7);
        //System.out.println(nesneA.son16Dizi[0] + nesneA.takımlarSon16[1] + nesneA.son16Guc[0] + nesneA.son16Guc[1]);
        son16 nesneSon16 = new son16();
        nesneSon16.verileriYazdır();
        nesneSon16.takımlariGoster();
        nesneSon16.fikstürGöster();
        nesneSon16.takımlarıEsle();
        nesneSon16.son8Kalantakımlar();

        son8 nesneSon8 =new son8();
        nesneSon8.veriyazdır();
        nesneSon8.takımlariGoster();
        nesneSon8.fikstürGöster();
        nesneSon8.takımlarıEsle();
        nesneSon8.son4kalanlar();

        son4 nesneSon4 = new son4();
        nesneSon4.veriyazdır();
        nesneSon4.takımlariGoster();
        nesneSon4.fikstürGöster();
        nesneSon4.takımlarıEsle();
        nesneSon4.finaleKalanlar();

        son2 nesneSon2 = new son2();
        nesneSon2.verileriYazdır();
        nesneSon2.takımlariGoster();
        nesneSon2.fikstürGöster();
        nesneSon2.takımlarıEsle();

    }



    public void macProgramıYazdır(int week, gruba nesneA, grupb nesneB, grupc nesneC, grupd nesneD, grupe nesneE,
            grupf nesneF, grupg nesneG, grubh nesneH) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n\n" + week + ".Hafta Maç programı");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (week) {
            case 1:
                nesneA.macProgramı(1);
                nesneB.macProgramı(1);
                nesneC.macProgramı(1);
                nesneD.macProgramı(1);
                nesneE.macProgramı(1);
                nesneF.macProgramı(1);
                nesneG.macProgramı(1);
                nesneH.macProgramı(1);
                break;
            case 2:
                nesneA.macProgramı(2);
                nesneB.macProgramı(2);
                nesneC.macProgramı(2);
                nesneD.macProgramı(2);
                nesneE.macProgramı(2);
                nesneF.macProgramı(2);
                nesneG.macProgramı(2);
                nesneH.macProgramı(2);
                break;
            case 3:
                nesneA.macProgramı(3);
                nesneB.macProgramı(3);
                nesneC.macProgramı(3);
                nesneD.macProgramı(3);
                nesneE.macProgramı(3);
                nesneF.macProgramı(3);
                nesneG.macProgramı(3);
                nesneH.macProgramı(3);
                break;
            case 4:
                nesneA.macProgramı(4);
                nesneB.macProgramı(4);
                nesneC.macProgramı(4);
                nesneD.macProgramı(4);
                nesneE.macProgramı(4);
                nesneF.macProgramı(4);
                nesneG.macProgramı(4);
                nesneH.macProgramı(4);
                break;
            case 5:
                nesneA.macProgramı(5);
                nesneB.macProgramı(5);
                nesneC.macProgramı(5);
                nesneD.macProgramı(5);
                nesneE.macProgramı(5);
                nesneF.macProgramı(5);
                nesneG.macProgramı(5);
                nesneH.macProgramı(5);
                break;
            case 6:
                nesneA.macProgramı(6);
                nesneB.macProgramı(6);
                nesneC.macProgramı(6);
                nesneD.macProgramı(6);
                nesneE.macProgramı(6);
                nesneF.macProgramı(6);
                nesneG.macProgramı(6);
                nesneH.macProgramı(6);
                break;
        }

    }
}