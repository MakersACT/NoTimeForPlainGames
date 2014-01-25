package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
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

		start.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(".SELECT"));
			}
		});

		materials.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		settings.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		exit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.exit(0);
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
