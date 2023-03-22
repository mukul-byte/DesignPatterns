package composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem{
    List<FileSystem> fileSystemList;

    public Directory(String name) {
        super(name);
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }
    @Override
    public void ls(int indent) {
        for(int idx = 0; idx< indent; idx++){
            System.out.print('\t');
        }
        System.out.println(super.getName());
        for(FileSystem fileSystemObj : fileSystemList){
            fileSystemObj.ls(indent + 1);
        }
    }
}
