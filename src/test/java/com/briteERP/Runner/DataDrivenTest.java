package com.briteERP.Runner;

import com.briteERP.utilities.Driver;
import com.briteERP.utilities.ExcelUtil;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class DataDrivenTest {
    List<Map<String, String>> testData;

    @BeforeMethod
    public void getTestData() {
        ExcelUtil excelUtil = new ExcelUtil("/Users/shernaysawut/Desktop/Framework_Practice/src/test/resource/Data/Event_test_data.xlsx", "ata");
        testData = excelUtil.getDataList();
    }


}
