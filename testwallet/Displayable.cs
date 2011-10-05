/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class Displayable : Storable {
  private HandleRef swigCPtr;

  internal Displayable(IntPtr cPtr, bool cMemoryOwn) : base(otapiPINVOKE.Displayable_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(Displayable obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~Displayable() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_Displayable(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public string gui_label {
    set {
      otapiPINVOKE.Displayable_gui_label_set(swigCPtr, value);
      if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      string ret = otapiPINVOKE.Displayable_gui_label_get(swigCPtr);
      if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public new static Displayable ot_dynamic_cast(Storable pObject) {
    IntPtr cPtr = otapiPINVOKE.Displayable_ot_dynamic_cast(Storable.getCPtr(pObject));
    Displayable ret = (cPtr == IntPtr.Zero) ? null : new Displayable(cPtr, false);
    return ret;
  }

}
