package com.example.livedatabindingmvvm1.network.TableDatabase

class TableSQLite {
    // khong gioi han so vi tri

    val tableBooking = mutableMapOf<Int, Boolean>() // true la co nguoi ngoi, false la ban trong

    // thanh toan , tra lai ban tai vi tri X
    fun khachThanhToan(viTri: Int) {
        tableBooking[viTri] = false
    }

    fun khachVaoBan(viTri: Int) {
        tableBooking[viTri] = true
    }

    fun checkBanTrong(viTri: Int): Boolean {
        return tableBooking[viTri] == true
    }

}