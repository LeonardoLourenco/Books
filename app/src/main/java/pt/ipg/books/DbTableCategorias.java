package pt.ipg.books;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class DbTableCategorias implements BaseColumns {
    public static final String TABLE_NAME = "categories";

    public static final String FIELD_NAME = "name";
    private SQLiteDatabase db;

    public DbTableCategorias(SQLiteDatabase db) {
        this.db = db;
    }

    public void create(){
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        FIELD_NAME + " TEXT NOT NULL" +
                        ")"
        );
    }
}
