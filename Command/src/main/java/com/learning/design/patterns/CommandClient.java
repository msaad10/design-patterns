package com.learning.design.patterns;

public class CommandClient {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("test1.txt")));

        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("test2.txt")));
    }
}