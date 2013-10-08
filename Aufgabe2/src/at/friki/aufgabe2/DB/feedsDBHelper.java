package at.friki.aufgabe2.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class feedsDBHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "feeds.db";
	private static final int DATABASE_VERSION = 1;

	public feedsDBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Method is called during creation of the database
	@Override
	public void onCreate(SQLiteDatabase database) {
		tableFeeds.onCreate(database);
		tableArticles.onCreate(database);
	}

	// Method is called during an upgrade of the database,
	// e.g. if you increase the database version
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		tableFeeds.onUpgrade(database, oldVersion, newVersion);
		tableArticles.onUpgrade(database, oldVersion, newVersion);
	}
}
 
