package com.example.pertemuan9roomdaatabase.view.route

import com.example.pertemuan9roomdaatabase.R
import com.example.pertemuan9roomdaatabase.uicontroller.DestinasiNavigasi

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"

    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}