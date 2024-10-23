package com.example.navigation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.navigation.ui.pantalles.CaraOCreu
import com.example.navigation.ui.pantalles.Home
import com.example.navigation.ui.pantalles.Numero
import com.example.navigation.ui.pantalles.Oracle
import com.example.navigation.ui.pantalles.RandomNumber
import com.example.navigation.ui.pantalles.Resposta
import java.text.Normalizer.Form

@Composable
fun Navegacio (
    navController: NavHostController,
    paddingValues: PaddingValues = PaddingValues(0.dp)
){
    NavHost(
        navController = navController,
        startDestination = Principal,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable<Principal>{
            Home(
                onCaraCreuClick = {resultat:Int->
                    navController.navigate(COC(resultat))
                },
                onNumeroClick = {
                    navController.navigate(RangeSlider)
                },
                onOracleClick={
                    navController.navigate(FormOracle)
                }
            )
        }

        composable<COC>{
            backStackEntry -> val result = backStackEntry.toRoute<COC>()
            CaraOCreu(
                num = result.resultat
            )
        }

        composable<RangeSlider> {
            RandomNumber(
                onRandomNumber = { num01 : Int, num02 : Int ->
                    navController.navigate(numSelect(num01, num02))
                }
            )
        }

        composable<numSelect>{
            backStackEntry->
            val num1 = backStackEntry.toRoute<numSelect>()
            val num2 = backStackEntry.toRoute<numSelect>()
            Numero(
                min = num1.num01,
                max = num2.num02
            )
        }

        composable<FormOracle>{
            Oracle(
                onFrmSendClick = {pregunta : String ->
                    navController.navigate(frmResposta(pregunta))
                }
            )
        }
        composable<frmResposta> {
            backStackEntry ->
            val pregunta = backStackEntry.toRoute<frmResposta>()
            Resposta(
                pregunta = pregunta.prgnt
            )
        }
    }
}