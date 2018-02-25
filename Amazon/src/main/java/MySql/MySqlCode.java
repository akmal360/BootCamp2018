package MySql;



import base.CommonAPI;
import utility.ConnectDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCode extends CommonAPI{
    ConnectDB db = new ConnectDB();
    public List<String> getData(String tableName, String columnNamae) throws Exception {
        List<String> data = new ArrayList<String>();
        data = db.readDataBase(tableName, columnNamae);
        return data;
    }
    public List<String> getAssretData(String tableName, String columnNamae) throws Exception {
        List<String> data = new ArrayList<String>();
        data = db.readDataBase(tableName, columnNamae);
        return data;
    }

    public List<String> searchItemByName(String tableName, String columnName) throws Exception {
        List<String> values = getData(tableName, columnName);
        List<String> actual = new ArrayList<>();
        for (String value : values) {
            sleepFor(1);
            typeByIdNEnter("twotabsearchtextbox", value);
            sleepFor(1);
            actual.add(getCurrentPageTitle());
            clearInputFieldById("twotabsearchtextbox");
            sleepFor(1);
        }
        return actual;
    }


}
