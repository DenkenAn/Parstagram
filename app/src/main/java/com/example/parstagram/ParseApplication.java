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
                .applicationId("laiDReOaQT834ByB66XCnEeozwmFAi7pO8Zq53R7")
                .clientKey("6kupl2IheJHk0zblCR1L8jNuOa6PqchEb73k8RDI")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
