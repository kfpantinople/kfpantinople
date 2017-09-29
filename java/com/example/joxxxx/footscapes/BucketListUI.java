package com.example.joxxxx.footscapes;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.hardware.camera2.*;

public class BucketListUI extends AppCompatActivity
{

    private Camera mCamera;
    //private CameraPreview mPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list_ui);
    }

    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
        {
            // this device has a camera
            return true;
        }
        else
        {
            // no camera on this device
            return false;
        }
    }

    public static Camera getCameraInstance(){
        Camera c = null;
        try
        {
            //c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }

    public void buttonclick(View v)
    {
        Intent govalidate = new Intent(this,BucketListValidationUI.class);
        Intent goposttest = new Intent(this,PostTestUI.class);
        switch (v.getId())
        {
            case R.id.btnpost:
            {
                startActivity(goposttest);
                break;
            }
            default:
            {
                startActivity(govalidate);
                break;
            }
        }
    }

}
