
package com.futurehotel.library;

import android.nfc.Tag;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNFutureModule extends ReactContextBaseJavaModule {
  public static final String TAG=RNFutureModule.class.getName();
  private final ReactApplicationContext reactContext;

  public RNFutureModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFuture";
  }


  public void  textMethod(){
    Log.e(TAG, "textMethod测试测试");
  }

}