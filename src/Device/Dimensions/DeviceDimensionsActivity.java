package Device.Dimensions;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class DeviceDimensionsActivity extends Activity {
    /** Called when the activity is first created. */
	Display ApplicationDisplay;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ApplicationDisplay = getWindowManager().getDefaultDisplay();
        String deviceId = Secure.getString(this.getContentResolver(),Secure.ANDROID_ID);
        
        TextView WidthTextview=(TextView)findViewById(R.id.WidthtextView1);
        TextView HeighttextView=(TextView)findViewById(R.id.HeighttextView2);
        TextView IDtextView=(TextView)findViewById(R.id.IDtextView2);
        
        WidthTextview.setText("Width : "+String.valueOf(ApplicationDisplay.getWidth()));
        HeighttextView.setText("Height : "+String.valueOf(ApplicationDisplay.getHeight()));
        IDtextView.setText("ANDROID ID : "+deviceId);
        //Eswaran
// switch1
//        final Switch switchT1 = (Switch)findViewById(R.id.switch1);   
//        switchT1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                if(switchT1.isChecked() == true)
//                {
////                	txtView1.setText("Your Selected is On");
//        			Toast.makeText(DeviceDimensionsActivity.this,
//            				String.valueOf("Your Selected is On"),
//            					Toast.LENGTH_SHORT).show();          	
//                }
//                else
//                {
////                	txtView1.setText("Your Selected is Off");
//        			Toast.makeText(DeviceDimensionsActivity.this,
//            				String.valueOf("Your Selected is Off"),
//            					Toast.LENGTH_SHORT).show();          	
//                }            	
//   
//            }
//        });

    }
    
    public void ExitApplication(View v)
    {
    	try
    	{
    		finish();
    	}catch (Exception e) 
    	{
			// TODO: handle exception
		}
    }
}