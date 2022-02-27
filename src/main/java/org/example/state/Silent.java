package org.example.state;

public class Silent implements MobileProfileState{

    public void setProfileState() {
        System.out.println("Mobile is in silent mode");
    }
}
