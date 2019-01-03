package com.example.raunalnik.todolist;

import android.content.Context;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileHelper {

    public static final String FILENAME = "listinfo.dat";

    public static void writeData(ArrayList<String> opravila, Context context) {

        FileOutputStream fos = context.openFileOutput(FILENAME)
    }


}
