package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Parser parser = new Parser();
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
        list.add(3);
        list.add(-4);
        list.add(3);
        list.add(2);
	parser.Summator(list);
        try {
            parser.Summator(parser.ReadStringFromFile("C:\\Users\\admin\\Desktop\\Р\\Lambda\\src\\Source\\1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
