/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp3.pk;
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Lenovo
 */
public class FileTypeFilter extends FileFilter{
    private final String extension;
    
    private final String description;

    public FileTypeFilter(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }
    
    public boolean accept(File file){
        if(file.isDirectory()){
            return true;
        }
        return file.getName().endsWith(extension);
    }
    
    public String getDescription(){
        return description + String.format(" (*%s)", extension);
    }
}
