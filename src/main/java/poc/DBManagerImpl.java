package poc;

import java.io.File;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DBManagerImpl implements DBManager {
	boolean connectionOpen = false;
	Logger logger = LoggerFactory.getLogger(DBManagerImpl.class);
	ConnectionSource connectionSource = null;
	private static final String CONNECTION_STRING = "jdbc:sqlite:test.db";
	private static final String DATABASE_NAME = "test.db";
	
	private boolean deleteDatabase() {
		File file = new File(DATABASE_NAME);
		return file.delete();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T> void createDatabase(List<Class> tables) {
		deleteDatabase();
		openConnection();
		Iterator<Class> i = tables.iterator();
		while (i.hasNext()) {
			Class clasz = i.next();
			try {
				TableUtils.createTable(connectionSource, clasz);
			} catch (SQLException e) {
				logger.error(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
		}
		closeConnection();
		
	}

	private void openConnection() {
		try {
			connectionSource = new JdbcConnectionSource(CONNECTION_STRING);
			connectionOpen = true;
			logger.debug("Opened database successfully");
		} catch (SQLException e) {
			logger.error(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	private void closeConnection() {
		try {
			connectionSource.close();
			connectionOpen = false;
		} catch (SQLException e) {
			logger.error(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	
	public <T> void insertRecord(T record, Class<T> clasz) {
		try {
			openConnection();
			Dao<T, String> dao = DaoManager.createDao(connectionSource, clasz);
			dao.create(record);
			closeConnection();
		} catch (SQLException e) {
			logger.error(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	public <T> T retrieveRecord(String id, Class<T> clasz) {
		try {
			openConnection();
			Dao<T, String> dao = DaoManager.createDao(connectionSource, clasz);
			return dao.queryForId(id);
		} catch (SQLException e) {
			logger.error(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
			return null;
		}
	}

}
