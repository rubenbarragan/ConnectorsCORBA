package commun;


/**
* commun/CORBA_InterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CORBA_Interface.idl
* s�bado 9 de abril de 2016 01:22:44 AM CDT
*/

abstract public class CORBA_InterfaceHelper
{
  private static String  _id = "IDL:commun/CORBA_Interface:1.0";

  public static void insert (org.omg.CORBA.Any a, commun.CORBA_Interface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static commun.CORBA_Interface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (commun.CORBA_InterfaceHelper.id (), "CORBA_Interface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static commun.CORBA_Interface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CORBA_InterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, commun.CORBA_Interface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static commun.CORBA_Interface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof commun.CORBA_Interface)
      return (commun.CORBA_Interface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      commun._CORBA_InterfaceStub stub = new commun._CORBA_InterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static commun.CORBA_Interface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof commun.CORBA_Interface)
      return (commun.CORBA_Interface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      commun._CORBA_InterfaceStub stub = new commun._CORBA_InterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
