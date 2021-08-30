
package com.zaremba.libraries;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Launcher
{
    public static void main(String[] args)
    {
        //Main.main(args);
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File src = new File("CoffeeCup.jpg");
        //System.out.println(file.getAbsolutePath());
        File out = new File("copied.jpg");
        try {
            FileUtils.copyFile(src,out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            Metadata metadata = ImageMetadataReader.readMetadata(file);

            print(metadata, "Using ImageMetadataReader");
        } catch (ImageProcessingException e) {
            print(e);
        } catch (IOException e) {
            print(e);
        }*/

    }

    /**
     * Write all extracted values to stdout.
     */
    private static void print(Metadata metadata, String method)
    {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.print(' ');
        System.out.print(method);
        System.out.println("-------------------------------------------------");
        System.out.println();

        //
        // A Metadata object contains multiple Directory objects
        //
        for (Directory directory : metadata.getDirectories()) {

            //
            // Each Directory stores values in Tag objects
            //
            for (Tag tag : directory.getTags()) {
                System.out.println(tag);
            }

            //
            // Each Directory may also contain error messages
            //
            for (String error : directory.getErrors()) {
                System.err.println("ERROR: " + error);
            }
        }
    }

    private static void print(Exception exception)
    {
        System.err.println("EXCEPTION: " + exception);
    }
}