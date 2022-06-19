[1mdiff --git a/app/src/main/java/com/example/photodiary/API.kt b/app/src/main/java/com/example/photodiary/API.kt[m
[1mindex a899b20..e60e820 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/API.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/API.kt[m
[36m@@ -1,7 +1,6 @@[m
 package com.example.photodiary[m
 [m
[31m-import com.example.photodiary.ModelClass.UnsplashResponce[m
[31m-import retrofit2.Response[m
[32m+[m[32mimport com.example.photodiary.model.UnsplashResponce[m
 import retrofit2.http.GET[m
 import retrofit2.http.Headers[m
 import retrofit2.http.Query[m
[36m@@ -14,5 +13,5 @@[m [minterface API {[m
         @Query("query") query: String,[m
         @Query("page") page: Int,[m
         @Query("per_page") per_page: Int[m
[31m-    ): Response<UnsplashResponce>[m
[32m+[m[32m    ) : UnsplashResponce[m
 }[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/java/com/example/photodiary/MainActivity.kt b/app/src/main/java/com/example/photodiary/MainActivity.kt[m
[1mindex e68095e..96525f2 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/MainActivity.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/MainActivity.kt[m
[36m@@ -8,4 +8,4 @@[m [mclass MainActivity : AppCompatActivity() {[m
         super.onCreate(savedInstanceState)[m
         setContentView(R.layout.activity_main)[m
     }[m
[31m-}// Access key -> PZu7QXCB5Rg9ZYh77prO-MGE7I8cxFg9xelP_d57FD0[m
\ No newline at end of file[m
[32m+[m[32m}// Access  key -> PZu7QXCB5Rg9ZYh77prO-MGE7I8cxFg9xelP_d57FD0[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/java/com/example/photodiary/model/UnsplashPhoto.kt b/app/src/main/java/com/example/photodiary/model/UnsplashPhoto.kt[m
[1mindex 3fa8a0a..8b349c6 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/model/UnsplashPhoto.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/model/UnsplashPhoto.kt[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.example.photodiary.ModelClass[m
[32m+[m[32mpackage com.example.photodiary.model[m
 [m
 data class UnsplashPhoto([m
     val id: String,[m
[1mdiff --git a/app/src/main/java/com/example/photodiary/model/UnsplashResponce.kt b/app/src/main/java/com/example/photodiary/model/UnsplashResponce.kt[m
[1mindex b63a4c9..e04c5b6 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/model/UnsplashResponce.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/model/UnsplashResponce.kt[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.example.photodiary.ModelClass[m
[32m+[m[32mpackage com.example.photodiary.model[m
 [m
 data class UnsplashResponce ([m
     val results : List<UnsplashPhoto>[m
[1mdiff --git a/app/src/main/java/com/example/photodiary/model/UnsplashUrl.kt b/app/src/main/java/com/example/photodiary/model/UnsplashUrl.kt[m
[1mindex 48afbad..b56c63a 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/model/UnsplashUrl.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/model/UnsplashUrl.kt[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.example.photodiary.ModelClass[m
[32m+[m[32mpackage com.example.photodiary.model[m
 [m
 data class UnsplashUrl([m
     val raw: String?,[m
[1mdiff --git a/app/src/main/java/com/example/photodiary/model/UnsplashUser.kt b/app/src/main/java/com/example/photodiary/model/UnsplashUser.kt[m
[1mindex ea96732..6538e26 100644[m
[1m--- a/app/src/main/java/com/example/photodiary/model/UnsplashUser.kt[m
[1m+++ b/app/src/main/java/com/example/photodiary/model/UnsplashUser.kt[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.example.photodiary.ModelClass[m
[32m+[m[32mpackage com.example.photodiary.model[m
 [m
 data class UnsplashUser([m
     val name: String?,[m
