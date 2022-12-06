public class son2 {
    son4 nesne4 = new son4();
    int[] song = new int[2];
    String sont[] =new String[2];
    int[] gol = new int[2];
    int[] puan = new int[2];
    int[] averaj = new int[2];

    public void verileriYazdır()
    {
        song[0]=nesne4.son2G[0]; song[1]=nesne4.son2G[1];
        sont[0]=nesne4.son2t[0]; sont[1]=nesne4.son2t[1];  
    }

    public void golSayiHesapla()
    {
        for(int i=0;i<2;i++)
        {
            gol[i]=(song[i]+(int)(Math.random()*15+1))/6;   
        }
    }

    public void takımlariGoster()
    {
        System.out.println(" Finale kalan takımlar\n");
        for(int i=0;i<2;i++)
        {
            System.out.println((i+1)+"."+sont[i]);
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }

    public void fikstürGöster()
    {
        try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n18 Haziran 2023\n");
        System.out.println(sont[0]+" - "+sont[1]);
    }

    public void takımlarıEsle()
    {
        golSayiHesapla();
        if(gol[0]>gol[1])
        {
            puan[0]+=3;
            averaj[0]+=gol[0]-gol[1];
            averaj[1]+=gol[0]-gol[1];
            if(averaj[0]>averaj[1])
            {sampiyon(0);}
            else
            {sampiyon(1);}
        }
        else if(gol[1]>gol[0])
        {
            puan[1]+=3;
            averaj[0]+=gol[0]-gol[1];
            averaj[1]+=gol[0]-gol[1];
            if(averaj[0]>averaj[1])
            {sampiyon(0);}
            else
            {sampiyon(1);}
        }
        else 
        {
            puan[0]+=1;puan[1]+=1;
            averaj[0]+=gol[0]-gol[1];
            averaj[1]+=gol[0]-gol[31];
            if(averaj[0]>averaj[1])
            {sampiyon(0);}
            else
            {sampiyon(1);}
        }
    }

    public void sampiyon(int i)
    {
        switch(i)
        {
            case 0:
                System.out.println("Büyük finalde heyacan birazdan başlıyacak");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Hakem Antony Tayler Maçı Başltatıyor");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println("İlk yarı da gol sesi yok ikinci yarı birazdan başlayacak");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("ikinci yarı başladı...");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Antony Tayler maçın"+"bitiş düdüğünü çalıyor\n");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Maç Sonucu\n");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(sont[0]+" "+gol[0]+" - "+gol[1]+" "+sont[1]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(sont[0]+" Zoru  başarıyor ve bu uzun serüvenin şampiyonu oluyorrr");
                System.out.println("TEBRİKLER "+sont[0]);
            
            case 1:
                System.out.println("Büyük finalde heyacan birazdan başlıyacak");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Hakem Antony Tayler Maçı Başltatıyor");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println("İlk yarı da gol sesi yok ikinci yarı birazdan başlayacak");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("ikinci yarı başladı...");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Antony Tayler maçın"+"bitiş düdüğünü çalıyor\n");
                try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("Maç Sonucu\n");
                try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(sont[0]+" "+gol[0]+" - "+gol[1]+" "+sont[1]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(sont[1]+" Zoru  başarıyor ve bu uzun serüvenin şampiyonu oluyorrr");
                System.out.println("TEBRİKLER "+sont[1]);
        }
    }

}
