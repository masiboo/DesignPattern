package org.example.state2;

public class StatePattern {

    public static void main(String[] args) {
        ProfileState profileState = new ProfileState();
        profileState.activateProfile(State.VIBRATION);
        profileState.activateProfile(State.SILENT);
    }
}
