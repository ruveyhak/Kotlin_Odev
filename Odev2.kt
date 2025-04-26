
fun main() {
    println("Fahrenheit: ${dereceToFahrenheit(25.0)}")
    println("Dikdörtgen Çevresi: ${dikdortgenCevresi(5, 10)}")
    println("Faktöriyel: ${faktoriyel(5)}")
    println("A harfi sayısı: ${kelimeIcindekiA("Ankara")}")
    println("İç Açı Toplamı: ${icAciToplami(5)}")
    println("Maaş Hesabı: ${maasHesabi(22)}")
    println("Kota Ücreti: ${kotaUcreti(55)}")
}

// 1. Dereceyi Fahrenheit’a çeviren metot
fun dereceToFahrenheit(c: Double): Double {
    return c * 1.8 + 32
}

// 2. Dikdörtgen çevresi hesaplayan metot
fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}

// 3. Faktöriyel hesaplayan metot
fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelime içinde kaç adet 'a' harfi olduğunu sayan metot
fun kelimeIcindekiA(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

// 5. Çokgenin iç açıları toplamı hesaplayan metot
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 6. Maaş hesabı yapan metot
fun maasHesabi(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    val mesaiSaati = if (calismaSaati > 160) calismaSaati - 160 else 0
    val normalSaat = calismaSaati - mesaiSaati
    return (normalSaat * 10) + (mesaiSaati * 20)
}

// 7. Kota ücret hesaplayan metot
fun kotaUcreti(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        100 + (kota - 50) * 4
    }
}
