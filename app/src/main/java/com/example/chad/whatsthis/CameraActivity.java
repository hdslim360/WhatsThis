package com.example.chad.whatsthis;

import android.app.Activity;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.hardware.Camera;

import static com.example.chad.whatsthis.Camera.getCameraInstance;

/**
 * Created by Chad on 9/18/2017.
 */

public class CameraActivity extends Activity
{

    private Camera mCamera;
    //private CameraPreview mPreview;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Create an instance of Camera
        mCamera = getCameraInstance();

        // Create our Preview view and set it as the content of our activity.
        mPreview = new CameraPreview(this, mCamera);
        FrameLayout preview = findViewById(R.id.camera_preview);
        preview.addView(mPreview);
    }

    //private Camera mCamera;
    private SurfaceView mPreview;
    private MediaRecorder mMediaRecorder;



    @Override
    protected void onPause() {
        super.onPause();
        releaseMediaRecorder();       // if you are using MediaRecorder, release it first
        releaseCamera();              // release the camera immediately on pause event
    }

    private void releaseMediaRecorder(){
        if (mMediaRecorder != null) {
            mMediaRecorder.reset();   // clear recorder configuration
            mMediaRecorder.release(); // release the recorder object
            mMediaRecorder = null;
            mCamera.lock();           // lock camera for later use
        }
    }

    private void releaseCamera(){
        if (mCamera != null){
            mCamera.release();        // release the camera for other applications
            mCamera = null;
        }
    }
}
