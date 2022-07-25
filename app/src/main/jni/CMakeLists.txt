project(yolov5ncnn)

cmake_minimum_required(VERSION 3.4.1)

#set(OpenCV_DIR ${CMAKE_SOURCE_DIR}/opencv-mobile-4.5.1-android/sdk/native/jni)
#find_package(OpenCV REQUIRED core imgproc)

set(ncnn_DIR ${CMAKE_SOURCE_DIR}/ncnn-20210124-android-vulkan-shared/${ANDROID_ABI}/lib/cmake/ncnn)
find_package(ncnn REQUIRED)

add_library(yolov5ncnn SHARED yolov5ncnn_jni.cpp)

target_link_libraries(yolov5ncnn
    ncnn

    jnigraphics
)
