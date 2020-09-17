package testing.example.com.astudylib;

import android.content.Context;
import android.widget.Toast;

public class AStudyUtil {

    public AStudyUtil() {
    }
    
    public static void showMsg(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show();

    }
}


