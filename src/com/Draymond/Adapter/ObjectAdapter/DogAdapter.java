package com.Draymond.Adapter.ObjectAdapter;

public class DogAdapter  implements Robot {
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void cry() {
        dog.wang();
    }

    @Override
    public void move() {

        dog.run();
    }
}
