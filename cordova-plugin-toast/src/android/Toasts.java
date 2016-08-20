package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.widget.Toast;
public class Toasts extends CordovaPlugin {
	private Toast t;
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("show")) {
            String message = data.optString(0);
            int time = Integer.parseInt(data.getString(1));
           if(t==null)
             {
              t =  Toast.makeText(this.cordova.getActivity(), message, time);
             }
              t.show();

            return true;

        } else {
            
            return false;

        }
    }
}
