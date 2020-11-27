package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    onClickButton onClickButton;
    public MainActivityFragment( ) {
    }

    public interface onClickButton {
        public void onClick(View v);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
//         Create an ad request. Check logcat output for the hashed device ID to
//         get test ads on a physical device. e.g.
//         "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        Button button = root.findViewById(R.id.button);
        button.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        //  onClickButton.onClick(v);
        // tellJoke(v);
        try{
            ((onClickButton) getActivity()).onClick(v);
        }catch (ClassCastException cce){

        }
    }

    public void tellJoke(View view) {
        Toast.makeText(getActivity(), "derp", Toast.LENGTH_LONG).show();
    }
}
