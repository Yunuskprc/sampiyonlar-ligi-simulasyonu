import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class gruba {

    private String[] takımlar = new String[4];
    private int[] guc = new int[4];
    private int[] golSayi = new int[4]; // güç puanı ile toplanacak şansa bağlı değerler;
    private Connection conn;
    private Statement st;

    private String takımAdlarDizi[] = { "select *from grupa", "select *from grupb", "select *from grupc",
            "select *from grupd", "select *from grupe", "select *from grupf", "select *from grupg",
            "select *from gruph" };

    public void takımAdlar(int takımAdlarDiziDeger) // takımlar ve güc dizilerine veritabınından verileri
    {
        int i = 0;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(takımAdlarDizi[takımAdlarDiziDeger]);
            while (rs.next()) {
                takımlar[i] = rs.getString("takımAD");
                guc[i] = Integer.parseInt(rs.getString("takımGÜC"));
                i++;
            }
            conn.close();
            st.close();
            rs.close();
            i=0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String tabloDizi[] = { "select *from grupa ORDER BY puan DESC", "select *from grupb ORDER BY puan DESC",
            "select *from grupc ORDER BY puan DESC", "select *from grupd ORDER BY puan DESC",
            "select *from grupe ORDER BY puan DESC", "select *from grupf ORDER BY puan DESC",
            "select *from grupg ORDER BY puan DESC", "select *from gruph ORDER BY puan DESC" };

    // üstteki dizi kalıtımda kod tekrarınından kurtarmak içindir.
    public void tablo(int tabloDiziDeger) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(tabloDizi[tabloDiziDeger]);

            while (rs.next()) {
                System.out.println(rs.getString("takımAD") + " " + rs.getString("OM") + " " + rs.getString("averaj")
                        + " " + rs.getString("puan"));
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tabloTakımlar(int tabloDiziDeger) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(tabloDizi[tabloDiziDeger]);

            while (rs.next()) {
                System.out.print(rs.getString("takımAD") + "  ");
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void golSayiHesapla() {
        int i = 0;
        for (i = 0; i < 4; i++) {
            golSayi[i] = (guc[i] + (int) (Math.random() * 15 + 1)) / 6;
        }
    }

    private int[] averaj1 = { 0, 0, 0, 0 };
    private int[] puan1 = { 0, 0, 0, 0 };
    private String grupStringleri[] = { "update grupa set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupb set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupc set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupd set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupe set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupf set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update grupg set OM=%d, averaj=%d, puan=%d where takımNO=%d",
            "update gruph set OM=%d, averaj=%d, puan=%d where takımNO=%d" };
    // üstteki dizi kalıtımda kod tekrarınından kurtarmak içindir.

    public void macProgramı(int hafta) {
        switch (hafta) {
            case 1:
                System.out.println(takımlar[0] + " - " + takımlar[3]);
                System.out.println(takımlar[1] + " - " + takımlar[2] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println(takımlar[0] + " - " + takımlar[2]);
                System.out.println(takımlar[1] + " - " + takımlar[3] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println(takımlar[0] + " - " + takımlar[1]);
                System.out.println(takımlar[2] + " - " + takımlar[3] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println(takımlar[3] + " - " + takımlar[0]);
                System.out.println(takımlar[2] + " - " + takımlar[1] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                System.out.println(takımlar[2] + " - " + takımlar[0]);
                System.out.println(takımlar[3] + " - " + takımlar[1] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                System.out.println(takımlar[1] + " - " + takımlar[0]);
                System.out.println(takımlar[3] + " - " + takımlar[2] + "\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public void takımEsle(int grupStr, int haftasayac) {
        String sorgu1, sorgu2;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (haftasayac) {
            case 1:
                golSayiHesapla();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                if (golSayi[0] > golSayi[3]) {

                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[0], puan1[0], 1);

                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[3], puan1[3], 4);

                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[0],
                            puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[3],
                            puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[0],
                            puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[3],
                            puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (golSayi[1] > golSayi[2]) {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 3;
                    puan1[2] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[2] > golSayi[1]) {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 0;
                    puan1[2] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 1;
                    puan1[2] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 1,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 1,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(takımlar[0] + " " + golSayi[0] + " - " + golSayi[3] + " " + takımlar[3]);
                System.out.println(takımlar[1] + " " + golSayi[1] + " - " + golSayi[2] + " " + takımlar[2] + "\n");
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;

            case 2:
                golSayiHesapla();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                if (golSayi[0] > golSayi[2]) {

                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 3;
                    puan1[2] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[2] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 0;
                    puan1[2] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 1;
                    puan1[2] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (golSayi[1] > golSayi[3]) {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[1]) {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 2,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 2,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(takımlar[0] + " " + golSayi[0] + " - " + golSayi[2] + " " + takımlar[2]);
                System.out.println(takımlar[1] + " " + golSayi[1] + " - " + golSayi[3] + " " + takımlar[3]);
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;

            case 3:
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                golSayiHesapla();
                if (golSayi[0] > golSayi[1]) {

                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 3;
                    puan1[1] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[1], puan1[1], 2);

                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[1] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 0;
                    puan1[1] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[1], puan1[1], 2);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 1;
                    puan1[1] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[1], puan1[1], 2);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // 3-4
                if (golSayi[2] > golSayi[3]) {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[2]) {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 3,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 3,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(takımlar[0] + " " + golSayi[0] + " - " + golSayi[1] + " " + takımlar[1]);
                System.out.println(takımlar[2] + " " + golSayi[2] + " - " + golSayi[3] + " " + takımlar[3]);
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;

            case 4:
                golSayiHesapla();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                if (golSayi[0] > golSayi[3]) {

                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[0], puan1[0], 1);

                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[3], puan1[3], 4);

                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[0],
                            puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[3],
                            puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[0];
                    puan1[0] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[0],
                            puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[3],
                            puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (golSayi[1] > golSayi[2]) {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 3;
                    puan1[2] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[2] > golSayi[1]) {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 0;
                    puan1[2] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[1] += golSayi[1] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[1];
                    puan1[1] += 1;
                    puan1[2] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 4,
                            averaj1[1],
                            puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 4,
                            averaj1[2],
                            puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(takımlar[3] + " " + golSayi[3] + " - " + golSayi[0] + " " + takımlar[0]);
                System.out.println(takımlar[2] + " " + golSayi[2] + " - " + golSayi[1] + " " + takımlar[1]);
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;
            case 5:
                golSayiHesapla();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                if (golSayi[0] > golSayi[2]) {

                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 3;
                    puan1[2] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[2] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 0;
                    puan1[2] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[2];
                    averaj1[2] += golSayi[2] - golSayi[0];
                    puan1[0] += 1;
                    puan1[2] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[2], puan1[2], 3);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (golSayi[1] > golSayi[3]) {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[1]) {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[1] += golSayi[1] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[1];
                    puan1[1] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 5,
                            averaj1[1], puan1[1], 2);
                    sorgu2 = String.format(grupStringleri[grupStr], 5,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(takımlar[2] + " " + golSayi[2] + " - " + golSayi[0] + " " + takımlar[0]);
                System.out.println(takımlar[3] + " " + golSayi[3] + " - " + golSayi[1] + " " + takımlar[1]);
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;
            case 6:
                golSayiHesapla();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                if (golSayi[0] > golSayi[1]) {

                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 3;
                    puan1[1] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[1], puan1[1], 2);

                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[1] > golSayi[0]) {
                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 0;
                    puan1[1] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[1], puan1[1], 2);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[0] += golSayi[0] - golSayi[1];
                    averaj1[1] += golSayi[1] - golSayi[0];
                    puan1[0] += 1;
                    puan1[1] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[0], puan1[0], 1);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[1], puan1[1], 2);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // 3-4
                if (golSayi[2] > golSayi[3]) {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 3;
                    puan1[3] += 0;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (golSayi[3] > golSayi[2]) {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 0;
                    puan1[3] += 3;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    averaj1[2] += golSayi[2] - golSayi[3];
                    averaj1[3] += golSayi[3] - golSayi[2];
                    puan1[2] += 1;
                    puan1[3] += 1;
                    sorgu1 = String.format(grupStringleri[grupStr], 6,
                            averaj1[2], puan1[2], 3);
                    sorgu2 = String.format(grupStringleri[grupStr], 6,
                            averaj1[3], puan1[3], 4);
                    try {
                        st = conn.createStatement();
                        st.executeUpdate(sorgu1);
                        st.executeUpdate(sorgu2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(takımlar[1] + " " + golSayi[1] + " - " + golSayi[0] + " " + takımlar[0]);
                System.out.println(takımlar[3] + " " + golSayi[3] + " - " + golSayi[2] + " " + takımlar[2]);
                golSayi[0] = 0;
                golSayi[1] = 0;
                golSayi[2] = 0;
                golSayi[3] = 0;

                break;
        }
    }

    
    public String[] takımlarSon16 = new String[4];
    public int[] averajDizi = new int[4];
    public  int[] puanDizi = new int[4];

    public void puanaGöreSıralama(int dizideger)
    {
        int i=0;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(tabloDizi[dizideger]);
            while (rs.next()) {
                puanDizi[i]=Integer.parseInt(rs.getString("puan"));
                takımlarSon16[i]=rs.getString("takımAD");
                guc[i]=Integer.parseInt(rs.getString("takımGÜC"));
                i++;
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    private String tabloDiziAveraj[] = { "select *from grupa ORDER BY averaj DESC", "select *from grupb ORDER BY averaj DESC","select *from grupc ORDER BY averaj DESC", "select *from grupd ORDER BY averaj DESC", "select *from grupe ORDER BY averaj DESC", "select *from grupf ORDER BY averaj DESC", "select *from grupg ORDER BY averaj DESC", "select *from gruph ORDER BY averaj DESC" };
    public void averajaGöreSıralama(int dizideger)
    {
        int i=0;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gruplar", "root", "Unutma23.");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(tabloDiziAveraj[dizideger]);
            while (rs.next()) {
                averajDizi[i]=Integer.parseInt(rs.getString("averaj"));
                i++;
            }
            conn.close();
            st.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    public  int[] son16Guc = new int[2];
    public  String son16Dizi[] = new String[2];

    public void son16belirle(int dizideger)
    {
        puanaGöreSıralama(dizideger);
        averajaGöreSıralama(dizideger);
        // alttaki if de puanlar aynı olunca yapıkacak olan listeleme
        if(puanDizi[0]==puanDizi[1] && puanDizi[0]==puanDizi[2] && puanDizi[0]==puanDizi[3])
        {    
            if(averajDizi[0]>averajDizi[1] && averajDizi[0]>averajDizi[2] && averajDizi[0]>averajDizi[3])
            {
                if(averajDizi[1]>averajDizi[2] && averajDizi[1]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımAdlarDizi[1];son16Guc[0]=guc[0];son16Guc[1]=guc[1];}
                else if(averajDizi[2]>averajDizi[1] && averajDizi[2]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımAdlarDizi[2];son16Guc[0]=guc[0];son16Guc[1]=guc[2];}
                else if(averajDizi[3]>averajDizi[1] && averajDizi[3]>averajDizi[1])
                {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımAdlarDizi[3];son16Guc[0]=guc[0];son16Guc[1]=guc[3];}
            }
            else if(averajDizi[1]>averajDizi[0] && averajDizi[1]>averajDizi[2] && averajDizi[1]>averajDizi[3])
            {
                if(averajDizi[0]>averajDizi[2] && averajDizi[0]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[1];son16Dizi[1]=takımAdlarDizi[0];son16Guc[0]=guc[1];son16Guc[1]=guc[0];}
                else if(averajDizi[2]>averajDizi[0] && averajDizi[2]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[1];son16Dizi[1]=takımAdlarDizi[2];son16Guc[0]=guc[1];son16Guc[1]=guc[2];}
                else if(averajDizi[3]>averajDizi[0] && averajDizi[3]>averajDizi[2])
                {son16Dizi[0]=takımlarSon16[1];son16Dizi[1]=takımAdlarDizi[3];son16Guc[0]=guc[1];son16Guc[1]=guc[3];}
            }
            else if(averajDizi[2]>averajDizi[0] && averajDizi[2]>averajDizi[1] && averajDizi[2]>averajDizi[3])
            {
                if(averajDizi[0]>averajDizi[1] && averajDizi[0]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[2];son16Dizi[1]=takımAdlarDizi[0];son16Guc[0]=guc[2];son16Guc[1]=guc[0];}
                else if(averajDizi[1]>averajDizi[0] && averajDizi[1]>averajDizi[3])
                {son16Dizi[0]=takımlarSon16[2];son16Dizi[1]=takımAdlarDizi[1];son16Guc[0]=guc[2];son16Guc[1]=guc[1];}
                else if(averajDizi[3]>averajDizi[1] && averajDizi[3]>averajDizi[0])
                {son16Dizi[0]=takımlarSon16[2];son16Dizi[1]=takımAdlarDizi[3];son16Guc[0]=guc[2];son16Guc[1]=guc[3];}
            }
            else if(averajDizi[3]>averajDizi[0] && averajDizi[3]>averajDizi[1] && averajDizi[3]>averajDizi[2])
            {
                if(averajDizi[0]>averajDizi[1] && averajDizi[0]>averajDizi[2])
                {son16Dizi[0]=takımlarSon16[3];son16Dizi[1]=takımAdlarDizi[0];son16Guc[0]=guc[3];son16Guc[1]=guc[0];}
                else if(averajDizi[1]>averajDizi[0] && averajDizi[1]>averajDizi[2])
                {son16Dizi[0]=takımlarSon16[3];son16Dizi[1]=takımAdlarDizi[1];son16Guc[0]=guc[3];son16Guc[1]=guc[1];}
                else if(averajDizi[2]>averajDizi[1] && averajDizi[2]>averajDizi[0])
                {son16Dizi[0]=takımlarSon16[3];son16Dizi[1]=takımAdlarDizi[2];son16Guc[0]=guc[3];son16Guc[1]=guc[2];}
            }
        }
        // alttaki if elsete ilk üçünün puanı aynı ise yapıkacaj olan listeme
        else if(puanDizi[0]==puanDizi[1] && puanDizi[0]==puanDizi[2])
        {
            if(averajDizi[0]>averajDizi[2] && averajDizi[0]>averajDizi[1])
            {
                if(averajDizi[1]>averajDizi[2])
                {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[1];son16Guc[0]=guc[0];son16Guc[1]=guc[1];}
                else
                {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[2];son16Guc[0]=guc[0];son16Guc[1]=guc[2];}
            }
            else if(averajDizi[1]>averajDizi[2] && averajDizi[1]>averajDizi[0])
            {
                if(averajDizi[0]>averajDizi[2])
                {son16Dizi[0]=takımlarSon16[1];son16Dizi[1]=takımlarSon16[0];son16Guc[0]=guc[1];son16Guc[1]=guc[0];}
                else
                {son16Dizi[0]=takımlarSon16[1];son16Dizi[1]=takımlarSon16[2];son16Guc[0]=guc[1];son16Guc[1]=guc[2];}
            }
            else if(averajDizi[2]>averajDizi[1] && averajDizi[2]>averajDizi[0])
            {
                if(averajDizi[0]>averajDizi[1])
                {son16Dizi[0]=takımlarSon16[2];son16Dizi[1]=takımlarSon16[0];son16Guc[0]=guc[2];son16Guc[1]=guc[0];}
                else
                {son16Dizi[0]=takımlarSon16[2];son16Dizi[1]=takımlarSon16[1];son16Guc[0]=guc[2];son16Guc[1]=guc[1];}
            }
            
        }
        // 1 ve 2.nin puanları aynıysa olacak olan listeleme
        else if(puanDizi[0]==puanDizi[1])
        {
            if(averajDizi[0]>averajDizi[1])
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[1];son16Guc[0]=guc[0];son16Guc[1]=guc[1];}
            else
            {son16Dizi[1]=takımlarSon16[1];son16Dizi[1]=takımlarSon16[0];son16Guc[0]=guc[1];son16Guc[1]=guc[0];}
        }
        //üstteki if elselerde puan tablosunda 1.likler paylaşıldığı durumları yapıldı altta ise sırayla 2-3-4 ün ve 2-3 ün aynı olduğu durumlar vardır
        else if(puanDizi[1]==puanDizi[2] && puanDizi[1]==puanDizi[3])
        {
            if(averajDizi[1]>averajDizi[2] && averajDizi[1]>averajDizi[3])
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[1];son16Guc[0]=guc[0];son16Guc[1]=guc[1];}
            else if(averajDizi[2]>averajDizi[1] && averajDizi[2]>averajDizi[3])
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[2];son16Guc[0]=guc[0];son16Guc[1]=guc[2];}
            else if(averajDizi[3]>averajDizi[2] && averajDizi[3]>averajDizi[1])
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[3];son16Guc[0]=guc[0];son16Guc[1]=guc[3];}
        }
        else if(puanDizi[1]==puanDizi[2])
        {
            if(averajDizi[1]>averajDizi[2])
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[1];son16Guc[0]=guc[0];son16Guc[1]=guc[1];}
            else
            {son16Dizi[0]=takımlarSon16[0];son16Dizi[1]=takımlarSon16[2];son16Guc[0]=guc[0];son16Guc[1]=guc[2];}
        }
        else if(puanDizi[0]!=puanDizi[1] && puanDizi[0]!=puanDizi[2] && puanDizi[0]!=puanDizi[3] && puanDizi[1]!=puanDizi[2] && puanDizi[2]!=puanDizi[3])
        {
            son16Dizi[0]=takımlarSon16[0];son16Guc[0]=guc[0];
            son16Dizi[1]=takımlarSon16[1];son16Guc[1]=guc[1];
        }
        else if(puanDizi[2]==puanDizi[3])
        {
            son16Dizi[0]=takımlarSon16[0];son16Guc[0]=guc[0];
            son16Dizi[1]=takımlarSon16[1];son16Guc[1]=guc[1];
        }
    }
}
