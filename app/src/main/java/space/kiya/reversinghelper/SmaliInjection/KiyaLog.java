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
