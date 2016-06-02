/**
 * ExampleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap;

public class ExampleServiceLocator extends org.apache.axis.client.Service implements com.soap.ExampleService {

    public ExampleServiceLocator() {
    }


    public ExampleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExampleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Example
    private java.lang.String Example_address = "http://localhost:8080/SoapExample/services/Example";

    public java.lang.String getExampleAddress() {
        return Example_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExampleWSDDServiceName = "Example";

    public java.lang.String getExampleWSDDServiceName() {
        return ExampleWSDDServiceName;
    }

    public void setExampleWSDDServiceName(java.lang.String name) {
        ExampleWSDDServiceName = name;
    }

    public com.soap.Example getExample() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Example_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExample(endpoint);
    }

    public com.soap.Example getExample(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soap.ExampleSoapBindingStub _stub = new com.soap.ExampleSoapBindingStub(portAddress, this);
            _stub.setPortName(getExampleWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExampleEndpointAddress(java.lang.String address) {
        Example_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soap.Example.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soap.ExampleSoapBindingStub _stub = new com.soap.ExampleSoapBindingStub(new java.net.URL(Example_address), this);
                _stub.setPortName(getExampleWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Example".equals(inputPortName)) {
            return getExample();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.com", "ExampleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.com", "Example"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Example".equals(portName)) {
            setExampleEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
