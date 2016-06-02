/**
 * Example.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Example extends Remote {
    public java.lang.String sayHello(String name) throws RemoteException;
}
