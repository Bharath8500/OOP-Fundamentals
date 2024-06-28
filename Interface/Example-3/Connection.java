public class Connection implements USBConnected, BluetoothConnection {
    public void usbConnected() {
        System.out.println("Device is connected to usb");
    }

    public void usbDisconnected() {
        System.out.println("USB device is disconnected");
    }

    public void bluetoothConnected() {
        System.out.println("Bluetooth device is connected");
    }

    public void bluetoothDisconnected() {
        System.out.println("Bluetooth device is disconnected");
    }

    public static void main(String[] args) {
        Connection c1 = new Connection();
        c1.usbConnected();
        c1.usbDisconnected();
        c1.bluetoothConnected();
        c1.bluetoothDisconnected();
    }
}