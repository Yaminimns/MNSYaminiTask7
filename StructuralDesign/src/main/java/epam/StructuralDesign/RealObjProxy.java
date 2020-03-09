package epam.StructuralDesign;

public class RealObjProxy extends RealObjWork{
	@Override
    public void doSomework() 
    {
        System.out.println("Delegating work on real object");
        super.doSomework();
    }

}
