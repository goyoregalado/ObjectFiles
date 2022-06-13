import java.io.*;

public class Main {

    public static void main(String[] args) {
        String fileName = "data/roster.dat";

        FileOutputStream outputFile = null;
        BufferedOutputStream bufferedOutput = null;
        ObjectOutputStream objectOutput = null;

        try {
            outputFile = new FileOutputStream(fileName);
            bufferedOutput = new BufferedOutputStream(outputFile);

            objectOutput = new ObjectOutputStream(bufferedOutput);
            objectOutput.writeObject(new Persona("Jane Doe", 21));
            objectOutput.writeObject(new Persona("John Doe", 26));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutput != null) objectOutput.close();
                if (bufferedOutput != null) bufferedOutput.close();
                if (outputFile != null) outputFile.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
