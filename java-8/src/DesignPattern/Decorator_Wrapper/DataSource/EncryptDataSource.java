package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.File;
import java.io.IOException;

public class EncryptDataSource extends BaseDataSourceWrapper{

    public EncryptDataSource(DataSource fileDataSource) {
        super(fileDataSource);
    }

    @Override
    public void write(File file) throws IOException {
        System.out.println("EncryptDataSource::write");
        super.write(file);
    }

    @Override
    public String read(File file) throws IOException {
        System.out.println("EncryptDataSource::read");
        return super.read(file);
    }
}
