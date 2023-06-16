package com.example.sbprojectex.Filter.httpCache;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

/**
 * 
 * ServletOutputStream
 */

public class CachedServletOutputStream extends ServletOutputStream{

    private DataOutputStream OutputStream;
   // private ByteArrayOutputStream baos;

    // public CachedServletOutputStream(OutputStream out, ByteArrayOutputStream baos){
    //     this.OutputStream = out;
    //     //this.baos = baos;
    // }

     public CachedServletOutputStream(OutputStream out){
        this.OutputStream = new DataOutputStream(out);
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setWriteListener(WriteListener listener) {
        
    }

    // ServletOutputStream의 기존 write메서드를 수정
    @Override
    public void write(int b) throws IOException {
        this.OutputStream.write(b);
        //this.baos.write(b);
    }
    
}
