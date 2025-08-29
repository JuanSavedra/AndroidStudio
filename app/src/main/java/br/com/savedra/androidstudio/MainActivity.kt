package br.com.savedra.androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.SegmentedButtonDefaults.borderStroke
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.savedra.androidstudio.ui.theme.AndroidStudioTheme
import br.com.savedra.androidstudio.ui.theme.Roboto

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Layout()
                }
            }
        }
    }
}

@Composable
fun Layout() {
    val scrollState = rememberScrollState()

    var nameTextField by remember {
        mutableStateOf("")
    }

    var ageTextField by remember {
        mutableStateOf("")
    }

    var emailTextField by remember {
        mutableStateOf("")
    }

    var colorButton by remember {
        mutableStateOf(Color.White)
    }

    Column(
        modifier = Modifier.fillMaxWidth()
            .background(colorButton)
            .verticalScroll(scrollState)
    ) {
        Text(
            text = "MEU APLICATIVO",
            color = Color(0xFF000000),
            modifier = Modifier.background(Color(0xFFFFFFFF))
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = Roboto
        )
        TextField(
            value = nameTextField,
            onValueChange = {
                letter -> nameTextField = letter
            },
            label = {
                Text(
                    text = "Qual o seu nome?"
                )
            },
            placeholder = {
                Text(
                    text = "Savedra",
                    color = Color(0x5B000000)
                )
            },
            trailingIcon = { //Canto direito
                Icon(
                    painter = painterResource(id = R.drawable.baseline_short_text_24),
                    contentDescription = "Ícone de texto"
                )
            },
            leadingIcon = { //Canto esquerdo
                Icon(
                    painter = painterResource(id = R.drawable.baseline_short_text_24),
                    contentDescription = "Ícone de texto"
                )
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Red
            ),
            modifier = Modifier.fillMaxWidth().padding(6.dp),
        )
        TextField(
            value = ageTextField,
            onValueChange = {
                    letter -> ageTextField = letter
            },
            label = {
                Text(
                    text = "Qual a sua idade?"
                )
            },
            placeholder = {
                Text(
                    text = "18",
                    color = Color(0x5B000000)
                )
            },
            trailingIcon = { //Canto direito
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Ícone rosto"
                )
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(6.dp),
        )
        OutlinedTextField(
            value = emailTextField,
            onValueChange = {
                    letter -> ageTextField = letter
            },
            label = {
                Text(
                    text = "Digite seu melhor email"
                )
            },
            placeholder = {
                Text(
                    text = "fulanodetal@gmail.com",
                    color = Color(0x5B000000)
                )
            },
            trailingIcon = { //Canto direito
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Ícone de conta"
                )
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.Black,
                cursorColor = Color.Red
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(6.dp),
        )

        var bestEmailCheckbox by remember {
            mutableStateOf(false)
        }

        var acceptTermsCheckbox by remember {
            mutableStateOf(false)
        }

        var emailNotificationsCheckbox by remember {
            mutableStateOf(false)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = bestEmailCheckbox,
                onCheckedChange = {
                    isChecked -> bestEmailCheckbox = isChecked
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Red
                )
            )
            Text(
                text = "Confirmo que esse é meu melhor email"
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = acceptTermsCheckbox,
                onCheckedChange = {
                    isChecked -> acceptTermsCheckbox = isChecked
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Red
                )
            )
            Text(
                text = "Aceita os termos de política e privacidade?"
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = emailNotificationsCheckbox,
                onCheckedChange = {
                    isChecked -> emailNotificationsCheckbox = isChecked
                }
            )
            Text(
                text = "Deseja receber notificações via email?"
            )
        }

        var selectedPlatform by remember {
            mutableStateOf(0)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedPlatform == 0,
                onClick = {
                    selectedPlatform = 0
                }
            )
            Text(
                text = "Windows"
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedPlatform == 1,
                onClick = {
                    selectedPlatform = 1
                }
            )
            Text(
                text = "Linux"
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = selectedPlatform == 2,
                onClick = {
                    selectedPlatform = 2
                }
            )
            Text(
                text = "MacOS"
            )
        }

        var backgroundTheme = "White"

        OutlinedButton(
            onClick = {
                if (backgroundTheme == "White") {
                    colorButton = Color.Blue
                    backgroundTheme = "Blue"
                } else {
                    colorButton = Color.White
                    backgroundTheme = "White"
                }
            },
            modifier = Modifier.size(width = 200.dp, height = 60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = borderStroke(width = 3.dp, color = Color.Green)
        ) {
            Text(
                text = "Mudar a cor de fundo",
                color = Color(0xFF000000)
            )
        }
        Text(
            text = "Desenvolvendo aplicações Android",
            color = Color(0xFF000000),
            modifier = Modifier.background(Color(0xFFDADADA))
                .fillMaxWidth()
                .padding(32.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = Roboto
        )
    }
}