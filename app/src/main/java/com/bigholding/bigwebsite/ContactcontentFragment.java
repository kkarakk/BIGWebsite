package com.bigholding.bigwebsite;

/**
 * Created by karan on 09-Mar-16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by karan on 09-Mar-16.
 */
public class ContactcontentFragment extends Fragment implements OnMapReadyCallback {
//    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
//    static final LatLng KIEL = new LatLng(53.551, 9.993);
//    private GoogleMap map;
//    //    private MapView mapView;
//    SupportMapFragment supportMapFragment;
//private FragmentActivity myContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_content_fragment,
                container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
//
//        MapFragment mapFragment = (android.support.v4.app.Fragment) getFragmentManager()
//                .findFragmentById(R.id.map); mapFragment.getMapAsync(this);
////        supportMapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
////        map = supportMapFragment.getMap();
////        mapView.onCreate(savedInstanceState);
////        map =mapView.getMap();
////        mapView=(MapView)getFragmentManager().findFragmentById(R.id.map).getView();
////        map=mapView.getMap();
////        GoogleMap mMap = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//        Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
//                .title("Hamburg"));
//        Marker kiel = map.addMarker(new MarkerOptions()
//                .position(KIEL)
//                .title("Kiel")
//                .snippet("Kiel is cool")
//                .icon(BitmapDescriptorFactory
//                        .fromResource(R.mipmap.ic_launcher)));
//        map.getUiSettings().setMyLocationButtonEnabled(false);
//        map.setMyLocationEnabled(true);
//        try {
//            MapsInitializer.initialize(this.getActivity());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Updates the location and zoom of the MapView
//        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(43.1, -87.9), 10);
//        map.animateCamera(cameraUpdate);
//        FragmentManager fragManager = myContext.getSupportFragmentManager();
//        SupportMapFragment mapFragment = (SupportMapFragment) fragManager.findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
        return view;
    }


    @Override
    public void onMapReady(final GoogleMap map) {
        //this.map = map;
        CameraUpdate center =
                CameraUpdateFactory.newLatLng(new LatLng(29.378600, 47.990282));
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(10);
        map.addMarker(new MarkerOptions()
                .position(new LatLng(29.378600, 47.990282))
                .title("Beyout Investment Group")).showInfoWindow();
        map.moveCamera(center);
        map.animateCamera(zoom);
        //map.setMyLocationEnabled(true);
    }
}
