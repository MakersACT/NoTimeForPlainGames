package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;

public class NoTimeForPlainGames extends Activity {
	public final static String NUMBER_OF_PLAYERS = "gr.devoid.notimeforplaingames.NUMBER_OF_PLAYERS";
	private int numberOfPlayers = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_time_for_plain_games);

		final ImageView settings = (ImageView) findViewById(R.id.settings);
		final ImageView materials = (ImageView) findViewById(R.id.materials);
		final ImageView hand = (ImageView) findViewById(R.id.hand);
		final ImageView start = (ImageView) findViewById(R.id.start);
		final ImageView exit = (ImageView) findViewById(R.id.exit);

		// Using OnTouchListener to catch touch events, in order
		// to update the image of the button on click and release.
		start.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					start.setImageResource(R.drawable.start_down);
					return true;
				case MotionEvent.ACTION_UP:
					start.setImageResource(R.drawable.start);
					showDialog();
					Intent createPlayers = new Intent(NoTimeForPlainGames.this, CreatePlayersActivity.class);
					createPlayers.putExtra(NUMBER_OF_PLAYERS, numberOfPlayers);
					startActivity(createPlayers);
					return true;
				default:
					return false;
				}
			}
		});

		materials.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					materials.setImageResource(R.drawable.materials_down);
					return true;
				case MotionEvent.ACTION_UP:
					materials.setImageResource(R.drawable.materials);
					return true;
				default:
					return false;
				}
			}
		});

		settings.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					settings.setImageResource(R.drawable.settings_down);
					return true;
				case MotionEvent.ACTION_UP:
					settings.setImageResource(R.drawable.settings);
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

	public void showDialog() {
		final Dialog pickNumberDialog = new Dialog(NoTimeForPlainGames.this);
		pickNumberDialog.setTitle("Number of Players");
		pickNumberDialog.setContentView(R.layout.pick_number_dialog);
		Button setButton = (Button) findViewById(R.id.player_picker_set);
		Button cancelButton = (Button) findViewById(R.id.player_picker_cancel);
		final NumberPicker pickNumber = (NumberPicker) pickNumberDialog.findViewById(R.id.player_number_picker);
		
		pickNumber.setMaxValue(15);
		pickNumber.setMinValue(2);
		pickNumber.setWrapSelectorWheel(true);
		
		setButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				numberOfPlayers = pickNumber.getValue();
				pickNumberDialog.dismiss();
			}
		});
		
		cancelButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				pickNumberDialog.dismiss();
			}
		});
	}
}
