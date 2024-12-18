public class Bitbucket implements IVersionControl{

    public Bitbucket()
    {

    }

    @Override
    public void commit(String message)
    {
        System.out.println("Commit the changes to Bitbucket with commit message: " + message);
    }

    @Override
    public void pull()
    {
        System.out.println("Pulling the changes from remote Bitbucket...");
    }

    @Override
    public void push()
    {
        System.out.println("Pushing the changes to Bitbucket...");
    }
}
