package dev.brian.com.myapplication;

public class MyStringClass implements MyString{

    private String name;

    public MyStringClass(){
        name="This is dagger";
    }
    @Override
    public String myStringVal() {
        return name;
    }
}
