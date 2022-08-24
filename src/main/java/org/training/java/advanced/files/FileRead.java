package org.training.java.advanced.files;

import org.training.java.advanced.streams.Customer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static void main(String[] args) throws Exception {
//        File file = new File("myfile.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] readBytes = new byte[512];
//        int read = fileInputStream.read(readBytes);
//
//        FileChannel channel = fileInputStream.getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
//        int read1 = channel.read(byteBuffer);
//        byteBuffer.limit(byteBuffer.position());
//        char aChar = byteBuffer.getChar();
//        if (aChar == '\n'){
//
//        }
//
//        Reader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String s = bufferedReader.readLine();


        Path filePath = Paths.get("myfile.txt");
        List<String> stringList = Files.readAllLines(filePath);
        System.out.println(stringList);

        List<Customer> customerList = new ArrayList<>();
        for (String line : stringList) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                Customer customer = new Customer(parts[0],
                                                 parts[1],
                                                 Integer.parseInt(parts[2]),
                                                 Integer.parseInt(parts[3]));
                if (customer.getHeight() > 180 && customer.getWeight() < 100){
                    customerList.add(customer);
                }
            }
        }
        System.out.println(customerList);
    }
}
