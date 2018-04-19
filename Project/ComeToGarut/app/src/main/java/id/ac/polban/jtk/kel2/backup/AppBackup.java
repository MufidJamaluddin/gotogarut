package id.ac.polban.jtk.kel2.backup;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/**
 * Created by dasuk on 19/04/2018.
 */

public class AppBackup extends BackupAgentHelper
{
    static final String PREF = "app_pref";
    static final String PREF_BACKUP_KEY = "appkel2";

    @Override
    public void onCreate()
    {
        super.onCreate();
        SharedPreferencesBackupHelper helper = new SharedPreferencesBackupHelper(this, PREF);
        super.addHelper(PREF_BACKUP_KEY, helper);
    }
}
