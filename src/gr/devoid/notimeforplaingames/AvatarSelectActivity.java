package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;

public class AvatarSelectActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_avatar_select);

		GridView gridView = (GridView) findViewById(R.id.grid_view);
        
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.avatar_select, menu);
		return true;
	}
	
}
