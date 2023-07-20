/*
checked exception are caught at compile/build time
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) throws IOException{

//        try {

            FileReader fileReader = new FileReader(":\\Users\\vikra\\IdeaProjects\\java-concepts\\exception\\src\\javaDoc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (int i = 0; i < 10; i++){
                System.out.println("LineNumber : "+i+" : "+bufferedReader.readLine());
            }


            bufferedReader.close();
            fileReader.close();

//        } catch (IOException ioException){
//            System.out.println(" IOException " + ioException.getMessage());
//        }

    }
}