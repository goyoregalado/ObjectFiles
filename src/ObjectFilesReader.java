import java.io.*;

public class ObjectFilesReader {

    public static void main(String[] args) {
        String fileName = "data/roster.dat";

        FileInputStream inputFile = null;
        BufferedInputStream bufferedInput = null;
        ObjectInputStream objectInput = null;

        try {
            inputFile = new FileInputStream(fileName);
            bufferedInput = new BufferedInputStream(inputFile);
            objectInput = new ObjectInputStream(bufferedInput);

            try {
                Persona p = (Persona) objectInput.readObject();
                while (true) {
                    System.out.println(p);
                    p = (Persona) objectInput.readObject();
                }
            } catch (EOFException ex) {
                System.out.println("Hemos llegado al final del fichero.");
            } catch (ClassNotFoundException e) {
                System.out.println("Se ha producido un error al leer un objeto");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Se ha producido un error de entrada salida");
        }
    }
}
