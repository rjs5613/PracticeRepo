/**
 * ExampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface ExampleService extends Service {
    public java.lang.String getExampleAddress();

    public com.soap.Example getExample() throws ServiceException;

    public com.soap.Example getExample(URL portAddress) throws ServiceException;
}
