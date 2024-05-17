package com.santeut.ui.navigation.bottom

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.santeut.ui.map.HikingScreen
import com.santeut.ui.map.MapScreen


@ExperimentalNaverMapApi
fun NavGraphBuilder.MapNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = "map",
        route = "map_graph"
    ) {

        composable(route = "map") {
            MapScreen()
        }
        composable(
            route = "hiking/{partyId}",
            arguments = listOf(navArgument("partyId") { type = NavType.IntType })
        ) { backStackEntry ->
            val partyId = backStackEntry.arguments?.getInt("partyId") ?: 0
            HikingScreen(partyId)
        }
    }
}