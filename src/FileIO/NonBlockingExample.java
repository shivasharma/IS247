import java.nio.ByteBuffer; // Import ByteBuffer
import java.nio.channels.FileChannel; // Import FileChannel
import java.nio.file.*; // Import Java NIO classes
import java.io.IOException; // Import IOException for error handling

public class NonBlockingExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("data.bin");

        try {
            // Step 1: Create a FileChannel
            FileChannel channel = FileChannel.open(filePath, StandardOpenOption.READ);

            // Step 2: Create a ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024); // 1 KB buffer

            // Step 3: Read data from the channel into the buffer
            while (channel.read(buffer) > 0) {
                buffer.flip(); // Switch buffer from write mode to read mode
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get()); // Print each byte as a character
                }
                buffer.clear(); // Clear the buffer for the next read
            }

            // Step 4: Close the channel
            channel.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
