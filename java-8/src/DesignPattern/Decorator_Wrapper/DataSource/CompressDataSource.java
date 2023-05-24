package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.File;
import java.io.IOException;

public class CompressDataSource extends BaseDataSourceWrapper{

    public CompressDataSource(DataSource fileDataSource) {
        super(fileDataSource);
    }

    @Override
    public void write(File file) throws IOException {
        System.out.println("CompressDataSource::write");
        super.write(file);
    }

    @Override
    public String read(File file) throws IOException {
        System.out.println("CompressDataSource::read");
        return super.read(file);
    }
}
