package epam.StructuralDesign;

public class WindowsFile implements FileDownloadWork{
	@Override
    public Object downloadFile(String path) {
        return new Object();
    }
 
    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in WINDOWS !!");
        return true;
    }

}
