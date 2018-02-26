package com.example.sallai.gps;

/**
 * Created by Sallai on 26.02.2018.
 */

public class LocationSQL {
        public static final String TABLE_NAME = "Location";


        public static final String longitude = "Longitude";
        public static final String latitude = "Latitude";
        public static final String mydate = "Mydate";
        public static final String[] all_columns = new String[] {longitude, latitude, mydate};

        public static final String SQL_DropLocation = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public static final String SQL_CreateLocation = "CREATE TABLE " + TABLE_NAME + "(" + longitude + "TEXT NOT NULL,"+ latitude + "TEXT NOT NULL,"+ mydate + "TEXT NOT NULL" + ")";

        public static final String SQL_InsertLocation = "INSERT INTO " + TABLE_NAME + "(" + longitude + "," + latitude + "," + mydate + ")"+ "VALUES (?,?,?)";

        public static final String SQL_DeleteLocation = "DELETE FROM " + TABLE_NAME;
}
