package com.unimelb.swen30006.workshops;

// Hello world test 123!!!!!

// Sample private file class to be replaced by your implementaiton
class File {
    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }
}