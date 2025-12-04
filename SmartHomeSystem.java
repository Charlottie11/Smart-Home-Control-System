
class Device {

    public boolean isItOn;
    protected String deviceType;
    protected String deviceName;
    protected String location;
    public static int powered = 0;

    public Device(String deviceType, String deviceName, String location) {
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
        this.isItOn = false;
    }

    public void turnOn() {
        this.isItOn = true;
    }

    public void turnOff() {
        this.isItOn = false;
    }

    public boolean isOn() {
        return isItOn;
    }

    public void status() {
        System.out.println(deviceName + " is " + (isItOn ? "ON" : "OFF"));
    }

    public static void setDevicesPower(Device[] devices, boolean powerOn) {
        for (Device d : devices) {
            if (powerOn) {

                d.turnOn();
            } else {

                d.turnOff();
            }
            d.status();
        }
    }

    public static void numberOfPoweredDevices(Device[] devices) {
        powered = 0;
        for (Device d : devices) {
            if (d.isItOn) {
                powered++;
            }

        }

        System.out.println("\n---------------------------------------------");
        System.out.println("| Number of device/s that are powered on: " + powered + " |");
        System.out.println("---------------------------------------------\n");
    }

}

class AirCondition extends Device {

    private int fanSpeed = 3;
    private int temperature = 24;

    public AirCondition(String deviceType, String deviceName, String location) {
        super(deviceType, deviceName, location);
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        status();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        status();
    }

    @Override
    public void status() {
        if (isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: ON");
            System.out.println("Fan Speed: " + fanSpeed);
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Location: " + location);
            System.out.println("---------------------------------");

        } else if (!isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: OFF");
            System.out.println("---------------------------------");

        }
    }
}

class LampShade extends Device {

    private int brightness;
    private String lightColor;

    public LampShade(String deviceType, String deviceName, String location) {
        super(deviceType, deviceName, location);
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        status();
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
        status();
    }

    public int getBrightness() {
        return brightness;
    }

    public String getLightColor() {
        return lightColor;
    }

    @Override
    public void status() {
        if (isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: ON");
            System.out.println("Brightness: " + brightness);
            System.out.println("Light Color: " + lightColor);
            System.out.println("Location: " + location);
            System.out.println("---------------------------------");

        } else if (!isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: OFF");
            System.out.println("---------------------------------");

        }
    }

}

class Television extends Device {

    private int volume;
    private int channel;

    public Television(String deviceType, String deviceName, String location) {
        super(deviceType, deviceName, location);
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        status();
    }

    public void setChannel(int channel) {
        this.channel = channel;
        status();
    }

    @Override
    public void status() {
        if (isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: ON");
            System.out.println("Volume: " + volume + "%");
            System.out.println("Channel: " + channel);
            System.out.println("Location: " + location);
            System.out.println("---------------------------------");

        } else if (!isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: OFF");
            System.out.println("---------------------------------");

        }
    }

}

class MicrowaveOven extends Device {

    private int timer = 0;
    private int temperature = 100;

    public MicrowaveOven(String deviceType, String deviceName, String location) {
        super(deviceType, deviceName, location);
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        status();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        status();
    }

    @Override
    public void status() {
        if (isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: ON");
            System.out.println("Timer: " + timer + " minutes");
            System.out.println("Temperature: " + temperature);
            System.out.println("Location: " + location);
            System.out.println("---------------------------------");
        } else if (!isItOn) {
            System.out.println("\n");
            System.out.println("---------------------------------");
            System.out.println("Device: " + deviceType);
            System.out.println("---" + deviceName + "---");
            System.out.println("Status: OFF");
            System.out.println("---------------------------------");
        }
    }

}

public class SmartHomeSystem {

    AirCondition ac1 = new AirCondition("Air Conditioner", "Panasonic 2", "Living Room");

    LampShade ls1 = new LampShade("Lamp Shade", "IKEA Gullsudare", "Living Room");
    LampShade ls2 = new LampShade("Lamp Shade", "IKEA Ringsta", "Master Bedroom");

    Television tv = new Television("Television", "TCL LED-55P635", "Living Room");

    MicrowaveOven mo = new MicrowaveOven("Microwave Oven", "Samsung-mg30t5018cc", "Kitchen");

    Device[] devices = {ac1, ls1, ls2, tv, mo};

    public static void main(String[] args) {
        System.out.println("-\n");
        System.out.println("\n    ---------------------");
        System.out.println("~   | Smart Home System |   ~");
        System.out.println("    ---------------------\n");

        SmartHomeSystem homeSystem = new SmartHomeSystem();

        homeSystem.ac1.turnOn();
        homeSystem.ac1.status();

        Device.numberOfPoweredDevices(homeSystem.devices);

        homeSystem.ls1.turnOn();
        homeSystem.ls1.setBrightness(100);
        homeSystem.ls1.setLightColor("Yellow");

        Device.numberOfPoweredDevices(homeSystem.devices);

        homeSystem.ls2.turnOn();
        homeSystem.ls2.setBrightness(homeSystem.ls1.getBrightness());
        homeSystem.ls2.setLightColor(homeSystem.ls1.getLightColor());

        Device.numberOfPoweredDevices(homeSystem.devices);

        homeSystem.tv.turnOn();
        homeSystem.tv.setVolume(10);
        homeSystem.tv.setChannel(1);
        
        Device.numberOfPoweredDevices(homeSystem.devices);

        System.out.println("--- Turning all devices Off ---");
        Device.setDevicesPower(homeSystem.devices, false);

        Device.numberOfPoweredDevices(homeSystem.devices);

        System.out.println("--- Turning all devices On ---");
        Device.setDevicesPower(homeSystem.devices, true);

        Device.numberOfPoweredDevices(homeSystem.devices);

    }
}
