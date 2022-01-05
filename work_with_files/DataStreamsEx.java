package povtor.work_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("textTwo.bin"));
            DataInputStream inputStream = new DataInputStream(
                    new FileInputStream("textTwo.bin"));
        ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
