package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileDataSource fileDataSource = new FileDataSource();
        BaseDataSourceWrapper wrapper1 = new EncryptDataSource(fileDataSource);
        BaseDataSourceWrapper wrapper2 = new CompressDataSource(wrapper1);
        wrapper2.write(new File("toidaidot.txt"));
//        System.out.println(wrapper2.read(new File("toidaidot.txt")));
    }
}
