public class son16 {
    int[] puan = new int[16];
    int[] averaj = new int[16];
    int[] gol = new int[16];
    String takımlar[] = new String[16];
    int[] guc= new int[16];

    gruba nesneA1 = new gruba();
    grupb nesneB1 = new grupb();
    grupc nesneC1 = new grupc();
    grupd nesneD1 = new grupd();
    grupe nesneE1 = new grupe();
    grupf nesneF1 = new grupf();
    grupg nesneG1 = new grupg();
    grubh nesneH1 = new grubh();
    
    public void verileriYazdır()
    {
        nesneA1.son16belirle(0);
        nesneB1.son16belirle(1);
        nesneC1.son16belirle(2);
        nesneD1.son16belirle(3);
        nesneE1.son16belirle(4);
        nesneF1.son16belirle(5);
        nesneG1.son16belirle(6);
        nesneH1.son16belirle(7);

        takımlar[0]=nesneA1.son16Dizi[0];
        takımlar[1]=nesneB1.son16Dizi[0];
        takımlar[2]=nesneC1.son16Dizi[0];
        takımlar[3]=nesneD1.son16Dizi[0];
        takımlar[4]=nesneE1.son16Dizi[0];
        takımlar[5]=nesneF1.son16Dizi[0];
        takımlar[6]=nesneG1.son16Dizi[0];
        takımlar[7]=nesneH1.son16Dizi[0];
        takımlar[8]=nesneA1.son16Dizi[1];
        takımlar[9]=nesneB1.son16Dizi[1];
        takımlar[10]=nesneC1.son16Dizi[1];
        takımlar[11]=nesneD1.son16Dizi[1];
        takımlar[12]=nesneE1.son16Dizi[1];
        takımlar[13]=nesneF1.son16Dizi[1];
        takımlar[14]=nesneG1.son16Dizi[1];
        takımlar[15]=nesneH1.son16Dizi[1];

        guc[0]=nesneA1.son16Guc[0];
        guc[1]=nesneB1.son16Guc[0];
        guc[2]=nesneC1.son16Guc[0];
        guc[3]=nesneD1.son16Guc[0];
        guc[4]=nesneE1.son16Guc[0];
        guc[5]=nesneF1.son16Guc[0];
        guc[6]=nesneG1.son16Guc[0];
        guc[7]=nesneH1.son16Guc[0];
        guc[8]=nesneA1.son16Guc[1];
        guc[9]=nesneB1.son16Guc[1];
        guc[10]=nesneC1.son16Guc[1];
        guc[11]=nesneD1.son16Guc[1];
        guc[12]=nesneE1.son16Guc[1];
        guc[13]=nesneF1.son16Guc[1];
        guc[14]=nesneG1.son16Guc[1];
        guc[15]=nesneH1.son16Guc[1];
    }



    public void golSayiHesapla()
    {
        for(int i=0;i<16;i++)
        {
            gol[i]=(guc[i]+(int)(Math.random()*15+1))/6;   
        }
    }

