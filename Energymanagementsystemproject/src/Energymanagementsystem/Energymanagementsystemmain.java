package Energymanagementsystem;
import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Energymanagementsystemmain {

	    public static void main(String[] args) {
	        // Instance creation
	        LogFileManager logManager = new LogFileManager();  // Monica

	        try {
	            // Monica: File management actions
	            System.out.println("===== Log File Management =====");

	            // 1. Create a log for StationA using Solar
	            logManager.createLog("StationA", "Solar");

	            // 2. Move the log to the archive folder
	            logManager.moveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

	            // 3. Archive the log file into a .zip
	            logManager.archiveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

	            // 4. Delete the log file after archiving
	            logManager.deleteLog("archived_logs/StationA_Solar_log_" + getCurrentDate() + ".txt");

	        } catch (IOException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    // Method to get the current date in 'yyyyMMdd' format
	    public static String getCurrentDate() {
	        return new SimpleDateFormat("yyyyMMdd").format(new Date());
	    }
	}