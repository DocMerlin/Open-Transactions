/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class Storage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Storage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Storage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Storage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_OTPacker GetPacker(int ePackType) {
    long cPtr = otapiJNI.Storage_GetPacker__SWIG_0(swigCPtr, this, ePackType);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OTPacker(cPtr, false);
  }

  public SWIGTYPE_p_OTPacker GetPacker() {
    long cPtr = otapiJNI.Storage_GetPacker__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OTPacker(cPtr, false);
  }

  public boolean Init(String oneStr, String twoStr, String threeStr, String fourStr, String fiveStr, String sixStr) {
    return otapiJNI.Storage_Init__SWIG_0(swigCPtr, this, oneStr, twoStr, threeStr, fourStr, fiveStr, sixStr);
  }

  public boolean Init(String oneStr, String twoStr, String threeStr, String fourStr, String fiveStr) {
    return otapiJNI.Storage_Init__SWIG_1(swigCPtr, this, oneStr, twoStr, threeStr, fourStr, fiveStr);
  }

  public boolean Init(String oneStr, String twoStr, String threeStr, String fourStr) {
    return otapiJNI.Storage_Init__SWIG_2(swigCPtr, this, oneStr, twoStr, threeStr, fourStr);
  }

  public boolean Init(String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_Init__SWIG_3(swigCPtr, this, oneStr, twoStr, threeStr);
  }

  public boolean Init(String oneStr, String twoStr) {
    return otapiJNI.Storage_Init__SWIG_4(swigCPtr, this, oneStr, twoStr);
  }

  public boolean Init(String oneStr) {
    return otapiJNI.Storage_Init__SWIG_5(swigCPtr, this, oneStr);
  }

  public boolean Init() {
    return otapiJNI.Storage_Init__SWIG_6(swigCPtr, this);
  }

  public boolean Exists(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_Exists__SWIG_0(swigCPtr, this, strFolder, oneStr, twoStr, threeStr);
  }

  public boolean Exists(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_Exists__SWIG_1(swigCPtr, this, strFolder, oneStr, twoStr);
  }

  public boolean Exists(String strFolder, String oneStr) {
    return otapiJNI.Storage_Exists__SWIG_2(swigCPtr, this, strFolder, oneStr);
  }

  public boolean Exists(String strFolder) {
    return otapiJNI.Storage_Exists__SWIG_3(swigCPtr, this, strFolder);
  }

  public boolean StoreString(String strContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_StoreString__SWIG_0(swigCPtr, this, strContents, strFolder, oneStr, twoStr, threeStr);
  }

  public boolean StoreString(String strContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_StoreString__SWIG_1(swigCPtr, this, strContents, strFolder, oneStr, twoStr);
  }

  public boolean StoreString(String strContents, String strFolder, String oneStr) {
    return otapiJNI.Storage_StoreString__SWIG_2(swigCPtr, this, strContents, strFolder, oneStr);
  }

  public boolean StoreString(String strContents, String strFolder) {
    return otapiJNI.Storage_StoreString__SWIG_3(swigCPtr, this, strContents, strFolder);
  }

  public String QueryString(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_QueryString__SWIG_0(swigCPtr, this, strFolder, oneStr, twoStr, threeStr);
  }

  public String QueryString(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_QueryString__SWIG_1(swigCPtr, this, strFolder, oneStr, twoStr);
  }

  public String QueryString(String strFolder, String oneStr) {
    return otapiJNI.Storage_QueryString__SWIG_2(swigCPtr, this, strFolder, oneStr);
  }

  public String QueryString(String strFolder) {
    return otapiJNI.Storage_QueryString__SWIG_3(swigCPtr, this, strFolder);
  }

  public boolean StorePlainString(String strContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_StorePlainString__SWIG_0(swigCPtr, this, strContents, strFolder, oneStr, twoStr, threeStr);
  }

  public boolean StorePlainString(String strContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_StorePlainString__SWIG_1(swigCPtr, this, strContents, strFolder, oneStr, twoStr);
  }

  public boolean StorePlainString(String strContents, String strFolder, String oneStr) {
    return otapiJNI.Storage_StorePlainString__SWIG_2(swigCPtr, this, strContents, strFolder, oneStr);
  }

  public boolean StorePlainString(String strContents, String strFolder) {
    return otapiJNI.Storage_StorePlainString__SWIG_3(swigCPtr, this, strContents, strFolder);
  }

  public String QueryPlainString(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_QueryPlainString__SWIG_0(swigCPtr, this, strFolder, oneStr, twoStr, threeStr);
  }

  public String QueryPlainString(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_QueryPlainString__SWIG_1(swigCPtr, this, strFolder, oneStr, twoStr);
  }

  public String QueryPlainString(String strFolder, String oneStr) {
    return otapiJNI.Storage_QueryPlainString__SWIG_2(swigCPtr, this, strFolder, oneStr);
  }

  public String QueryPlainString(String strFolder) {
    return otapiJNI.Storage_QueryPlainString__SWIG_3(swigCPtr, this, strFolder);
  }

  public boolean StoreObject(Storable theContents, String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_StoreObject__SWIG_0(swigCPtr, this, Storable.getCPtr(theContents), theContents, strFolder, oneStr, twoStr, threeStr);
  }

  public boolean StoreObject(Storable theContents, String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_StoreObject__SWIG_1(swigCPtr, this, Storable.getCPtr(theContents), theContents, strFolder, oneStr, twoStr);
  }

  public boolean StoreObject(Storable theContents, String strFolder, String oneStr) {
    return otapiJNI.Storage_StoreObject__SWIG_2(swigCPtr, this, Storable.getCPtr(theContents), theContents, strFolder, oneStr);
  }

  public boolean StoreObject(Storable theContents, String strFolder) {
    return otapiJNI.Storage_StoreObject__SWIG_3(swigCPtr, this, Storable.getCPtr(theContents), theContents, strFolder);
  }

  public Storable QueryObject(int theObjectType, String strFolder, String oneStr, String twoStr, String threeStr) {
    long cPtr = otapiJNI.Storage_QueryObject__SWIG_0(swigCPtr, this, theObjectType, strFolder, oneStr, twoStr, threeStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public Storable QueryObject(int theObjectType, String strFolder, String oneStr, String twoStr) {
    long cPtr = otapiJNI.Storage_QueryObject__SWIG_1(swigCPtr, this, theObjectType, strFolder, oneStr, twoStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public Storable QueryObject(int theObjectType, String strFolder, String oneStr) {
    long cPtr = otapiJNI.Storage_QueryObject__SWIG_2(swigCPtr, this, theObjectType, strFolder, oneStr);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public Storable QueryObject(int theObjectType, String strFolder) {
    long cPtr = otapiJNI.Storage_QueryObject__SWIG_3(swigCPtr, this, theObjectType, strFolder);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public boolean EraseValueByKey(String strFolder, String oneStr, String twoStr, String threeStr) {
    return otapiJNI.Storage_EraseValueByKey__SWIG_0(swigCPtr, this, strFolder, oneStr, twoStr, threeStr);
  }

  public boolean EraseValueByKey(String strFolder, String oneStr, String twoStr) {
    return otapiJNI.Storage_EraseValueByKey__SWIG_1(swigCPtr, this, strFolder, oneStr, twoStr);
  }

  public boolean EraseValueByKey(String strFolder, String oneStr) {
    return otapiJNI.Storage_EraseValueByKey__SWIG_2(swigCPtr, this, strFolder, oneStr);
  }

  public boolean EraseValueByKey(String strFolder) {
    return otapiJNI.Storage_EraseValueByKey__SWIG_3(swigCPtr, this, strFolder);
  }

  public Storable CreateObject(int eType) {
    long cPtr = otapiJNI.Storage_CreateObject(swigCPtr, this, eType);
    return (cPtr == 0) ? null : new Storable(cPtr, true);
  }

  public static Storage Create(int eStorageType, int ePackType) {
    long cPtr = otapiJNI.Storage_Create(eStorageType, ePackType);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int GetType() {
    return otapiJNI.Storage_GetType(swigCPtr, this);
  }

}
