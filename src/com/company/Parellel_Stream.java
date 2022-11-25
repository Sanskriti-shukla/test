package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Parellel_Stream {
    public static <parallelStream> void main(String[] argvs) throws IOException {
// Creating a File object
        File f = new File("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\new_file.txt");

//            Stream<String> txt = Files.lines(f.toPath());
        List<String> txt = Files.readAllLines(f.toPath());
//            parallelStream<String> y=Files.readAllLines(f.toPath());

//            txt.parallel().forEach(System.out::println);
        txt.parallelStream().forEach(System.out::println);

    }
}

