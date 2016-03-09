package com.bigholding.bigwebsite;

/**
 * Created by karan on 09-Mar-16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by karan on 09-Mar-16.
 */
public class ContactcontentFragment extends Fragment  {
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

//        supportMapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
//        map = supportMapFragment.getMap();
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



//    public void onMapReady(GoogleMap map) {
//        LatLng sydney = new LatLng(-33.867, 151.206);
//
//        map.setMyLocationEnabled(true);
//        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
//
//        map.addMarker(new MarkerOptions()
//                .title("Sydney")
//                .snippet("The most populous city in Australia.")
//                .position(sydney));
//    }
//    @Override
//    public void onAttach(Activity activity) {
//        myContext=(FragmentActivity) activity;
//        super.onAttach(activity);
//    }
}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }


