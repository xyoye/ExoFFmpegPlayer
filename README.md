# ExoFFmpegPlayer #

ExoPlayer的FFmpeg扩展，源码来自于[mqplayer](https://github.com/joffychim/mqplayer)，项目对源码进行了一些修改以及封装。

## 使用 ##

gradle配置：参考app.gradle

生成ExoPlayer：new ExoFFmpegPlayer(Context);

Over

## so、arr文件生成 ##
1、app.gradle中引用exoffmpeg_source模块 -> Rebuild Project ->
so文件在文件夹：“build/intermediates/intermediate-jars/debug/jni/armeabi-v7a/libexoffmpeg.so(libffmpeg.so)”

2、将1中生成的两个so文件放入exoffmpeg模块中“libs/armeabi-v7a”目录 -> Android Studio中右上角gradle -> 选中exoffmpeg -> 打开Tasks/build/assembleRelease -> arr文件在文件夹：“build/outputs/arr/exoffmpeg-release.arr”

将exoffmpeg-release.arr重命名为exoffmpeg.arr放入app模块中的libs目录中，按“使用”修改gradle及文件