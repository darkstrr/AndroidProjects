package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4O3uoKTOzu2Npw34ODYjw9aRheAyJ7muaeV4ITey")
                .clientKey("u8c0OJjX2r5b78CJfPMiDxWd6xx11tRLIFYz2YWo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
