package com.dicoding.picodiploma.mysubmission;

import java.util.ArrayList;

public class GamesData {

    private static String[] gameNames = {
            "Tetris",
            "Minecraft",
            "Grand Theft Auto V",
            "Wii Sports",
            "Player Unknown Battlegrounds (PUBG)",
            "Pokemon Red/Blue/Green/Yellow",
            "Super Mario Bros",
            "Mario Kart Wii",
            "Wii Sports Resort",
            "Diablo III"
    };

    private static String[] gameDetails = {
            "Permainan dimana berbagai macam tetromino yang terdiri dari empat balok akan jatuh. Tujuan dari permainan ini adalah dengan memanipulasi tetromino yang jatuh, dengan menggerakannya ke samping atau memutarnya, sehingga akan terbentuk garis horizontal tanpa celah yang akan menghilang. Permainan berakhir jika tetromino berikutnya terhalang sehingga tidak bisa masuk",
            "Minecraft difokuskan pada kreativitas dan pembangunan, yang memungkinkan pemain untuk membangun apapun dari kubus bertekstur dalam dunia 3D",
            "Game aksi dan petualangan yang berlatarbelakang negara fiktif di Amerika Serikat yakni San Andreas. Untuk pertama kalinya dalam GTA, tokoh protagonis bukan hanya satu melainkan tiga, yakni Franklin Clinton, Michael dan Trevor Philips",
            "Permainan berisi kumpulan dari 5 simulasi olahraga antara lain tenis, baseball, bowling, golf, dan tinju. Pemain menggunakan Wii Remote untuk meniru aksi yang dilakukan dalam olahraga kehidupan nyata",
            "Permainan genre battle royale yang bisa dimainkan dengan 100 orang sekaligus secara daring. 100 orang tersebut akan berusaha bertahan hidup dengan saling membunuh di suatu pulau",
            "Permainan mengumpulkan bermacam jenis monster untuk ditangkap dan dilatih guna menjadi Pokemon Trainer terhebat di seluruh daratan Kanto",
            "Tujuan permainan ini menjelajahi Kerajaan Jamur, menghancurkan dan melawan prajurit Bowser, serta menyelamatkan Putri Toadstool di tingkat akhir dengan menginjak sambil melompati musuh",
            "Permainan mengendalikan salah satu dari karakter Mario untuk berpartisipasi dalam balapan menggunakan karts yang menggunakan sensor gerak Wii untuk memberikan kontrol kemudi",
            "Permainan olahraga yang bertempat di pantai pulau Wuhu dimana tersedia 12 macam olahraga untuk dimainkan menggunskan kontrol Wii",
            "Permainan online hack and slash dungeon dimana pemain menggunakan armor dan senjata untuk melawan monster yang berada dalam game. Terdapat 7 pilihan kelas dalam game ini dengan beragam skill yang unik"
    };

    private static int[] gameImages = {
            R.drawable.tetris,
            R.drawable.minecraft,
            R.drawable.gta,
            R.drawable.wiisport,
            R.drawable.pubg,
            R.drawable.pokemon,
            R.drawable.supermario,
            R.drawable.mariokart,
            R.drawable.wiisport,
            R.drawable.diablo
    };

    static ArrayList<Game> getListData() {
        ArrayList<Game> list = new ArrayList<>();
        for(int position = 0; position< gameNames.length; position++) {
            Game game = new Game();
            game.setName(gameNames[position]);
            game.setDetail(gameDetails[position]);
            game.setPhoto(gameImages[position]);
            list.add(game);
        }
        return list;
    }
}
