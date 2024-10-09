package EnergyManagementSystem;
import java.io.IOException;
public class EnergyManagementSystemMain {

	 public static void main(String[] args) {
	        // Instance creation
	        LogFileManager logManager = new LogFileManager();  // Monica
	        MetadataManager metadataManager = new MetadataManager();  // Aarthi
	        DataExchangeSimulator dataSimulator = new DataExchangeSimulator();  // Daran

	        try {
	            System.out.println("===== Log File Management =====");
	            
	            // 1. Create a log for StationA using Solar
	            logManager.createLog("StationA", "Solar");
	            
	            // 2. Move the log to the archive folder
	            logManager.moveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

	            // 3. Archive the log file into a .zip
	            logManager.archiveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

	            // 4. Delete the log file after archiving
	            logManager.deleteLog("archived_logs/StationA_Solar_log_" + getCurrentDate() + ".txt");

	            System.out.println();}
	    // Helper method to get current date in the format "yyyyMMdd"
	    public static String getCurrentDate() {
	        return new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
	    }
	}
