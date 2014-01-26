package gr.devoid.notimeforplaingames;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class NoTimeForPlainGames extends Activity {
	public final static String NUMBER_OF_PLAYERS = "gr.devoid.notimeforplaingames.NUMBER_OF_PLAYERS";
	private int numberOfPlayers = 0;
	private Intent createPlayers;
	
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
					createPlayers = new Intent(NoTimeForPlainGames.this, CreatePlayersActivity.class);
					showDialog();
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
					Log.d("FUCK!", "Exiting...");
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
		AlertDialog.Builder playerNum = new AlertDialog.Builder(this);
		playerNum.setTitle("Number of Players");
		playerNum.setMessage("Enter the number of players:");
		
		// Set an EditText view to get user input
		final EditText input = new EditText(this);
		input.setInputType(InputType.TYPE_NUMBER_VARIATION_NORMAL);
		playerNum.setView(input);
		
		playerNum.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				numberOfPlayers = Integer.parseInt(input.getText().toString());
				createPlayers.putExtra(NUMBER_OF_PLAYERS, numberOfPlayers);
				startActivity(createPlayers);
			}
		});
		
		playerNum.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// nothing
			}
		});
		
		playerNum.show();
	}
}
