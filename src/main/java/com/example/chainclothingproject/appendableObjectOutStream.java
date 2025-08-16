package com.example.chainclothingproject;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class appendableObjectOutStream extends ObjectOutputStream {
    public appendableObjectOutStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException{
        //
    }
}

