package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class GameSelect extends Activity {

	ImageView draw, ath, arch, sing, dance;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_select);

		draw = (ImageView) findViewById(R.id.imageDraw);
		ath = (ImageView) findViewById(R.id.imageAth);
		arch = (ImageView) findViewById(R.id.imageArch);
		sing = (ImageView) findViewById(R.id.imageSing);
		dance = (ImageView) findViewById(R.id.imageDance);

		draw.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
		});

		ath.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		arch.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		sing.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		dance.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_select, menu);
		return true;
	}

}
