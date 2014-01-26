package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class NoTimeForPlainGames extends Activity {

	ImageView start, materials, settings, exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_time_for_plain_games);

		start = (ImageView) findViewById(R.id.start);
		materials = (ImageView) findViewById(R.id.matterials);
		settings = (ImageView) findViewById(R.id.settings);
		exit = (ImageView) findViewById(R.id.exit);

		// Using OnTouchListener to catch touch events, in order
		// to update the image of the button on click and release.
		start.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					start.setImageResource(R.drawable.start_down);
					startActivity(new Intent(NoTimeForPlainGames.this, SelectPlayers.class));
					return true;

				case MotionEvent.ACTION_UP:
					start.setImageResource(R.drawable.start);
					return true;
				default:
					return false;
				}
			}
		});

		exit.setOnTouchListener(new View.OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					exit.setImageResource(R.drawable.exit_down);
					return true;
				case MotionEvent.ACTION_UP:
					exit.setImageResource(R.drawable.exit);
					System.exit(0);
					return true;
				default:
					return false;
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.no_time_for_plain_games, menu);
		return true;
	}

}
