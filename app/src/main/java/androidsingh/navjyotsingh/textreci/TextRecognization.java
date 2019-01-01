package androidsingh.navjyotsingh.textreci;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class TextRecognization extends Application {

    public static final String RESULT_TEST="RESULT_TEST";


    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
