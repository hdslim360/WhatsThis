package com.example.chad.whatsthis;

import android.hardware.Camera;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.content.ContentValues.TAG;
import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;
import static com.example.chad.whatsthis.Main.getOutputMediaFile;

/**
 * Created by Chad on 9/18/2017.
 */

interface PictureCallback extends Camera.PictureCallback
{
    PictureCallback mPicture = new PictureCallback() {

        @Override
        public void onPictureTaken(byte[] data, Camera camera) {

            File pictureFile = getOutputMediaFile(MEDIA_TYPE_IMAGE);
            if (pictureFile == null){
                Log.d(TAG, "Error creating media file, check storage permissions: " + e.getMessage());
                return;

            }

            try {
                FileOutputStream fos = new FileOutputStream(pictureFile);
                fos.write(data);
                fos.close();
            }

            catch (FileNotFoundException e)
            {
                Log.d(TAG, "File not found: " + e.getMessage());
            } catch (IOException e)
            {
                Log.d(TAG, "Error accessing file: " + e.getMessage());
            }
        }
    };
}
