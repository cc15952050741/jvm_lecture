package com.ssy.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class MyTest3 {
    public void test() throws IOException, FileNotFoundException {
        try {
            InputStream in = new FileInputStream("test.txt");

            ServerSocket serverSocket = new ServerSocket(999);
            serverSocket.accept();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}
