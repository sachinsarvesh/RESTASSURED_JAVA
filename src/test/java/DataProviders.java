import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "sampleData")
    public Object[][] dataForPost(){
//        Object[][] data = new Object[2][3];
//
//        data[0][0] = "Yashwanth";
//        data[0][1] = "dev";
//        data[0][2] = 1;
//
//        data[1][0] = "Mani";
//        data[1][1] = "QA";
//        data[1][2] = 2;

        return new Object[][]{
                {"Suman", "dev", 3},
                {"Reshma", "dev", 3}
        };
    }
}
