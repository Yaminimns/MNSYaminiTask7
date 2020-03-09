package epam.StructuralDesign;

public interface FileDownloadWork {
	public Object downloadFile(String path);
    
    public boolean storeFile(Object object);
}
