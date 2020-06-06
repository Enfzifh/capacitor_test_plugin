package io.ionic.starter;

import android.content.Intent;
import android.net.Uri;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class TestNativePlugin extends Plugin {

    // affiche une valeur string
    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");
        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
    }

    /* Permet de lancer une activité / application */
    @PluginMethod()
    public void launch_intent(PluginCall call) {

        /*Intent intent = new Intent(Intent.ACTION_VIEW);
        getContext().startActivity(intent);*/

        String encodedPhoneNumber = String.format("tel:%s", Uri.encode("0654953562")); //Uri.encode("*1234#")
        Uri number = Uri.parse(encodedPhoneNumber);
        Intent intent_dial = new Intent(Intent.ACTION_DIAL, number);
        getContext().startActivity(intent_dial);
    }
}
