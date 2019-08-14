package com.baidu.ocr.meigong;

import android.content.Context;

import java.io.File;

/**
 * @author FX
 * 创建时间:  2019-08-09 16:32
 * 描述:
 */
public class FileUtil {
    public static File getSaveFile(Context context) {
        File file = new File(context.getFilesDir(), "pic.jpg");
        return file;
    }
}
