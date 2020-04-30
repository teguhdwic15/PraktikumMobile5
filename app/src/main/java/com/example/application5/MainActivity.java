package com.example.application5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng smkn1bangil = new LatLng(-7.600467, 112.792152);
        mapAPI.addMarker(new MarkerOptions().position(smkn1bangil).title("SMKN 1 Bangil")
                .snippet("Jl. Tongkol No.3, Sukalipuro, Dermo, Kec. Bangil, Pasuruan, Jawa Timur 67153"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(smkn1bangil));

        LatLng sman1bangil = new LatLng(-7.583224, 112.792238);
        mapAPI.addMarker(new MarkerOptions().position(sman1bangil).title("SMAN 1 Bangil")
                .snippet("Jl. Bader No.3, Satakmanaruwi Lor, Kalirejo, Kec. Bangil, Pasuruan, Jawa Timur 67153"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(sman1bangil));

        LatLng manbangil = new LatLng(-7.588553, 112.779825);
        mapAPI.addMarker(new MarkerOptions().position(manbangil).title("MAN 1 Pasuruan")
                .snippet("Jl. balai Desa gelanggang No.3, Glanggang, Kec. Beji, Pasuruan, Jawa Timur 67154"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(manbangil));

    }
}
