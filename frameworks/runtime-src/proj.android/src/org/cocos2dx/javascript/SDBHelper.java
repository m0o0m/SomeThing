package org.cocos2dx.javascript;

import java.io.File;

import android.os.Environment;
/**
数据库根目录 /sdcard/hpcDbData/
应用的数据建立在 /sdcard/hpcDbData/'包名'/
*/
public class SDBHelper {
public static final String DB_DIR = Environment.getExternalStorageDirectory().getPath() + File.separator + SHZ_CONFIG.packsgeName;
static {
while(! Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {	
try {
Thread.sleep(500);
} catch (InterruptedException e) {
e.printStackTrace();
break;
}
}
File dbFolder = new File(DB_DIR);
// 目录不存在则自动创建目录
if (!dbFolder.exists()){
dbFolder.mkdirs();
}
}
}