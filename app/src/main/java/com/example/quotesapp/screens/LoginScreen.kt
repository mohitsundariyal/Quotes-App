import android.graphics.drawable.Drawable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.R

@Composable
@Preview(showSystemUi = true)
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFeef8f2)),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 70.dp)
            ) {
                Text(
                    text = "Inspire",
                    color = Color(0xFF122017),
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp
                )
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "Start your day with wisdom.",
                    color = Color(0xFF8a958f),
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(60.dp))

                Box(
                    modifier = Modifier.height(50.dp).width(300.dp).clip(RoundedCornerShape(24.dp))
                        .background(Color(0xFFffffff))){
                    Row() {
                        Icon(
                            painter = painterResource(
                                id =
                                    R.drawable.ic_google
                            ),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 50.dp, top = 10.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "Login with Google" ,modifier = Modifier.padding(top = 15.dp), fontWeight = FontWeight.Bold,fontSize = 16.sp)

                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Box(
                    modifier = Modifier.height(50.dp).width(300.dp).clip(RoundedCornerShape(24.dp))
                        .background(Color(0xFFffffff))){
                    Row() {
                        Icon(
                            painter = painterResource(
                                id =
                                    R.drawable.ic_facebook
                            ),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 50.dp, top = 10.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "Login with Facebook" ,modifier = Modifier.padding(top = 15.dp), fontWeight = FontWeight.Bold,fontSize = 16.sp)

                    }

                }
                Spacer(modifier = Modifier.height(45.dp))

                Text(text = "Continue as Guest", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF38e079))




            }
        }
        Text(text = "Terms and Services | Privacy Policy", color = Color(0xFF8a958f), fontSize = 12.sp, modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 40.dp))
    }
}

