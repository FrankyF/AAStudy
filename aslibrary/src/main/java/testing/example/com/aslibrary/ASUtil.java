package testing.example.com.aslibrary;

import android.content.Context;
import android.widget.Toast;

public class ASUtil {
    public ASUtil() {
    }
    public static void showMsg1(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
