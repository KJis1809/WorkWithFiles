import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File dirGames = new File("E://Games");
        StringBuilder sb = new StringBuilder();

        File dirSrc = new File(dirGames, "src");
        if (dirSrc.mkdir()) {
            sb.append("Directory ").append(dirSrc.getName()).append(" was created\n");

            File subdirMain = new File(dirSrc, "main");
            if (subdirMain.mkdir()) {
                sb.append(" - Subdirectory ").append(subdirMain.getName()).append(" was created\n");

                File mainClass = new File(subdirMain, "Main.java");
                File utilsClass = new File(subdirMain, "Utils.java");
                try {
                    if (mainClass.createNewFile())
                        sb.append("      * File ").append(mainClass.getName()).append(" was created\n");
                    if (utilsClass.createNewFile())
                        sb.append("      * File ").append(utilsClass.getName()).append(" was created\n");

                } catch (IOException ex) {
                    sb.append(ex.getMessage());
                }
            }

            File subdirTest = new File(dirSrc, "test");
            if (subdirTest.mkdir()) {
                sb.append(" - Subdirectory ").append(subdirTest.getName()).append(" was created\n");
            }
        }


        File dirRes = new File(dirGames, "res");
        if (dirRes.mkdir()) {
            sb.append("Directory ").append(dirRes.getName()).append(" was created\n");

            File subdirDrawables = new File(dirRes, "drawables");
            if (subdirDrawables.mkdir())
                sb.append(" - Subdirectory ").append(subdirDrawables.getName()).append(" was created\n");

            File subdirVectors = new File(dirRes, "vectors");
            if (subdirVectors.mkdir())
                sb.append(" - Subdirectory ").append(subdirVectors.getName()).append(" was created\n");

            File subdirIcons = new File(dirRes, "icons");
            if (subdirIcons.mkdir())
                sb.append(" - Subdirectory ").append(subdirIcons.getName()).append(" was created\n");
        }


        File dirSaveGames = new File(dirGames, "savegames");
        if (dirSaveGames.mkdir()) {
            sb.append("Directory ").append(dirSaveGames.getName()).append(" was created\n");
        }


        File dirTemp = new File(dirGames, "temp");
        if (dirTemp.mkdir()) {
            sb.append("Directory ").append(dirTemp.getName()).append(" was created\n");

            File tempFile = new File(dirTemp, "temp.txt");
            try {
                if (tempFile.createNewFile())
                    sb.append("      * File ").append(tempFile.getName()).append(" was created\n");

                FileWriter writer = new FileWriter(tempFile);
                writer.write(sb.toString());

                writer.flush();

                writer.close();

            } catch (IOException ex) {
                sb.append(ex.getMessage());
            }
        }
    }
}