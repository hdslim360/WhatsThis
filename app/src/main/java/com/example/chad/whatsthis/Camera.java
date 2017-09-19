package com.example.chad.whatsthis;


//import android.hardware.Camera;

import android.hardware.Camera.ShutterCallback;

/**
 * Created by Chad on 9/18/2017.
 */

public class Camera
{
            public static android.hardware.Camera open()
            {
                return getCameraInstance();
            }

            /** A safe way to get an instance of the Camera object. */
            public static android.hardware.Camera getCameraInstance()
            {
                android.hardware.Camera c = null;
                try
                {
                    c = android.hardware.Camera.open(); // attempt to get a Camera instance
                }
                catch (Exception e)
                {
                    // Camera is not available (in use or does not exist)
                }
                return c; // returns null if camera is unavailable
            }




}
