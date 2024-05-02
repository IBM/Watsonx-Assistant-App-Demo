package com.WatsonxAssistantApp;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.PackageList;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;

import java.util.List;

import javax.annotation.Nullable;

public class MainActivity extends ReactActivity {
      private WindowInfoTrackerCallbackAdapter windowInfoTracker;
    private final LayoutStateChangeCallback layoutStateChangeCallback =
            new LayoutStateChangeCallback();

    class LayoutStateChangeCallback implements Consumer<WindowLayoutInfo> {
        @Override
        public void accept(WindowLayoutInfo newLayoutInfo) {
            // Use newLayoutInfo to update the Layout
            List<DisplayFeature> displayFeatures = newLayoutInfo.getDisplayFeatures();
            for (DisplayFeature feature : displayFeatures) {
                Log.d("TEST 2",feature.toString());
                Log.d("TEST LOG",(((FoldingFeature) feature).getState()).toString());

                if (feature instanceof FoldingFeature) {
                    if (isTableTopPosture((FoldingFeature) feature)) {
                        //enterTabletopMode(feature);
                    } else if (isBookPosture((FoldingFeature) feature)) {
                        //enterBookMode(feature);
                    } else if (isSeparating((FoldingFeature) feature)) {
                        // Dual-screen device
                        if (((FoldingFeature) feature).getOrientation() ==
                                FoldingFeature.Orientation.HORIZONTAL) {
                            //enterTabletopMode(feature);
                        } else {
                            //enterBookMode(feature);
                        }
                    } else {
                        //enterNormalMode();
                    }
                }
            }
        }
    }


    private boolean isTableTopPosture(FoldingFeature foldFeature) {
        return (foldFeature != null) &&
                (foldFeature.getState() == FoldingFeature.State.HALF_OPENED) &&
                (foldFeature.getOrientation() == FoldingFeature.Orientation.HORIZONTAL);
    }

    private boolean isBookPosture(FoldingFeature foldFeature) {
        return (foldFeature != null) &&
                (foldFeature.getState() == FoldingFeature.State.HALF_OPENED) &&
                (foldFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL);
    }

    private boolean isSeparating(FoldingFeature foldFeature) {
        return (foldFeature != null) &&
                (foldFeature.getState() == FoldingFeature.State.FLAT) &&
                (foldFeature.isSeparating() == true);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        windowInfoTracker =
                new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.getOrCreate(this));

    }

    @Override
    protected void onStart() {
        super.onStart();
        windowInfoTracker.addWindowLayoutInfoListener(
                this, Runnable::run, layoutStateChangeCallback);
    }

    @Override
    protected void onStop() {
        super.onStop();
        windowInfoTracker.removeWindowLayoutInfoListener(layoutStateChangeCallback);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        final WindowMetrics windowMetrics = WindowMetricsCalculator.getOrCreate()
                .computeCurrentWindowMetrics(this);
        final Rect bounds = windowMetrics.getBounds();

        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", newConfig);
        this.sendBroadcast(intent);
    }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "WatsonxAssistantApp";
  }

  /**
   * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util class {@link
   * DefaultReactActivityDelegate} which allows you to easily enable Fabric and Concurrent React
   * (aka React 18) with two boolean flags.
   */
  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new DefaultReactActivityDelegate(
        this,
        getMainComponentName(),
        // If you opted-in for the New Architecture, we enable the Fabric Renderer.
        DefaultNewArchitectureEntryPoint.getFabricEnabled());
  }
}
