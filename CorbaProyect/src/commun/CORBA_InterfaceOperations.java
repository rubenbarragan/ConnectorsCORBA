package commun;

/**
 * commun/CORBA_InterfaceOperations.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from CORBA_Interface.idl domingo 10 de abril de
 * 2016 03:55:12 PM CDT
 */
public interface CORBA_InterfaceOperations {

    String sayHello();

    String selectAll();

    String insertRow(String ibt, String name, String lugar, String datetime);

    String updateRow(String ibt, String lugar, String datetime);

    boolean isEmpty();

    void recoveryBD(String ibt, String name, String lugar, String datetime);

    void giveMeYourBD();
} // interface CORBA_InterfaceOperations