package Screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rawnet.R
import com.example.rawnet.ui.theme.*


@Composable
fun HomeScreen() {
    val pageCount by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) { /* ConstraintLayout {

             val (logoimageref, loginformref) = createRefs()

             Box(contentAlignment = Alignment.Center,
                 modifier = Modifier
                     .height(100.dp)
                     .constrainAs(logoimageref) {
                         top.linkTo(loginformref.top)
                         bottom.linkTo(loginformref.top)
                         start.linkTo(parent.start)
                         end.linkTo(parent.end)
                     }) {

             }*/

        Surface(
            color = ghost_white,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
            /*.padding(top = 15.dp)*/
            /*  .constrainAs(loginformref) {
                  bottom.linkTo(parent.bottom)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
              }*/
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                HomeScreen()
                HeaderHome()
                CategoryView()
                Spacer(modifier = Modifier.padding(10.dp))
                SlidingBannerView()
                Spacer(modifier = Modifier.padding(10.dp))
                PageIndicator(pageCount)
                Spacer(modifier = Modifier.padding(20.dp))

                PopularItemSection()
                Spacer(modifier = Modifier.padding(10.dp))

            }

        }

    }
}



@Composable
fun HeaderHome() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "DnD Gifts",
            color = black,
            fontSize = 24.sp,
            letterSpacing = 2.sp,
            modifier = Modifier.padding(horizontal = 100.dp)
        )

        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = black,
                modifier = Modifier
                    .padding(bottom = 25.dp)
                    .size(32.dp, 32.dp)
            )

        }
        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top

        ) {IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "menu",
                tint = black,
                modifier = Modifier.padding(bottom = 25.dp)
                    .size(50.dp)
            )

        }


        }
    }
}

@Composable
fun SlidingBannerView() {
    Image(
        painter = painterResource(id = R.drawable.ic_sale_banner),
        contentDescription = "",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun PageIndicator(pageCount: Int) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(if (pageCount == 0) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 0) dark_gray else Color.LightGray)
            )

            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .size(if (pageCount == 1) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 1) dark_gray else Color.LightGray)
            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .size(if (pageCount == 2) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 2) dark_gray else Color.LightGray)
            )

            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .size(if (pageCount == 3) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 3) dark_gray else Color.LightGray)
            )

            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .size(if (pageCount == 4) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 4) dark_gray else Color.LightGray)
            )

            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Box(
                modifier = Modifier
                    .size(if (pageCount == 5) 10.dp else 8.dp)
                    .clip(CircleShape)
                    .background(if (pageCount == 5) dark_gray else Color.LightGray)
            )

        }
    }

}

@Composable
fun CategoryView() {/*
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        CategoryButton(

            icon = painterResource(id = R.drawable.maua),
            backgroundColor = Color(0xffFFFFFF),
            onNextPage = { navController.navigate(Screen.FlowerScreen.route)}
        )
        CategoryButton(
            icon = painterResource(id = R.drawable.brathet),
            backgroundColor = Color(0xffFFFFFF),
            onNextPage= { navController.navigate(Screen.ForHimScreen.route)}
        )
        CategoryButton(
            icon = painterResource(id = R.drawable.blackgalt),
            backgroundColor = Color(0xffFFFFFF),
            onNextPage = {navController.navigate(Screen.ForHerScreen.route)}
        )
        CategoryButton(
            icon = painterResource(id = R.drawable.child),
            backgroundColor = Color(0xffFFFFFF),
            onNextPage = { navController.navigate(Screen.KidsScreen.route)}

        )

    }
*/}

@Composable
fun CategoryButton(
    icon: Painter,
    backgroundColor: Color,
    onNextPage:()->Unit) {
    Box(
        Modifier

            .size(52.dp)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(40.dp)
            )

    ) {
        Image(
            painter = icon, contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .clickable(onClick = onNextPage)
        )
    }
}



@Composable
fun PopularItemSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Personalized Gifts", style = MaterialTheme.typography.h6, color = black)
        TextButton(onClick = {

        }) {
            Text(text = "View All", color = black)
        }
    }
    Spacer(modifier = Modifier.padding(10.dp))
    PouplarItems()
}

@Composable
fun PouplarItems() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .wrapContentHeight()
                .clip(RoundedCornerShape(16.dp))
                .background(white)
                .clickable {  }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(100.dp),
                        painter = painterResource(R.drawable.mauare),
                        contentDescription = "",
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier
                            .wrapContentHeight()
                    ) {
                        Text(
                            text = "Ksh",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = black,
                        )
                        Text(
                            text = "1800.00",
                            fontSize = 12.sp,
                            color = colorPrimary,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(colorPrimary)
                            .padding(4.dp)
                            .shadow(elevation = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = white,
                            modifier = Modifier
                                .size(32.dp, 32.dp)
                        )
                    }

                }

            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .wrapContentSize()
                .clip(RoundedCornerShape(16.dp))
                .background(white)
                .clickable { }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(100.dp),
                        painter = painterResource(R.drawable.ic_pink_rose_bouquet),
                        contentDescription = "",
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier
                            .wrapContentHeight()
                    ) {
                        Text(
                            text = "Ksh",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = black,
                        )
                        Text(
                            text = "ksh567.00",
                            fontSize = 12.sp,
                            color = colorPrimary,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(colorPrimary)
                            .padding(4.dp)
                            .shadow(elevation = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "",
                            tint = white,
                            modifier = Modifier
                                .size(32.dp, 32.dp)
                        )
                    }

                }

            }
        }
    }
}



