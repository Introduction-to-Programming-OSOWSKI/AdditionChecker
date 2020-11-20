package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(true, App.addCheck(22, 22, 44), "addCheck() failed");
       assertEquals(true, App.addCheck(5, 2, 7), "addCheck() failed");
       assertEquals(true, App.addCheck(4, 9, 13), "addCheck() failed");
       assertEquals(false, App.addCheck(4, 9, 12), "addCheck() failed");
       assertEquals(false, App.addCheck(4, 9, 14), "addCheck() failed");
   }

}
