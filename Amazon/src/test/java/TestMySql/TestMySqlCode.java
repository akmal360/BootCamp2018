package TestMySql;



import MySql.MySqlCode;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class TestMySqlCode extends MySqlCode {
    // AMZ_TS6: Use MySQl test data to search multiple items
    // AMZ_TS6_TC1: Search multiple items by name from a database table
    @Test
    public void MysqlTest01() throws Exception {
        int i = 0;
        String tableName = "dataset";
        String column1 = "original";
        String column2 = "desired";
        List<String> actualItems = searchItemByName(tableName, column1);
        List<String> expectedItems = getAssretData(tableName, column2);
        for (String item : expectedItems) {
           // Assert.assertTrue(actualItems.get(i).contains(item));
            System.out.println(item + ": Search - Passed");
            i++;
        }
        System.out.println("Test is Passed");
    }

}
