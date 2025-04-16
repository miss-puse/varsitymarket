package za.ca.cput.adp3capstone.domain.products;

public class Laptop extends Product {
    private String processor;
    private int ramSize;                // in GB
    private int storageSize;            // in GB
    private String storageType;         // HDD, SSD, or both
    private String graphicsCard;        // NVIDIA GTX 1650, etc
    private double screenSize;          // in cm
    private String resolution;          // 1920x1080.etc
    private String operatingSystem;     // Windows 11, macOS,etc
    private double batteryLife;         // in mAh
    private double weight;              // in kg
    private boolean isTouchscreen;
    private String keyboardLayout;      // QWERTY, AZERTY, etc
    private int amountOfUsbPorts;
    private boolean hasHdmiPort;
    private boolean hasWebcam;
    private boolean isRefurbished;

    private Laptop() {}

    private Laptop(Builder builder){
        this.processor = builder.processor;
        this.ramSize = builder.ramSize;
        this.storageSize = builder.storageSize;
        this.storageType = builder.storageType;
        this.graphicsCard = builder.graphicsCard;
        this.screenSize = builder.screenSize;
        this.resolution = builder.resolution;
        this.operatingSystem = builder.operatingSystem;
        this.batteryLife = builder.batteryLife;
        this.weight = builder.weight;
        this.isTouchscreen = builder.isTouchscreen;
        this.keyboardLayout = builder.keyboardLayout;
        this.amountOfUsbPorts = builder.amountOfUsbPorts;
        this.hasHdmiPort = builder.hasHdmiPort;
        this.hasWebcam = builder.hasWebcam;
        this.isRefurbished = builder.isRefurbished;
    }

    public static class Builder{
        private String processor;
        private int ramSize;
        private int storageSize;
        private String storageType;
        private String graphicsCard;
        private double screenSize;
        private String resolution;
        private String operatingSystem;
        private double batteryLife;
        private double weight;
        private boolean isTouchscreen;
        private String keyboardLayout;
        private int amountOfUsbPorts;
        private boolean hasHdmiPort;
        private boolean hasWebcam;
        private boolean isRefurbished;



        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRamSize(int ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Builder setStorageSize(int storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setBatteryLife(double batteryLife) {
            this.batteryLife = batteryLife;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setTouchscreen(boolean isTouchscreen) {
            this.isTouchscreen = isTouchscreen;
            return this;
        }

        public Builder setKeyboardLayout(String keyboardLayout) {
            this.keyboardLayout = keyboardLayout;
            return this;
        }

        public Builder setAmountOfUsbPorts(int amountOfUsbPorts) {
            this.amountOfUsbPorts = amountOfUsbPorts;
            return this;
        }

        public Builder setHasHdmiPort(boolean hasHdmiPort) {
            this.hasHdmiPort = hasHdmiPort;
            return this;
        }

        public Builder setHasWebcam(boolean hasWebcam) {
            this.hasWebcam = hasWebcam;
            return this;
        }

        public Builder setRefurbished(boolean isRefurbished) {
            this.isRefurbished = isRefurbished;
            return this;
        }

        public Builder copy(Laptop laptopToCopy) {
            this.processor = laptopToCopy.processor;
            this.ramSize = laptopToCopy.ramSize;
            this.storageSize = laptopToCopy.storageSize;
            this.storageType = laptopToCopy.storageType;
            this.graphicsCard = laptopToCopy.graphicsCard;
            this.screenSize = laptopToCopy.screenSize;
            this.resolution = laptopToCopy.resolution;
            this.operatingSystem = laptopToCopy.operatingSystem;
            this.batteryLife = laptopToCopy.batteryLife;
            this.weight = laptopToCopy.weight;
            this.isTouchscreen = laptopToCopy.isTouchscreen;
            this.keyboardLayout = laptopToCopy.keyboardLayout;
            this.amountOfUsbPorts = laptopToCopy.amountOfUsbPorts;
            this.hasHdmiPort = laptopToCopy.hasHdmiPort;
            this.hasWebcam = laptopToCopy.hasWebcam;
            this.isRefurbished = laptopToCopy.isRefurbished;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", storageType='" + storageType + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryLife=" + batteryLife +
                ", weight=" + weight +
                ", isTouchscreen=" + isTouchscreen +
                ", keyboardLayout='" + keyboardLayout + '\'' +
                ", amountOfUsbPorts=" + amountOfUsbPorts +
                ", hasHdmiPort=" + hasHdmiPort +
                ", hasWebcam=" + hasWebcam +
                ", isRefurbished=" + isRefurbished +
                '}';
    }
}
