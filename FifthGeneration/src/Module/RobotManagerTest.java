//package Module;
//
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//public class RobotManagerTest {
//
//    @Test
//    public void testRobotMovement() {
//        MainMethodRobotManager manager = new MainMethodRobotManager(5, 5);
//        manager.addRobot(1);
//
//        manager.moveRobot(1, "N2");
//        assertEquals("(0, 2)", manager.getRobotLocation(1));
//
//        manager.moveRobot(1, "E1");
//        assertEquals("(1, 2)", manager.getRobotLocation(1));
//    }
//
//    @Test
//    public void testRobotBoundary() {
//        MainMethodRobotManager manager = new MainMethodRobotManager(5, 5);
//        manager.addRobot(1);
//
//        manager.moveRobot(1, "N5");
//        assertEquals("(0, 0)", manager.getRobotLocation(1));
//
//        manager.moveRobot(1, "S5");
//        assertEquals("(0, 4)", manager.getRobotLocation(1));
//
//        manager.moveRobot(1, "E5");
//        assertEquals("(4, 4)", manager.getRobotLocation(1));
//
//        manager.moveRobot(1, "W5");
//        assertEquals("(0, 4)", manager.getRobotLocation(1));
//    }
//
//	
//		
//	}
//}
