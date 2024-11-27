package ch.hslu.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


/**
 * Schreibt eine int-Zahl in eine Datei.
 */
public final class DataStream {
    private static final Logger LOG = LoggerFactory.getLogger(DataStream.class);
    private static final String TXT_FILE = "data-file.txt";

    public static void main(final String[] args) throws IOException {
            final int value = 99;
            final float valueFloat = 100f;
            final double valueDouble = 1000d;
            try ( DataOutputStream dos = new DataOutputStream(new FileOutputStream(TXT_FILE))) {
                dos.writeInt(value);
                dos.writeFloat(valueFloat);
                dos.writeDouble(valueDouble);

                LOG.info("Zahl '{}' (int) in Datei '{}' geschrieben.", value, TXT_FILE);
            } catch (IOException exception) {
                LOG.error(exception.getMessage(), exception);
            }
        if (new File("data-file.txt").exists()) {
            try ( final DataInputStream dis = new DataInputStream(new FileInputStream(TXT_FILE))) {
                final int result = dis.readInt();
                final float resultFloat = dis.readFloat();
                final double resultDouble = dis.readDouble();

                System.out.println(result);
                System.out.println(resultFloat);
                System.out.println(resultDouble);
            }
            catch (IOException ioe) {
                LOG.error(ioe.getMessage(), ioe);
            }
        }

    }
}
