package com.example.pertemuan9roomdaatabase.view.route

import com.example.pertemuan9roomdaatabase.R
import com.example.pertemuan9roomdaatabase.uicontroller.DestinasiNavigasi

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}