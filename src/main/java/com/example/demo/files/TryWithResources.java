package com.example.demo.files;

import java.io.File;
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Created by Serdar Turkmen on 23.05.2018
 */
public class TryWithResources {

    public static void main(String[] args) throws Exception {
        File file = new File("/home/bawer/Desktop/blog.zip");

        JarEntry je;

        try (
                FileInputStream fis = new FileInputStream(file);
                JarInputStream jis = new JarInputStream(fis);
        ) {
            while ((je = jis.getNextJarEntry()) != null) {
                System.out.println(je.getName());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
