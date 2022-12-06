public class son8 {
    son16 nesne16 = new son16();
    int[] son8G = new int[8];
    String son8t[] =new String[8];
    int[] gol = new int[8];
    int[] puan = new int[8];
    int[] averaj = new int[8];
    public void veriyazdır()
    {
        son8G[0]=nesne16.son8Guc[0];son8G[1]=nesne16.son8Guc[1];son8G[2]=nesne16.son8Guc[2];son8G[3]=nesne16.son8Guc[3];
        son8G[4]=nesne16.son8Guc[4];son8G[5]=nesne16.son8Guc[5];son8G[6]=nesne16.son8Guc[6];son8G[7]=nesne16.son8Guc[7];

        son8t[0]=nesne16.son8[0];son8t[1]=nesne16.son8[1];son8t[2]=nesne16.son8[2];son8t[3]=nesne16.son8[3];
        son8t[7]=nesne16.son8[7];son8t[6]=nesne16.son8[6];son8t[5]=nesne16.son8[5];son8t[4]=nesne16.son8[4];
    }

    public void golSayiHesapla()
    {
        for(int i=0;i<8;i++)
        {
            gol[i]=(son8G[i]+(int)(Math.random()*15+1))/6;   
        }
    }

    public void takımlariGoster()
    {
        System.out.println("Çeyrek Final'e kalan takımlar\n");
        for(int i=0;i<8;i++)
        {
            System.out.println((i+1)+"."+son8t[i]);
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
        try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("Kura Çekimi birazdan başlıyor...");
        try {Thread.sleep(2000);} catch (Exception e) {e.printStackTrace();}
        System.out.println("SON 8 Takımları BELLİ OLDU İŞTE FİKSTÜR");
        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n18 Nisan 2023\n");
        System.out.println(son8t[0]+" - "+son8t[4]);System.out.println(son8t[1]+" - "+son8t[5]);
        System.out.println(son8t[2]+" - "+son8t[6]);System.out.println(son8t[3]+" - "+son8t[7]);

        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n\n25 Nisan 2023\n");
        System.out.println(son8t[4]+" - "+son8t[0]);System.out.println(son8t[5]+" - "+son8t[1]);
        System.out.println(son8t[6]+" - "+son8t[2]);System.out.println(son8t[7]+" - "+son8t[3]);
    }
    // 0-4 1-5 2-6 3-7
    public void takımlarıEsle()
    {
        for(int i=0;i<2;i++)
        {
            golSayiHesapla();
            switch(i)
            {
                case 0:
                        if(gol[0]>gol[4])
                        {
                            puan[0]+=3;
                            averaj[0]+=gol[0]-gol[4];
                            averaj[4]+=gol[0]-gol[4];
                        }
                        else if(gol[4]>gol[0])
                        {
                            puan[4]+=3;
                            averaj[0]+=gol[0]-gol[4];
                            averaj[4]+=gol[0]-gol[4];
                        }
                        else 
                        {
                            puan[0]+=1;puan[4]+=1;
                            averaj[0]+=gol[0]-gol[4];
                            averaj[4]+=gol[0]-gol[4];
                        }


                        if(gol[1]>gol[5])
                        {
                            puan[1]+=3;
                            averaj[1]+=gol[1]-gol[5];
                            averaj[5]+=gol[1]-gol[5];
                        }
                        else if(gol[5]>gol[1])
                        {
                            puan[5]+=3;
                            averaj[1]+=gol[1]-gol[5];
                            averaj[5]+=gol[1]-gol[5];
                        }
                        else 
                        {
                            puan[1]+=1;puan[5]+=1;
                            averaj[1]+=gol[1]-gol[5];
                            averaj[5]+=gol[1]-gol[5];
                        }

                        if(gol[2]>gol[6])
                        {
                            puan[2]+=3;
                            averaj[2]+=gol[2]-gol[6];
                            averaj[6]+=gol[2]-gol[6];
                        }
                        else if(gol[6]>gol[2])
                        {
                            puan[6]+=3;
                            averaj[2]+=gol[2]-gol[6];
                            averaj[6]+=gol[2]-gol[6];
                        }
                        else 
                        {
                            puan[2]+=1;puan[6]+=1;
                            averaj[2]+=gol[2]-gol[6];
                            averaj[6]+=gol[2]-gol[6];
                        }


                        if(gol[3]>gol[7])
                        {
                            puan[3]+=3;
                            averaj[3]+=gol[3]-gol[7];
                            averaj[7]+=gol[3]-gol[7];
                        }
                        else if(gol[7]>gol[3])
                        {
                            puan[7]+=3;
                            averaj[3]+=gol[3]-gol[7];
                            averaj[7]+=gol[3]-gol[7];
                        }
                        else 
                        {
                            puan[3]+=1;puan[7]+=1;
                            averaj[1]+=gol[3]-gol[7];
                            averaj[7]+=gol[3]-gol[7];
                        }

                        maçsonucları(0);
                        for(int j=0;j<8;j++)
                        {gol[j]=0;}
                        break;
                case 1:
                    if(gol[0]>gol[4])
                    {
                        puan[0]+=3;
                        averaj[0]+=gol[0]-gol[4];
                        averaj[4]+=gol[0]-gol[4];
                    }
                    else if(gol[4]>gol[0])
                    {
                        puan[4]+=3;
                        averaj[0]+=gol[0]-gol[4];
                        averaj[4]+=gol[0]-gol[4];
                    }
                    else 
                    {
                        puan[0]+=1;puan[4]+=1;
                        averaj[0]+=gol[0]-gol[4];
                        averaj[4]+=gol[0]-gol[4];
                    }


                    if(gol[1]>gol[5])
                    {
                        puan[1]+=3;
                        averaj[1]+=gol[1]-gol[5];
                        averaj[5]+=gol[1]-gol[5];
                    }
                    else if(gol[5]>gol[1])
                    {
                        puan[5]+=3;
                        averaj[1]+=gol[1]-gol[5];
                        averaj[5]+=gol[1]-gol[5];
                    }
                    else 
                    {
                        puan[1]+=1;puan[5]+=1;
                        averaj[1]+=gol[1]-gol[5];
                        averaj[5]+=gol[1]-gol[5];
                    }

                    if(gol[2]>gol[6])
                    {
                        puan[2]+=3;
                        averaj[2]+=gol[2]-gol[6];
                        averaj[6]+=gol[2]-gol[6];
                    }
                    else if(gol[6]>gol[2])
                    {
                        puan[6]+=3;
                        averaj[2]+=gol[2]-gol[6];
                        averaj[6]+=gol[2]-gol[6];
                    }
                    else 
                    {
                        puan[2]+=1;puan[6]+=1;
                        averaj[2]+=gol[2]-gol[6];
                        averaj[6]+=gol[2]-gol[6];
                    }


                    if(gol[3]>gol[7])
                    {
                        puan[3]+=3;
                        averaj[3]+=gol[3]-gol[7];
                        averaj[7]+=gol[3]-gol[7];
                    }
                    else if(gol[7]>gol[3])
                    {
                        puan[7]+=3;
                        averaj[3]+=gol[3]-gol[7];
                        averaj[7]+=gol[3]-gol[7];
                    }
                    else 
                    {
                        puan[3]+=1;puan[7]+=1;
                        averaj[1]+=gol[3]-gol[7];
                        averaj[7]+=gol[3]-gol[7];
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
                System.out.println(son8t[0]+" "+gol[0]+" - "+gol[4]+" "+son8t[4]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[1]+" "+gol[1]+" - "+gol[5]+" "+son8t[5]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[2]+" "+gol[2]+" - "+gol[6]+" "+son8t[6]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[3]+" "+gol[3]+" - "+gol[7]+" "+son8t[7]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                break;
            case 1:
                try {Thread.sleep(1500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("\nİşte 2.Maçların Sonuçları\n");try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[4]+" "+gol[4]+" - "+gol[1]+" "+son8t[1]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[5]+" "+gol[5]+" - "+gol[2]+" "+son8t[2]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[6]+" "+gol[6]+" - "+gol[3]+" "+son8t[3]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(son8t[7]+" "+gol[7]+" - "+gol[4]+" "+son8t[4]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        }
    }


    int[] son4G = new int[4];
    String son4t[] =new String[4];

    public void son4kalanlar()
    {
        if(puan[0]>puan[4])
        {son4t[0]=son8t[0];son4G[0]=son8G[0];}
        else if(puan[4]>puan[0])
        {son4t[0]=son8t[4];son4G[0]=son8G[4];}
        else
        {
            if(averaj[0]>averaj[4])
            {son4t[0]=son8t[0];son4G[0]=son8G[0];}
            else if(averaj[4]>averaj[0])
            {son4t[0]=son8t[4];son4G[0]=son8G[4];}
            else
            {son4t[0]=son8t[0];son4G[0]=son8G[0];}
        }
    
        if(puan[1]>puan[5])
        {son4t[1]=son8t[1];son4G[1]=son8G[1];}
        else if(puan[5]>puan[1])
        {son4t[1]=son8t[5];son4G[1]=son8G[5];}
        else
        {
            if(averaj[1]>averaj[5])
            {son4t[1]=son8t[1];son4G[1]=son8G[1];}
            else if(averaj[5]>averaj[1])
            {son4t[1]=son8t[5];son4G[1]=son8G[5];}
            else
            {son4t[1]=son8t[1];son4G[1]=son8G[1];}
        }
    
        if(puan[2]>puan[6])
        {son4t[2]=son8t[2];son4G[2]=son8G[2];}
        else if(puan[6]>puan[2])
        {son4t[2]=son8t[6];son4G[2]=son8G[6];}
        else
        {
            if(averaj[2]>averaj[6])
            {son4t[2]=son8t[2];son4G[2]=son8G[2];}
            else if(averaj[6]>averaj[2])
            {son4t[2]=son8t[6];son4G[2]=son8G[6];}
            else
            {son4t[2]=son8t[2];son4G[2]=son8G[2];}
        }
    
        if(puan[3]>puan[7])
        {son4t[3]=son8t[3];son4G[3]=son8G[3];}
        else if(puan[7]>puan[3])
        {son4t[3]=son8t[7];son4G[3]=son8G[7];}
        else
        {
            if(averaj[3]>averaj[7])
            {son4t[3]=son8t[3];son4G[3]=son8G[3];}
            else if(averaj[7]>averaj[3])
            {son4t[3]=son8t[7];son4G[3]=son8G[7];}
            else
            {son4t[3]=son8t[3];son4G[3]=son8G[3];}
        }
    }

}
