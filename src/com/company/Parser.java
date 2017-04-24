package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Created by admin on 24.04.2017.
 */
public class Parser {

    File F = new File("C:\\Users\\admin\\Desktop\\Р\\Lambda\\src\\Source");
    File []fList;


    public List<String> getFilesNames(){
        List<String> result = new ArrayList<String>();

        fList = F.listFiles();


        for(int i=0; i<fList.length; i++)
        {

            if(fList[i].isFile()) {
                System.out.println(String.valueOf(i) + " - " + fList[i].getName());
                result.add(fList[i].toString());
            }

        }
        return result;
    }

    public List<Integer> ReadStringFromFile(String filePath) throws FileNotFoundException {
        List<Integer> result = new ArrayList<Integer>();

        Scanner in = new Scanner(new File(filePath));
int i=0;

        while(in.hasNextInt()) {

            try {
                result.add(in.nextInt());}
            catch (ArrayIndexOutOfBoundsException e)
            {   }
            finally {
                System.out.println(result.get(i));
                i++;
            }


        }
        in.close();

       return result;
    }

    public void Summator(List<Integer> numberCollect){


    Optional<Integer> sum = numberCollect.stream().filter((a) -> a>0 && a%2==0).reduce((s1, s2) -> s1 + s2);
        System.out.println(sum.toString());

    }

}
