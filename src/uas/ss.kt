import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*
object Menghitung_gaji {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val kursIndonesia = DecimalFormat.getCurrencyInstance() as
                DecimalFormat
        val formatRp = DecimalFormatSymbols()
        val nama: String
        val nip: String
        val jabatan: Int
        val status: Int
        val jumlanak: Int
        val presensi: Int
        var gapok: Int
        var tamgapok: Int
        val tunjanak: Double
        val totpres: Double
        val totpajak: Int
        val totgaji: Double
        println("Nama : Triko Prasetyo ")
        println("Nim : 19.12.1009 ")
        println("MENGHITUNG GAJI KARYAWAN")
        print("Masukan Nama : ")
        nama = input.next()
        print("Masukan NIP : ")
        nip = input.next()
        print("Masukan jabatan : ")
        jabatan = input.nextInt()
        when (jabatan) {
            1 -> {
                gapok = 10000000
            }
            2 -> {
                gapok = 7000000

            }
            else -> {
                gapok = 0
            }
        }
        print("Masukan status (lajang/menikah) : ")
        status = input.nextInt()
        when (status) {
            1 -> {
                tamgapok = 1500000
            }
            2 -> {
                tamgapok = 1000000
            }
            else -> {
                tamgapok = 0
            }
        }
        print("Masukan jumlah anak : ")
        jumlanak = input.nextInt()
        print("Masukan jumlah presensi : ")
        presensi = input.nextInt()
        formatRp.currencySymbol = "Rp. "
        formatRp.monetaryDecimalSeparator = ','
        formatRp.groupingSeparator = '.'
        kursIndonesia.decimalFormatSymbols = formatRp
        tunjanak = (1000000 * jumlanak).toDouble()
        totpres = (65000 * presensi).toDouble()
        totpajak = (0.05 * gapok).toInt()
        totgaji = ((gapok + tamgapok + tunjanak + totpres) -
                totpajak).toInt().toDouble()
        println("Nama Pegawai : $nama")
        println("NIP : $nip")
        println("Jabatan : $jabatan")
        println("Status : $status")
        println("Jumlah Anak : $jumlanak")
        println("Jumlah Presensi : $presensi")
        println("----------------------------------------")
        System.out.printf("Total Gaji : %f\n", totgaji);
    }
}