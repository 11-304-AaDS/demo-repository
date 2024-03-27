package RadixSort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public File createFile(int i) throws IOException {
        File file = new File("src\\RadixSort\\dataset" + i + ".txt");
        if (!file.createNewFile()) throw new IOException();
        fullFile(file);
        return file;
    }

    public void fullFile(File file) {
        Random random = new Random();
        try {
            FileWriter writer = new FileWriter(file);
            int count = 100 + random.nextInt(9901);
            for(int i = 0; i < count; i++) {
                int data = random.nextInt(69746);
                writer.write(data + "\n");
            }
                writer.close();
        } catch (Exception e) {
            System.out.println("Не удалось заполнить файл");
        }
    }
}
