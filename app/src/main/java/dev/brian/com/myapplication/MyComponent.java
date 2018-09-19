package dev.brian.com.myapplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyStringModule.class)
interface MyComponent {
    void inject(MainActivity mainActivity);

}

