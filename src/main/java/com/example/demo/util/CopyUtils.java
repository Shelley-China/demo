package com.example.demo.util;

import java.io.*;

public class CopyUtils {

    @SuppressWarnings("unchecked")
    public static <T> T clone(T obj) {
        T clonedObj = null;
        ByteArrayOutputStream byteout = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream byteinput = null;
        ObjectInputStream ois = null;
        try {
            byteout = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(byteout);
            oos.writeObject(obj);

            byteinput = new ByteArrayInputStream(byteout.toByteArray());
            ois = new ObjectInputStream(byteinput);
            clonedObj = (T) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(byteout != null) {
                    byteout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(byteinput != null) {
                    byteinput.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return clonedObj;
    }
}