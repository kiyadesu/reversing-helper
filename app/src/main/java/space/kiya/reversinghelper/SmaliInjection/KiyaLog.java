package space.kiya.reversinghelper.SmaliInjection;

import android.util.Log;

public class KiyaLog{
    public static void Log(String tag, String msg){
        Log.d(tag, msg);
    }

    public static void Log(Object obj){
        Log("kiya",obj.toString());
    }

    public static void Log(Object[] objs){
        Log("kiya",Arrays.toString(objs));
    }
}
