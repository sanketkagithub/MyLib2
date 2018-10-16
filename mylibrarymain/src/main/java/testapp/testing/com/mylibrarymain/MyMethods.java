package testapp.testing.com.mylibrarymain;

import android.content.Context;
import android.widget.Toast;

public class MyMethods
{

    public static void callMe(Context context)
    {
        Toast.makeText(context, "callMe called", Toast.LENGTH_SHORT).show();

    }


}
