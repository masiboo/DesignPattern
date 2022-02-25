package org.example.state2;

public class ProfileState {

    private  MobileProfileState mobileProfileState;

    public ProfileState(){
        mobileProfileState = new Vibration();
    }

    public void activateProfile(State state){
        switch (state){
            case VIBRATION:
                mobileProfileState = new Vibration();
                mobileProfileState.setProfileState();
                break;
            case SILENT:
                mobileProfileState = new Silent();
                mobileProfileState.setProfileState();
                break;
            default:
                System.out.println("Unknown profile");
        }

    }
}
