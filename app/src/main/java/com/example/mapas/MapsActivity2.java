package com.example.mapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng chichen = new LatLng(20.6667,  -88.5667);
        LatLng coliseo = new LatLng(41.89193,  12.51133);
        LatLng cristo = new LatLng( -22.949888,  -43.215119);
        LatLng muralla = new LatLng( 40.4319077,  116.5703749);
        LatLng machu = new LatLng( -13.163031497853225,   -72.54498972468005);
        LatLng petra = new LatLng( 30.323218808136044, 35.479635897558886);
        LatLng taj = new LatLng( 27.175345217940237, 78.04212073991509);




        mMap.addMarker(new MarkerOptions().position(chichen).title("Chichén Itzá, México."));
        mMap.addMarker(new MarkerOptions().position(coliseo).title("El Coliseo de Roma, Italia."));
        mMap.addMarker(new MarkerOptions().position(cristo).title("La estatua Cristo Redentor, Río de Janeiro."));
        mMap.addMarker(new MarkerOptions().position(muralla).title("La Gran Muralla, China."));
        mMap.addMarker(new MarkerOptions().position(machu).title("Machu Picchu, Perú"));
        mMap.addMarker(new MarkerOptions().position(petra).title("Petra, Jordania."));
        mMap.addMarker(new MarkerOptions().position(taj).title("El Taj Mahal, India."));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(machu));
        //mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
}