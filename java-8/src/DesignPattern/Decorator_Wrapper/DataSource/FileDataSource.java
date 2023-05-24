package DesignPattern.Decorator_Wrapper.DataSource;

import java.io.*;

public class FileDataSource implements DataSource{
    @Override
    public void write(File file) throws IOException {
        System.out.println("FileDataSource::write");
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(str);

        writer.close();
    }

    @Override
    public String read(File file) throws IOException {
        System.out.println("FileDataSource::read");
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
