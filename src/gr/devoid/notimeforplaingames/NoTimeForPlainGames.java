package gr.devoid.notimeforplaingames;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NoTimeForPlainGames extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_time_for_plain_games);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.no_time_for_plain_games, menu);
		return true;
	}

}
