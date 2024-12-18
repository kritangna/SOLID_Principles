public class Main {
    public static void main(String[] args) {

        IVersionControl git = new GitVersionControl();
        IVersionControl bitbucket = new Bitbucket();

        DevelopmentTeam devTeamUsingGit = new DevelopmentTeam(git);
        DevelopmentTeam devTeamUsingBitbucket = new DevelopmentTeam(bitbucket);

        devTeamUsingGit.makePull();
        devTeamUsingGit.makeCommit("Git remote branch is now up-to-date with local changes");
        devTeamUsingGit.makePush();

        devTeamUsingBitbucket.makePull();
        devTeamUsingBitbucket.makeCommit("Bitbucket remote branch is now up-to-date with local changes");
        devTeamUsingBitbucket.makePush();
    }
}
