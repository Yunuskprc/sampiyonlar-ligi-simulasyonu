public class son4 {
    son8 nesne8 = new son8();
    int[] son4G = new int[4];
    String son4t[] =new String[4];
    int[] gol = new int[4];
    int[] puan = new int[4];
    int[] averaj = new int[4];

    public void veriyazdır()
    {
        son4G[0]=nesne8.son8G[0];son4G[1]=nesne8.son8G[1];son4G[2]=nesne8.son8G[2];son4G[3]=nesne8.son8G[3];

        son4t[0]=nesne8.son8t[0];son4t[1]=nesne8.son8t[1];son4t[2]=nesne8.son8t[2];son4t[3]=nesne8.son8t[3];
    }

    public void golSayiHesapla()
    {
        for(int i=0;i<4;i++)
        {
            gol[i]=(son4G[i]+(int)(Math.random()*15+1))/6;   
        }
    }

    public void takımlariGoster()
    {
        System.out.println("Yarı Finale kalan takımlar\n");
        for(int i=0;i<4;i++)
        {
            System.out.println((i+1)+"."+son4t[i]);
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
        System.out.println("Yarı final Takımları BELLİ OLDU İŞTE FİKSTÜR");
        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n18 Mayır 2023\n");
        System.out.println(son4t[0]+" - "+son4t[3]);System.out.println(son4t[1]+" - "+son4t[2]);


        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\25' Mayır 2023\n");
        System.out.println(son4t[3]+" - "+son4t[0]);System.out.println(son4t[2]+" - "+son4t[1]);
    }

    public void takımlarıEsle()
    {
        for(int i=0;i<2;i++)
        {
            golSayiHesapla();
            switch(i)
            {
                case 0:
                    if(gol[0]>gol[3])
                    {
                        puan[0]+=3;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }
                    else if(gol[3]>gol[0])
                    {
                        puan[3]+=3;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }
                    else 
                    {
                        puan[0]+=1;puan[3]+=1;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }

                    if(gol[1]>gol[2])
                        {
                            puan[1]+=3;
                            averaj[1]+=gol[1]-gol[2];
                            averaj[2]+=gol[1]-gol[2];
                        }
                        else if(gol[2]>gol[1])
                        {
                            puan[2]+=3;
                            averaj[1]+=gol[1]-gol[2];
                            averaj[2]+=gol[1]-gol[2];
                        }
                        else 
                        {
                            puan[1]+=1;puan[2]+=1;
                            averaj[1]+=gol[1]-gol[2];
                            averaj[2]+=gol[1]-gol[2];
                        }

                        maçsonucları(0);
                        for(int j=0;j<8;j++)
                        {gol[j]=0;}
                        break;

                case 1:
                    if(gol[0]>gol[3])
                    {
                        puan[0]+=3;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }
                    else if(gol[3]>gol[0])
                    {
                        puan[3]+=3;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }
                    else 
                    {
                        puan[0]+=1;puan[3]+=1;
                        averaj[0]+=gol[0]-gol[3];
                        averaj[3]+=gol[0]-gol[3];
                    }

                    if(gol[1]>gol[2])
                    {
                        puan[1]+=3;
                        averaj[1]+=gol[1]-gol[2];
                        averaj[2]+=gol[1]-gol[2];
                    }
                    else if(gol[2]>gol[1])
                    {
                        puan[2]+=3;
                        averaj[1]+=gol[1]-gol[2];
                        averaj[2]+=gol[1]-gol[2];
                    }
                    else 
                    {
                        puan[1]+=1;puan[2]+=1;
                        averaj[1]+=gol[1]-gol[2];
                        averaj[2]+=gol[1]-gol[2];
                    }

                    maçsonucları(0);
                    for(int j=0;j<8;j++)
                    {gol[j]=0;}
                    break;
            }
        }
    }

    public void maçsonucları(int i)
    {
        switch(i)
        {
            case 0:
                try {Thread.sleep(1500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("\nİşte 1.Maçların Sonuçları\n");try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son4t[0]+" "+gol[0]+" - "+gol[3]+" "+son4t[3]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son4t[1]+" "+gol[1]+" - "+gol[2]+" "+son4t[2]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                break;
            case 1:
                try {Thread.sleep(1500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son4t[3]+" "+gol[3]+" - "+gol[0]+" "+son4t[0]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son4t[2]+" "+gol[2]+" - "+gol[1]+" "+son4t[1]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                break;
        }
    }

    int[] son2G = new int[2];
    String son2t[] =new String[2];

    public void finaleKalanlar()
    {
        if(puan[0]>puan[3])
        {son2G[0]=son4G[0];son2t[0]=son4t[0];}
        else if(puan[3]>puan[0])
        {son2G[0]=son4G[3];son2t[0]=son4t[3];}
        else
        {
            if(averaj[0]>averaj[3])
            {son2G[0]=son4G[0];son2t[0]=son4t[0];}
            else if(averaj[3]>averaj[0])
            {son2G[0]=son4G[3];son2t[0]=son4t[3];}
            else 
            {son2G[0]=son4G[0];son2t[0]=son4t[0];}
        }

        if(puan[1]>puan[2])
        {son2G[1]=son4G[1];son2t[1]=son4t[1];}
        else if(puan[2]>puan[1])
        {son2G[1]=son4G[2];son2t[1]=son4t[2];}
        else
        {
            if(averaj[1]>averaj[2])
            {son2G[1]=son4G[1];son2t[1]=son4t[1];}
            else if(averaj[2]>averaj[1])
            {son2G[1]=son4G[2];son2t[1]=son4t[2];}
            else 
            {son2G[1]=son4G[1];son2t[1]=son4t[1];}
        }
    }

}
