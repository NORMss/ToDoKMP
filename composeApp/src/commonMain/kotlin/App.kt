import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import data.MongoDB
import presentation.screen.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.koin.dsl.module
import presentation.screen.home.HomeViewModel
import presentation.screen.task.TaskViewModel

val darkPurpleColor = Color(color = 0xFF6750A4)
val lightPurpleColor = Color(color = 0xFFEADDFF)

@Composable
@Preview
fun App() {
    initializeKoin()

    val lightColors = lightColorScheme(
        primary = darkPurpleColor,
        onPrimary = lightPurpleColor,
        primaryContainer = darkPurpleColor,
        onPrimaryContainer = lightPurpleColor,
    )

    val darkColors = lightColorScheme(
        primary = lightPurpleColor,
        onPrimary = darkPurpleColor,
        primaryContainer = lightPurpleColor,
        onPrimaryContainer = darkPurpleColor,
    )

    val colors by mutableStateOf(
        if (isSystemInDarkTheme()) darkColors else lightColors
    )

    MaterialTheme(colorScheme = colors) {
        Navigator(HomeScreen()) {
            SlideTransition(it)
        }
    }
}

val mongoModule = module {
    single { MongoDB() }
    factory { HomeViewModel(get()) }
    factory { TaskViewModel(get()) }
}

fun initializeKoin() {
    startKoin {
        modules(mongoModule)
    }
}