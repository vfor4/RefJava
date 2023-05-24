package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataSource {
    public void write(File file) throws IOException;
    public String read(File file) throws IOException;
}
