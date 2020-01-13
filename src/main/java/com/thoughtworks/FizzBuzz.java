package com.thoughtworks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        FileWriter writer  = new FileWriter("result.txt", false);

        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream.range(1, 1025).forEach(number -> {
            try {
                writer.write(String.format("%s %s\n", number, fizzBuzz.say(number)));
            } catch (IOException ignore) {
            }
        });

        writer.close();
    }

    private String say(Integer number) {
        return number.toString();
    }
}
