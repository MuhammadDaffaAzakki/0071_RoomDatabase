package com.example.pertemuan9roomdaatabase.viewmodel

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.pertemuan9roomdaatabase.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiSiswa().container.repositorisSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositorisSiswa)
        }

    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari
 * [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
