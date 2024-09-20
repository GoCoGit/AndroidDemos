#include "jni.h"
#include "com_goco_JNIDemo.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_com_goco_JNIDemo_testHello(JNIEnv *env,jobject obj){
    printf("Hello JNI!\n");
    return;
}