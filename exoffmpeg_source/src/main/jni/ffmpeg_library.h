//
// Created by joffychim on 2019-07-04.
//

#ifndef EXOFFMPEG_FFMPEG_LIBRARY_H
#define EXOFFMPEG_FFMPEG_LIBRARY_H

#include <jni.h>

extern "C" {
#include <libavcodec/avcodec.h>
}

AVCodec *getCodecByName(JNIEnv* env, jstring codecName);

#endif //EXOFFMPEG_FFMPEG_LIBRARY_H
