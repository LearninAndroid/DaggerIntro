package dev.brian.com.myapplication;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class MyStringModule {

    @Provides
    @Singleton
    static MyString providesMyString(){
        return new MyStringClass();
    }
}
