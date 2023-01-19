package IOSAbstractClasses;

interface Actions {

    void action();
}


public abstract class IOSActions implements Actions {

    @Override
    public abstract void action();
}
