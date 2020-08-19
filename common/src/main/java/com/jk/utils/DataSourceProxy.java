package com.jk.utils;

import com.zaxxer.hikari.HikariDataSource;

import javax.activation.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataSourceProxy implements DataSource {



    public DataSourceProxy(HikariDataSource dataSource) {
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
