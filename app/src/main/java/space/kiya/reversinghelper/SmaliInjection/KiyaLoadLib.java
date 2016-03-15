package space.kiya.reversinghelper.SmaliInjection;

/**
 * Created by kiya on 16-3-15.
 */
public class KiyaLoadLib {
    static{
        // //loadlibary里 要把SO文件名的lib和后缀去掉。
        System.loadLibrary("kiya");
    }
}
