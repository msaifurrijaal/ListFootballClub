package com.example.projectakhir

object FootballsData {
    private val footballNames = arrayOf(
        "Arsenal",
        "Barcelona",
        "Chelsea",
        "Borussia Dortmund",
        "Inter Milan",
        "Juventus",
        "Liverpool",
        "Real Madrid",
        "Manchester United",
        "Paris Saint-Germain")

    private val footballDetails = arrayOf(
        "Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square.",
        "Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square.",
        "Chelsea Football Club adalah sebuah klub sepak bola yang bermarkas di Fulham, London. Didirikan pada 1905, klub ini kini berkompetisi di Liga Utama Inggris dan memainkan pertandingan kandang mereka di Stamford Bridge.",
        "Ballspielverein Borussia 09 e.V. Dortmund umumnya dikenal sebagai Borussia Dortmund, atau disingkat sebagai BVB, adalah klub sepak bola Jerman yang berbasis di Dortmund, Rhine-Westphalia Utara.",
        "Football Club Internazionale Milano, atau yang dikenal dengan nama Internazionale ataupun juga Inter, dan bahasa sehari-hari dikenal sebagai Inter Milan di luar Italia, adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia.",
        "Juventus Football Club S.p.A., biasa disebut sebagai Juventus dan populer dengan nama Juve, adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte.",
        "Liverpool Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya.",
        "Real Madrid Club de Fútbol, umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih.",
        "Manchester United Football Club adalah sebuah klub sepak bola profesional yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Utama Inggris dengan gelar Liga Utama Inggris terbanyak sepanjang masa.",
        "Paris Saint-Germain atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan Stade Saint-Germain.")

    private val footballImages = intArrayOf(R.drawable.arsenal,
            R.drawable.barca,
            R.drawable.chelsea,
            R.drawable.dortmun,
            R.drawable.inter,
            R.drawable.juve,
            R.drawable.liverpool,
            R.drawable.madrid,
            R.drawable.mu,
            R.drawable.psg)

    val listData : ArrayList<Football>
        get() {
            val list = arrayListOf<Football>()
            for (position in footballNames.indices) {
                val football = Football()
                football.name = footballNames[position]
                football.detail = footballDetails[position]
                football.photo = footballImages[position]
                list.add(football)
            }
            return list
        }
}