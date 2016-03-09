package com.bigholding.bigwebsite;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by karan on 09-Mar-16.
 */
public class SectorscontentFragment extends Fragment{
    //region Viewpager required
    private ViewPager viewPager;
public enum CustomPagerEnum {

     LOGISTICS("Logistics", R.layout.logistics_content),
     CONSTRUCTION("Construction", R.layout.construction_content),
     ENERGY("Energy", R.layout.energy_content);

    private String mTitleResId;
    private int mLayoutResId;

    CustomPagerEnum(String titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public String getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
    //region

    //region switching pages automatically
//    Timer timer;
//    int page = 0;


//    public void pageSwitcher(int seconds) {
//        timer = new Timer(); // At this line a new Thread will be created
//        timer.scheduleAtFixedRate(new RemindTask(), 0, seconds * 1000); // delay
//        // in
//        // milliseconds
//    }

//    class RemindTask extends TimerTask {
//
//        @Override
//        public void run() {
//
//            // As the TimerTask run on a seprate thread from UI thread we have
//            // to call runOnUiThread to do work on UI thread.
//            getActivity().runOnUiThread(new Runnable() {
//                public void run() {
//
//                    if (page > 3) { // In my case the number of pages are 5
//                        timer.cancel();
//                        // Showing a toast for just testing purpose
////                        Toast.makeText(getContext(), "Timer stoped",
////                                Toast.LENGTH_LONG).show();
//                    } else {
//                        viewPager.setCurrentItem(page++);
//                    }
//                }
//            });
//
//        }
//    }
    //region
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sectors_content_fragment,
                container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager_sector);
        viewPager.setAdapter(new CustomPagerAdapter(getActivity()));
        //pageSwitcher(3);//turn pages every 1 section to show user something is there

        return view;
    }
    class CustomPagerAdapter extends PagerAdapter {

        private Context mContext;

        public CustomPagerAdapter(Context context) {
            mContext = context;
        }

        @Override
        public Object instantiateItem(ViewGroup collection, int position) {
            CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
            LayoutInflater inflater = LayoutInflater.from(mContext);
            ViewGroup layout = (ViewGroup) inflater.inflate(customPagerEnum.getLayoutResId(), collection, false);
            collection.addView(layout);
            return layout;
        }

        @Override
        public void destroyItem(ViewGroup collection, int position, Object view) {
            collection.removeView((View) view);
        }

        @Override
        public int getCount() {
            return CustomPagerEnum.values().length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
            return (customPagerEnum.getTitleResId());
        }

    }

}
