package com.example.navigation.navigation

import kotlinx.serialization.Serializable

@Serializable
object Principal
@Serializable
data class COC(val resultat : Int)
@Serializable
object RangeSlider
@Serializable
data class numSelect(val num01: Int, val num02: Int)
@Serializable
object FormOracle
@Serializable
data class frmResposta(val prgnt : String)