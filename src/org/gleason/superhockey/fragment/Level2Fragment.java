package org.gleason.superhockey.fragment;

import org.gleason.superhockey.MainActivity;
import org.gleason.superhockey.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class Level2Fragment extends Fragment implements OnClickListener{
	public static Level2Fragment newInstance() {
		return new Level2Fragment();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View returnValue = inflater.inflate(R.layout.fragment_level2, container, false);
		returnValue.findViewById(R.id.level2).setOnClickListener(this);
		return returnValue;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(getActivity().getApplicationContext(), MainActivity.class);
		Bundle b = new Bundle();
		
		b.putInt("level", 2);
		intent.putExtras(b);
		getActivity().startActivity(intent);
	}
}
