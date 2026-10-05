import LibraryFiles.UtilityClass;

import java.io.IOException;

public class Demo
{
    public static void main(String[] args) throws IOException {


        String name = UtilityClass.getPFData("browserName");
        System.out.println(name);

        String username = UtilityClass.getPFData("UN");
        System.out.println(username);

        String pwd = UtilityClass.getPFData("PWD");
        System.out.println(pwd);

    }
}
