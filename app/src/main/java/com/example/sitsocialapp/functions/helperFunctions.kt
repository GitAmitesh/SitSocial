package com.example.sitsocialapp.functions

import com.example.sitsocialapp.R

fun getImageList(): MutableList<Int> {
    val list = mutableListOf<Int>()
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)
    list.add(R.drawable.nirman)

    return list
}
/*TODO: photo, name, desc, content, likecount, commentcount*/
data class postContentClass(val img: Int, val name: String, val desc: String, val content: String, var likeCount: Int, var commentCount: Int)

fun getPostList(): MutableList<postContentClass> {
    val list = mutableListOf<postContentClass>()
    list.add(postContentClass(R.drawable.user_image,"Jacob Washington", "3 days ago", "“If you think you are too small to make a difference, try sleeping with a mosquito.” ~ Dalai Lama", 25, 10))
    list.add(postContentClass(R.drawable.user_image,"Amitesh Muduli", "2 days ago", "You can change the XML code that Vector Asset Studio generates, although it’s not a best practice.", 50, 15))
    list.add(postContentClass(R.drawable.user_image,"Anand Mohan Mishra", "4 days ago", "The initial loading of a vector drawable can cost more CPU cycles than the corresponding raster image.", 40, 21))
    list.add(postContentClass(R.drawable.user_image,"Amit Pritam Jena", "5 days ago", "Although vector drawables do support one or more colors, in many cases it makes sense to color icons black", 70, 32))
    list.add(postContentClass(R.drawable.user_image,"Raj Panigrahi", "1 days ago", "Vector Asset Studio adds a vector graphic to the project as an XML file that describes the image. Maintaining one XML file can be easier than updating multiple raster graphics at various resolutions.", 121, 26))
    list.add(postContentClass(R.drawable.user_image,"Nikhil Paikray", "8 days ago", "Android Studio includes a tool called Vector Asset Studio that helps you add material icons and import Scalable Vector Graphic (SVG) and Adobe Photoshop Document (PSD) files into your project as vector drawable resources. Using vector drawables instead of bitmaps reduces the size of your APK because the same file can be resized for different screen densities without loss of image quality. For older versions of Android that don't support vector drawables, Vector Asset Studio can, at build time, turn your vector drawables into different bitmap sizes for each screen density.", 89, 38))
    list.add(postContentClass(R.drawable.user_image,"Jacob Washington", "3 days ago", "“If you think you are too small to make a difference, try sleeping with a mosquito.” ~ Dalai Lama", 25, 10))
    list.add(postContentClass(R.drawable.user_image,"Amitesh Muduli", "2 days ago", "You can change the XML code that Vector Asset Studio generates, although it’s not a best practice.", 50, 15))
    list.add(postContentClass(R.drawable.user_image,"Anand Mohan Mishra", "4 days ago", "The initial loading of a vector drawable can cost more CPU cycles than the corresponding raster image.", 40, 21))
    list.add(postContentClass(R.drawable.user_image,"Amit Pritam Jena", "5 days ago", "Although vector drawables do support one or more colors, in many cases it makes sense to color icons black", 70, 32))
    list.add(postContentClass(R.drawable.user_image,"Raj Panigrahi", "1 days ago", "Vector Asset Studio adds a vector graphic to the project as an XML file that describes the image. Maintaining one XML file can be easier than updating multiple raster graphics at various resolutions.", 121, 26))
    list.add(postContentClass(R.drawable.user_image,"Nikhil Paikray", "8 days ago", "Android Studio includes a tool called Vector Asset Studio that helps you add material icons and import Scalable Vector Graphic (SVG) and Adobe Photoshop Document (PSD) files into your project as vector drawable resources. Using vector drawables instead of bitmaps reduces the size of your APK because the same file can be resized for different screen densities without loss of image quality. For older versions of Android that don't support vector drawables, Vector Asset Studio can, at build time, turn your vector drawables into different bitmap sizes for each screen density.", 89, 38))


    return list
}
//
//class IconResource private constructor(
//    @DrawableRes private val resID: Int?,
//    private val imageVector: ImageVector?
//) {
//
//    @Composable
//    fun asPainterResource(): Painter {
//        resID?.let {
//            return painterResource(id = resID)
//        }
//        return rememberVectorPainter(image = imageVector!!)
//    }
//
//    companion object {
//        fun fromDrawableResource(@DrawableRes resID: Int): IconResource {
//            return IconResource(resID, null)
//        }
//
//        fun fromImageVector(imageVector: ImageVector?): IconResource {
//            return IconResource(null, imageVector)
//        }
//    }
//}

data class followedCommunitiesClass(val img: Int, val name: String, val content: String)

fun getFollowedCommunitiesList(): MutableList<followedCommunitiesClass> {
    val list = mutableListOf<followedCommunitiesClass>()
    list.add(followedCommunitiesClass(R.drawable.user_image,"Jacob Washington",  "“If you think ” ~ Dalai Lama"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amitesh Muduli",  "You can change the XML code that Vector Asset Studio generates"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Anand Mohan Mishra",  "The initial loading of a vector drawable can cost more CPU cycles than the ."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amit Pritam Jena",  "Although vector drawables do support one or more colors, in many cases it makes sense to color icons black"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Raj Panigrahi",  "Vector Asset Studio adds a vector graphic to the project as an XML file that describes the image. Maintaining one XML file can be easier than updating multiple raster graphics at various resolutions."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Nikhil Paikray",  "Android Studio includes a tool called Vector Asset Studio that helps you add material icons and import Scalable Vector Graphic (SVG) and Adobe Photoshop Document (PSD) files into your project as vector drawable resources. Using vector drawables instead of bitmaps reduces the size of your APK because the same file can be resized for different screen densities without loss of image quality. For older versions of Android that don't support vector drawables, Vector Asset Studio can, at build time, turn your vector drawables into different bitmap sizes for each screen density."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Jacob Washington",  "“If you think you are too small to make a difference, try sleeping with a mosquito.” ~ Dalai Lama"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amitesh Muduli", "You can change the XML code that Vector Asset Studio generates, although it’s not a best practice."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Anand Mohan Mishra",  "The initial loading of a vector drawable can cost more CPU cycles than the corresponding raster image."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Jacob Washington",  "“If you think ” ~ Dalai Lama"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amitesh Muduli",  "You can change the XML code that Vector Asset Studio generates"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Anand Mohan Mishra",  "The initial loading of a vector drawable can cost more CPU cycles than the ."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amit Pritam Jena",  "Although vector drawables do support one or more colors, in many cases it makes sense to color icons black"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Raj Panigrahi",  "Vector Asset Studio adds a vector graphic to the project as an XML file that describes the image. Maintaining one XML file can be easier than updating multiple raster graphics at various resolutions."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Nikhil Paikray",  "Android Studio includes a tool called Vector Asset Studio that helps you add material icons and import Scalable Vector Graphic (SVG) and Adobe Photoshop Document (PSD) files into your project as vector drawable resources. Using vector drawables instead of bitmaps reduces the size of your APK because the same file can be resized for different screen densities without loss of image quality. For older versions of Android that don't support vector drawables, Vector Asset Studio can, at build time, turn your vector drawables into different bitmap sizes for each screen density."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Jacob Washington",  "“If you think you are too small to make a difference, try sleeping with a mosquito.” ~ Dalai Lama"))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Amitesh Muduli", "You can change the XML code that Vector Asset Studio generates, although it’s not a best practice."))
    list.add(followedCommunitiesClass(R.drawable.user_image,"Anand Mohan Mishra",  "The initial loading of a vector drawable can cost more CPU cycles than the corresponding raster image."))

    return list
}