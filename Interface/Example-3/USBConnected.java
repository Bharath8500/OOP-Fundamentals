//Multiple interface implemented by the single class
interface USBConnected {
    void usbConnected();

    void usbDisconnected();
}

interface BluetoothConnection {
    void bluetoothConnected();

    void bluetoothDisconnected();
}