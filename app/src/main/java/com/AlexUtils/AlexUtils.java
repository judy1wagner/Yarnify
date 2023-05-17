package com.AlexUtils;

import android.app.Application;
import android.content.Context;

import androidx.constraintlayout.utils.widget.MockView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class AlexUtils {
    String jsonResponse ="";

    public RequestQueue queue;

    public AlexUtils(Context context){
         queue = Volley.newRequestQueue(context);
    }

    public StringRequest apiQueryTestMethod(){

        String url = "https://run.mocky.io/v3/b89e04da-962d-494e-94f7-89dda7d1c308";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        jsonResponse = response;
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //dont know
            }
        });

        return stringRequest;
    }

    // Add the request to the RequestQueue.

    public void addToResponseQueue(StringRequest request, RequestQueue requestQueue){
        requestQueue.add(request);
    }
}
