package composite.fileSystem;

public class File extends FileSystem{
    public File(String name) {
        super(name);
    }

    @Override
    public void ls(int indent) {
        for(int idx = 0; idx< indent; idx++){
            System.out.print('\t');
        }
        System.out.println(super.getName());
    }
}
