package com.example.mapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
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
        LatLng piramidedegiza = new LatLng(29.979175, 31.134358);
        LatLng Mausoleo = new LatLng(	37.037944, 27.424056);
        LatLng Jardines = new LatLng(	32.5355, 44.4275);
        LatLng Templo  = new LatLng(	27.363889, 37.949722);
        LatLng Estatua  = new LatLng(	37.637861, 	21.63);
        LatLng Coloso  = new LatLng(	36.451111, 	28.227778);
        LatLng Faro  = new LatLng(		31.214167, 	29.885);


        mMap.addMarker(new MarkerOptions().position(piramidedegiza).title("Piramide de Giza"));
        mMap.addMarker(new MarkerOptions().position(Mausoleo).title("Mausoleo de halicarnaso"));
        mMap.addMarker(new MarkerOptions().position(Jardines).title("Los Jardines Colgantes de Babilonia"));
        mMap.addMarker(new MarkerOptions().position(Templo).title("El Templo de Artemisa"));
        mMap.addMarker(new MarkerOptions().position(Estatua).title("La Estatua de Zeus en Olimpia"));
        mMap.addMarker(new MarkerOptions().position(Coloso).title("El Coloso de Rodas"));
        mMap.addMarker(new MarkerOptions().position(Faro).title("El Faro de Alejandría"));


        mMap.addMarker(new MarkerOptions().position(piramidedegiza).title("Es la primera maravilla del mundo antiguo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(piramidedegiza));
    }
}