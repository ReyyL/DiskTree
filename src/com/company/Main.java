package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    private static final ArrayList<File> fileNames = new ArrayList<>();

    public static void main(String[] args) {
        getListFiles("Your link");
        for (File file : fileNames) {
            System.out.println(file.getName());
        }
    }

    public static void getListFiles(String str) {
        File file = new File(str);
        for (File s : Objects.requireNonNull(file.listFiles())) {
            if (s.isFile()) {
                fileNames.add(s);
            }
            else
                if (s.isDirectory()) {
                    getListFiles(s.getAbsolutePath());
                }
        }

    }
}