    public void takımlariGoster()
    {
        System.out.println("SON 16'ya kalan takımlar\n");
        for(int i=0;i<16;i++)
        {
            System.out.println((i+1)+"."+takımlar[i]);
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
        System.out.println("SON 16 Takımları BELLİ OLDU İŞTE FİKSTÜR");
        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n18 MART 2023\n");
        System.out.println(takımlar[0]+" - "+takımlar[8]);System.out.println(takımlar[1]+" - "+takımlar[9]);
        System.out.println(takımlar[2]+" - "+takımlar[10]);System.out.println(takımlar[3]+" - "+takımlar[11]);
        System.out.println(takımlar[4]+" - "+takımlar[12]);System.out.println(takımlar[5]+" - "+takımlar[13]);
        System.out.println(takımlar[6]+" - "+takımlar[14]);System.out.println(takımlar[7]+" - "+takımlar[15]);
        try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        System.out.println("\n\n25 MART 2023\n");
        System.out.println(takımlar[8]+" - "+takımlar[0]);System.out.println(takımlar[9]+" - "+takımlar[1]);
        System.out.println(takımlar[10]+" - "+takımlar[2]);System.out.println(takımlar[11]+" - "+takımlar[3]);
        System.out.println(takımlar[12]+" - "+takımlar[4]);System.out.println(takımlar[13]+" - "+takımlar[5]);
        System.out.println(takımlar[14]+" - "+takımlar[6]);System.out.println(takımlar[15]+" - "+takımlar[7]);
    }

    public void takımlarıEsle()
    {
        for(int i=1;i<=2;i++)
        {   
            golSayiHesapla();
            switch(i)
            {
                case 1:
                        if(gol[0]>gol[8])
                        {puan[0]=3;puan[8]=0;averaj[0]=gol[0]-gol[8];averaj[8]=gol[8]-gol[0];}
                        else if(gol[8]>gol[0])
                        {puan[0]=0;puan[8]=3;averaj[0]=gol[0]-gol[8];averaj[8]=gol[8]-gol[0];}
                        else
                        {puan[0]=1;puan[8]=1;averaj[0]=gol[0]-gol[8];averaj[8]=gol[8]-gol[0];}

                        if(gol[1]>gol[9])
                        {puan[1]=3;puan[9]=0;averaj[1]=gol[1]-gol[9];averaj[9]=gol[9]-gol[1];}
                        else if(gol[9]>gol[1])
                        {puan[1]=0;puan[9]=3;averaj[1]=gol[1]-gol[9];averaj[9]=gol[9]-gol[1];}
                        else
                        {puan[1]=1;puan[9]=1;averaj[1]=gol[1]-gol[9];averaj[9]=gol[9]-gol[1];}

                        if(gol[2]>gol[10])
                        {puan[2]=3;puan[10]=0;averaj[2]=gol[2]-gol[10];averaj[10]=gol[10]-gol[2];}
                        else if(gol[10]>gol[2])
                        {puan[2]=0;puan[10]=3;averaj[2]=gol[2]-gol[10];averaj[10]=gol[10]-gol[2];}
                        else
                        {puan[2]=1;puan[10]=1;averaj[2]=gol[2]-gol[10];averaj[10]=gol[10]-gol[2];}

                        if(gol[3]>gol[11])
                        {puan[3]=3;puan[11]=0;averaj[3]=gol[3]-gol[11];averaj[11]=gol[11]-gol[3];}
                        else if(gol[11]>gol[3])
                        {puan[3]=0;puan[11]=3;averaj[3]=gol[3]-gol[11];averaj[11]=gol[11]-gol[3];}
                        else
                        {puan[3]=1;puan[11]=1;averaj[3]=gol[3]-gol[11];averaj[11]=gol[11]-gol[3];}

                        if(gol[4]>gol[12])
                        {puan[4]=3;puan[12]=0;averaj[4]=gol[4]-gol[12];averaj[12]=gol[12]-gol[4];}
                        else if(gol[12]>gol[4])
                        {puan[4]=0;puan[12]=3;averaj[4]=gol[4]-gol[12];averaj[12]=gol[12]-gol[4];}
                        else
                        {puan[4]=1;puan[12]=1;averaj[4]=gol[4]-gol[12];averaj[12]=gol[12]-gol[4];}

                        if(gol[5]>gol[13])
                        {puan[5]=3;puan[13]=0;averaj[5]=gol[5]-gol[13];averaj[13]=gol[13]-gol[5];}
                        else if(gol[13]>gol[5])
                        {puan[5]=0;puan[13]=3;averaj[5]=gol[5]-gol[13];averaj[13]=gol[13]-gol[5];}
                        else
                        {puan[5]=1;puan[13]=1;averaj[5]=gol[5]-gol[13];averaj[13]=gol[13]-gol[5];}

                        if(gol[6]>gol[14])
                        {puan[6]=3;puan[14]=0;averaj[6]=gol[6]-gol[14];averaj[14]=gol[14]-gol[6];}
                        else if(gol[14]>gol[6])
                        {puan[6]=0;puan[14]=3;averaj[6]=gol[6]-gol[14];averaj[14]=gol[14]-gol[6];}
                        else
                        {puan[6]=1;puan[14]=1;averaj[6]=gol[6]-gol[14];averaj[14]=gol[14]-gol[6];}

                        if(gol[7]>gol[15])
                        {puan[7]=3;puan[15]=0;averaj[7]=gol[7]-gol[15];averaj[15]=gol[15]-gol[7];}
                        else if(gol[15]>gol[7])
                        {puan[7]=0;puan[15]=3;averaj[7]=gol[7]-gol[15];averaj[15]=gol[15]-gol[7];}
                        else
                        {puan[7]=1;puan[15]=1;averaj[7]=gol[7]-gol[15];averaj[15]=gol[15]-gol[7];}
                        
                        maçsonucları(0);
                        for(int j=0;j<16;j++)
                        {gol[j]=0;}
                        break;
                case 2:
                        if(gol[0]>gol[8])
                        {puan[0]+=3;puan[8]+=0;averaj[0]+=gol[0]-gol[8];averaj[8]+=gol[8]-gol[0];}
                        else if(gol[8]>gol[0])
                        {puan[0]+=0;puan[8]+=3;averaj[0]+=gol[0]-gol[8];averaj[8]+=gol[8]-gol[0];}
                        else
                        {puan[0]+=1;puan[8]+=1;averaj[0]+=gol[0]-gol[8];averaj[8]+=gol[8]-gol[0];}

                        if(gol[1]>gol[9])
                        {puan[1]+=3;puan[9]+=0;averaj[1]+=gol[1]-gol[9];averaj[9]+=gol[9]-gol[1];}
                        else if(gol[9]>gol[1])
                        {puan[1]+=0;puan[9]+=3;averaj[1]+=gol[1]-gol[9];averaj[9]+=gol[9]-gol[1];}
                        else
                        {puan[1]+=1;puan[9]+=1;averaj[1]+=gol[1]-gol[9];averaj[9]+=gol[9]-gol[1];}

                        if(gol[2]>gol[10])
                        {puan[2]+=3;puan[10]+=0;averaj[2]+=gol[2]-gol[10];averaj[10]+=gol[10]-gol[2];}
                        else if(gol[10]>gol[2])
                        {puan[2]+=0;puan[10]+=3;averaj[2]+=gol[2]-gol[10];averaj[10]+=gol[10]-gol[2];}
                        else
                        {puan[2]+=1;puan[10]+=1;averaj[2]+=gol[2]-gol[10];averaj[10]+=gol[10]-gol[2];}

                        if(gol[3]>gol[11])
                        {puan[3]+=3;puan[11]+=0;averaj[3]+=gol[3]-gol[11];averaj[11]+=gol[11]-gol[3];}
                        else if(gol[11]>gol[3])
                        {puan[3]+=0;puan[11]+=3;averaj[3]+=gol[3]-gol[11];averaj[11]+=gol[11]-gol[3];}
                        else
                        {puan[3]+=1;puan[11]+=1;averaj[3]+=gol[3]-gol[11];averaj[11]+=gol[11]-gol[3];}

                        if(gol[4]>gol[12])
                        {puan[4]+=3;puan[12]+=0;averaj[4]+=gol[4]-gol[12];averaj[12]+=gol[12]-gol[4];}
                        else if(gol[12]>gol[4])
                        {puan[4]+=0;puan[12]+=3;averaj[4]+=gol[4]-gol[12];averaj[12]+=gol[12]-gol[4];}
                        else
                        {puan[4]+=1;puan[12]+=1;averaj[4]+=gol[4]-gol[12];averaj[12]+=gol[12]-gol[4];}

                        if(gol[5]>gol[13])
                        {puan[5]+=3;puan[13]+=0;averaj[5]+=gol[5]-gol[13];averaj[13]+=gol[13]-gol[5];}
                        else if(gol[13]>gol[5])
                        {puan[5]+=0;puan[13]+=3;averaj[5]+=gol[5]-gol[13];averaj[13]+=gol[13]-gol[5];}
                        else
                        {puan[5]+=1;puan[13]+=1;averaj[5]+=gol[5]-gol[13];averaj[13]+=gol[13]-gol[5];}

                        if(gol[6]>gol[14])
                        {puan[6]+=3;puan[14]+=0;averaj[6]+=gol[6]-gol[14];averaj[14]+=gol[14]-gol[6];}
                        else if(gol[14]>gol[6])
                        {puan[6]+=0;puan[14]+=3;averaj[6]+=gol[6]-gol[14];averaj[14]+=gol[14]-gol[6];}
                        else
                        {puan[6]+=1;puan[14]+=1;averaj[6]+=gol[6]-gol[14];averaj[14]+=gol[14]-gol[6];}

                        if(gol[7]>gol[15])
                        {puan[7]+=3;puan[15]+=0;averaj[7]+=gol[7]-gol[15];averaj[15]+=gol[15]-gol[7];}
                        else if(gol[15]>gol[7])
                        {puan[7]+=0;puan[15]+=3;averaj[7]+=gol[7]-gol[15];averaj[15]+=gol[15]-gol[7];}
                        else
                        {puan[7]+=1;puan[15]+=1;averaj[7]+=gol[7]-gol[15];averaj[15]+=gol[15]-gol[7];}
                       
                        maçsonucları(1);
                        for(int j=0;j<16;j++)
                        {gol[j]=0;}
                        break;
            }
        }
    }

    public void maçsonucları(int i)
    {
        switch(i)
        {
            case 1:
                try {Thread.sleep(1500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("\nİşte 1.Maçların Sonuçları\n");try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[0]+" "+gol[0]+" - "+gol[8]+" "+takımlar[8]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[1]+" "+gol[1]+" - "+gol[9]+" "+takımlar[9]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[2]+" "+gol[2]+" - "+gol[10]+" "+takımlar[10]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[3]+" "+gol[3]+" - "+gol[11]+" "+takımlar[11]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[4]+" "+gol[4]+" - "+gol[12]+" "+takımlar[12]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[5]+" "+gol[5]+" - "+gol[13]+" "+takımlar[13]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[6]+" "+gol[8]+" - "+gol[14]+" "+takımlar[14]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[7]+" "+gol[7]+" - "+gol[15]+" "+takımlar[15]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}

            case 2:
                try {Thread.sleep(1500);} catch (Exception e) {e.printStackTrace();}
                System.out.println("\nİşte 2.Maçların Sonuçları\n");try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[8]+" "+gol[8]+" - "+gol[0]+" "+takımlar[0]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[9]+" "+gol[9]+" - "+gol[1]+" "+takımlar[1]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[10]+" "+gol[10]+" - "+gol[2]+" "+takımlar[2]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[11]+" "+gol[11]+" - "+gol[3]+" "+takımlar[3]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[12]+" "+gol[12]+" - "+gol[4]+" "+takımlar[4]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[13]+" "+gol[13]+" - "+gol[5]+" "+takımlar[5]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[14]+" "+gol[14]+" - "+gol[6]+" "+takımlar[6]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
                System.out.println(takımlar[15]+" "+gol[15]+" - "+gol[7]+" "+takımlar[7]);try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}
        }
    }

        // 0-8  1-9  2-10  3-11  4-12  5-13  6-14  7-15
    String son8[] = new String[8];
    int[] son8Guc = new int[8];
    public void son8Kalantakımlar()
    {
        if(puan[0]>puan[8])
        {son8[0]=takımlar[0]; son8Guc[0]=guc[0];}
        else if(puan[8]>puan[0])
        {son8[0]=takımlar[8];son8Guc[0]=guc[8];}
        else
        {
            if(averaj[0]>averaj[8])
            {son8[0]=takımlar[0];son8Guc[0]=guc[0];}
            else if(averaj[8]>averaj[0])
            {son8[0]=takımlar[8];son8Guc[0]=guc[8];}
            else 
            {son8[0]=takımlar[0];son8Guc[0]=guc[0];}
        }

        if(puan[1]>puan[9])
        {son8[1]=takımlar[1]; son8Guc[1]=guc[1];}
        else if(puan[9]>puan[1])
        {son8[1]=takımlar[9];son8Guc[1]=guc[9];}
        else
        {
            if(averaj[1]>averaj[9])
            {son8[1]=takımlar[1];son8Guc[1]=guc[1];}
            else if(averaj[9]>averaj[1])
            {son8[1]=takımlar[9];son8Guc[1]=guc[9];}
            else 
            {son8[1]=takımlar[1];son8Guc[1]=guc[1];}
        }
        
        if(puan[2]>puan[10])
        {son8[2]=takımlar[2]; son8Guc[2]=guc[0];}
        else if(puan[10]>puan[2])
        {son8[2]=takımlar[10];son8Guc[2]=guc[10];}
        else
        {
            if(averaj[2]>averaj[10])
            {son8[2]=takımlar[2];son8Guc[2]=guc[2];}
            else if(averaj[10]>averaj[2])
            {son8[2]=takımlar[10];son8Guc[2]=guc[10];}
            else 
            {son8[2]=takımlar[2];son8Guc[2]=guc[2];}
        }

        if(puan[3]>puan[11])
        {son8[3]=takımlar[3]; son8Guc[3]=guc[3];}
        else if(puan[11]>puan[3])
        {son8[3]=takımlar[11];son8Guc[3]=guc[11];}
        else
        {
            if(averaj[3]>averaj[11])
            {son8[3]=takımlar[3];son8Guc[3]=guc[3];}
            else if(averaj[11]>averaj[3])
            {son8[3]=takımlar[11];son8Guc[3]=guc[11];}
            else 
            {son8[3]=takımlar[3];son8Guc[3]=guc[3];}
        }

        if(puan[4]>puan[12])
        {son8[4]=takımlar[4]; son8Guc[4]=guc[4];}
        else if(puan[12]>puan[4])
        {son8[4]=takımlar[12];son8Guc[4]=guc[12];}
        else
        {
            if(averaj[4]>averaj[12])
            {son8[4]=takımlar[4];son8Guc[4]=guc[4];}
            else if(averaj[12]>averaj[4])
            {son8[4]=takımlar[12];son8Guc[4]=guc[12];}
            else 
            {son8[4]=takımlar[4];son8Guc[4]=guc[4];}
        }
    
        if(puan[5]>puan[13])
        {son8[5]=takımlar[5]; son8Guc[5]=guc[5];}
        else if(puan[13]>puan[5])
        {son8[5]=takımlar[13];son8Guc[5]=guc[13];}
        else
        {
            if(averaj[5]>averaj[13])
            {son8[5]=takımlar[5];son8Guc[5]=guc[5];}
            else if(averaj[13]>averaj[5])
            {son8[5]=takımlar[13];son8Guc[5]=guc[13];}
            else 
            {son8[5]=takımlar[5];son8Guc[5]=guc[5];}
        }
        
        if(puan[6]>puan[14])
        {son8[6]=takımlar[6]; son8Guc[6]=guc[6];}
        else if(puan[14]>puan[6])
        {son8[6]=takımlar[14];son8Guc[6]=guc[6];}
        else
        {
            if(averaj[6]>averaj[14])
            {son8[6]=takımlar[6];son8Guc[6]=guc[6];}
            else if(averaj[14]>averaj[6])
            {son8[6]=takımlar[14];son8Guc[6]=guc[14];}
            else 
            {son8[6]=takımlar[6];son8Guc[6]=guc[6];}
        }

        if(puan[7]>puan[15])
        {son8[7]=takımlar[7]; son8Guc[7]=guc[7];}
        else if(puan[15]>puan[7])
        {son8[7]=takımlar[15];son8Guc[7]=guc[15];}
        else
        {
            if(averaj[7]>averaj[15])
            {son8[7]=takımlar[7];son8Guc[7]=guc[7];}
            else if(averaj[15]>averaj[7])
            {son8[7]=takımlar[15];son8Guc[7]=guc[15];}
            else 
            {son8[7]=takımlar[7];son8Guc[7]=guc[7];}
        }
        
    }
}
