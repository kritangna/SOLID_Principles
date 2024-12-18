public class GitVersionControl implements IVersionControl{

    public GitVersionControl()
    {

    }

    @Override
    public void commit(String message)
    {
        System.out.println("Commit the changes to git with commit message: " + message);
    }

    @Override
    public void pull()
    {
        System.out.println("Pulling the changes from remote git...");
    }

    @Override
    public void push()
    {
        System.out.println("Pushing the changes to git...");
    }
}
