package org.example.proxy;

import org.example.state.ATMMachine;

public class ATMProxy implements ATMData {
    ATMMachine ATMMachine;

    public ATMProxy(){
        ATMMachine = new ATMMachine();
    }

    public ATMState getATMState() {
        return ATMMachine.getATMState();
    }

    public int getCashInMachine() {
        return ATMMachine.getCashInMachine();
    }

}
