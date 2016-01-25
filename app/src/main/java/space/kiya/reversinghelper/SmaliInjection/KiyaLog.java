package space.kiya.reversinghelper.SmaliInjection;

import android.util.Log;

import java.util.Arrays;

/**
 *
 * Created by kiya on 16-1-21.
 */

/*
* 在反编译的smali根目录下创建目录 space/kiya/reversinghelper/SmaliInjection/,放入该 smali 文件
* 调用语句：invoke-static {v1}, Lspace/kiya/reversinghelper/SmaliInjection/KiyaLog;->Log(Ljava/lang/Object;)V
* unzip test.apk -d test
* java -jar baksmali.jar classes.dex
* java -jar smali.jar out
* 归档管理器打开原apk文件替换classes.dex
* ./signapk.sh test.apk 签名
*/

public class KiyaLog{
    public static void Log(String tag, String msg){
        Log.d(tag, msg);
    }

    public static void Log(Object obj){
        Log("kiya",obj.toString());
    }

    public static void Log(Object[] objs){
        Log("kiya", Arrays.toString(objs));
    }
}
