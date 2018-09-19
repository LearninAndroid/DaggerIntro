package dev.brian.com.myapplication;

import android.app.Application;

public class MyApplication  extends Application{
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent.builder().myStringModule(new MyStringModule()).build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
