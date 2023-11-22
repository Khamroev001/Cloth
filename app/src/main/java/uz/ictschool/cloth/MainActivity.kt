package uz.ictschool.cloth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ictschool.cloth.ui.theme.ClothTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClothTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
        
                }
            }
        }
    }


    @Preview
    @Composable
    fun item(){

        Row(modifier = Modifier
            .width(140.dp)
            .height(200.dp)
            .padding(5.dp)) {



            Column(modifier = Modifier.fillMaxSize()) {

                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription ="item_img" , modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .height(120.dp), contentScale = ContentScale.Fit,

                )

                Text(text = "Calvin Clein Regular Slim Fit shirt", fontSize = 12.sp)

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {

                    Text(text = "$52", fontSize = 14.sp)

                    Text(text = "$62.4", fontSize = 12.sp, color = Color.Gray)

                    Text(text = "20% OFF", fontSize = 12.sp, color = Color.Yellow)
                }

                Row(verticalAlignment = Alignment.CenterVertically){
                    Image(modifier= Modifier
                        .width(18.dp)
                        .height(18.dp),painter = painterResource(id = R.drawable.baseline_star_24), contentDescription = "star" )


                    Text(text = "4.1", fontSize = 12.sp)

                    Text(text = "(87)", fontSize = 12.sp, color = Color.Gray)

                }

            }

        }



       Row(Modifier.padding(6.dp)){


        Spacer(modifier = Modifier.width(100.dp).height(20.dp))

        Image(painter = painterResource(id = R.drawable.baseline_star_24), contentDescription = "like",
            Modifier
                .width(18.dp)
                .height(18.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )

    }

    }
}

