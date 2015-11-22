package com.example.kt.cha_on.DB;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by kt on 2015-11-22.
 */
public class DataManager {
    private Context context = null;
    private DbOpenHelper mDbOpenHelper;
    private Cursor mCursor=null;


    public DataManager(Context context) {
        this.context = context;
        mDbOpenHelper = new DbOpenHelper(context);
    }
}