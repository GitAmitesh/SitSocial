package com.example.sitsocialapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sitsocialapp.R
import com.example.sitsocialapp.functions.getFollowedCommunitiesList
import com.example.sitsocialapp.functions.getImageList
import com.example.sitsocialapp.functions.getPostList
import com.example.sitsocialapp.ui.theme.AccentColor
import com.example.sitsocialapp.ui.theme.fontAccentFamily
import com.example.sitsocialapp.ui.theme.fontLogoFamily
import com.example.sitsocialapp.ui.theme.fontPrimaryFamily
import com.example.sitsocialapp.ui.theme.gradient


@Composable
fun LoginButton(text: String, event: () -> Unit){
    Button(onClick = { event() },
        colors = ButtonDefaults.buttonColors(containerColor = AccentColor),
        modifier = Modifier.size(width = 400.dp, height = 50.dp)
    ) {
        Text(text = text,
            fontSize = 24.sp,
            fontFamily = fontAccentFamily,
            color = Color.White
        )
    }
}
@Composable
fun TextInput(label: String, placeholder: String){
    val state = remember{ mutableStateOf("") }
    TextField(value = state.value,
        onValueChange = {
            state.value=it
        },
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) }
    )
}

@Composable
fun LogoText(size: Int, modifier: Modifier){
    Text(text = "SIT SOCIAL",
        color = Color.White,
        fontFamily = fontLogoFamily,
        fontSize = size.sp,
        modifier = modifier
    )
}

@Composable
fun TopBar(screenName: String){
    val state = remember { mutableStateOf("") }
    Column(modifier = Modifier
//        .fillMaxSize()
        .padding(10.dp),
//        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(IntrinsicSize.Min)
        ) {
            LogoText(size = 23, modifier = Modifier)
            Spacer(modifier = Modifier.width(6.dp))
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp),
                color = Color.White
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = screenName,
                color = Color.White,
                fontFamily = fontPrimaryFamily,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            //Menu Button Icon
            IconButton(
                onClick = { /*TODO Draw menu*/ },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    tint = Color.White
                )
            }
            //Search Field
            OutlinedTextField(
                value = state.value,
                onValueChange = {
                    state.value = it
                },
                placeholder = { Text(text = "Search Communities") },
                shape = RoundedCornerShape(50),
//                modifier = Modifier.width(240.dp),
                trailingIcon = {
                    //Search button
                    IconButton(
                        onClick = { /*TODO Search Operation*/ },
                        modifier = Modifier.size(40.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp),
                            tint = Color.White
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    focusedBorderColor = Color.White.copy(alpha = 0.8f),
                    unfocusedBorderColor = Color.White.copy(alpha = 0.6f),
                    unfocusedPlaceholderColor = Color.White.copy(alpha = 0.6f)
                )
            )
            //Event Button Icon
            IconButton(
                onClick = { /*TODO Open Events page*/ },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    tint = Color.White
                )
            }
        }
    }
}


@Composable
fun CircleStoryFrame(img: Int){
    Image(painter = painterResource(id = img),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .border(3.dp, gradient, CircleShape),
        contentDescription = "Circle Story")
}


@Composable
fun Story(){
    LazyRow(content = {
        items(getImageList()){item ->
            CircleStoryFrame(img = item)
        }
    },
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    )
}

