package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.File;
import java.io.IOException;

public class BaseDataSourceWrapper implements DataSource{

    private final DataSource fileDataSource;
    public BaseDataSourceWrapper(DataSource fileDataSource){
        this.fileDataSource = fileDataSource;
    }

    @Override
    public void write(File file) throws IOException {
       this.fileDataSource.write(file);
    }

    @Override
    public String read(File file) throws IOException {
        return this.fileDataSource.read(file);
    }
}
