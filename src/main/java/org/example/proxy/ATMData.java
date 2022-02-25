package org.example.proxy;

// This interface will contain just those methods
// that you want the proxy to provide access to

public interface ATMData {
     ATMState getATMState();
     int getCashInMachine();
}
