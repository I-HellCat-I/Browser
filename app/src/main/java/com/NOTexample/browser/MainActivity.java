package com.NOTexample.browser;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.mozilla.geckoview.GeckoRuntime;
import org.mozilla.geckoview.GeckoSession;
import org.mozilla.geckoview.GeckoView;

public class MainActivity extends AppCompatActivity{
    TextView textPageView;
    EditText textUriInput;
    ActivityResultContracts ARC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GeckoView view = findViewById(R.id.geckoview);
        GeckoSession session = new GeckoSession();
        GeckoRuntime runtime = GeckoRuntime.create(this);

        session.open(runtime);
        view.setSession(session);
        session.loadUri("about:buildconfig"); // Or any other URL...
        //textPageView = findViewById(R.id.textPageView);
        //textUriInput = findViewById(R.id.textUriInput);
        //ARC = new ActivityResultContracts();

        /*if (ContextCompat.checkSelfPermission(
                getBaseContext(), Manifest.permission.INTERNET) ==
                PackageManager.PERMISSION_GRANTED) {
            // You can use the API that requires the permission.
            //performAction(...);
        } else if (shouldShowRequestPermissionRationale()) {
            // In an educational UI, explain to the user why your app requires this
            // permission for a specific feature to behave as expected. In this UI,
            // include a "cancel" or "no thanks" button that allows the user to
            // continue using your app without granting the permission.
            //showInContextUI(...);
        } else {
            // You can directly ask for the permission.
            // The registered ActivityResultCallback gets the result of this request.
            requestPermissionLauncher.launch(
                    Manifest.permission.INTERNET);
        }

        if (getBaseContext().checkSelfPermission ("INTERNET") == PackageManager.PERMISSION_DENIED){
            permission = registerForActivityResult()
            .RequestPermission();
        }*/
        /*textUriInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                RequestQueue queue = Volley.newRequestQueue(getBaseContext());
                String url = String.valueOf(textUriInput.getText());
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                    textPageView.setText(Html.fromHtml(response, Html.FROM_HTML_MODE_COMPACT));
                                } else {
                                    textPageView.setText(Html.fromHtml(response));
                                };
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textPageView.setText("That didn't work!");
                    }

                });
                queue.add(stringRequest);
                return true;
            }
        });
    }

    @Override
    public void onActivityResult(Object result) {

    }*/

}}