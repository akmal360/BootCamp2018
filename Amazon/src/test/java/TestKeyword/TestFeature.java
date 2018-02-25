package TestKeyword;


import Keyword.Feature;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFeature extends Feature {
    @Test
    public void testFeature()throws IOException,InterruptedException{
        selectFeature();
    }

}
