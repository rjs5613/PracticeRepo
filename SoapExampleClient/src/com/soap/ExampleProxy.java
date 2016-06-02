package com.soap;

public class ExampleProxy implements com.soap.Example {
  private String _endpoint = null;
  private com.soap.Example example = null;
  
  public ExampleProxy() {
    _initExampleProxy();
  }
  
  public ExampleProxy(String endpoint) {
    _endpoint = endpoint;
    _initExampleProxy();
  }
  
  private void _initExampleProxy() {
    try {
      example = (new com.soap.ExampleServiceLocator()).getExample();
      if (example != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)example)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)example)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (example != null)
      ((javax.xml.rpc.Stub)example)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soap.Example getExample() {
    if (example == null)
      _initExampleProxy();
    return example;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (example == null)
      _initExampleProxy();
    return example.sayHello(name);
  }
  
  
}