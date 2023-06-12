package com.example.monitormaintainance2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MonitorMaintainance2ControllerTest {
     private  MonitorMaintainance2Controller messageController= new MonitorMaintainance2Controller();
     @Test
    public void defaultTest(){
         String message = messageController.message;
         String result = messageController.defaultwebseite();
         assertEquals(message, result);
     }
}
