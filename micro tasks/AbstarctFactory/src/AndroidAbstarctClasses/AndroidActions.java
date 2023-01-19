package AndroidAbstarctClasses;


interface Actions {

    void action();
}

public abstract class AndroidActions implements Actions {

    @Override
    public abstract void action();
}