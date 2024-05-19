import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> children;

    Directory(String directoryName) {
        this.directoryName = directoryName;
        children = new ArrayList<>();
    }
    public void add(FileSystem fs) {
        children.add(fs);
    }
    @Override
    public void ls() {
        System.out.println("DirectoryName: " + directoryName);
        for(FileSystem child: children) {
            child.ls();
        }
    }
}
