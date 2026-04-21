package basicInheritence;

public class SmartDeviceQ1 {


    public static class SmartDevice {

        String brandName;
        String deviceID;

        void showStatus() {
            System.out.println("Device is starting up...");

        }
    }

    public static class SmartBulb extends SmartDevice {
        int brightnessLevel;

        void setBrightness(int level) {
            brightnessLevel = level;
            System.out.println("Brightness set to: " + brightnessLevel);

        }
    }

        public static void main(String[] args) {
            SmartBulb bulb = new SmartBulb();

            bulb.brandName = "Philips";
            bulb.deviceID = "BULB123";

            bulb.showStatus();   // inherited method
            bulb.setBrightness(75);
        }


}
