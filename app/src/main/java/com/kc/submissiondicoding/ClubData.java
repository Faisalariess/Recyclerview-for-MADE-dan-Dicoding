package com.kc.submissiondicoding;

import java.util.ArrayList;

public class ClubData {

    public static String [][] data = new String[][]{
            {"Persebaya", "Surabaya - Jawa Timur", "https://i.ibb.co/WswjQKq/Logo-Persebaya-Surabaya.png",
            "sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama Soerabajasche Indische Voetbal Bond (SIVB) dan sudah malang melintang dikancah sepak bola Indonesia. Sempat di bekukan oleh PSSI dan disahkan kembali oleh PSSI sebagai anggota di Kongres Tahunan PSSI Bandung pada tanggal 8 Januari 2017."},
            {"Persib", "Bandung - Jawa Barat", "https://i.ibb.co/9twxHb6/Logo-Persib.png",
            "sebuah tim sepak bola Indonesia terbesar yang berdiri pada 14 Maret 1933, klub ini berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 2019 Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama."},
            {"Persija", "Jakarta - DKI Jakarta", "https://i.ibb.co/x3Pkv0n/Logo-Persija-Jakarta.jpg",
            "sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra (VIJ)"},
            {"PSIS", "Semarang - Jawa tengah", "https://i.ibb.co/mDmqK3H/PSIS-Semarang-logo.png",
            "klub sepak bola yang bermarkas di kota Semarang, Indonesia dengan tempat berlatih dan bertanding di Stadion Jatidiri Semarang. Julukan klub ini adalah \"Laskar Mahesa Jenar\". PSIS Semarang adalah klub pertama di Liga Indonesia yang pernah menjadi juara Divisi Utama (1999) dan kemudian terdegradasi ke divisi I pada musim berikutnya (2000)."},
            {"PSM", "Makassar - Sulawesi Selatan", "https://i.ibb.co/0rQcMJ8/Logo-PSM-Makasar-Baru.png",
            "sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasuka Ramang atau Juku Eja."},
            {"Persipura", "Jayapura - Papua", "https://i.ibb.co/1XQB9Tv/Logo-Persipura-Jayapura.png",
            "sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013. Persipura juga dikenal sebagai klub bola yang melahirkan pemain lokal yang berkualitas internasional"},
            {"Bali United", "Denpasar - Bali", "https://i.ibb.co/c3C7Xnc/Bali-United-logo.png",
            "sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam) yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama."},
            {"Sriwijaya Fc", "Palembang - Sumatera Selatan", "https://i.ibb.co/X4fgp54/Logo-Sriwijaya-FC-2009.png",
            "sebuah klub sepak bola Indonesia yang bermarkas di Palembang. Tim berjuluk Laskar Wong Kito ini merupakan tim yang dimiliki oleh PT Sriwijaya Optimis Mandiri (PT SOM) setelah terjadi penjualan opsi kepemilikan dari Pemerintah Provinsi Sumatra Selatan."},
            {"Madura United", "Madura - Jawa Timur", "https://i.ibb.co/wg803HR/MADURA-UNITED.jpg",
            "klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia."},
            {"Borneo FC", "Samarinda - Kalimantan timur", "https://i.ibb.co/n3WB7Yr/Logo-Borneo-FC.png",
            "klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur. Klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014, menggantikan Persisam Samarinda sebagai Klub asal samarinda, Kalimantan Timur. Pada 2015, mereka berlaga di Indonesia Super League berstatus sebagai klub promosi. Menjalani dua laga pada ISL 2015, langkah PBFC akhirnya terhenti setelah PSSI dan kompetisi dibekukan Menpora RI. Selepas itu, mereka terjun di Piala Presiden, sekaligus sukses menembus Babak 8 Besar."},
            {"PSS", "Sleman - Yogyakarta", "https://i.ibb.co/t2CN0N4/Logo-PSS-Ring-Merah.png",
            "sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. Klub yang didirikan pada 20 Mei 1976 ini merupakan salah satu klub sepak bola yang disegani di Indonesia dan memiliki julukan sebagai tim Super Elang Jawa atau Super Elja. Klub ini juga sering disebut dengan julukan Laskar Sembada. Mereka bermain di Liga 1 dalam sebuah kompetisi sepak bola Indonesia, Liga Indonesia."},
            {"PSIM", "Yogyakarta - Yogyakarta", "https://i.ibb.co/nMRS4d7/PSIM.png",
            "Persatuan Sepak Bola Indonésia Mataram Ngayogyakarta) adalah sebuah klub sepak bola di Yogyakarta yang didirikan pada 5 September 1929 dengan nama awal Persatuan Sepakraga Mataram (PSM). Nama Mataram digunakan karena Yogyakarta merupakan pusat pemerintahan kerajaan Mataram (Ngayogyakarta Hadiningrat). Kemudian pada tanggal 27 Juli 1930 nama PSM diubah menjadi PSIM seperti yang dikenal sekarang. Salah satu pemain PSIM yang menjadi legenda bagi sepak bola Indonesia adalah R. Maladi yang merupakan kiper PSIM dalam kompetisi Perserikatan 1931."}
    };

    public static ArrayList<Club> getListData(){
        Club club = null;
        ArrayList<Club> list = new ArrayList<>();
        for (String[] aData : data) {
            club = new Club();
            club.setName(aData[0]);
            club.setRemark(aData[1]);
            club.setPhoto(aData[2]);
            club.setDetail(aData[3]);
            list.add(club);
        }

        return list;
    }

}