@Composable
fun Feed(){
    LazyColumn(content = {
        items(getPostList()){item ->
            Post(img = item.img, name = item.name, desc = item.desc, content = item.content, likeCount = item.likeCount, commentCount = item.commentCount)
        }
    },
        horizontalAlignment = Alignment.CenterHorizontally)
}
//@Preview
@Composable
fun Post(img: Int, name: String, desc: String, content: String, likeCount: Int, commentCount: Int){
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(10.dp, 5.dp, 10.dp, 5.dp)
    ){
        //User Info and More
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            UserInfo(img = img, name = name, desc = desc)
            IconButton(
                onClick = { /*TODO Draw menu*/ }
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "more",
                    tint = Color.White.copy(alpha = 0.8f)
                )
            }
        }
        //post content
        Text(text = content,
            fontSize = 15.sp,
            fontFamily = fontPrimaryFamily,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        //Like, Comment, and Share
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.Top){
            //Like
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                var isLike by remember{ mutableStateOf(false) }
                var noOfLikes = remember { mutableIntStateOf(likeCount) }
                IconToggleButton(checked = isLike,
                    onCheckedChange = {
                        isLike = !isLike
                        if(isLike){
                            noOfLikes.intValue = noOfLikes.intValue + 1
                        }
                        else{
                            noOfLikes.intValue = noOfLikes.intValue - 1
                        }
                    },
                    modifier = Modifier.size(25.dp)
                ) {
                    Icon(
                        imageVector = if(!isLike){Icons.Filled.FavoriteBorder}else{Icons.Filled.Favorite},
                        contentDescription = "like",
                        tint = if(!isLike){Color.White.copy(alpha = 0.8f)}else{Color.Red},
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(text = noOfLikes.value.toString(),
                    color = Color.White,
                )
            }
            //Comment
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                var noOfComments = remember { mutableIntStateOf(commentCount) }
                IconButton(
                    onClick = { /*TODO Open Events page*/ },
                    modifier = Modifier.size(25.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_insert_comment_24),
                        contentDescription = "Comment",
                        modifier = Modifier.fillMaxSize(),
                        tint = Color.White.copy(alpha = 0.8f)
                    )
                }
                Text(text = noOfComments.intValue.toString(),
                    color = Color.White
                    )
            }
            //Share
            IconButton(
                onClick = { /*TODO Open Events page*/ },
                modifier = Modifier.size(25.dp)
            ) {
                Icon(
                   imageVector = Icons.Rounded.Send,
                    contentDescription = "Comment",
                    modifier = Modifier
                        .fillMaxSize()
                        .rotate(325f),
                    tint = Color.White.copy(alpha = 0.8f)
                )
            }
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .width(2.dp)
                .padding(top = 6.dp, bottom = 6.dp),
            color = Color.LightGray.copy(alpha = 0.4f)
        )
    }
}

//@Preview
@Composable
fun UserInfo(img: Int, name: String, desc: String) {
    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)){
        Image(painter = painterResource(id = img),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
            ,
            contentDescription = "Circle Profile picture")
        Column {
            Text(text = name, fontSize = 14.sp, fontFamily = fontPrimaryFamily, color = Color.White)
            Text(text = desc, fontSize = 11.sp, fontFamily = fontPrimaryFamily, color = Color.White.copy(alpha = 0.6f))
        }
    }
}
//@Preview
@Composable
fun FollowedCommunitiesFrame(img: Int, name: String, content: String){
    Box(modifier = Modifier
        .widthIn(200.dp, 300.dp)
        .height(130.dp)
        .border(0.85.dp, Color.LightGray.copy(alpha = 0.5f), RoundedCornerShape(20.dp))
        .clip(shape = RoundedCornerShape(20.dp))
        .padding(10.dp)
    ){
        Column (verticalArrangement = Arrangement.spacedBy(6.dp)
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ){
                Image(painter = painterResource(id = img),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                    ,
                    contentDescription = "Circle Profile picture")
                Text(text = name, fontSize = 20.sp, fontFamily = fontPrimaryFamily, color = Color.White)
            }
            Text(text = content, fontSize = 14.sp, fontFamily = fontPrimaryFamily, color = Color.White,
                textAlign = TextAlign.Justify, overflow = TextOverflow.Ellipsis, maxLines = 3)
        }
    }
}

@Composable
fun FollowedCommunities(){
    LazyRow(content = {
        items(getFollowedCommunitiesList()){ item ->
            FollowedCommunitiesFrame(item.img,item.name,item.content)
        }
    },
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    )
}


@Composable
fun NewCommunitiesFrame(img: Int, name: String, content: String){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(130.dp)
        .border(0.85.dp, Color.LightGray.copy(alpha = 0.5f), RoundedCornerShape(20.dp))
        .clip(shape = RoundedCornerShape(20.dp))
        .padding(10.dp),
        contentAlignment = Alignment.Center
    ){
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()){
            Image(painter = painterResource(id = img),
                contentDescription = "Circle Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(70.dp).clip(CircleShape))
            Column (horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()){
                Row (horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()){
                    Text(text = name, fontSize = 20.sp, fontFamily = fontPrimaryFamily, color = Color.White, maxLines = 1, overflow = TextOverflow.Ellipsis, modifier = Modifier.weight(1f))
                    Button(onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                        modifier = Modifier.requiredWidth(80.dp)
                    ) {
                        Text(text = "Join",
                            fontSize = 16.sp,
                            fontFamily = fontAccentFamily,
                            color = Color.White
                        )
                    }
                }
                Text(text = content , fontSize = 14.sp, fontFamily = fontPrimaryFamily, color = Color.White,
                textAlign = TextAlign.Justify, overflow = TextOverflow.Ellipsis, maxLines = 3)
            }
        }
    }
}

@Composable
fun NewCommunities(){
    LazyColumn(content = {
        items(getFollowedCommunitiesList()){ item ->
            NewCommunitiesFrame(item.img,item.name,item.content)
        }
    },
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    )
}

