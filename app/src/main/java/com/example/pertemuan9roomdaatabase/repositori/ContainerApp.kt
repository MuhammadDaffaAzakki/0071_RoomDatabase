package com.example.pertemuan9roomdaatabase.repositori

import android.content.Context
import com.example.pertemuan9roomdaatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
    val repositorisSiswa: RepositoriSiswa get() = repositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
