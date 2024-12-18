public class DevelopmentTeam {

    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl vc)
    {
        versionControl = vc;
    }

    public void makeCommit(String message)
    {
        versionControl.commit(message);
    }

    public void makePull()
    {
        versionControl.pull();
    }

    public void makePush()
    {
        versionControl.push();
    }
}
