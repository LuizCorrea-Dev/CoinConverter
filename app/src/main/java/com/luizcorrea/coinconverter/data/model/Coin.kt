package com.luizcorrea.coinconverter.data.model

import java.util.*

enum class Coin(val locale: Locale) {
    USD(Locale.US),
    CAD(Locale.CANADA),
    EUR(Locale.ITALY),
    GBP(Locale.UK),
    BRL(Locale("pt", "BR")),
    ARS(Locale("es", "AR"))
    ;

    companion object {
        fun getByName(name: String) = values().find { it.name == name } ?: BRL
    }
}