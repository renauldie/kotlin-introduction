package basic.collections

fun main() {
    var namaTemans = mutableListOf<String>()
    var ulang = "Y"
    while (ulang == "Y") {
        println("============================")
        print("Masukkan Pilihan \n1. Lihat \n2. Tambah \n3. Hapus \n4. Keluar \n(pilihan): ")
        var pilihan = readLine()

        if (pilihan == "1") {
            if (namaTemans.count() > 0) {
                println("Teman yg tercatat saat ini : ")
                for (teman in namaTemans) {
                    var urutan = (namaTemans.indexOf(teman) + 1).toString();
                    println(urutan + ". " + teman);
                }
            } else {
                println("Anda Belum mempunyai teman");
            }
            ulang = "Y"
        } else if (pilihan == "2") {
            println("Masukkan teman anda : ")
            var namaTeman = readLine()
            if (namaTeman != null) {
                namaTemans.add(namaTeman).toString()
            }
            ulang = "Y"
        } else if (pilihan == "3") {
            if (namaTemans.count() > 0) {
                for (teman in namaTemans) {
                    var urutan = (namaTemans.indexOf(teman) + 1).toString()
                    println(urutan + ". " + teman)
                }

                print("Pilihlah nomor teman anda : ")
                val nomorTeman = readLine()
                for (teman in namaTemans) {
                    var urutan = (namaTemans.indexOf(teman) + 1).toString()
                    if (urutan == nomorTeman.toString()) {
                        namaTemans.remove(teman)
                    }
                }
            } else {
                println("Tidak ada data teman yang bisa dihapus")
            }
        } else{
            ulang = "N"
        }
    }
}