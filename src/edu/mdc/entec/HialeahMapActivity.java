package edu.mdc.entec;

import android.app.Activity;
import android.os.Bundle;

public class HialeahMapActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hialeah_campus_map_layout);
		
        /*final ImageView HialeahMap = (ImageView) findViewById(R.id.imgHialeahMap);
        
		HialeahMap.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentHialeah = new Intent();
				intentHialeah.setAction(Intent.ACTION_VIEW);
				intentHialeah.setDataAndType(Uri.parse("file://" + "/MDC_Mobile/res/drawable-hdpi/hialeah_map.png"), "image/*");
				startActivity(intentHialeah);
			}
        	
        });*/
		
	}
}
