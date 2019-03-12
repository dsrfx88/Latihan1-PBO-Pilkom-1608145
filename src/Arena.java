/*
     Menjalankan pertarungan antar dua robot

 */

public class Arena{
    private Robot robot1;
    private Robot robot2;

    public void tambahRobot(Robot r1,Robot r2) {
        robot1 = r1;
        robot2 = r2;
    }

    public void bertanding() {
        //UI sederhana untuk pertandingan

        //loop sampai salah satu robot habis skor kesehatannya
        boolean isSelesai = false;

        //LENGKAPI dengan NIM dan NAMA
        System.out.println("Saya berjanji tdk berbuat curang dan/atau membantu orang lain berbuat curang");
        System.out.println(" Latihan 1 6 Maret ");
        System.out.println(" NIM NAMA ");
        System.out.println(" 1608145 Faradissa Nurul Faidah ");                      //nomor 1

        System.out.print("Pertandingan dimulai =====\n");


        //player
        Robot robotAktif = robot1;
        Robot robotPasif = robot2;

        while (!isSelesai) {
            System.out.println("");
            System.out.println("Giliran robot:"+robotAktif.nama);
            System.out.println("Robot menyerang dengan senjata "+robotAktif.oSenjata.namaSenjata);      //nomor 3
            robotAktif.serang(robotPasif);
            //print kesehatan
            robot1.printStatistik();
            robot2.printStatistik();
            //tukar peran
            Robot temp = robotAktif; //supaya tdk tertimpa
            robotAktif = robotPasif;
            robotPasif = temp;

            //stop jika salah satu robot skor kesehatanya nol
            isSelesai = (robotAktif.kesehatan<=0 || robotPasif.kesehatan<=0);
        }
        System.out.println("Pertandingan Selesai");

        //cek pemenang
        if (robotAktif.kesehatan>0){                                                 //nomor 2
            System.out.println("Pemenang adalah "+robotAktif.nama);
        }else{
            System.out.println("Pemenang adalah "+robotPasif.nama);
        }

    }


    public static void main(String [] args) {
        //buat arena
        Arena oArena = new Arena();

        //siapkan robot
        Robot robot1 = new Robot("Robot pertama");
        Robot robot2 = new Robot("Robot kedua");

        //tambahkan senjata ke robot
        //Senjata oSenjataPukulan1 = new SenjataPukulan();
        //robot1.tambahSenjata(oSenjataPukulan1);
        Senjata oSenjataKilat = new SenjataKilat();                                 //pembuatan objek class SenjataKilat untuk nomor 4
        Senjata oSenjataPukulanTambahan1 = new SenjataPukulan();
        Perisai oPerisai1 = new Perisai();
        robot1.tambahSenjata(oSenjataKilat);
        robot1.pakaiPerisai(oPerisai1);
        robot1.tambahSenjataLagi(oSenjataPukulanTambahan1);

        Senjata oSenjataPukulan2 = new SenjataPukulan();
        Senjata oSenjataPukulanTambahan2 = new SenjataPukulan();
        Perisai oPerisai2 = new Perisai();
        robot2.tambahSenjata(oSenjataPukulan2);
        robot2.pakaiPerisai(oPerisai2);
        robot2.tambahSenjataLagi(oSenjataPukulanTambahan2);

        //tambahkan robot ke arena
        oArena.tambahRobot(robot1,robot2);

        //mainkan
        oArena.bertanding();

    }

}
