package composite.fileSystem;

import lombok.Getter;

public abstract class FileSystem {
    @Getter
    private String name;

    public FileSystem(String name) {
        this.name = name;
    }

    public abstract void ls(int indent);
}
