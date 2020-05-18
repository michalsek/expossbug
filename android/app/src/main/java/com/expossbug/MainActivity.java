package com.expossbug;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactRootView;
import expo.modules.splashscreen.SplashScreen;
import expo.modules.splashscreen.SplashScreenImageResizeMode;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is
   * used to schedule rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "expossbug";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    SplashScreen.show(this, SplashScreenImageResizeMode.COVER, ReactRootView.class);
  }
}
