abstract class DataProcessor {
    public final void process() {
        try {
            readData();
            processData();
            saveData();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    abstract void readData() throws Exception;

    abstract void processData() throws Exception;

    abstract void saveData() throws Exception;
}

abstract class SecureProcessor extends DataProcessor {
    void readData() throws Exception {
        System.out.println("Reading data securely...");
    }

    void saveData() throws Exception {
        System.out.println("Saving data securely...");
    }
}

class EncryptedFileProcessor extends SecureProcessor {
    void processData() throws Exception {
        System.out.println("Decrypting...");
        throw new Exception("Decryption failed: Invalid key!");
    }
}

public class Main13d {
    public static void main(String[] args) {
        DataProcessor dp = new EncryptedFileProcessor();
        dp.process();
    }
}
