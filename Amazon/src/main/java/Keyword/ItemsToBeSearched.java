package Keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI{
    DataReader dataReader = new DataReader();
    public String[] getDataFromExcelFileForFeatures() throws IOException, InterruptedException {
        String path = System.getProperty("user.dir")+"/data/Features.xls";
        String [] data = dataReader.colReader(path,2);
        sleepFor(2);
        return data;
    }
}
