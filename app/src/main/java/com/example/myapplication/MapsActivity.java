package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.myapplication.databinding.ActivityMapsBinding;

public class MapsActivity extends AppCompatActivity implements  OnMapReadyCallback {

    private GoogleMap mMap;
    private OnMapReadyCallback onMapReadyCallback;
    private double v;
    private Object v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                                           .findFragmentById(R.id.map);


        mapFragment.getMapAsync( onMapReadyCallback this);
        
        
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        
        mMap = googleMap;
;
        LatLng bgmlatLng = new LatLng( v 26.238_9, v1  73.024_3)
        MarkerOptions markerOptions = new MarkerOptions().position(bgmlatLng).title("Belgaum");
                mMap.addMarker(markerOptions);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bgmlatLng));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bgmlatLng, v: 16f));

    }
}