package com.example;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class testingCV {
    public static void main (String[]args) {
        // Loads opencv native library 
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        // Matrix that stores various types of data 
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1); 
        System.out.println("mat = " + mat.dump());
    }
}
