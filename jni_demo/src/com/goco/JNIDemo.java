package com.goco;

public class JNIDemo {
    static{
	    System.load("C:\\Users\\admin\\Projects\\demos\\jni_demo\\src\\com\\goco\\TestJNI.dll");
	}

    public native void testHello();

    public static void main(String[] args){
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.testHello();
    }
}