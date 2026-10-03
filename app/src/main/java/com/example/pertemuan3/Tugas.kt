package com.example.pertemuan3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier

@Composable
fun TugasPraktikum (modifier : Modifier = Modifier){
    Box(modifier = modifier.fillMaxSize()){

        Immage(
            painter = painterResource(id = R.drawable.graybackground),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text (
                text = "Selamat Datang",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Text (
                text = "ini adalah halaman login",
                fontSize = 20.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(30.dp))

            Image (
                painter = painterResource(id = R.drawable.logoumy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
        }

    }
}