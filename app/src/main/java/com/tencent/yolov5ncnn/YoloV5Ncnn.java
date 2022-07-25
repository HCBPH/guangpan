package com.tencent.yolov5ncnn;

import android.content.res.AssetManager;
import android.graphics.Bitmap;

public class YoloV5Ncnn
{
    public native boolean Init(AssetManager mgr);
    public native boolean openCamera(int facing);

    public class Obj
    {
        public float x;
        public float y;
        public float w;
        public float h;
        public String label;
        public float prob;
    }

    public native Obj[] Detect(Bitmap bitmap, boolean use_gpu);

    static {
        System.loadLibrary("yolov5ncnn");
    }
}
